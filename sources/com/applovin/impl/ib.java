package com.applovin.impl;

import com.applovin.impl.ej;

public final class ib implements ej {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f8510a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8511b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8512c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8513d;

    public ib(long[] jArr, long[] jArr2, long j10) {
        a1.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f8513d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f8510a = jArr;
            this.f8511b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f8510a = jArr3;
            long[] jArr4 = new long[i10];
            this.f8511b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f8512c = j10;
    }

    public ej.a b(long j10) {
        if (!this.f8513d) {
            return new ej.a(gj.f8033c);
        }
        int b10 = yp.b(this.f8511b, j10, true, true);
        gj gjVar = new gj(this.f8511b[b10], this.f8510a[b10]);
        if (gjVar.f8034a == j10 || b10 == this.f8511b.length - 1) {
            return new ej.a(gjVar);
        }
        int i10 = b10 + 1;
        return new ej.a(gjVar, new gj(this.f8511b[i10], this.f8510a[i10]));
    }

    public long d() {
        return this.f8512c;
    }

    public boolean b() {
        return this.f8513d;
    }
}
