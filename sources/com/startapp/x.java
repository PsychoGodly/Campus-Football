package com.startapp;

/* compiled from: Sta */
public class x implements r9 {

    /* renamed from: a  reason: collision with root package name */
    public final double f17518a;

    /* renamed from: b  reason: collision with root package name */
    public final double f17519b;

    /* renamed from: c  reason: collision with root package name */
    public final double f17520c;

    /* renamed from: d  reason: collision with root package name */
    public final double f17521d;

    /* renamed from: e  reason: collision with root package name */
    public final double f17522e;

    /* renamed from: f  reason: collision with root package name */
    public final double f17523f;

    /* renamed from: g  reason: collision with root package name */
    public double f17524g;

    /* renamed from: h  reason: collision with root package name */
    public long f17525h;

    /* renamed from: i  reason: collision with root package name */
    public double f17526i;

    public x(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 + d11;
        this.f17518a = d10 / d15;
        this.f17519b = d11 / d15;
        this.f17520c = d12;
        this.f17521d = d13;
        this.f17522e = d14;
        this.f17523f = k9.a(0.0d, d13, d14);
    }

    public static double a(long j10, long j11, double d10, double d11, double d12, double d13) {
        double max = ((double) Math.max(0, j10 - j11)) / d10;
        if (d12 > 0.0d) {
            return k9.a(max, d11, d12, d13);
        }
        if (d12 < 0.0d) {
            return k9.a(max, d11, d12) / d13;
        }
        return k9.a(max, d11, d12);
    }

    public void a(long j10, double d10) {
        double a10 = this.f17524g * a(j10, this.f17525h, this.f17520c, this.f17521d, this.f17522e, this.f17523f);
        double d11 = (this.f17519b * d10) + (this.f17518a * a10);
        this.f17526i = d11;
        if (a10 < d11) {
            this.f17524g = d11;
            this.f17525h = j10;
        }
    }

    public double a() {
        return this.f17526i;
    }
}
