package com.startapp;

/* compiled from: Sta */
public class z2 implements r9 {

    /* renamed from: a  reason: collision with root package name */
    public final double f17577a;

    /* renamed from: b  reason: collision with root package name */
    public final double f17578b;

    /* renamed from: c  reason: collision with root package name */
    public double f17579c;

    public z2(double d10) {
        double d11 = d10 + 1.0d;
        this.f17577a = d10 / d11;
        this.f17578b = 1.0d / d11;
    }

    public void a(double d10) {
        this.f17579c = (d10 * this.f17578b) + (this.f17577a * this.f17579c);
    }

    public double a() {
        return this.f17579c;
    }
}
