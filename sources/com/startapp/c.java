package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f15666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f15667b;

    public c(d dVar, Context context) {
        this.f15667b = dVar;
        this.f15666a = context;
    }

    public void run() {
        try {
            f2.a(this.f15666a, DiskAdCacheManager.b());
            f2.a(this.f15666a, DiskAdCacheManager.a());
            CacheKey cacheKey = null;
            for (Map.Entry next : this.f15667b.f16929a.entrySet()) {
                CacheKey cacheKey2 = (CacheKey) next.getKey();
                if (cacheKey2.a() == AdPreferences.Placement.INAPP_SPLASH) {
                    cacheKey = cacheKey2;
                } else {
                    h hVar = (h) next.getValue();
                    Context context = this.f15666a;
                    AdPreferences.Placement a10 = cacheKey2.a();
                    AdPreferences adPreferences = hVar.f16954d;
                    String b10 = this.f15667b.b(cacheKey2);
                    int i10 = hVar.f16963m;
                    DiskAdCacheManager.DiskCacheKey diskCacheKey = new DiskAdCacheManager.DiskCacheKey(a10, adPreferences);
                    diskCacheKey.a(i10);
                    String b11 = DiskAdCacheManager.b();
                    if (b10 != null) {
                        f2.a(f2.b(context, b11), b10, (Serializable) diskCacheKey);
                    }
                    Context context2 = this.f15666a;
                    String b12 = this.f15667b.b(cacheKey2);
                    DiskAdCacheManager.DiskCachedAd diskCachedAd = new DiskAdCacheManager.DiskCachedAd(hVar.f16955e);
                    String a11 = DiskAdCacheManager.a();
                    if (b12 != null) {
                        try {
                            f2.a(f2.b(context2, a11), b12, (Serializable) diskCachedAd);
                        } catch (Throwable th) {
                            if (f2.a(4)) {
                                i3.a(th);
                            }
                        }
                    }
                }
            }
            if (cacheKey != null) {
                this.f15667b.f16929a.remove(cacheKey);
            }
        } catch (Throwable th2) {
            i3.a(th2);
        }
    }
}
