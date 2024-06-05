package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class SdkProperties {
    private static final String CACHE_DIR_NAME = "UnityAdsCache";
    private static final String CHINA_CONFIG_HOSTNAME = "dW5pdHlhZHMudW5pdHljaGluYS5jbg==";
    private static final String CHINA_ISO_ALPHA_2_CODE = "CN";
    private static final String CHINA_ISO_ALPHA_3_CODE = "CHN";
    private static final String CONFIG_VERSION_METADATA_KEY = "com.unity3d.ads.configversion";
    private static final String DEFAULT_CONFIG_HOSTNAME = "unityads.unity3d.com";
    private static final String DEFAULT_CONFIG_VERSION = "configv2";
    private static final String LOCAL_CACHE_FILE_PREFIX = "UnityAdsCache-";
    private static final String LOCAL_STORAGE_FILE_PREFIX = "UnityAdsStorage-";
    private static long _appInitializationTimeEpochMs;
    private static CacheDirectory _cacheDirectory;
    private static String _configUrl;
    private static final AtomicReference<InitializationState> _currentInitializationState = new AtomicReference<>(InitializationState.NOT_INITIALIZED);
    private static boolean _debugMode = false;
    private static final LinkedHashSet<IUnityAdsInitializationListener> _initializationListeners = new LinkedHashSet<>();
    private static long _initializationTime;
    private static long _initializationTimeEpochMs;
    private static boolean _initialized = false;
    private static Configuration _latestConfiguration;
    private static boolean _reinitialized = false;
    private static boolean _testMode = false;

    public enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    public static void addInitializationListener(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener != null) {
            LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
            synchronized (linkedHashSet) {
                linkedHashSet.add(iUnityAdsInitializationListener);
            }
        }
    }

    public static long getAppInitializationTimeSinceEpoch() {
        return _appInitializationTimeEpochMs;
    }

    public static File getCacheDirectory() {
        return getCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static String getCacheDirectoryName() {
        return "UnityAdsCache";
    }

    public static CacheDirectory getCacheDirectoryObject() {
        return _cacheDirectory;
    }

    public static String getCacheFilePrefix() {
        return LOCAL_CACHE_FILE_PREFIX;
    }

    public static String getConfigUrl() {
        if (_configUrl == null) {
            _configUrl = getDefaultConfigUrl("release");
        }
        return _configUrl;
    }

    public static String getConfigVersion(Context context) {
        if (context == null) {
            return DEFAULT_CONFIG_VERSION;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString(CONFIG_VERSION_METADATA_KEY, DEFAULT_CONFIG_VERSION);
            }
            return DEFAULT_CONFIG_VERSION;
        } catch (PackageManager.NameNotFoundException unused) {
            DeviceLog.warning("Failed to retrieve application info for current package");
            return DEFAULT_CONFIG_VERSION;
        }
    }

    public static InitializationState getCurrentInitializationState() {
        return _currentInitializationState.get();
    }

    public static boolean getDebugMode() {
        return _debugMode;
    }

    public static String getDefaultConfigUrl(String str) {
        String str2 = isChinaLocale(Device.getNetworkCountryISO()) ? new String(Base64.decode(CHINA_CONFIG_HOSTNAME, 0)) : DEFAULT_CONFIG_HOSTNAME;
        return "https://" + getConfigVersion(ClientProperties.getApplicationContext()) + '.' + str2 + "/webview/" + getWebViewBranch() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + str + "/config.json";
    }

    public static IUnityAdsInitializationListener[] getInitializationListeners() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    public static long getInitializationTime() {
        return _initializationTime;
    }

    public static long getInitializationTimeEpoch() {
        return _initializationTimeEpochMs;
    }

    public static Configuration getLatestConfiguration() {
        return _latestConfiguration;
    }

    public static String getLocalConfigurationFilepath() {
        if (getCacheDirectory() == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return getCacheDirectory().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    public static String getLocalStorageFilePrefix() {
        return LOCAL_STORAGE_FILE_PREFIX;
    }

    public static String getLocalWebViewFile() {
        if (getCacheDirectory() == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return getCacheDirectory().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    public static int getVersionCode() {
        return 41200;
    }

    public static String getVersionName() {
        return "4.12.0";
    }

    private static String getWebViewBranch() {
        return getVersionName();
    }

    public static boolean isChinaLocale(String str) {
        return str.equalsIgnoreCase(CHINA_ISO_ALPHA_2_CODE) || str.equalsIgnoreCase(CHINA_ISO_ALPHA_3_CODE);
    }

    public static boolean isInitialized() {
        return _initialized;
    }

    public static boolean isReinitialized() {
        return _reinitialized;
    }

    public static boolean isTestMode() {
        return _testMode;
    }

    public static void notifyInitializationComplete() {
        setInitializeState(InitializationState.INITIALIZED_SUCCESSFULLY);
        for (IUnityAdsInitializationListener iUnityAdsInitializationListener : getInitializationListeners()) {
            Objects.requireNonNull(iUnityAdsInitializationListener);
            Utilities.wrapCustomerListener(new a(iUnityAdsInitializationListener));
        }
        resetInitializationListeners();
    }

    public static void notifyInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        setInitializeState(InitializationState.INITIALIZED_FAILED);
        for (IUnityAdsInitializationListener bVar : getInitializationListeners()) {
            Utilities.wrapCustomerListener(new b(bVar, unityAdsInitializationError, str));
        }
        resetInitializationListeners();
    }

    public static void resetInitializationListeners() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }

    public static void setAppInitializationTimeSinceEpoch(long j10) {
        _appInitializationTimeEpochMs = j10;
    }

    public static void setCacheDirectory(CacheDirectory cacheDirectory) {
        _cacheDirectory = cacheDirectory;
    }

    public static void setConfigUrl(String str) throws URISyntaxException, MalformedURLException {
        if (str == null) {
            throw new MalformedURLException();
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            new URL(str).toURI();
            _configUrl = str;
        } else {
            throw new MalformedURLException();
        }
    }

    public static void setDebugMode(boolean z10) {
        _debugMode = z10;
        if (z10) {
            DeviceLog.setLogLevel(8);
        } else {
            DeviceLog.setLogLevel(4);
        }
    }

    public static void setInitializationTime(long j10) {
        _initializationTime = j10;
    }

    public static void setInitializationTimeSinceEpoch(long j10) {
        _initializationTimeEpochMs = j10;
    }

    public static void setInitializeState(InitializationState initializationState) {
        _currentInitializationState.set(initializationState);
    }

    public static void setInitialized(boolean z10) {
        _initialized = z10;
    }

    public static void setLatestConfiguration(Configuration configuration) {
        _latestConfiguration = configuration;
    }

    public static void setReinitialized(boolean z10) {
        _reinitialized = z10;
    }

    public static void setTestMode(boolean z10) {
        _testMode = z10;
    }

    public static File getCacheDirectory(Context context) {
        if (_cacheDirectory == null) {
            setCacheDirectory(new CacheDirectory("UnityAdsCache"));
        }
        return _cacheDirectory.getCacheDirectory(context);
    }
}
