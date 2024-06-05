package com.applovin.impl;

import java.util.Arrays;

public final class mc {

    /* renamed from: a  reason: collision with root package name */
    private int f9342a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f9343b;

    public mc() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f9342a;
        long[] jArr = this.f9343b;
        if (i10 == jArr.length) {
            this.f9343b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f9343b;
        int i11 = this.f9342a;
        this.f9342a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long[] b() {
        return Arrays.copyOf(this.f9343b, this.f9342a);
    }

    public mc(int i10) {
        this.f9343b = new long[i10];
    }

    public long a(int i10) {
        if (i10 >= 0 && i10 < this.f9342a) {
            return this.f9343b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f9342a);
    }

    public int a() {
        return this.f9342a;
    }
}
