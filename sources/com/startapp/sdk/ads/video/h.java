package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import com.startapp.sdk.adsbase.cache.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList<CachedVideoAd> f16674a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f16675b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16676c;

    /* renamed from: d  reason: collision with root package name */
    public final d f16677d;

    public h(Context context, Executor executor, d dVar) {
        this.f16675b = context;
        this.f16676c = executor;
        this.f16677d = dVar;
    }

    public boolean a(int i10) {
        ArrayList arrayList;
        boolean z10;
        Iterator it = this.f16674a.iterator();
        boolean z11 = false;
        while (it.hasNext() && this.f16674a.size() > i10) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            d dVar = this.f16677d;
            String a10 = cachedVideoAd.a();
            synchronized (dVar) {
                arrayList = new ArrayList(dVar.f16929a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                }
                com.startapp.sdk.adsbase.d dVar2 = ((com.startapp.sdk.adsbase.cache.h) it2.next()).f16955e;
                if (dVar2 instanceof VideoEnabledAd) {
                    VideoEnabledAd videoEnabledAd = (VideoEnabledAd) dVar2;
                    if (!(videoEnabledAd.x() == null || videoEnabledAd.x().c() == null || !videoEnabledAd.x().c().equals(a10))) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                it.remove();
                if (cachedVideoAd.a() != null) {
                    new File(cachedVideoAd.a()).delete();
                }
                z11 = true;
            }
        }
        return z11;
    }
}
