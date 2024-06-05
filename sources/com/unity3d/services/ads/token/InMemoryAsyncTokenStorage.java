package com.unity3d.services.ads.token;

import android.os.Handler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilderWithExtras;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InMemoryAsyncTokenStorage implements AsyncTokenStorage {
    private Configuration _configuration = new Configuration();
    private boolean _configurationWasSet = false;
    private DeviceInfoReaderBuilderWithExtras _deviceInfoReaderBuilderWithExtras;
    /* access modifiers changed from: private */
    public final Handler _handler;
    private final InitializationStatusReader _initStatusReader = new InitializationStatusReader();
    private INativeTokenGenerator _nativeTokenGenerator;
    private final SDKMetricsSender _sdkMetrics;
    private boolean _tokenAvailable = false;
    private final List<TokenListenerState> _tokenListeners = new LinkedList();
    private TokenStorage _tokenStorage;

    /* renamed from: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$TokenType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.device.TokenType[] r0 = com.unity3d.services.core.device.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$core$device$TokenType = r0
                com.unity3d.services.core.device.TokenType r1 = com.unity3d.services.core.device.TokenType.TOKEN_NATIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$core$device$TokenType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.device.TokenType r1 = com.unity3d.services.core.device.TokenType.TOKEN_REMOTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.AnonymousClass3.<clinit>():void");
        }
    }

    class TokenListenerState {
        public IBiddingManager biddingManager;
        public boolean invoked;
        public Runnable runnable;
        public TokenType tokenType;

        TokenListenerState() {
        }
    }

    public InMemoryAsyncTokenStorage(INativeTokenGenerator iNativeTokenGenerator, Handler handler, SDKMetricsSender sDKMetricsSender, TokenStorage tokenStorage) {
        this._handler = handler;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._sdkMetrics = sDKMetricsSender;
        this._tokenStorage = tokenStorage;
    }

    private synchronized TokenListenerState addTimeoutHandler(IBiddingManager iBiddingManager) {
        final TokenListenerState tokenListenerState;
        tokenListenerState = new TokenListenerState();
        tokenListenerState.biddingManager = iBiddingManager;
        tokenListenerState.tokenType = TokenType.TOKEN_REMOTE;
        tokenListenerState.runnable = new Runnable() {
            public void run() {
                InMemoryAsyncTokenStorage.this.notifyTokenReady(tokenListenerState, (String) null);
            }
        };
        this._tokenListeners.add(tokenListenerState);
        this._handler.postDelayed(tokenListenerState.runnable, (long) this._configuration.getTokenTimeout());
        return tokenListenerState;
    }

    private Map<String, String> getMetricTags() {
        HashMap hashMap = new HashMap();
        hashMap.put("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState()));
        return hashMap;
    }

    private void handleTokenInvocation(final TokenListenerState tokenListenerState) {
        if (!tokenListenerState.invoked) {
            tokenListenerState.invoked = true;
            if (!this._tokenAvailable) {
                tokenListenerState.tokenType = TokenType.TOKEN_NATIVE;
                if (GMA.getInstance().hasSCARBiddingSupport() && this._deviceInfoReaderBuilderWithExtras != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(ScarConstants.TOKEN_ID_KEY, tokenListenerState.biddingManager.getTokenIdentifier());
                    this._deviceInfoReaderBuilderWithExtras.setExtras(hashMap);
                }
                this._nativeTokenGenerator.generateToken(new INativeTokenGeneratorListener() {
                    public void onReady(final String str) {
                        InMemoryAsyncTokenStorage.this._handler.post(new Runnable() {
                            public void run() {
                                AnonymousClass2 r02 = AnonymousClass2.this;
                                InMemoryAsyncTokenStorage.this.notifyTokenReady(tokenListenerState, str);
                            }
                        });
                    }
                });
                return;
            }
            tokenListenerState.tokenType = TokenType.TOKEN_REMOTE;
            String token = this._tokenStorage.getToken();
            if (token != null && !token.isEmpty()) {
                notifyTokenReady(tokenListenerState, token);
            }
        }
    }

    private boolean isValidConfig(Configuration configuration) {
        return configuration != null;
    }

    private synchronized void notifyListenersTokenReady() {
        while (true) {
            if (this._tokenListeners.isEmpty()) {
                break;
            }
            String token = this._tokenStorage.getToken();
            if (token == null) {
                break;
            }
            notifyTokenReady(this._tokenListeners.get(0), token);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void notifyTokenReady(TokenListenerState tokenListenerState, String str) {
        if (this._tokenListeners.remove(tokenListenerState)) {
            tokenListenerState.biddingManager.onUnityAdsTokenReady(tokenListenerState.tokenType == TokenType.TOKEN_REMOTE ? tokenListenerState.biddingManager.getFormattedToken(str) : str);
            try {
                this._handler.removeCallbacks(tokenListenerState.runnable);
            } catch (Exception e10) {
                DeviceLog.exception("Failed to remove callback from a handler", e10);
            }
        }
        sendTokenMetrics(str, tokenListenerState.tokenType);
    }

    private void sendNativeTokenMetrics(String str) {
        SDKMetricsSender sDKMetricsSender = this._sdkMetrics;
        if (sDKMetricsSender != null) {
            if (str == null) {
                sDKMetricsSender.sendMetric(TSIMetric.newNativeGeneratedTokenNull(getMetricTags()));
            } else {
                sDKMetricsSender.sendMetric(TSIMetric.newNativeGeneratedTokenAvailable(getMetricTags()));
            }
        }
    }

    private void sendRemoteTokenMetrics(String str) {
        if (this._sdkMetrics != null) {
            if (str == null || str.isEmpty()) {
                this._sdkMetrics.sendMetric(TSIMetric.newAsyncTokenNull(getMetricTags()));
            } else {
                this._sdkMetrics.sendMetric(TSIMetric.newAsyncTokenAvailable(getMetricTags()));
            }
        }
    }

    private void sendTokenMetrics(String str, TokenType tokenType) {
        int i10 = AnonymousClass3.$SwitchMap$com$unity3d$services$core$device$TokenType[tokenType.ordinal()];
        if (i10 == 1) {
            sendNativeTokenMetrics(str);
        } else if (i10 != 2) {
            DeviceLog.error("Unknown token type passed to sendTokenMetrics");
        } else {
            sendRemoteTokenMetrics(str);
        }
    }

    public synchronized void getToken(IBiddingManager iBiddingManager) {
        if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.INITIALIZED_FAILED) {
            iBiddingManager.onUnityAdsTokenReady((String) null);
            sendTokenMetrics((String) null, TokenType.TOKEN_REMOTE);
        } else if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.NOT_INITIALIZED) {
            iBiddingManager.onUnityAdsTokenReady((String) null);
            sendTokenMetrics((String) null, TokenType.TOKEN_REMOTE);
        } else {
            TokenListenerState addTimeoutHandler = addTimeoutHandler(iBiddingManager);
            if (this._configurationWasSet) {
                handleTokenInvocation(addTimeoutHandler);
            }
        }
    }

    public synchronized void onTokenAvailable() {
        this._tokenAvailable = true;
        if (this._configurationWasSet) {
            notifyListenersTokenReady();
        }
    }

    public synchronized void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
        boolean isValidConfig = isValidConfig(configuration);
        this._configurationWasSet = isValidConfig;
        if (isValidConfig) {
            if (this._nativeTokenGenerator == null) {
                this._deviceInfoReaderBuilderWithExtras = new DeviceInfoReaderBuilderWithExtras(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance());
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this._nativeTokenGenerator = new NativeTokenGenerator(newSingleThreadExecutor, this._deviceInfoReaderBuilderWithExtras);
                if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this._nativeTokenGenerator = new NativeTokenGeneratorWithPrivacyAwait(newSingleThreadExecutor, this._nativeTokenGenerator, configuration.getPrivacyRequestWaitTimeout());
                }
            }
            Iterator it = new ArrayList(this._tokenListeners).iterator();
            while (it.hasNext()) {
                handleTokenInvocation((TokenListenerState) it.next());
            }
        }
    }
}
