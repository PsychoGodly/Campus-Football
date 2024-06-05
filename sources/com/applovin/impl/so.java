package com.applovin.impl;

final class so {

    /* renamed from: a  reason: collision with root package name */
    public final mo f12158a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12159b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f12160c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f12161d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12162e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f12163f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f12164g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12165h;

    public so(mo moVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        a1.a(iArr.length == jArr2.length);
        a1.a(jArr.length == jArr2.length);
        a1.a(iArr2.length == jArr2.length ? true : z10);
        this.f12158a = moVar;
        this.f12160c = jArr;
        this.f12161d = iArr;
        this.f12162e = i10;
        this.f12163f = jArr2;
        this.f12164g = iArr2;
        this.f12165h = j10;
        this.f12159b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int b10 = yp.b(this.f12163f, j10, true, false); b10 >= 0; b10--) {
            if ((this.f12164g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int a10 = yp.a(this.f12163f, j10, true, false); a10 < this.f12163f.length; a10++) {
            if ((this.f12164g[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }
}
