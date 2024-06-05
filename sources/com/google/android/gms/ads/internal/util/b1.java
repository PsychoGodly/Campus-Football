package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private long f14770a;

    /* renamed from: b  reason: collision with root package name */
    private long f14771b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final Object f14772c = new Object();

    public b1(long j10) {
        this.f14770a = j10;
    }

    public final void a(long j10) {
        synchronized (this.f14772c) {
            this.f14770a = j10;
        }
    }

    public final boolean b() {
        synchronized (this.f14772c) {
            long b10 = t.b().b();
            if (this.f14771b + this.f14770a > b10) {
                return false;
            }
            this.f14771b = b10;
            return true;
        }
    }
}
