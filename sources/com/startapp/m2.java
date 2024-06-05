package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* compiled from: Sta */
public class m2 extends r0 {

    /* renamed from: m  reason: collision with root package name */
    public int f16130m = 0;

    public m2(Context context, HtmlAd htmlAd, int i10, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, false);
        this.f16130m = i10;
    }

    public void a(boolean z10) {
        super.a(z10);
        c(z10);
    }

    public GetAdRequest d() {
        BannerStandardAd bannerStandardAd = (BannerStandardAd) this.f16910b;
        k0 k0Var = new k0();
        a((GetAdRequest) k0Var);
        k0Var.L = bannerStandardAd.q();
        k0Var.M = bannerStandardAd.j();
        k0Var.C0 = this.f16130m;
        k0Var.f17038s0 = BannerMetaData.f16423b.a().f();
        k0Var.U0 = bannerStandardAd.x();
        k0Var.V0 = bannerStandardAd.v();
        k0Var.f(this.f16909a);
        return k0Var;
    }
}
