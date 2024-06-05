package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.f2;
import com.startapp.sdk.ads.video.j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* compiled from: Sta */
public class f implements j.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j.b f16669a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f16670b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f16671c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f16672d;

    public f(h hVar, j.b bVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f16672d = hVar;
        this.f16669a = bVar;
        this.f16670b = cachedVideoAd;
        this.f16671c = context;
    }

    public void a(String str) {
        j.b bVar = this.f16669a;
        if (bVar != null) {
            bVar.a(str);
        }
        if (str != null) {
            this.f16670b.a(System.currentTimeMillis());
            this.f16670b.a(str);
            h hVar = this.f16672d;
            Context context = this.f16671c;
            CachedVideoAd cachedVideoAd = this.f16670b;
            hVar.f16674a.remove(cachedVideoAd);
            hVar.a(AdsCommonMetaData.f16770h.G().b() - 1);
            hVar.f16674a.add(cachedVideoAd);
            f2.b(context, "CachedAds", hVar.f16674a);
        }
    }
}
