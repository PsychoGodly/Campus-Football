package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.cache.d;
import java.util.List;

/* compiled from: Sta */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16973a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.b f16974b;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f16975a;

        public a(List list) {
            this.f16975a = list;
        }

        public void run() {
            DiskAdCacheManager.b bVar = j.this.f16974b;
            List<DiskAdCacheManager.DiskCacheKey> list = this.f16975a;
            a aVar = (a) bVar;
            aVar.getClass();
            if (list != null) {
                try {
                    for (DiskAdCacheManager.DiskCacheKey diskCacheKey : list) {
                        if (aVar.f16925b.a(diskCacheKey.placement)) {
                            aVar.f16925b.a(aVar.f16924a, (StartAppAd) null, diskCacheKey.placement, diskCacheKey.adPreferences, (d.C0170d) null, true, diskCacheKey.a());
                        }
                    }
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
            d dVar = aVar.f16925b;
            Context context = aVar.f16924a;
            dVar.f16932d = false;
            for (d.e eVar : dVar.f16933e) {
                if (dVar.a(eVar.f16943b)) {
                    dVar.a(context, eVar.f16942a, eVar.f16943b, eVar.f16944c, new c(dVar, eVar), false, 0);
                }
            }
            dVar.f16933e.clear();
        }
    }

    public j(Context context, DiskAdCacheManager.b bVar) {
        this.f16973a = context;
        this.f16974b = bVar;
    }

    public void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new a(f2.d(this.f16973a, DiskAdCacheManager.b())));
        } catch (Throwable th) {
            i3.a(th);
        }
    }
}
