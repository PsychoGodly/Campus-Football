package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import org.json.JSONObject;

public class BannerWebPlayerContainer extends RelativeLayout {
    private String _bannerAdId;
    private int _lastVisibility = -1;
    private UnityBannerSize _size;
    private Runnable _unsubscribeLayoutChange = null;
    private JSONObject _webPlayerEventSettings;
    private JSONObject _webPlayerSettings;
    /* access modifiers changed from: private */
    public WebPlayerView _webPlayerView;
    private JSONObject _webSettings;

    public BannerWebPlayerContainer(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, UnityBannerSize unityBannerSize) {
        super(context);
        this._size = unityBannerSize;
        this._bannerAdId = str;
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
        this._webPlayerEventSettings = jSONObject3;
        WebPlayerView webPlayerView = new WebPlayerView(context, str, this._webSettings, this._webPlayerSettings);
        this._webPlayerView = webPlayerView;
        webPlayerView.setEventSettings(this._webPlayerEventSettings);
        subscribeOnLayoutChange();
        addView(this._webPlayerView);
        setupLayoutParams();
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), (float) this._size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), (float) this._size.getHeight()))));
        ViewGroup.LayoutParams layoutParams = this._webPlayerView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this._webPlayerView.setLayoutParams(layoutParams);
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            final AnonymousClass1 r02 = new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    BannerWebPlayerContainer.this.onLayoutChange(view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            };
            addOnLayoutChangeListener(r02);
            this._unsubscribeLayoutChange = new Runnable() {
                public void run() {
                    BannerWebPlayerContainer.this.removeOnLayoutChangeListener(r02);
                }
            };
        }
    }

    public void destroy() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                this.removeAllViews();
                ViewParent parent = this.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this);
                }
                if (this._webPlayerView != null) {
                    this._webPlayerView.destroy();
                }
                WebPlayerView unused = this._webPlayerView = null;
            }
        });
    }

    public WebPlayerView getWebPlayer() {
        return this._webPlayerView;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BannerBridge.didAttach(this._bannerAdId);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BannerBridge.didDetach(this._bannerAdId);
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        BannerBridge.resize(this._bannerAdId, i10, i11, i12, i13, Build.VERSION.SDK_INT >= 11 ? getAlpha() : 1.0f);
        if (getParent() != null) {
            Rect rect = new Rect();
            getHitRect(rect);
            if ((getParent() instanceof View) && !((View) getParent()).getLocalVisibleRect(rect)) {
                onVisibilityChanged(this, 8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i12 != 0 || i13 != 0) {
            BannerBridge.resize(this._bannerAdId, getLeft(), getRight(), i10, i11, Build.VERSION.SDK_INT >= 11 ? getAlpha() : 1.0f);
            Rect rect = new Rect();
            getHitRect(rect);
            if (((View) getParent()).getLocalVisibleRect(rect)) {
                onVisibilityChanged(this, 8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        if (view == this) {
            int i11 = this._lastVisibility;
            if (i11 == -1) {
                this._lastVisibility = i10;
                return;
            }
            if (i10 != 0 && i11 == 0) {
                BannerBridge.visibilityChanged(this._bannerAdId, i10);
            }
            this._lastVisibility = i10;
        }
    }

    public void setAlpha(float f10) {
        super.setAlpha(f10);
        onLayoutChange(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject) {
        this._webPlayerEventSettings = jSONObject;
    }

    public void setWebPlayerSettings(JSONObject jSONObject, JSONObject jSONObject2) {
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
    }
}
