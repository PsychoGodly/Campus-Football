package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;

/* compiled from: Sta */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16970a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.c f16971b;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ((b) i.this.f16971b).f16926a.f16931c = false;
        }
    }

    public i(Context context, DiskAdCacheManager.c cVar) {
        this.f16970a = context;
        this.f16971b = cVar;
    }

    public void run() {
        try {
            f2.a(this.f16970a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new a());
        } catch (Throwable th) {
            i3.a(th);
        }
    }
}
