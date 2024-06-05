package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.timer.ITimerListener;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.Executors;

public class ShowModuleDecoratorTimeout extends ShowModuleDecorator {
    private static final String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";
    private final ExperimentsReader _experimentsReader;

    public ShowModuleDecoratorTimeout(IShowModule iShowModule, ExperimentsReader experimentsReader) {
        super(iShowModule);
        this._experimentsReader = experimentsReader;
    }

    /* access modifiers changed from: private */
    public void onOperationTimeout(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (showOperationState != null) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(AdOperationError.timeout, Long.valueOf(showOperationState.duration())));
            remove(showOperationState.f32055id);
            Utilities.runOnUiThread(new a(showOperationState, unityAdsShowError, str));
        }
    }

    private void releaseOperationTimeoutLock(String str) {
        ShowOperationState showOperationState;
        BaseTimer baseTimer;
        IShowOperation iShowOperation = get(str);
        if (iShowOperation != null && (showOperationState = iShowOperation.getShowOperationState()) != null && (baseTimer = showOperationState.timeoutTimer) != null) {
            baseTimer.kill();
        }
    }

    private void startShowTimeout(final ShowOperationState showOperationState) {
        if (showOperationState != null) {
            BaseTimer baseTimer = new BaseTimer(Integer.valueOf(showOperationState.configuration.getShowTimeout()), new ITimerListener() {
                public void onTimerFinished() {
                    ShowModuleDecoratorTimeout showModuleDecoratorTimeout = ShowModuleDecoratorTimeout.this;
                    ShowOperationState showOperationState = showOperationState;
                    UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                    showModuleDecoratorTimeout.onOperationTimeout(showOperationState, unityAdsShowError, "[UnityAds] Timeout while trying to show " + showOperationState.placementId);
                }
            });
            showOperationState.timeoutTimer = baseTimer;
            baseTimer.start(Executors.newSingleThreadScheduledExecutor());
        }
    }

    public void onUnityAdsShowConsent(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowConsent(str);
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public void onUnityAdsShowStart(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowStart(str);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowStart());
        showOperationState.start();
        if (!this._experimentsReader.getCurrentlyActiveExperiments().isNativeShowTimeoutDisabled()) {
            startShowTimeout(showOperationState);
        }
        super.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }
}
