package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* compiled from: Sta */
public class l2 extends s0 {

    /* renamed from: i  reason: collision with root package name */
    public int f16090i = 0;

    public l2(Context context, Banner3DAd banner3DAd, int i10, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, banner3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER);
        this.f16090i = i10;
    }

    public void a(Ad ad2) {
    }

    public GetAdRequest d() {
        k0 k0Var = new k0();
        a((GetAdRequest) k0Var);
        k0Var.f17038s0 = BannerMetaData.f16423b.a().a();
        k0Var.C0 = this.f16090i;
        k0Var.U0 = ((Banner3DAd) this.f16910b).i();
        k0Var.f(this.f16909a);
        return k0Var;
    }
}
