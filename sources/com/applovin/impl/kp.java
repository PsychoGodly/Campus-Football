package com.applovin.impl;

import android.text.Layout;

final class kp {

    /* renamed from: a  reason: collision with root package name */
    private String f9068a;

    /* renamed from: b  reason: collision with root package name */
    private int f9069b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9070c;

    /* renamed from: d  reason: collision with root package name */
    private int f9071d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9072e;

    /* renamed from: f  reason: collision with root package name */
    private int f9073f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f9074g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f9075h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f9076i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f9077j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f9078k;

    /* renamed from: l  reason: collision with root package name */
    private String f9079l;

    /* renamed from: m  reason: collision with root package name */
    private int f9080m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f9081n = -1;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f9082o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f9083p;

    /* renamed from: q  reason: collision with root package name */
    private int f9084q = -1;

    /* renamed from: r  reason: collision with root package name */
    private yn f9085r;

    /* renamed from: s  reason: collision with root package name */
    private float f9086s = Float.MAX_VALUE;

    public kp a(kp kpVar) {
        return a(kpVar, true);
    }

    public int b() {
        if (this.f9070c) {
            return this.f9069b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String c() {
        return this.f9068a;
    }

    public float d() {
        return this.f9078k;
    }

    public int e() {
        return this.f9077j;
    }

    public String f() {
        return this.f9079l;
    }

    public Layout.Alignment g() {
        return this.f9083p;
    }

    public int h() {
        return this.f9081n;
    }

    public int i() {
        return this.f9080m;
    }

    public float j() {
        return this.f9086s;
    }

    public int k() {
        int i10 = this.f9075h;
        if (i10 == -1 && this.f9076i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f9076i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment l() {
        return this.f9082o;
    }

    public boolean m() {
        return this.f9084q == 1;
    }

    public yn n() {
        return this.f9085r;
    }

    public boolean o() {
        return this.f9072e;
    }

    public boolean p() {
        return this.f9070c;
    }

    public boolean q() {
        return this.f9073f == 1;
    }

    public boolean r() {
        return this.f9074g == 1;
    }

    public int a() {
        if (this.f9072e) {
            return this.f9071d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public kp c(int i10) {
        this.f9077j = i10;
        return this;
    }

    public kp d(int i10) {
        this.f9081n = i10;
        return this;
    }

    public kp e(int i10) {
        this.f9080m = i10;
        return this;
    }

    public kp c(boolean z10) {
        this.f9073f = z10 ? 1 : 0;
        return this;
    }

    public kp d(boolean z10) {
        this.f9084q = z10 ? 1 : 0;
        return this;
    }

    public kp e(boolean z10) {
        this.f9074g = z10 ? 1 : 0;
        return this;
    }

    public kp b(int i10) {
        this.f9069b = i10;
        this.f9070c = true;
        return this;
    }

    private kp a(kp kpVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kpVar != null) {
            if (!this.f9070c && kpVar.f9070c) {
                b(kpVar.f9069b);
            }
            if (this.f9075h == -1) {
                this.f9075h = kpVar.f9075h;
            }
            if (this.f9076i == -1) {
                this.f9076i = kpVar.f9076i;
            }
            if (this.f9068a == null && (str = kpVar.f9068a) != null) {
                this.f9068a = str;
            }
            if (this.f9073f == -1) {
                this.f9073f = kpVar.f9073f;
            }
            if (this.f9074g == -1) {
                this.f9074g = kpVar.f9074g;
            }
            if (this.f9081n == -1) {
                this.f9081n = kpVar.f9081n;
            }
            if (this.f9082o == null && (alignment2 = kpVar.f9082o) != null) {
                this.f9082o = alignment2;
            }
            if (this.f9083p == null && (alignment = kpVar.f9083p) != null) {
                this.f9083p = alignment;
            }
            if (this.f9084q == -1) {
                this.f9084q = kpVar.f9084q;
            }
            if (this.f9077j == -1) {
                this.f9077j = kpVar.f9077j;
                this.f9078k = kpVar.f9078k;
            }
            if (this.f9085r == null) {
                this.f9085r = kpVar.f9085r;
            }
            if (this.f9086s == Float.MAX_VALUE) {
                this.f9086s = kpVar.f9086s;
            }
            if (z10 && !this.f9072e && kpVar.f9072e) {
                a(kpVar.f9071d);
            }
            if (z10 && this.f9080m == -1 && (i10 = kpVar.f9080m) != -1) {
                this.f9080m = i10;
            }
        }
        return this;
    }

    public kp b(String str) {
        this.f9079l = str;
        return this;
    }

    public kp b(boolean z10) {
        this.f9076i = z10 ? 1 : 0;
        return this;
    }

    public kp b(float f10) {
        this.f9086s = f10;
        return this;
    }

    public kp b(Layout.Alignment alignment) {
        this.f9082o = alignment;
        return this;
    }

    public kp a(int i10) {
        this.f9071d = i10;
        this.f9072e = true;
        return this;
    }

    public kp a(boolean z10) {
        this.f9075h = z10 ? 1 : 0;
        return this;
    }

    public kp a(String str) {
        this.f9068a = str;
        return this;
    }

    public kp a(float f10) {
        this.f9078k = f10;
        return this;
    }

    public kp a(Layout.Alignment alignment) {
        this.f9083p = alignment;
        return this;
    }

    public kp a(yn ynVar) {
        this.f9085r = ynVar;
        return this;
    }
}
