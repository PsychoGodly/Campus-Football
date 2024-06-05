package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class ScarBannerAdHandler implements g {
    private String _operationId;

    public ScarBannerAdHandler(String str) {
        this._operationId = str;
    }

    public void onAdClicked() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLICKED, this._operationId);
    }

    public void onAdClosed() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLOSED, this._operationId);
    }

    public void onAdFailedToLoad(int i10, String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, this._operationId, Integer.valueOf(i10), str);
    }

    public void onAdImpression() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_IMPRESSION, this._operationId);
    }

    public void onAdLoaded() {
        BannerViewCache.getInstance().addScarContainer(this._operationId);
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOADED, this._operationId);
    }

    public void onAdOpened() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_OPENED, this._operationId);
    }
}
