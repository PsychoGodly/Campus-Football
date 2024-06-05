package com.applovin.impl;

import java.util.Arrays;

final class tf {

    /* renamed from: a  reason: collision with root package name */
    private final int f12403a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12404b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12405c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f12406d;

    /* renamed from: e  reason: collision with root package name */
    public int f12407e;

    public tf(int i10, int i11) {
        this.f12403a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f12406d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f12404b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f12406d;
            int length = bArr2.length;
            int i13 = this.f12407e + i12;
            if (length < i13) {
                this.f12406d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f12406d, this.f12407e, i12);
            this.f12407e += i12;
        }
    }

    public void b() {
        this.f12404b = false;
        this.f12405c = false;
    }

    public void b(int i10) {
        boolean z10 = true;
        a1.b(!this.f12404b);
        if (i10 != this.f12403a) {
            z10 = false;
        }
        this.f12404b = z10;
        if (z10) {
            this.f12407e = 3;
            this.f12405c = false;
        }
    }

    public boolean a(int i10) {
        if (!this.f12404b) {
            return false;
        }
        this.f12407e -= i10;
        this.f12404b = false;
        this.f12405c = true;
        return true;
    }

    public boolean a() {
        return this.f12405c;
    }
}
