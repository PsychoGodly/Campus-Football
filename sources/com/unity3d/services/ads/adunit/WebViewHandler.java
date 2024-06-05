package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;

public class WebViewHandler implements IAdUnitViewHandler {
    public boolean create(IAdUnitActivity iAdUnitActivity) {
        return true;
    }

    public boolean destroy() {
        if (WebViewApp.getCurrentApp() == null || WebViewApp.getCurrentApp().getWebView() == null) {
            return true;
        }
        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
        return true;
    }

    public View getView() {
        if (WebViewApp.getCurrentApp() != null) {
            return WebViewApp.getCurrentApp().getWebView();
        }
        return null;
    }

    public void onCreate(IAdUnitActivity iAdUnitActivity, Bundle bundle) {
    }

    public void onDestroy(IAdUnitActivity iAdUnitActivity) {
        destroy();
    }

    public void onPause(IAdUnitActivity iAdUnitActivity) {
    }

    public void onResume(IAdUnitActivity iAdUnitActivity) {
    }

    public void onStart(IAdUnitActivity iAdUnitActivity) {
    }

    public void onStop(IAdUnitActivity iAdUnitActivity) {
    }
}
