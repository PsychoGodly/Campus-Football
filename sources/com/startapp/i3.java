package com.startapp;

import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class i3 {

    /* renamed from: a  reason: collision with root package name */
    public final j3 f15911a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15912b;

    /* renamed from: c  reason: collision with root package name */
    public String f15913c;

    /* renamed from: d  reason: collision with root package name */
    public String f15914d;

    /* renamed from: e  reason: collision with root package name */
    public String f15915e;

    /* renamed from: f  reason: collision with root package name */
    public Object f15916f;

    /* renamed from: g  reason: collision with root package name */
    public String f15917g;

    /* renamed from: h  reason: collision with root package name */
    public Long f15918h;

    /* renamed from: i  reason: collision with root package name */
    public String f15919i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15920j;

    /* renamed from: k  reason: collision with root package name */
    public String f15921k;

    public i3(j3 j3Var) {
        if (j3Var != j3.f15953f) {
            this.f15911a = j3Var;
        } else {
            this.f15911a = j3.f15952e;
        }
        j3 j3Var2 = this.f15911a;
        if (j3Var2 == j3.f15952e || j3Var2 == j3.f15951d) {
            this.f15919i = j9.a(j9.a(0));
        }
        this.f15912b = 0;
    }

    public void a() {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.N.f16284a;
            if (componentLocator != null) {
                componentLocator.n().a(this, (n3) null);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return super.toString();
    }

    public void a(n3 n3Var) {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.N.f16284a;
            if (componentLocator != null) {
                componentLocator.n().a(this, (n3) null);
            } else {
                n3Var.a(this, 3);
            }
        } catch (Throwable unused) {
        }
    }

    public i3(Throwable th) {
        this.f15911a = j3.f15953f;
        this.f15915e = j9.b(th);
        this.f15914d = j9.a(j9.a(th));
        this.f15919i = j9.a(j9.a(1));
        this.f15912b = 0;
    }

    public static void a(Throwable th) {
        try {
            new i3(th).a();
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, j3 j3Var) {
        try {
            new i3(th, j3Var).a();
        } catch (Throwable unused) {
        }
    }

    public i3(Throwable th, j3 j3Var) {
        boolean z10 = j3Var == j3.f15954g;
        this.f15911a = j3Var;
        this.f15915e = j9.b(th);
        this.f15914d = j9.a(j9.a(th));
        this.f15919i = z10 ? th.getClass().getName() : j9.a(j9.a(1));
        this.f15912b = 0;
    }

    public i3(j3 j3Var, long j10) {
        this.f15911a = j3Var;
        this.f15912b = j10;
    }
}
