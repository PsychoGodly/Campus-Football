package com.unity3d.services.core.configuration;

import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.lifecycle.LifecycleListener;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class InitializeThread extends Thread {
    private static InitializeThread _thread;
    private boolean _didRetry = false;
    private final SDKMetricsSender _sdkMetricsSender = ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class));
    private InitializeState _state;
    private String _stateName;
    private long _stateStartTimestamp;
    private boolean _stopThread = false;

    private static abstract class InitializeState {
        private InitializeState() {
        }

        public abstract InitializeState execute();
    }

    public static class InitializeStateCheckForCachedWebViewUpdate extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public InitializeState execute() {
            try {
                byte[] access$400 = InitializeThread.loadCachedFileToByteArray(new File(SdkProperties.getLocalWebViewFile()));
                if (Utilities.Sha256(access$400).equals(this._configuration.getWebViewHash())) {
                    return new InitializeStateUpdateCache(this._configuration, new String(access$400, "UTF-8"));
                }
            } catch (Exception unused) {
            }
            return new InitializeStateDownloadWebView(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateCheckForUpdatedWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localWebViewConfiguration;
        private byte[] _localWebViewData;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration, byte[] bArr, Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localWebViewData = bArr;
            this._localWebViewConfiguration = configuration2;
        }

        public InitializeState execute() {
            try {
                String Sha256 = Utilities.Sha256(this._localWebViewData);
                if (!Sha256.equals(this._configuration.getWebViewHash())) {
                    SdkProperties.setLatestConfiguration(this._configuration);
                }
                if (!TextUtils.isEmpty(Sha256)) {
                    Configuration configuration = this._localWebViewConfiguration;
                    if (configuration != null) {
                        if (configuration.getWebViewHash() != null && this._localWebViewConfiguration.getWebViewHash().equals(Sha256) && SdkProperties.getVersionName().equals(this._localWebViewConfiguration.getSdkVersion())) {
                            return new InitializeStateCreate(this._localWebViewConfiguration, new String(this._localWebViewData, "UTF-8"));
                        }
                    }
                    Configuration configuration2 = this._configuration;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(Sha256)) {
                        return new InitializeStateCreate(this._configuration, new String(this._localWebViewData, "UTF-8"));
                    }
                }
            } catch (Exception unused) {
            }
            return new InitializeStateCleanCache(this._configuration, new InitializeStateLoadWeb(this._configuration));
        }
    }

    public static class InitializeStateCleanCache extends InitializeState {
        private Configuration _configuration;
        private InitializeState _nextState;

        public InitializeStateCleanCache(Configuration configuration, InitializeState initializeState) {
            super();
            this._configuration = configuration;
            this._nextState = initializeState;
        }

        public InitializeState execute() {
            try {
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                File file2 = new File(SdkProperties.getLocalWebViewFile());
                file.delete();
                file2.delete();
            } catch (Exception e10) {
                DeviceLog.error("Failure trying to clean cache: " + e10.getMessage());
            }
            return this._nextState;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration, InitializeState initializeState) {
            super(configuration, initializeState);
        }

        public InitializeState execute() {
            try {
                InitializeState execute = super.execute();
                if (!(execute instanceof InitializeStateError)) {
                    return execute;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class InitializeStateComplete extends InitializeState {
        private Configuration _configuration;

        public InitializeStateComplete(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public InitializeState execute() {
            for (Class moduleConfiguration : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this._configuration.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null) {
                    moduleConfiguration2.initCompleteState(this._configuration);
                }
            }
            return null;
        }
    }

    public static class InitializeStateConfig extends InitializeState {
        /* access modifiers changed from: private */
        public Configuration _configuration;
        /* access modifiers changed from: private */
        public Configuration _localConfig;
        private int _maxRetries;
        /* access modifiers changed from: private */
        public InitializeState _nextState;
        private int _retries = 0;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateConfig(Configuration configuration) {
            super();
            this._configuration = new Configuration(SdkProperties.getConfigUrl(), configuration.getExperimentsReader());
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
            this._localConfig = configuration;
            this._nextState = null;
        }

        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
            return executeWithLoader();
        }

        public InitializeState executeLegacy(Configuration configuration) {
            try {
                configuration.makeRequest();
                if (configuration.getDelayWebViewUpdate()) {
                    return new InitializeStateLoadCacheConfigAndWebView(configuration, this._localConfig);
                }
                return new InitializeStateLoadCache(configuration);
            } catch (Exception e10) {
                if (this._retries >= this._maxRetries) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e10, this, this._localConfig);
                }
                this._retryDelay = (long) (((double) this._retryDelay) * this._scalingFactor);
                this._retries++;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this._retryDelay);
            }
        }

        public InitializeState executeWithLoader() {
            final SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
            HttpClient httpClient = (HttpClient) Utilities.getService(HttpClient.class);
            PrivacyConfigStorage instance = PrivacyConfigStorage.getInstance();
            DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory(sDKMetricsSender);
            PrivacyConfigurationLoader privacyConfigurationLoader = new PrivacyConfigurationLoader(new ConfigurationLoader(new ConfigurationRequestFactory(this._configuration, deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN)), sDKMetricsSender, httpClient), new ConfigurationRequestFactory(this._configuration, deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), instance, httpClient);
            final Configuration configuration = new Configuration(SdkProperties.getConfigUrl());
            try {
                privacyConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() {
                    public void onError(String str) {
                        sDKMetricsSender.sendMetric(TSIMetric.newEmergencySwitchOff());
                        InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                        InitializeState unused = initializeStateConfig._nextState = initializeStateConfig.executeLegacy(configuration);
                    }

                    public void onSuccess(Configuration configuration) {
                        Configuration unused = InitializeStateConfig.this._configuration = configuration;
                        InitializeStateConfig.this._configuration.saveToDisk();
                        if (InitializeStateConfig.this._configuration.getDelayWebViewUpdate()) {
                            InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                            InitializeState unused2 = initializeStateConfig._nextState = new InitializeStateLoadCacheConfigAndWebView(initializeStateConfig._configuration, InitializeStateConfig.this._localConfig);
                        }
                        ((TokenStorage) Utilities.getService(TokenStorage.class)).setInitToken(InitializeStateConfig.this._configuration.getUnifiedAuctionToken());
                        InitializeStateConfig initializeStateConfig2 = InitializeStateConfig.this;
                        InitializeState unused3 = initializeStateConfig2._nextState = new InitializeStateLoadCache(initializeStateConfig2._configuration);
                    }
                });
                return this._nextState;
            } catch (Exception e10) {
                int i10 = this._retries;
                if (i10 >= this._maxRetries) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e10, this, this._configuration);
                }
                this._retryDelay = (long) (((double) this._retryDelay) * this._scalingFactor);
                this._retries = i10 + 1;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this._retryDelay);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateCreate extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateCreate(Configuration configuration, String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration configuration = this._configuration;
            configuration.setWebViewData(this._webViewData);
            try {
                ErrorState create = WebViewApp.create(configuration, false);
                if (create == null) {
                    return new InitializeStateComplete(this._configuration);
                }
                String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                DeviceLog.error(webAppFailureMessage);
                return new InitializeStateError(create, new Exception(webAppFailureMessage), this._configuration);
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                return new InitializeStateError(ErrorState.CreateWebApp, e10, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }

        public String getWebData() {
            return this._webViewData;
        }
    }

    public static class InitializeStateCreateWithRemote extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCreateWithRemote(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: creating webapp");
            try {
                ErrorState create = WebViewApp.create(this._configuration, true);
                if (create == null) {
                    return new InitializeStateComplete(this._configuration);
                }
                String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                DeviceLog.error(webAppFailureMessage);
                return new InitializeStateError(create, new Exception(webAppFailureMessage), this._configuration);
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                return new InitializeStateError(ErrorState.CreateWebApp, e10, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateDownloadWebView extends InitializeState {
        private Configuration _configuration;
        private HttpClient _httpClient = ((HttpClient) Utilities.getService(HttpClient.class));
        private int _retries;
        private long _retryDelay;

        public InitializeStateDownloadWebView(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
        }

        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: downloading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    String obj = this._httpClient.executeBlocking(new HttpRequest(this._configuration.getWebViewUrl())).getBody().toString();
                    String webViewHash = this._configuration.getWebViewHash();
                    if (obj == null || webViewHash == null || !Utilities.Sha256(obj).equals(webViewHash)) {
                        return null;
                    }
                    return new InitializeStateUpdateCache(this._configuration, obj);
                } catch (Exception unused) {
                    if (this._retries >= this._configuration.getMaxRetries()) {
                        return null;
                    }
                    long retryScalingFactor = (long) (((double) this._retryDelay) * this._configuration.getRetryScalingFactor());
                    this._retryDelay = retryScalingFactor;
                    this._retries++;
                    return new InitializeStateRetry(this, retryScalingFactor);
                }
            } catch (Exception e10) {
                DeviceLog.exception("Malformed URL", e10);
                return null;
            }
        }
    }

    public static class InitializeStateError extends InitializeState {
        protected Configuration _configuration;
        ErrorState _errorState;
        Exception _exception;

        public InitializeStateError(ErrorState errorState, Exception exc, Configuration configuration) {
            super();
            this._errorState = errorState;
            this._exception = exc;
            this._configuration = configuration;
        }

        public InitializeState execute() {
            DeviceLog.error("Unity Ads init: halting init in " + this._errorState.getMetricName() + ": " + this._exception.getMessage());
            for (Class moduleConfiguration : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this._configuration.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null) {
                    moduleConfiguration2.initErrorState(this._configuration, this._errorState, this._exception.getMessage());
                }
            }
            return null;
        }
    }

    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        public InitializeState execute() {
            SdkProperties.setInitializeState(SdkProperties.InitializationState.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    public static class InitializeStateInitModules extends InitializeState {
        private Configuration _configuration;

        public InitializeStateInitModules(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public InitializeState execute() {
            return new InitializeStateConfig(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateLoadCache extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadCache(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] readFileBytes = Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
                String Sha256 = Utilities.Sha256(readFileBytes);
                if (Sha256 == null || !Sha256.equals(this._configuration.getWebViewHash())) {
                    return new InitializeStateLoadWeb(this._configuration);
                }
                try {
                    String str = new String(readFileBytes, "UTF-8");
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                    return new InitializeStateCreate(this._configuration, str);
                } catch (Exception e10) {
                    return new InitializeStateError(ErrorState.LoadCache, e10, this._configuration);
                }
            } catch (Exception e11) {
                DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e11.getMessage());
                return new InitializeStateLoadWeb(this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateLoadCacheConfigAndWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration, Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localConfig = configuration2;
        }

        public InitializeState execute() {
            try {
                return new InitializeStateCheckForUpdatedWebView(this._configuration, InitializeThread.loadCachedFileToByteArray(new File(SdkProperties.getLocalWebViewFile())), this._localConfig);
            } catch (Exception unused) {
                return new InitializeStateCleanCache(this._configuration, new InitializeStateLoadWeb(this._configuration));
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateLoadConfigFile extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadConfigFile(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: Loading Config File Parameters");
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            if (!file.exists()) {
                return new InitializeStateReset(this._configuration);
            }
            try {
                this._configuration = new Configuration(new JSONObject(new String(Utilities.readFileBytes(file))));
            } catch (Exception unused) {
                DeviceLog.debug("Unity Ads init: Using default configuration parameters");
            }
            return new InitializeStateReset(this._configuration);
        }
    }

    public static class InitializeStateLoadWeb extends InitializeState {
        private Configuration _configuration;
        private HttpClient _httpClient = ((HttpClient) Utilities.getService(HttpClient.class));
        private int _maxRetries;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateLoadWeb(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
        }

        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: loading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    String obj = this._httpClient.executeBlocking(new HttpRequest(this._configuration.getWebViewUrl())).getBody().toString();
                    String webViewHash = this._configuration.getWebViewHash();
                    if (webViewHash != null && !Utilities.Sha256(obj).equals(webViewHash)) {
                        return new InitializeStateError(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), this._configuration);
                    }
                    if (webViewHash != null) {
                        Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), obj);
                    }
                    return new InitializeStateCreate(this._configuration, obj);
                } catch (Exception e10) {
                    int i10 = this._retries;
                    if (i10 >= this._maxRetries) {
                        return new InitializeStateNetworkError(ErrorState.NetworkWebviewRequest, e10, this, this._configuration);
                    }
                    this._retryDelay = (long) (((double) this._retryDelay) * this._scalingFactor);
                    this._retries = i10 + 1;
                    InitializeEventsMetricSender.getInstance().onRetryWebview();
                    return new InitializeStateRetry(this, this._retryDelay);
                }
            } catch (Exception e11) {
                DeviceLog.exception("Malformed URL", e11);
                return new InitializeStateError(ErrorState.MalformedWebviewRequest, e11, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateNetworkError extends InitializeStateError implements IConnectivityListener {
        private static long _lastConnectedEventTimeMs;
        private static int _receivedConnectedEvents;
        private ConditionVariable _conditionVariable;
        private int _connectedEventThreshold;
        private InitializeState _erroredState;
        private int _maximumConnectedEvents;
        private long _networkErrorTimeout;
        private ErrorState _state;

        public InitializeStateNetworkError(ErrorState errorState, Exception exc, InitializeState initializeState, Configuration configuration) {
            super(errorState, exc, configuration);
            this._state = errorState;
            _receivedConnectedEvents = 0;
            _lastConnectedEventTimeMs = 0;
            this._erroredState = initializeState;
            this._networkErrorTimeout = configuration.getNetworkErrorTimeout();
            this._maximumConnectedEvents = configuration.getMaximumConnectedEvents();
            this._connectedEventThreshold = configuration.getConnectedEventThreshold();
        }

        private boolean shouldHandleConnectedEvent() {
            return System.currentTimeMillis() - _lastConnectedEventTimeMs >= ((long) this._connectedEventThreshold) && _receivedConnectedEvents <= this._maximumConnectedEvents;
        }

        public InitializeState execute() {
            DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            this._conditionVariable = new ConditionVariable();
            ConnectivityMonitor.addListener(this);
            if (this._conditionVariable.block(this._networkErrorTimeout)) {
                ConnectivityMonitor.removeListener(this);
                return this._erroredState;
            }
            ConnectivityMonitor.removeListener(this);
            return new InitializeStateError(this._state, new Exception("No connected events within the timeout!"), this._configuration);
        }

        public void onConnected() {
            _receivedConnectedEvents++;
            DeviceLog.debug("Unity Ads init got connected event");
            if (shouldHandleConnectedEvent()) {
                this._conditionVariable.open();
            }
            if (_receivedConnectedEvents > this._maximumConnectedEvents) {
                ConnectivityMonitor.removeListener(this);
            }
            _lastConnectedEventTimeMs = System.currentTimeMillis();
        }

        public void onDisconnected() {
            DeviceLog.debug("Unity Ads init got disconnected event");
        }
    }

    public static class InitializeStateReset extends InitializeState {
        private Configuration _configuration;
        private int _resetWebAppTimeout;

        public InitializeStateReset(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._resetWebAppTimeout = configuration.getResetWebappTimeout();
        }

        private void unregisterLifecycleCallbacks() {
            if (Lifecycle.getLifecycleListener() != null) {
                if (ClientProperties.getApplication() != null) {
                    ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener((LifecycleListener) null);
            }
        }

        public InitializeState execute() {
            boolean z10;
            DeviceLog.debug("Unity Ads init: starting init");
            final ConditionVariable conditionVariable = new ConditionVariable();
            final WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                currentApp.resetWebViewAppInitialization();
                if (currentApp.getWebView() != null) {
                    Utilities.runOnUiThread(new Runnable() {
                        public void run() {
                            WebView webView = currentApp.getWebView();
                            if (webView != null) {
                                webView.destroy();
                                currentApp.setWebView((WebView) null);
                            }
                            conditionVariable.open();
                        }
                    });
                    z10 = conditionVariable.block((long) this._resetWebAppTimeout);
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Reset failed on opening ConditionVariable"), this._configuration);
                }
            }
            if (Build.VERSION.SDK_INT > 13) {
                unregisterLifecycleCallbacks();
            }
            SdkProperties.setCacheDirectory((CacheDirectory) null);
            if (SdkProperties.getCacheDirectory() == null) {
                return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Cache directory is NULL"), this._configuration);
            }
            SdkProperties.setInitialized(false);
            for (Class moduleConfiguration : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this._configuration.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null) {
                    moduleConfiguration2.resetState(this._configuration);
                }
            }
            return new InitializeStateInitModules(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateRetry extends InitializeState {
        long _delay;
        InitializeState _state;

        public InitializeStateRetry(InitializeState initializeState, long j10) {
            super();
            this._state = initializeState;
            this._delay = j10;
        }

        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: retrying in " + this._delay + " milliseconds");
            try {
                Thread.sleep(this._delay);
            } catch (Exception e10) {
                DeviceLog.exception("Init retry interrupted", e10);
                Thread.currentThread().interrupt();
            }
            return this._state;
        }
    }

    public static class InitializeStateUpdateCache extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateUpdateCache(Configuration configuration, String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        public InitializeState execute() {
            if (!(this._configuration == null || this._webViewData == null)) {
                try {
                    Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), this._webViewData);
                    Utilities.writeFile(new File(SdkProperties.getLocalConfigurationFilepath()), this._configuration.getFilteredJsonString());
                } catch (Exception unused) {
                    return new InitializeStateCleanCacheIgnoreError(this._configuration, (InitializeState) null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    private InitializeThread(InitializeState initializeState) {
        this._state = initializeState;
    }

    public static synchronized DownloadLatestWebViewStatus downloadLatestWebView() {
        synchronized (InitializeThread.class) {
            if (_thread != null) {
                DownloadLatestWebViewStatus downloadLatestWebViewStatus = DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
                return downloadLatestWebViewStatus;
            } else if (SdkProperties.getLatestConfiguration() == null) {
                DownloadLatestWebViewStatus downloadLatestWebViewStatus2 = DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
                return downloadLatestWebViewStatus2;
            } else {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(SdkProperties.getLatestConfiguration()));
                _thread = initializeThread;
                initializeThread.setName("UnityAdsDownloadThread");
                _thread.start();
                DownloadLatestWebViewStatus downloadLatestWebViewStatus3 = DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
                return downloadLatestWebViewStatus3;
            }
        }
    }

    private String getMetricNameForState(InitializeState initializeState) {
        if (initializeState == null) {
            return null;
        }
        String simpleName = initializeState.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String lowerCase = simpleName.substring(getStatePrefixLength()).toLowerCase();
        StringBuilder sb2 = new StringBuilder(7 + lowerCase.length() + 6);
        sb2.append("native_");
        sb2.append(lowerCase);
        sb2.append("_state");
        return sb2.toString();
    }

    private Map<String, String> getMetricTagsForState() {
        return InitializeEventsMetricSender.getInstance().getRetryTags();
    }

    private int getStatePrefixLength() {
        return 15;
    }

    private void handleStateEndMetrics(InitializeState initializeState) {
        if (this._stateName != null && !isRetryState(initializeState) && !this._stateName.equals("native_retry_state")) {
            this._sdkMetricsSender.sendMetric(new Metric(this._stateName, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._stateStartTimestamp)), getMetricTagsForState()));
        }
    }

    private void handleStateStartMetrics(InitializeState initializeState) {
        if (isRetryState(initializeState)) {
            this._didRetry = true;
        } else {
            if (!this._didRetry) {
                this._stateStartTimestamp = System.nanoTime();
            }
            this._didRetry = false;
        }
        this._stateName = getMetricNameForState(initializeState);
    }

    public static synchronized void initialize(Configuration configuration) {
        synchronized (InitializeThread.class) {
            if (_thread == null) {
                InitializeEventsMetricSender.getInstance().didInitStart();
                CachedLifecycle.register();
                InitializeThread initializeThread = new InitializeThread(new InitializeStateLoadConfigFile(configuration));
                _thread = initializeThread;
                initializeThread.setName("UnityAdsInitializeThread");
                _thread.start();
            }
        }
    }

    private boolean isRetryState(InitializeState initializeState) {
        return initializeState instanceof InitializeStateRetry;
    }

    /* access modifiers changed from: private */
    public static byte[] loadCachedFileToByteArray(File file) throws IOException {
        if (file == null || !file.exists()) {
            throw new IOException("file not found");
        }
        try {
            return Utilities.readFileBytes(file);
        } catch (IOException unused) {
            throw new IOException("could not read from file");
        }
    }

    public static synchronized void reset() {
        synchronized (InitializeThread.class) {
            if (_thread == null) {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateForceReset());
                _thread = initializeThread;
                initializeThread.setName("UnityAdsResetThread");
                _thread.start();
            }
        }
    }

    public void quit() {
        this._stopThread = true;
    }

    public void run() {
        while (true) {
            try {
                InitializeState initializeState = this._state;
                if (initializeState == null || this._stopThread) {
                    break;
                }
                try {
                    handleStateStartMetrics(initializeState);
                    InitializeState execute = this._state.execute();
                    this._state = execute;
                    handleStateEndMetrics(execute);
                } catch (Exception e10) {
                    DeviceLog.exception("Unity Ads SDK encountered an error during initialization, cancel initialization", e10);
                    Utilities.runOnUiThread(new Runnable() {
                        public void run() {
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
                        }
                    });
                    this._state = new InitializeStateForceReset();
                } catch (OutOfMemoryError e11) {
                    DeviceLog.exception("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new Exception(e11));
                    Utilities.runOnUiThread(new Runnable() {
                        public void run() {
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
                        }
                    });
                    this._state = new InitializeStateForceReset();
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        _thread = null;
    }
}
