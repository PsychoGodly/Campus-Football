package com.startapp.sdk.adsbase.cache;

import com.startapp.k;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.h;

/* compiled from: Sta */
public class f implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f16947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f16948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f16949c;

    public f(h hVar, h.a aVar, boolean z10) {
        this.f16949c = hVar;
        this.f16947a = aVar;
        this.f16948b = z10;
    }

    public void onFailedToReceiveAd(Ad ad2) {
        h hVar = this.f16949c;
        hVar.f16955e = null;
        hVar.a(this.f16948b);
    }

    public void onReceiveAd(Ad ad2) {
        k.b(this.f16949c.f16952b, this.f16947a, ad2, true);
    }
}
