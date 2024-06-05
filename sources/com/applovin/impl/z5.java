package com.applovin.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class z5 implements j8 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f13789a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final e5 f13790b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13791c;

    /* renamed from: d  reason: collision with root package name */
    private long f13792d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f13793e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    private int f13794f;

    /* renamed from: g  reason: collision with root package name */
    private int f13795g;

    public z5(e5 e5Var, long j10, long j11) {
        this.f13790b = e5Var;
        this.f13792d = j10;
        this.f13791c = j11;
    }

    private void d(int i10) {
        if (i10 != -1) {
            this.f13792d += (long) i10;
        }
    }

    private void e(int i10) {
        int i11 = this.f13794f + i10;
        byte[] bArr = this.f13793e;
        if (i11 > bArr.length) {
            this.f13793e = Arrays.copyOf(this.f13793e, yp.a(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private void g(int i10) {
        int i11 = this.f13795g - i10;
        this.f13795g = i11;
        this.f13794f = 0;
        byte[] bArr = this.f13793e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[(65536 + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f13793e = bArr2;
    }

    public boolean a(int i10, boolean z10) {
        e(i10);
        int i11 = this.f13795g - this.f13794f;
        while (i11 < i10) {
            i11 = a(this.f13793e, this.f13794f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f13795g = this.f13794f + i11;
        }
        this.f13794f += i10;
        return true;
    }

    public int b(byte[] bArr, int i10, int i11) {
        int i12;
        e(i11);
        int i13 = this.f13795g;
        int i14 = this.f13794f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = a(this.f13793e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f13795g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f13793e, this.f13794f, bArr, i10, i12);
        this.f13794f += i12;
        return i12;
    }

    public void c(int i10) {
        a(i10, false);
    }

    public long f() {
        return this.f13792d;
    }

    private int f(int i10) {
        int min = Math.min(this.f13795g, i10);
        g(min);
        return min;
    }

    public void c(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    public long d() {
        return this.f13792d + ((long) this.f13794f);
    }

    public void d(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11, false);
    }

    private int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f13795g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f13793e, 0, bArr, i10, min);
        g(min);
        return min;
    }

    public long a() {
        return this.f13791c;
    }

    public int a(byte[] bArr, int i10, int i11) {
        int e10 = e(bArr, i10, i11);
        if (e10 == 0) {
            e10 = a(bArr, i10, i11, 0, true);
        }
        d(e10);
        return e10;
    }

    public boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f13793e, this.f13794f - i11, bArr, i10, i11);
        return true;
    }

    public boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        int e10 = e(bArr, i10, i11);
        while (e10 < i11 && e10 != -1) {
            e10 = a(bArr, i10, i11, e10, z10);
        }
        d(e10);
        return e10 != -1;
    }

    public void b() {
        this.f13794f = 0;
    }

    public int b(int i10) {
        int f10 = f(i10);
        if (f10 == 0) {
            byte[] bArr = this.f13789a;
            f10 = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        d(f10);
        return f10;
    }

    public void a(int i10) {
        b(i10, false);
    }

    private int a(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int a10 = this.f13790b.a(bArr, i10 + i12, i11 - i12);
            if (a10 != -1) {
                return i12 + a10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public boolean b(int i10, boolean z10) {
        int f10 = f(i10);
        while (f10 < i10 && f10 != -1) {
            f10 = a(this.f13789a, -f10, Math.min(i10, this.f13789a.length + f10), f10, z10);
        }
        d(f10);
        return f10 != -1;
    }
}
