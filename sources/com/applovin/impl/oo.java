package com.applovin.impl;

final class oo {

    /* renamed from: a  reason: collision with root package name */
    public j6 f10499a;

    /* renamed from: b  reason: collision with root package name */
    public long f10500b;

    /* renamed from: c  reason: collision with root package name */
    public long f10501c;

    /* renamed from: d  reason: collision with root package name */
    public long f10502d;

    /* renamed from: e  reason: collision with root package name */
    public int f10503e;

    /* renamed from: f  reason: collision with root package name */
    public int f10504f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f10505g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f10506h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f10507i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public int[] f10508j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public long[] f10509k = new long[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean[] f10510l = new boolean[0];

    /* renamed from: m  reason: collision with root package name */
    public boolean f10511m;

    /* renamed from: n  reason: collision with root package name */
    public boolean[] f10512n = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public no f10513o;

    /* renamed from: p  reason: collision with root package name */
    public final yg f10514p = new yg();

    /* renamed from: q  reason: collision with root package name */
    public boolean f10515q;

    /* renamed from: r  reason: collision with root package name */
    public long f10516r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10517s;

    public void a(j8 j8Var) {
        j8Var.d(this.f10514p.c(), 0, this.f10514p.e());
        this.f10514p.f(0);
        this.f10515q = false;
    }

    public void b(int i10) {
        this.f10514p.d(i10);
        this.f10511m = true;
        this.f10515q = true;
    }

    public boolean c(int i10) {
        return this.f10511m && this.f10512n[i10];
    }

    public void a(yg ygVar) {
        ygVar.a(this.f10514p.c(), 0, this.f10514p.e());
        this.f10514p.f(0);
        this.f10515q = false;
    }

    public long a(int i10) {
        return this.f10509k[i10] + ((long) this.f10508j[i10]);
    }

    public void a(int i10, int i11) {
        this.f10503e = i10;
        this.f10504f = i11;
        if (this.f10506h.length < i10) {
            this.f10505g = new long[i10];
            this.f10506h = new int[i10];
        }
        if (this.f10507i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f10507i = new int[i12];
            this.f10508j = new int[i12];
            this.f10509k = new long[i12];
            this.f10510l = new boolean[i12];
            this.f10512n = new boolean[i12];
        }
    }

    public void a() {
        this.f10503e = 0;
        this.f10516r = 0;
        this.f10517s = false;
        this.f10511m = false;
        this.f10515q = false;
        this.f10513o = null;
    }
}
