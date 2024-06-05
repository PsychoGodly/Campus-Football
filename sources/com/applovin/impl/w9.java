package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.g;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;

public class w9 extends m9 {
    public w9(b bVar, Activity activity, k kVar) {
        super(bVar, activity, kVar);
    }

    public /* bridge */ /* synthetic */ void a(g gVar) {
        super.a(gVar);
    }

    public void a(ImageView imageView, g gVar, g gVar2, o oVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f9330d.addView(appLovinAdView);
        int i10 = 3;
        if (gVar != null) {
            a(this.f9329c.l(), (this.f9329c.E0() ? 3 : 5) | 48, gVar);
        }
        if (gVar2 != null) {
            if (!this.f9329c.y0()) {
                i10 = 5;
            }
            a(this.f9329c.l(), i10 | 48, gVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f9328b, ((Integer) this.f9327a.a(oj.f10458z2)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f9327a.a(oj.B2)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f9328b, ((Integer) this.f9327a.a(oj.A2)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f9330d.addView(imageView, layoutParams);
        }
        if (oVar != null) {
            this.f9330d.addView(oVar, this.f9331e);
        }
        if (kVar != null) {
            this.f9330d.addView(kVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f9330d);
        } else {
            this.f9328b.setContentView(this.f9330d);
        }
    }
}
