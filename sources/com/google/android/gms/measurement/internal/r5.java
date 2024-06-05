package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.List;
import r5.l;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class r5 {
    private long A;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private String H;
    private boolean I;
    private long J;
    private long K;

    /* renamed from: a  reason: collision with root package name */
    private final w5 f24996a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24997b;

    /* renamed from: c  reason: collision with root package name */
    private String f24998c;

    /* renamed from: d  reason: collision with root package name */
    private String f24999d;

    /* renamed from: e  reason: collision with root package name */
    private String f25000e;

    /* renamed from: f  reason: collision with root package name */
    private String f25001f;

    /* renamed from: g  reason: collision with root package name */
    private long f25002g;

    /* renamed from: h  reason: collision with root package name */
    private long f25003h;

    /* renamed from: i  reason: collision with root package name */
    private long f25004i;

    /* renamed from: j  reason: collision with root package name */
    private String f25005j;

    /* renamed from: k  reason: collision with root package name */
    private long f25006k;

    /* renamed from: l  reason: collision with root package name */
    private String f25007l;

    /* renamed from: m  reason: collision with root package name */
    private long f25008m;

    /* renamed from: n  reason: collision with root package name */
    private long f25009n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f25010o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25011p;

    /* renamed from: q  reason: collision with root package name */
    private String f25012q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f25013r;

    /* renamed from: s  reason: collision with root package name */
    private long f25014s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f25015t;

    /* renamed from: u  reason: collision with root package name */
    private String f25016u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f25017v;

    /* renamed from: w  reason: collision with root package name */
    private long f25018w;

    /* renamed from: x  reason: collision with root package name */
    private long f25019x;

    /* renamed from: y  reason: collision with root package name */
    private int f25020y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f25021z;

    r5(w5 w5Var, String str) {
        q.k(w5Var);
        q.g(str);
        this.f24996a = w5Var;
        this.f24997b = str;
        w5Var.zzl().i();
    }

    public final void A(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.J != j10;
        this.J = j10;
    }

    public final void B(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f25007l, str);
        this.f25007l = str;
    }

    public final void C(boolean z10) {
        this.f24996a.zzl().i();
        this.I |= this.f25017v != z10;
        this.f25017v = z10;
    }

    public final long D() {
        this.f24996a.zzl().i();
        return this.A;
    }

    public final void E(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.E != j10;
        this.E = j10;
    }

    public final void F(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f25005j, str);
        this.f25005j = str;
    }

    public final void G(boolean z10) {
        this.f24996a.zzl().i();
        this.I |= this.f25021z != z10;
        this.f25021z = z10;
    }

    public final long H() {
        this.f24996a.zzl().i();
        return this.J;
    }

    public final void I(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.F != j10;
        this.F = j10;
    }

    public final void J(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f25001f, str);
        this.f25001f = str;
    }

    public final long K() {
        this.f24996a.zzl().i();
        return this.E;
    }

    public final void L(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.D != j10;
        this.D = j10;
    }

    public final void M(String str) {
        this.f24996a.zzl().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !l.a(this.f24999d, str);
        this.f24999d = str;
    }

    public final long N() {
        this.f24996a.zzl().i();
        return this.F;
    }

    public final void O(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.C != j10;
        this.C = j10;
    }

    public final void P(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.H, str);
        this.H = str;
    }

    public final long Q() {
        this.f24996a.zzl().i();
        return this.D;
    }

    public final void R(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.G != j10;
        this.G = j10;
    }

    public final void S(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f25000e, str);
        this.f25000e = str;
    }

    public final long T() {
        this.f24996a.zzl().i();
        return this.C;
    }

    public final void U(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.B != j10;
        this.B = j10;
    }

    public final void V(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f25016u, str);
        this.f25016u = str;
    }

    public final long W() {
        this.f24996a.zzl().i();
        return this.G;
    }

    public final void X(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25009n != j10;
        this.f25009n = j10;
    }

    public final long Y() {
        this.f24996a.zzl().i();
        return this.B;
    }

    public final void Z(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25014s != j10;
        this.f25014s = j10;
    }

    public final int a() {
        this.f24996a.zzl().i();
        return this.f25020y;
    }

    public final long a0() {
        this.f24996a.zzl().i();
        return this.f25009n;
    }

    public final void b(int i10) {
        this.f24996a.zzl().i();
        this.I |= this.f25020y != i10;
        this.f25020y = i10;
    }

    public final void b0(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.K != j10;
        this.K = j10;
    }

    public final void c(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25006k != j10;
        this.f25006k = j10;
    }

    public final long c0() {
        this.f24996a.zzl().i();
        return this.f25014s;
    }

    public final void d(Boolean bool) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f25013r, bool);
        this.f25013r = bool;
    }

    public final void d0(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25008m != j10;
        this.f25008m = j10;
    }

    public final void e(String str) {
        this.f24996a.zzl().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !l.a(this.f25012q, str);
        this.f25012q = str;
    }

    public final long e0() {
        this.f24996a.zzl().i();
        return this.K;
    }

    public final void f(List<String> list) {
        this.f24996a.zzl().i();
        if (!l.a(this.f25015t, list)) {
            this.I = true;
            this.f25015t = list != null ? new ArrayList(list) : null;
        }
    }

    public final void f0(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25004i != j10;
        this.f25004i = j10;
    }

    public final void g(boolean z10) {
        this.f24996a.zzl().i();
        this.I |= this.f25011p != z10;
        this.f25011p = z10;
    }

    public final long g0() {
        this.f24996a.zzl().i();
        return this.f25008m;
    }

    public final String h() {
        this.f24996a.zzl().i();
        return this.f25005j;
    }

    public final void h0(long j10) {
        boolean z10 = true;
        q.a(j10 >= 0);
        this.f24996a.zzl().i();
        boolean z11 = this.I;
        if (this.f25002g == j10) {
            z10 = false;
        }
        this.I = z10 | z11;
        this.f25002g = j10;
    }

    public final String i() {
        this.f24996a.zzl().i();
        return this.f25001f;
    }

    public final long i0() {
        this.f24996a.zzl().i();
        return this.f25004i;
    }

    public final String j() {
        this.f24996a.zzl().i();
        return this.f24999d;
    }

    public final void j0(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25003h != j10;
        this.f25003h = j10;
    }

    public final String k() {
        this.f24996a.zzl().i();
        return this.H;
    }

    public final long k0() {
        this.f24996a.zzl().i();
        return this.f25002g;
    }

    public final String l() {
        this.f24996a.zzl().i();
        return this.f25000e;
    }

    public final void l0(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25019x != j10;
        this.f25019x = j10;
    }

    public final String m() {
        this.f24996a.zzl().i();
        return this.f25016u;
    }

    public final long m0() {
        this.f24996a.zzl().i();
        return this.f25003h;
    }

    public final List<String> n() {
        this.f24996a.zzl().i();
        return this.f25015t;
    }

    public final void n0(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.f25018w != j10;
        this.f25018w = j10;
    }

    public final void o() {
        this.f24996a.zzl().i();
        this.I = false;
    }

    public final long o0() {
        this.f24996a.zzl().i();
        return this.f25019x;
    }

    public final void p() {
        this.f24996a.zzl().i();
        long j10 = this.f25002g + 1;
        if (j10 > 2147483647L) {
            this.f24996a.zzj().G().b("Bundle index overflow. appId", n4.q(this.f24997b));
            j10 = 0;
        }
        this.I = true;
        this.f25002g = j10;
    }

    public final long p0() {
        this.f24996a.zzl().i();
        return this.f25018w;
    }

    public final boolean q() {
        this.f24996a.zzl().i();
        return this.f25011p;
    }

    public final Boolean q0() {
        this.f24996a.zzl().i();
        return this.f25013r;
    }

    public final boolean r() {
        this.f24996a.zzl().i();
        return this.f25010o;
    }

    public final String r0() {
        this.f24996a.zzl().i();
        return this.f25012q;
    }

    public final boolean s() {
        this.f24996a.zzl().i();
        return this.I;
    }

    public final String s0() {
        this.f24996a.zzl().i();
        String str = this.H;
        P((String) null);
        return str;
    }

    public final boolean t() {
        this.f24996a.zzl().i();
        return this.f25017v;
    }

    public final String t0() {
        this.f24996a.zzl().i();
        return this.f24997b;
    }

    public final boolean u() {
        this.f24996a.zzl().i();
        return this.f25021z;
    }

    public final String u0() {
        this.f24996a.zzl().i();
        return this.f24998c;
    }

    public final long v() {
        this.f24996a.zzl().i();
        return 0;
    }

    public final String v0() {
        this.f24996a.zzl().i();
        return this.f25007l;
    }

    public final void w(long j10) {
        this.f24996a.zzl().i();
        this.I |= this.A != j10;
        this.A = j10;
    }

    public final void x(String str) {
        this.f24996a.zzl().i();
        this.I |= !l.a(this.f24998c, str);
        this.f24998c = str;
    }

    public final void y(boolean z10) {
        this.f24996a.zzl().i();
        this.I |= this.f25010o != z10;
        this.f25010o = z10;
    }

    public final long z() {
        this.f24996a.zzl().i();
        return this.f25006k;
    }
}
