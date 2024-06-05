package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.e;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public abstract class j1 {

    /* renamed from: a  reason: collision with root package name */
    public h f15944a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f15945b = null;

    /* renamed from: c  reason: collision with root package name */
    public Long f15946c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15947d = false;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            j1.this.c();
        }
    }

    public j1(h hVar) {
        this.f15944a = hVar;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f15946c = null;
        this.f15947d = false;
        h hVar = this.f15944a;
        if (hVar.f16963m < MetaData.f17070k.M()) {
            hVar.f16963m++;
            hVar.a((StartAppAd) null, (AdEventListener) null, true, false);
            return;
        }
        h.b bVar = hVar.f16966p;
        if (bVar != null) {
            ((e) bVar).a(hVar);
        }
    }

    public void d() {
        if (!this.f15947d) {
            if (this.f15946c == null) {
                this.f15946c = Long.valueOf(System.currentTimeMillis());
            }
            if (a()) {
                if (this.f15945b == null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    this.f15945b = new Handler(myLooper);
                }
                long b10 = b();
                if (b10 >= 0) {
                    this.f15947d = true;
                    this.f15945b.postDelayed(new a(), b10);
                }
            }
        }
    }

    public void e() {
        Handler handler = this.f15945b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.f15946c = null;
        this.f15947d = false;
    }
}
