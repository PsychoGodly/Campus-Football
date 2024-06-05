package com.unity3d.services.ads.adunit;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.ads.webplayer.WebPlayerViewCache;
import com.unity3d.services.core.misc.ViewUtilities;

public class WebPlayerHandler implements IAdUnitViewHandler {
    private static String webPlayerViewId = "webplayer";
    private WebPlayerView _webPlayerView;

    public boolean create(IAdUnitActivity iAdUnitActivity) {
        if (this._webPlayerView != null) {
            return true;
        }
        WebPlayerSettingsCache instance = WebPlayerSettingsCache.getInstance();
        Context context = iAdUnitActivity.getContext();
        String str = webPlayerViewId;
        WebPlayerView webPlayerView = new WebPlayerView(context, str, instance.getWebSettings(str), instance.getWebPlayerSettings(webPlayerViewId));
        this._webPlayerView = webPlayerView;
        webPlayerView.setEventSettings(instance.getWebPlayerEventSettings(webPlayerViewId));
        WebPlayerViewCache.getInstance().addWebPlayer(webPlayerViewId, this._webPlayerView);
        return true;
    }

    public boolean destroy() {
        WebPlayerView webPlayerView = this._webPlayerView;
        if (webPlayerView != null) {
            ViewUtilities.removeViewFromParent(webPlayerView);
            this._webPlayerView.destroy();
        }
        WebPlayerViewCache.getInstance().removeWebPlayer(webPlayerViewId);
        this._webPlayerView = null;
        return true;
    }

    public View getView() {
        return this._webPlayerView;
    }

    public void onCreate(IAdUnitActivity iAdUnitActivity, Bundle bundle) {
        create(iAdUnitActivity);
    }

    public void onDestroy(IAdUnitActivity iAdUnitActivity) {
        if (iAdUnitActivity.isFinishing()) {
            destroy();
        }
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
