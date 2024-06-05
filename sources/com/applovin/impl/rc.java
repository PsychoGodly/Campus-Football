package com.applovin.impl;

import com.applovin.impl.rd;
import com.applovin.impl.wd;

public final class rc implements rd, rd.a {

    /* renamed from: a  reason: collision with root package name */
    public final wd.a f11170a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11171b;

    /* renamed from: c  reason: collision with root package name */
    private final n0 f11172c;

    /* renamed from: d  reason: collision with root package name */
    private wd f11173d;

    /* renamed from: f  reason: collision with root package name */
    private rd f11174f;

    /* renamed from: g  reason: collision with root package name */
    private rd.a f11175g;

    /* renamed from: h  reason: collision with root package name */
    private long f11176h = -9223372036854775807L;

    public rc(wd.a aVar, n0 n0Var, long j10) {
        this.f11170a = aVar;
        this.f11172c = n0Var;
        this.f11171b = j10;
    }

    public void a(wd.a aVar) {
        long d10 = d(this.f11171b);
        rd a10 = ((wd) a1.a((Object) this.f11173d)).a(aVar, this.f11172c, d10);
        this.f11174f = a10;
        if (this.f11175g != null) {
            a10.a((rd.a) this, d10);
        }
    }

    public boolean b(long j10) {
        rd rdVar = this.f11174f;
        return rdVar != null && rdVar.b(j10);
    }

    public long c() {
        return this.f11176h;
    }

    public long d() {
        return this.f11171b;
    }

    public long e() {
        return ((rd) yp.a((Object) this.f11174f)).e();
    }

    public void f() {
        rd rdVar = this.f11174f;
        if (rdVar != null) {
            rdVar.f();
            return;
        }
        wd wdVar = this.f11173d;
        if (wdVar != null) {
            wdVar.b();
        }
    }

    public long g() {
        return ((rd) yp.a((Object) this.f11174f)).g();
    }

    public long h() {
        return ((rd) yp.a((Object) this.f11174f)).h();
    }

    public void i() {
        if (this.f11174f != null) {
            ((wd) a1.a((Object) this.f11173d)).a(this.f11174f);
        }
    }

    private long d(long j10) {
        long j11 = this.f11176h;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public qo b() {
        return ((rd) yp.a((Object) this.f11174f)).b();
    }

    public void c(long j10) {
        ((rd) yp.a((Object) this.f11174f)).c(j10);
    }

    public void e(long j10) {
        this.f11176h = j10;
    }

    /* renamed from: b */
    public void a(rd rdVar) {
        ((rd.a) yp.a((Object) this.f11175g)).a(this);
    }

    public void a(long j10, boolean z10) {
        ((rd) yp.a((Object) this.f11174f)).a(j10, z10);
    }

    public long a(long j10, fj fjVar) {
        return ((rd) yp.a((Object) this.f11174f)).a(j10, fjVar);
    }

    public boolean a() {
        rd rdVar = this.f11174f;
        return rdVar != null && rdVar.a();
    }

    public void a(rd rdVar) {
        ((rd.a) yp.a((Object) this.f11175g)).a(this);
    }

    public void a(rd.a aVar, long j10) {
        this.f11175g = aVar;
        rd rdVar = this.f11174f;
        if (rdVar != null) {
            rdVar.a((rd.a) this, d(this.f11171b));
        }
    }

    public long a(long j10) {
        return ((rd) yp.a((Object) this.f11174f)).a(j10);
    }

    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f11176h;
        if (j12 == -9223372036854775807L || j10 != this.f11171b) {
            j11 = j10;
        } else {
            this.f11176h = -9223372036854775807L;
            j11 = j12;
        }
        return ((rd) yp.a((Object) this.f11174f)).a(f8VarArr, zArr, yiVarArr, zArr2, j11);
    }

    public void a(wd wdVar) {
        a1.b(this.f11173d == null);
        this.f11173d = wdVar;
    }
}
