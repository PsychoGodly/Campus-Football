package com.applovin.impl;

import com.applovin.impl.ej;
import java.util.Arrays;

public final class e3 implements ej {

    /* renamed from: a  reason: collision with root package name */
    public final int f7362a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f7363b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f7364c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f7365d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f7366e;

    /* renamed from: f  reason: collision with root package name */
    private final long f7367f;

    public e3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7363b = iArr;
        this.f7364c = jArr;
        this.f7365d = jArr2;
        this.f7366e = jArr3;
        int length = iArr.length;
        this.f7362a = length;
        if (length > 0) {
            int i10 = length - 1;
            this.f7367f = jArr2[i10] + jArr3[i10];
            return;
        }
        this.f7367f = 0;
    }

    public ej.a b(long j10) {
        int c10 = c(j10);
        gj gjVar = new gj(this.f7366e[c10], this.f7364c[c10]);
        if (gjVar.f8034a >= j10 || c10 == this.f7362a - 1) {
            return new ej.a(gjVar);
        }
        int i10 = c10 + 1;
        return new ej.a(gjVar, new gj(this.f7366e[i10], this.f7364c[i10]));
    }

    public boolean b() {
        return true;
    }

    public int c(long j10) {
        return yp.b(this.f7366e, j10, true, true);
    }

    public long d() {
        return this.f7367f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f7362a + ", sizes=" + Arrays.toString(this.f7363b) + ", offsets=" + Arrays.toString(this.f7364c) + ", timeUs=" + Arrays.toString(this.f7366e) + ", durationsUs=" + Arrays.toString(this.f7365d) + ")";
    }
}
