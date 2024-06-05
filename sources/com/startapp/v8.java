package com.startapp;

/* compiled from: Sta */
public class v8 {

    /* renamed from: a  reason: collision with root package name */
    public final y2 f17415a;

    /* renamed from: b  reason: collision with root package name */
    public final y2 f17416b;

    /* renamed from: c  reason: collision with root package name */
    public final z2 f17417c;

    /* renamed from: d  reason: collision with root package name */
    public final ca f17418d;

    /* renamed from: e  reason: collision with root package name */
    public final u9 f17419e = new u9();

    /* renamed from: f  reason: collision with root package name */
    public final z2 f17420f;

    /* renamed from: g  reason: collision with root package name */
    public final x f17421g;

    /* renamed from: h  reason: collision with root package name */
    public final t9 f17422h;

    /* renamed from: i  reason: collision with root package name */
    public final x f17423i;

    /* renamed from: j  reason: collision with root package name */
    public final s6 f17424j;

    /* renamed from: k  reason: collision with root package name */
    public final x f17425k;

    /* renamed from: l  reason: collision with root package name */
    public long f17426l;

    /* renamed from: m  reason: collision with root package name */
    public long f17427m;

    public v8(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25) {
        double d26 = d10;
        double d27 = d11;
        y2 y2Var = new y2(new z2(d10), new z2(d10), new z2(d10));
        this.f17415a = y2Var;
        this.f17416b = new y2(new z2(d11), new z2(d11), new z2(d11));
        double d28 = d12;
        this.f17417c = new z2(d12);
        double d29 = d14;
        double d30 = d15;
        this.f17418d = new ca(new da(d29, d30, y2Var.b()), new da(d29, d30, y2Var.c()), new da(d29, d30, y2Var.d()));
        this.f17420f = new z2(d13);
        double d31 = d21;
        double d32 = d22;
        double d33 = d23;
        double d34 = d24;
        double d35 = d25;
        this.f17421g = new x(d31, d32, d33, d34, d35);
        this.f17422h = new t9();
        this.f17423i = new x(d31, d32, d33, d34, d35);
        this.f17424j = new s6(5.0d, false);
        this.f17425k = new x(d16, d17, d18, d19, d20);
    }

    public void a(double d10, long j10) {
        this.f17425k.f17524g = Math.min(Math.max(0.0d, d10), 1.0d);
        this.f17425k.f17525h = j10;
    }

    public void a(long j10, long j11, double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16;
        double exp;
        long j12 = j10;
        long j13 = j11;
        double d17 = d10;
        double d18 = d11;
        double d19 = d12;
        if (this.f17427m < j13) {
            if (this.f17426l <= 0) {
                this.f17426l = j13;
            }
            y2 y2Var = this.f17415a;
            double d20 = y2Var.f17556a.f17579c;
            double d21 = y2Var.f17557b.f17579c;
            double d22 = y2Var.f17558c.f17579c;
            double d23 = d19;
            y2Var.a(d10, d11, d12);
            y2 y2Var2 = this.f17415a;
            double d24 = y2Var2.f17556a.f17579c - d20;
            double d25 = y2Var2.f17557b.f17579c - d21;
            double d26 = y2Var2.f17558c.f17579c - d22;
            double d27 = d26 * d26;
            double d28 = d27 + (d25 * d25) + (d24 * d24);
            this.f17421g.a(j12, k9.a(d28, 1.5d, 4.0d));
            this.f17423i.a(j12, k9.a(d28, 0.01d, 1000.0d));
            y2 y2Var3 = this.f17416b;
            y2 y2Var4 = this.f17415a;
            y2Var3.a(d17 - y2Var4.f17556a.f17579c, d18 - y2Var4.f17557b.f17579c, d23 - y2Var4.f17558c.f17579c);
            this.f17417c.a(this.f17416b.f17559d);
            ca caVar = this.f17418d;
            double d29 = d23;
            long j14 = j11;
            caVar.f15703a.a(j14, d17);
            caVar.f15704b.a(j14, d18);
            caVar.f15705c.a(j14, d29);
            da daVar = caVar.f15703a;
            double d30 = daVar.f15757q;
            da daVar2 = caVar.f15704b;
            double d31 = daVar2.f15757q;
            da daVar3 = caVar.f15705c;
            double d32 = daVar3.f15757q;
            double d33 = d30 + d31 + d32;
            double d34 = 1.0d - this.f17421g.f17526i;
            if (d33 > 0.0d) {
                caVar.f15706d = ((daVar.f15756p * d30) / d33) + ((daVar2.f15756p * d31) / d33) + ((daVar3.f15756p * d32) / d33);
                caVar.f15707e = d33 / 3.0d;
            } else {
                caVar.f15706d = 0.0d;
                caVar.f15707e = 0.0d;
            }
            double a10 = k9.a(((double) (j14 - this.f17426l)) / 1.0E9d, 10.0d, 1.0d);
            u9 u9Var = this.f17419e;
            ca caVar2 = this.f17418d;
            double d35 = caVar2.f15706d;
            double d36 = caVar2.f15707e;
            double d37 = this.f17417c.f17579c;
            u9Var.f17377a = (Math.min(Math.exp((-Math.pow(d35 - 7.0d, 2.0d)) / 1.0d) * 2.0d, 1.0d) * 1.0d) + (u9Var.f17377a * 0.0d);
            double d38 = u9Var.f17378b * 0.0d;
            if (d36 < 0.0d) {
                d14 = 1.0d;
                d13 = 0.0d;
            } else {
                if (d36 < 0.5d) {
                    d13 = Math.pow(d36 * 2.0d, 4.0d);
                } else if (d36 > 2.0d) {
                    d13 = Math.exp((2.0d - d36) * 6.0d);
                } else {
                    d14 = 1.0d;
                    d13 = 1.0d;
                }
                d14 = 1.0d;
            }
            u9Var.f17378b = (d13 * d14) + d38;
            double d39 = u9Var.f17379c * 0.0d;
            if (d37 < 0.0d) {
                d16 = 1.0d;
                d15 = 0.0d;
            } else {
                if (d37 < 0.5d) {
                    exp = Math.pow(d37 * 2.0d, 4.0d);
                } else if (d37 > 5.0d) {
                    exp = Math.exp((5.0d - d37) * 4.0d);
                } else {
                    d16 = 1.0d;
                    d15 = 1.0d;
                }
                d15 = exp;
                d16 = 1.0d;
            }
            double d40 = (d15 * d16) + d39;
            u9Var.f17379c = d40;
            double d41 = (d40 * 100.0d) / 270.0d;
            u9Var.f17380d = d41 + ((u9Var.f17378b * 70.0d) / 270.0d) + ((u9Var.f17377a * 100.0d) / 270.0d);
            this.f17420f.a(a10 * d34 * this.f17419e.f17380d);
            double d42 = this.f17420f.f17579c;
            t9 t9Var = this.f17422h;
            ca caVar3 = this.f17418d;
            double d43 = caVar3.f15706d;
            double d44 = caVar3.f15707e;
            this.f17424j.getClass();
            this.f17424j.getClass();
            t9Var.f17313a = (d43 * 0.050000000000000044d) + (t9Var.f17313a * 0.95d);
            t9Var.f17314b = (d44 * 0.050000000000000044d) + (t9Var.f17314b * 0.95d);
            t9Var.f17315c = (Math.abs(0.0d) * 0.0050000000000000044d) + (t9Var.f17315c * 0.995d);
            t9Var.f17316d = (Math.abs(0.0d) * 0.0050000000000000044d) + (t9Var.f17316d * 0.995d);
            t9Var.f17317e = ((((k9.a(t9Var.f17316d, 0.4d, 5.0d, t9.f17312i) * 1000.0d) / 5000.0d) + ((k9.a(t9Var.f17315c, 0.2d, 6.0d, t9.f17311h) * 1000.0d) / 5000.0d) + ((k9.a(t9Var.f17314b, 0.2d, 20.0d, t9.f17310g) * 1000.0d) / 5000.0d) + ((k9.a(t9Var.f17313a, 8.0d, 2.0d, t9.f17309f) * 2000.0d) / 5000.0d)) * 4.999999999999449E-4d) + (t9Var.f17317e * 0.9995d);
            x xVar = this.f17425k;
            double d45 = this.f17423i.f17526i;
            double d46 = (1.0d - d45) * a10 * this.f17422h.f17317e;
            xVar.a(j10, d46 + (d42 * d45));
            this.f17427m = j11;
        }
    }
}
