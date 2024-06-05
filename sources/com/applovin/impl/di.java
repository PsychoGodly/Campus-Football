package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;

final class di {

    /* renamed from: a  reason: collision with root package name */
    private final io f7242a = new io(0);

    /* renamed from: b  reason: collision with root package name */
    private final yg f7243b = new yg();

    /* renamed from: c  reason: collision with root package name */
    private boolean f7244c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7245d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7246e;

    /* renamed from: f  reason: collision with root package name */
    private long f7247f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f7248g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f7249h = -9223372036854775807L;

    di() {
    }

    private static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    public io b() {
        return this.f7242a;
    }

    public boolean c() {
        return this.f7244c;
    }

    private int b(j8 j8Var, qh qhVar) {
        int min = (int) Math.min(20000, j8Var.a());
        long j10 = (long) 0;
        if (j8Var.f() != j10) {
            qhVar.f10991a = j10;
            return 1;
        }
        this.f7243b.d(min);
        j8Var.b();
        j8Var.c(this.f7243b.c(), 0, min);
        this.f7247f = a(this.f7243b);
        this.f7245d = true;
        return 0;
    }

    private int c(j8 j8Var, qh qhVar) {
        long a10 = j8Var.a();
        int min = (int) Math.min(20000, a10);
        long j10 = a10 - ((long) min);
        if (j8Var.f() != j10) {
            qhVar.f10991a = j10;
            return 1;
        }
        this.f7243b.d(min);
        j8Var.b();
        j8Var.c(this.f7243b.c(), 0, min);
        this.f7248g = b(this.f7243b);
        this.f7246e = true;
        return 0;
    }

    private int a(j8 j8Var) {
        this.f7243b.a(yp.f13667f);
        this.f7244c = true;
        j8Var.b();
        return 0;
    }

    public long a() {
        return this.f7249h;
    }

    private int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10 + 2] & 255) << 8);
    }

    private long b(yg ygVar) {
        int d10 = ygVar.d();
        for (int e10 = ygVar.e() - 4; e10 >= d10; e10--) {
            if (a(ygVar.c(), e10) == 442) {
                ygVar.f(e10 + 4);
                long c10 = c(ygVar);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long c(yg ygVar) {
        int d10 = ygVar.d();
        if (ygVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ygVar.a(bArr, 0, 9);
        ygVar.f(d10);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return b(bArr);
    }

    public int a(j8 j8Var, qh qhVar) {
        if (!this.f7246e) {
            return c(j8Var, qhVar);
        }
        if (this.f7248g == -9223372036854775807L) {
            return a(j8Var);
        }
        if (!this.f7245d) {
            return b(j8Var, qhVar);
        }
        long j10 = this.f7247f;
        if (j10 == -9223372036854775807L) {
            return a(j8Var);
        }
        long b10 = this.f7242a.b(this.f7248g) - this.f7242a.b(j10);
        this.f7249h = b10;
        if (b10 < 0) {
            kc.d("PsDurationReader", "Invalid duration: " + this.f7249h + ". Using TIME_UNSET instead.");
            this.f7249h = -9223372036854775807L;
        }
        return a(j8Var);
    }

    private static long b(byte[] bArr) {
        long j10 = (long) bArr[0];
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j12 = (long) bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private long a(yg ygVar) {
        int e10 = ygVar.e();
        for (int d10 = ygVar.d(); d10 < e10 - 3; d10++) {
            if (a(ygVar.c(), d10) == 442) {
                ygVar.f(d10 + 4);
                long c10 = c(ygVar);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }
}
