package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import com.startapp.sdk.adsbase.cache.h;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class i1 extends j1 {

    /* renamed from: e  reason: collision with root package name */
    public final FailuresHandler f15908e = CacheMetaData.b().a().c();

    /* renamed from: f  reason: collision with root package name */
    public int f15909f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15910g = false;

    public i1(h hVar) {
        super(hVar);
    }

    public boolean a() {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        if (!(startAppSDKInternal.f16809c && !startAppSDKInternal.f16810d && !startAppSDKInternal.f16812f)) {
            return false;
        }
        FailuresHandler failuresHandler = this.f15908e;
        if (!((failuresHandler == null || failuresHandler.a() == null) ? false : true)) {
            return false;
        }
        if (this.f15910g) {
            return this.f15908e.b();
        }
        return true;
    }

    public long b() {
        Long l10;
        if (this.f15909f >= this.f15908e.a().size() || (l10 = this.f15946c) == null) {
            return -1;
        }
        long millis = TimeUnit.SECONDS.toMillis((long) this.f15908e.a().get(this.f15909f).intValue()) - (System.currentTimeMillis() - l10.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0;
    }

    public void c() {
        if (this.f15909f == this.f15908e.a().size() - 1) {
            this.f15910g = true;
        } else {
            this.f15909f++;
        }
        super.c();
    }

    public void f() {
        e();
        this.f15909f = 0;
        this.f15910g = false;
    }
}
