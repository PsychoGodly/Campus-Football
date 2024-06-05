package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class k3 {

    /* renamed from: a  reason: collision with root package name */
    public final double f16019a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16020b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16021c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16022d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16023e;

    /* renamed from: f  reason: collision with root package name */
    public final long f16024f;

    /* renamed from: g  reason: collision with root package name */
    public final List<m3> f16025g;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f16026a = 1.0d;

        /* renamed from: b  reason: collision with root package name */
        public int f16027b;

        /* renamed from: c  reason: collision with root package name */
        public int f16028c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16029d;

        /* renamed from: e  reason: collision with root package name */
        public String f16030e;

        /* renamed from: f  reason: collision with root package name */
        public String f16031f;

        /* renamed from: g  reason: collision with root package name */
        public List<m3> f16032g;

        public double a() {
            return this.f16026a;
        }

        public List<m3> b() {
            return this.f16032g;
        }

        public String c() {
            return this.f16031f;
        }

        public int d() {
            return this.f16027b;
        }

        public int e() {
            return this.f16028c;
        }

        public String f() {
            return this.f16030e;
        }

        public boolean g() {
            return this.f16029d;
        }

        public a a(m3 m3Var) {
            if (this.f16032g == null) {
                this.f16032g = new ArrayList();
            }
            this.f16032g.add(m3Var);
            return this;
        }
    }

    public k3(a aVar) {
        this.f16019a = aVar.a();
        this.f16020b = aVar.d();
        this.f16021c = aVar.e();
        this.f16022d = aVar.g();
        this.f16023e = Math.max(60000, j9.e(aVar.f()));
        this.f16024f = Math.max(0, j9.e(aVar.c()));
        this.f16025g = j9.b(aVar.b());
    }

    public static <T> T a(T t10, T t11) {
        return t11 != null ? t11 : t10;
    }

    public double a() {
        return this.f16019a;
    }

    public List<m3> b() {
        return this.f16025g;
    }

    public long c() {
        return this.f16024f;
    }

    public int d() {
        return this.f16020b;
    }

    public int e() {
        return this.f16021c;
    }

    public long f() {
        return this.f16023e;
    }

    public boolean g() {
        return this.f16022d;
    }

    public k3(k3 k3Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        this.f16019a = ((Double) a(Double.valueOf(k3Var.a()), analyticsCategoryConfig.a())).doubleValue();
        this.f16020b = ((Integer) a(Integer.valueOf(k3Var.d()), analyticsCategoryConfig.d())).intValue();
        this.f16021c = ((Integer) a(Integer.valueOf(k3Var.e()), analyticsCategoryConfig.e())).intValue();
        this.f16022d = ((Boolean) a(Boolean.valueOf(k3Var.g()), analyticsCategoryConfig.f())).booleanValue();
        this.f16023e = analyticsCategoryConfig.g() == null ? k3Var.f() : Math.max(60000, j9.e(analyticsCategoryConfig.g()));
        this.f16024f = analyticsCategoryConfig.c() == null ? k3Var.c() : Math.max(0, j9.e(analyticsCategoryConfig.c()));
        this.f16025g = (List) a(k3Var.b(), m3.a(analyticsCategoryConfig.b()));
    }
}
