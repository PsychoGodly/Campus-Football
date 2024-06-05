package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoadModuleDecoratorInitializationBuffer extends LoadModuleDecorator implements IInitializationListener {
    private static final String errorMsgInitializationFailed = "[UnityAds] SDK Initialization Failed";
    private static final String errorMsgInitializationFailure = "[UnityAds] SDK Initialization Failure";
    private ConcurrentHashMap<LoadOperationState, IWebViewBridgeInvoker> _queuedLoadEvents = new ConcurrentHashMap<>();

    /* renamed from: com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.properties.SdkProperties$InitializationState[] r0 = com.unity3d.services.core.properties.SdkProperties.InitializationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = r0
                com.unity3d.services.core.properties.SdkProperties$InitializationState r1 = com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.properties.SdkProperties$InitializationState r1 = com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer.AnonymousClass2.<clinit>():void");
        }
    }

    public LoadModuleDecoratorInitializationBuffer(ILoadModule iLoadModule, IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(iLoadModule);
        iInitializationNotificationCenter.addListener(this);
    }

    private void sendOnUnityAdsFailedToLoad(final LoadOperationState loadOperationState, final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str) {
        if (loadOperationState != null && loadOperationState.listener != null) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    LoadOperationState loadOperationState = loadOperationState;
                    loadOperationState.listener.onUnityAdsFailedToLoad(loadOperationState.placementId, unityAdsLoadError, str);
                }
            });
        }
    }

    public synchronized void onSdkInitializationFailed(String str, ErrorState errorState, int i10) {
        for (LoadOperationState sendOnUnityAdsFailedToLoad : this._queuedLoadEvents.keySet()) {
            sendOnUnityAdsFailedToLoad(sendOnUnityAdsFailedToLoad, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
        }
        this._queuedLoadEvents.clear();
    }

    public synchronized void onSdkInitialized() {
        for (Map.Entry next : this._queuedLoadEvents.entrySet()) {
            super.executeAdOperation((IWebViewBridgeInvoker) next.getValue(), (LoadOperationState) next.getKey());
        }
        this._queuedLoadEvents.clear();
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, LoadOperationState loadOperationState) {
        if (loadOperationState != null) {
            int i10 = AnonymousClass2.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.getCurrentInitializationState().ordinal()];
            if (i10 == 1) {
                super.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
            } else if (i10 != 2) {
                this._queuedLoadEvents.put(loadOperationState, iWebViewBridgeInvoker);
            } else {
                sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
            }
        }
    }
}
