package com.startapp;

/* compiled from: Sta */
public class da {

    /* renamed from: a  reason: collision with root package name */
    public final b f15741a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final long f15742b;

    /* renamed from: c  reason: collision with root package name */
    public final double f15743c;

    /* renamed from: d  reason: collision with root package name */
    public final r9 f15744d;

    /* renamed from: e  reason: collision with root package name */
    public double f15745e;

    /* renamed from: f  reason: collision with root package name */
    public double f15746f;

    /* renamed from: g  reason: collision with root package name */
    public double f15747g;

    /* renamed from: h  reason: collision with root package name */
    public long f15748h;

    /* renamed from: i  reason: collision with root package name */
    public long f15749i;

    /* renamed from: j  reason: collision with root package name */
    public double f15750j;

    /* renamed from: k  reason: collision with root package name */
    public long f15751k;

    /* renamed from: l  reason: collision with root package name */
    public long f15752l;

    /* renamed from: m  reason: collision with root package name */
    public a f15753m;

    /* renamed from: n  reason: collision with root package name */
    public a f15754n;

    /* renamed from: o  reason: collision with root package name */
    public int f15755o;

    /* renamed from: p  reason: collision with root package name */
    public double f15756p;

    /* renamed from: q  reason: collision with root package name */
    public double f15757q;

    /* renamed from: r  reason: collision with root package name */
    public double f15758r;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a f15759a;

        /* renamed from: b  reason: collision with root package name */
        public long f15760b;

        /* renamed from: c  reason: collision with root package name */
        public long f15761c;

        /* renamed from: d  reason: collision with root package name */
        public int f15762d;

        /* renamed from: e  reason: collision with root package name */
        public double f15763e;
    }

    /* compiled from: Sta */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public a f15764a;
    }

    public da(double d10, double d11, r9 r9Var) {
        this.f15742b = (long) (d10 * 1.0E9d);
        this.f15743c = d11;
        this.f15744d = r9Var;
    }

    public void a(long j10, double d10) {
        a aVar;
        this.f15745e = this.f15746f;
        this.f15746f = this.f15747g;
        this.f15747g = d10;
        this.f15748h = this.f15749i;
        this.f15749i = j10;
        long j11 = j10 - this.f15742b;
        while (true) {
            a aVar2 = this.f15753m;
            if (aVar2 == null || aVar2.f15760b >= j11 || (aVar = aVar2.f15759a) == null || aVar.f15760b >= j11) {
                b bVar = this.f15741a;
                a aVar3 = bVar.f15764a;
            } else {
                this.f15753m = aVar;
                this.f15755o -= aVar2.f15762d;
                this.f15758r -= aVar2.f15763e;
                b bVar2 = this.f15741a;
                aVar2.f15759a = bVar2.f15764a;
                bVar2.f15764a = aVar2;
            }
        }
        b bVar3 = this.f15741a;
        a aVar32 = bVar3.f15764a;
        if (aVar32 == null) {
            aVar32 = new a();
        } else {
            bVar3.f15764a = aVar32.f15759a;
            aVar32.f15759a = null;
            aVar32.f15760b = 0;
            aVar32.f15761c = 0;
            aVar32.f15762d = 0;
            aVar32.f15763e = 0.0d;
        }
        aVar32.f15760b = this.f15749i;
        aVar32.f15761c = this.f15752l;
        double a10 = this.f15744d.a();
        double d11 = this.f15745e;
        double d12 = this.f15746f;
        if (d11 < d12 && d12 > this.f15747g) {
            double d13 = d12 - a10;
            if (d13 > this.f15743c) {
                this.f15750j = d13;
                this.f15751k = this.f15748h;
            }
        }
        if (d12 > a10 && a10 > this.f15747g && this.f15751k > this.f15752l) {
            this.f15752l = this.f15749i;
            aVar32.f15762d = 1;
            aVar32.f15763e = this.f15750j;
        }
        int i10 = this.f15755o + aVar32.f15762d;
        this.f15755o = i10;
        double d14 = this.f15758r + aVar32.f15763e;
        this.f15758r = d14;
        a aVar4 = this.f15754n;
        if (aVar4 != null) {
            aVar4.f15759a = aVar32;
        }
        this.f15754n = aVar32;
        if (this.f15753m == null) {
            this.f15753m = aVar32;
        }
        long j12 = this.f15752l - this.f15753m.f15761c;
        if (j12 > 0) {
            this.f15756p = ((double) i10) / (((double) j12) / 1.0E9d);
        }
        if (i10 > 0) {
            this.f15757q = d14 / ((double) i10);
        } else {
            this.f15757q = 0.0d;
        }
    }
}
