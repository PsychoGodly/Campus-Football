package com.startapp;

/* compiled from: Sta */
public class y2 implements r9 {

    /* renamed from: a  reason: collision with root package name */
    public final z2 f17556a;

    /* renamed from: b  reason: collision with root package name */
    public final z2 f17557b;

    /* renamed from: c  reason: collision with root package name */
    public final z2 f17558c;

    /* renamed from: d  reason: collision with root package name */
    public double f17559d;

    public y2(z2 z2Var, z2 z2Var2, z2 z2Var3) {
        this.f17556a = z2Var;
        this.f17557b = z2Var2;
        this.f17558c = z2Var3;
    }

    public void a(double d10, double d11, double d12) {
        this.f17556a.a(d10);
        this.f17557b.a(d11);
        this.f17558c.a(d12);
        double d13 = this.f17556a.f17579c;
        double d14 = this.f17557b.f17579c;
        double d15 = (d14 * d14) + (d13 * d13);
        double d16 = this.f17558c.f17579c;
        this.f17559d = Math.sqrt((d16 * d16) + d15);
    }

    public z2 b() {
        return this.f17556a;
    }

    public z2 c() {
        return this.f17557b;
    }

    public z2 d() {
        return this.f17558c;
    }

    public double a() {
        return this.f17559d;
    }
}
