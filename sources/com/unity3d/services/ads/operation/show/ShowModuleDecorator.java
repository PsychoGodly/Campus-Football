package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;

public class ShowModuleDecorator implements IShowModule {
    private final IShowModule _showModule;

    public ShowModuleDecorator(IShowModule iShowModule) {
        this._showModule = iShowModule;
    }

    public SDKMetricsSender getMetricSender() {
        return this._showModule.getMetricSender();
    }

    public void onUnityAdsShowClick(String str) {
        this._showModule.onUnityAdsShowClick(str);
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this._showModule.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
    }

    public void onUnityAdsShowConsent(String str) {
        this._showModule.onUnityAdsShowConsent(str);
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this._showModule.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public void onUnityAdsShowStart(String str) {
        this._showModule.onUnityAdsShowStart(str);
    }

    public void remove(String str) {
        this._showModule.remove(str);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        this._showModule.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }

    public IShowOperation get(String str) {
        return (IShowOperation) this._showModule.get(str);
    }

    public void set(IShowOperation iShowOperation) {
        this._showModule.set(iShowOperation);
    }
}
