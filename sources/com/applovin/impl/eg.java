package com.applovin.impl;

import java.util.Arrays;

final class eg {

    /* renamed from: a  reason: collision with root package name */
    private final fg f7421a = new fg();

    /* renamed from: b  reason: collision with root package name */
    private final yg f7422b = new yg(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f7423c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f7424d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7425e;

    eg() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f7424d = 0;
        do {
            int i13 = this.f7424d;
            int i14 = i10 + i13;
            fg fgVar = this.f7421a;
            if (i14 >= fgVar.f7782g) {
                break;
            }
            int[] iArr = fgVar.f7785j;
            this.f7424d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public yg b() {
        return this.f7422b;
    }

    public void c() {
        this.f7421a.a();
        this.f7422b.d(0);
        this.f7423c = -1;
        this.f7425e = false;
    }

    public void d() {
        if (this.f7422b.c().length != 65025) {
            yg ygVar = this.f7422b;
            ygVar.a(Arrays.copyOf(ygVar.c(), Math.max(65025, this.f7422b.e())), this.f7422b.e());
        }
    }

    public fg a() {
        return this.f7421a;
    }

    public boolean a(j8 j8Var) {
        int i10;
        a1.b(j8Var != null);
        if (this.f7425e) {
            this.f7425e = false;
            this.f7422b.d(0);
        }
        while (!this.f7425e) {
            if (this.f7423c < 0) {
                if (!this.f7421a.a(j8Var) || !this.f7421a.a(j8Var, true)) {
                    return false;
                }
                fg fgVar = this.f7421a;
                int i11 = fgVar.f7783h;
                if ((fgVar.f7777b & 1) == 1 && this.f7422b.e() == 0) {
                    i11 += a(0);
                    i10 = this.f7424d;
                } else {
                    i10 = 0;
                }
                if (!l8.a(j8Var, i11)) {
                    return false;
                }
                this.f7423c = i10;
            }
            int a10 = a(this.f7423c);
            int i12 = this.f7423c + this.f7424d;
            if (a10 > 0) {
                yg ygVar = this.f7422b;
                ygVar.a(ygVar.e() + a10);
                if (!l8.b(j8Var, this.f7422b.c(), this.f7422b.e(), a10)) {
                    return false;
                }
                yg ygVar2 = this.f7422b;
                ygVar2.e(ygVar2.e() + a10);
                this.f7425e = this.f7421a.f7785j[i12 + -1] != 255;
            }
            if (i12 == this.f7421a.f7782g) {
                i12 = -1;
            }
            this.f7423c = i12;
        }
        return true;
    }
}
