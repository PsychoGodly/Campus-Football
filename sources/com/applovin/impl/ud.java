package com.applovin.impl;

import com.applovin.impl.wd;

final class ud {

    /* renamed from: a  reason: collision with root package name */
    public final wd.a f12551a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12552b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12553c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12554d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12555e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12556f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12557g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12558h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12559i;

    ud(wd.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = z10;
        boolean z15 = z11;
        boolean z16 = z12;
        boolean z17 = z13;
        boolean z18 = false;
        a1.a(!z17 || z15);
        a1.a(!z16 || z15);
        if (!z14 || (!z15 && !z16 && !z17)) {
            z18 = true;
        }
        a1.a(z18);
        this.f12551a = aVar;
        this.f12552b = j10;
        this.f12553c = j11;
        this.f12554d = j12;
        this.f12555e = j13;
        this.f12556f = z14;
        this.f12557g = z15;
        this.f12558h = z16;
        this.f12559i = z17;
    }

    public ud a(long j10) {
        if (j10 == this.f12553c) {
            return this;
        }
        return new ud(this.f12551a, this.f12552b, j10, this.f12554d, this.f12555e, this.f12556f, this.f12557g, this.f12558h, this.f12559i);
    }

    public ud b(long j10) {
        if (j10 == this.f12552b) {
            return this;
        }
        return new ud(this.f12551a, j10, this.f12553c, this.f12554d, this.f12555e, this.f12556f, this.f12557g, this.f12558h, this.f12559i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ud.class != obj.getClass()) {
            return false;
        }
        ud udVar = (ud) obj;
        if (this.f12552b == udVar.f12552b && this.f12553c == udVar.f12553c && this.f12554d == udVar.f12554d && this.f12555e == udVar.f12555e && this.f12556f == udVar.f12556f && this.f12557g == udVar.f12557g && this.f12558h == udVar.f12558h && this.f12559i == udVar.f12559i && yp.a((Object) this.f12551a, (Object) udVar.f12551a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f12551a.hashCode() + 527) * 31) + ((int) this.f12552b)) * 31) + ((int) this.f12553c)) * 31) + ((int) this.f12554d)) * 31) + ((int) this.f12555e)) * 31) + (this.f12556f ? 1 : 0)) * 31) + (this.f12557g ? 1 : 0)) * 31) + (this.f12558h ? 1 : 0)) * 31) + (this.f12559i ? 1 : 0);
    }
}
