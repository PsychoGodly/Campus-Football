package com.applovin.impl;

import java.util.NoSuchElementException;

final class kb {

    /* renamed from: a  reason: collision with root package name */
    private int f8938a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f8939b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f8940c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f8941d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    private int f8942e = 15;

    private void b() {
        int[] iArr = this.f8941d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f8938a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f8941d, 0, iArr2, i11, i10);
            this.f8938a = 0;
            this.f8939b = this.f8940c - 1;
            this.f8941d = iArr2;
            this.f8942e = length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f8940c == this.f8941d.length) {
            b();
        }
        int i11 = (this.f8939b + 1) & this.f8942e;
        this.f8939b = i11;
        this.f8941d[i11] = i10;
        this.f8940c++;
    }

    public boolean c() {
        return this.f8940c == 0;
    }

    public int d() {
        int i10 = this.f8940c;
        if (i10 != 0) {
            int[] iArr = this.f8941d;
            int i11 = this.f8938a;
            int i12 = iArr[i11];
            this.f8938a = (i11 + 1) & this.f8942e;
            this.f8940c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }

    public void a() {
        this.f8938a = 0;
        this.f8939b = -1;
        this.f8940c = 0;
    }
}
