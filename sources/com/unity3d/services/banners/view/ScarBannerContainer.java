package com.unity3d.services.banners.view;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;

public class ScarBannerContainer extends RelativeLayout {
    private String _bannerAdId;

    public ScarBannerContainer(Context context, String str) {
        super(context);
        this._bannerAdId = str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$destroy$0(ScarBannerContainer scarBannerContainer) {
        scarBannerContainer.removeAllViews();
        ViewParent parent = scarBannerContainer.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(scarBannerContainer);
        }
    }

    public void destroy() {
        Utilities.runOnUiThread(new a(this));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BannerBridge.didAttachScarBanner(this._bannerAdId);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BannerBridge.didDetachScarBanner(this._bannerAdId);
    }
}
