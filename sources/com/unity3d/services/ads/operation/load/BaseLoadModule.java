package com.unity3d.services.ads.operation.load;

import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdModule;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback;
import com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocation;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseLoadModule extends AdModule<ILoadOperation, LoadOperationState> implements ILoadModule {
    static final String errorMsgFailedToCreateLoadRequest = "[UnityAds] Failed to create load request";
    static final String errorMsgInternalCommunicationFailure = "[UnityAds] Internal communication failure";
    static final String errorMsgInternalCommunicationTimeout = "[UnityAds] Internal communication timeout";
    static final String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";

    public BaseLoadModule(SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    /* access modifiers changed from: private */
    public void sendOnUnityAdsFailedToLoad(final LoadOperationState loadOperationState, final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str, boolean z10) {
        if (loadOperationState != null && loadOperationState.listener != null) {
            if (z10) {
                getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
            }
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    loadOperationState.onUnityAdsFailedToLoad(unityAdsLoadError, str);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void addOptionalParameters(LoadOperationState loadOperationState, JSONObject jSONObject) throws JSONException;

    /* access modifiers changed from: package-private */
    public JSONObject buildBaseOptions(LoadOperationState loadOperationState) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headerBiddingOptions", loadOperationState.loadOptions.getData());
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public JSONObject buildBaseParameters(LoadOperationState loadOperationState, LoadOperation loadOperation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject buildBaseOptions = buildBaseOptions(loadOperationState);
        buildBaseOptions.put("headerBiddingOptions", loadOperationState.loadOptions.getData());
        jSONObject.put("options", buildBaseOptions);
        jSONObject.put("listenerId", loadOperation.getId());
        jSONObject.put("placementId", loadOperationState.placementId);
        jSONObject.put("time", Device.getElapsedRealtime());
        addOptionalParameters(loadOperationState, jSONObject);
        return jSONObject;
    }

    public void onUnityAdsAdLoaded(String str) {
        ILoadOperation iLoadOperation = (ILoadOperation) get(str);
        if (iLoadOperation != null && iLoadOperation.getLoadOperationState() != null) {
            LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadSuccess(Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
            iLoadOperation.onUnityAdsAdLoaded(loadOperationState.placementId);
            remove(str);
        }
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        ILoadOperation iLoadOperation = (ILoadOperation) get(str);
        if (iLoadOperation != null && iLoadOperation.getLoadOperationState() != null) {
            LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
            iLoadOperation.onUnityAdsFailedToLoad(loadOperationState.placementId, unityAdsLoadError, str2);
            remove(str);
        }
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, final LoadOperationState loadOperationState) {
        if (TextUtils.isEmpty(loadOperationState.placementId)) {
            sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        LoadOperation loadOperation = new LoadOperation(loadOperationState, new WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker, new IWebViewBridgeInvocationCallback() {
            public void onFailure(String str, CallbackStatus callbackStatus) {
                BaseLoadModule.this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(AdOperationError.callback_error, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
                BaseLoadModule.this.sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
                BaseLoadModule.this.remove(loadOperationState.getId());
            }

            public void onSuccess() {
            }

            public void onTimeout() {
                BaseLoadModule.this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(AdOperationError.callback_timeout, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
                BaseLoadModule.this.sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
                BaseLoadModule.this.remove(loadOperationState.getId());
            }
        }));
        try {
            JSONObject buildBaseParameters = buildBaseParameters(loadOperationState, loadOperation);
            set(loadOperation);
            loadOperation.invoke(loadOperationState.configuration.getWebViewBridgeTimeout(), buildBaseParameters);
        } catch (NullPointerException | JSONException unused) {
            sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        }
    }
}
