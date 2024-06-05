package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;

/* compiled from: Sta */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16977a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16978b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AdEventListener f16979c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.a f16980d;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DiskAdCacheManager.DiskCachedAd f16981a;

        public a(DiskAdCacheManager.DiskCachedAd diskCachedAd) {
            this.f16981a = diskCachedAd;
        }

        public void run() {
            try {
                DiskAdCacheManager.DiskCachedAd diskCachedAd = this.f16981a;
                if (diskCachedAd == null) {
                    k kVar = k.this;
                    DiskAdCacheManager.a(kVar.f16977a, kVar.f16979c);
                    return;
                }
                if (diskCachedAd.a() != null) {
                    if (this.f16981a.a().isReady()) {
                        if (this.f16981a.a().d()) {
                            k kVar2 = k.this;
                            DiskAdCacheManager.a(kVar2.f16977a, kVar2.f16979c);
                            return;
                        }
                        k kVar3 = k.this;
                        DiskAdCacheManager.a(kVar3.f16977a, this.f16981a, kVar3.f16980d, kVar3.f16979c);
                        return;
                    }
                }
                k kVar4 = k.this;
                DiskAdCacheManager.a(kVar4.f16977a, kVar4.f16979c);
            } catch (Throwable th) {
                i3.a(th);
                k kVar5 = k.this;
                DiskAdCacheManager.a(kVar5.f16977a, kVar5.f16979c);
            }
        }
    }

    public k(Context context, String str, AdEventListener adEventListener, DiskAdCacheManager.a aVar) {
        this.f16977a = context;
        this.f16978b = str;
        this.f16979c = adEventListener;
        this.f16980d = aVar;
    }

    public void run() {
        Object obj;
        try {
            Context context = this.f16977a;
            String a10 = DiskAdCacheManager.a();
            String str = this.f16978b;
            obj = null;
            if (str != null) {
                obj = f2.a(f2.b(context, a10), str);
            }
        } catch (Throwable th) {
            i3.a(th);
            DiskAdCacheManager.a(this.f16977a, this.f16979c);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a((DiskAdCacheManager.DiskCachedAd) obj));
    }
}
