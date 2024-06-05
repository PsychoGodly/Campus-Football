package com.applovin.impl;

final class jk {

    /* renamed from: a  reason: collision with root package name */
    private final yg f8781a = new yg(8);

    /* renamed from: b  reason: collision with root package name */
    private int f8782b;

    private long a(j8 j8Var) {
        int i10 = 0;
        j8Var.c(this.f8781a.c(), 0, 1);
        byte b10 = this.f8781a.c()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        j8Var.c(this.f8781a.c(), 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f8781a.c()[i10] & 255) + (i13 << 8);
        }
        this.f8782b += i12 + 1;
        return (long) i13;
    }

    public boolean b(j8 j8Var) {
        long a10;
        int i10;
        long a11 = j8Var.a();
        long j10 = 1024;
        int i11 = (a11 > -1 ? 1 : (a11 == -1 ? 0 : -1));
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        j8Var.c(this.f8781a.c(), 0, 4);
        long y10 = this.f8781a.y();
        this.f8782b = 4;
        while (y10 != 440786851) {
            int i13 = this.f8782b + 1;
            this.f8782b = i13;
            if (i13 == i12) {
                return false;
            }
            j8Var.c(this.f8781a.c(), 0, 1);
            y10 = ((y10 << 8) & -256) | ((long) (this.f8781a.c()[0] & 255));
        }
        long a12 = a(j8Var);
        long j11 = (long) this.f8782b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = (((long) this.f8782b) > (j11 + a12) ? 1 : (((long) this.f8782b) == (j11 + a12) ? 0 : -1));
            if (i14 < 0) {
                if (a(j8Var) != Long.MIN_VALUE && a10 >= 0 && a10 <= 2147483647L) {
                    if (i10 != 0) {
                        int a13 = (int) (a10 = a(j8Var));
                        j8Var.c(a13);
                        this.f8782b += a13;
                    }
                }
            } else if (i14 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
