package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.g;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;

public class p9 extends m9 {
    public p9(b bVar, Activity activity, k kVar) {
        super(bVar, activity, kVar);
    }

    public /* bridge */ /* synthetic */ void a(g gVar) {
        super.a(gVar);
    }

    public void a(g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f9330d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f9329c.l(), (this.f9329c.y0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f9330d.addView(kVar, this.f9331e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f9330d);
        } else {
            this.f9328b.setContentView(this.f9330d);
        }
    }
}
