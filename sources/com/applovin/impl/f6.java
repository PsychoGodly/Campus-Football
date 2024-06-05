package com.applovin.impl;

final class f6 implements bd {

    /* renamed from: a  reason: collision with root package name */
    private final yk f7630a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7631b;

    /* renamed from: c  reason: collision with root package name */
    private li f7632c;

    /* renamed from: d  reason: collision with root package name */
    private bd f7633d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7634f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7635g;

    public interface a {
        void a(mh mhVar);
    }

    public f6(a aVar, j3 j3Var) {
        this.f7631b = aVar;
        this.f7630a = new yk(j3Var);
    }

    public mh a() {
        bd bdVar = this.f7633d;
        if (bdVar != null) {
            return bdVar.a();
        }
        return this.f7630a.a();
    }

    public void b(li liVar) {
        bd bdVar;
        bd l10 = liVar.l();
        if (l10 != null && l10 != (bdVar = this.f7633d)) {
            if (bdVar == null) {
                this.f7633d = l10;
                this.f7632c = liVar;
                l10.a(this.f7630a.a());
                return;
            }
            throw y7.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c() {
        this.f7635g = false;
        this.f7630a.c();
    }

    public long p() {
        if (this.f7634f) {
            return this.f7630a.p();
        }
        return ((bd) a1.a((Object) this.f7633d)).p();
    }

    private void c(boolean z10) {
        if (a(z10)) {
            this.f7634f = true;
            if (this.f7635g) {
                this.f7630a.b();
                return;
            }
            return;
        }
        bd bdVar = (bd) a1.a((Object) this.f7633d);
        long p10 = bdVar.p();
        if (this.f7634f) {
            if (p10 < this.f7630a.p()) {
                this.f7630a.c();
                return;
            }
            this.f7634f = false;
            if (this.f7635g) {
                this.f7630a.b();
            }
        }
        this.f7630a.a(p10);
        mh a10 = bdVar.a();
        if (!a10.equals(this.f7630a.a())) {
            this.f7630a.a(a10);
            this.f7631b.a(a10);
        }
    }

    public void a(li liVar) {
        if (liVar == this.f7632c) {
            this.f7633d = null;
            this.f7632c = null;
            this.f7634f = true;
        }
    }

    public void b() {
        this.f7635g = true;
        this.f7630a.b();
    }

    public void a(long j10) {
        this.f7630a.a(j10);
    }

    public void a(mh mhVar) {
        bd bdVar = this.f7633d;
        if (bdVar != null) {
            bdVar.a(mhVar);
            mhVar = this.f7633d.a();
        }
        this.f7630a.a(mhVar);
    }

    public long b(boolean z10) {
        c(z10);
        return p();
    }

    private boolean a(boolean z10) {
        li liVar = this.f7632c;
        return liVar == null || liVar.c() || (!this.f7632c.d() && (z10 || this.f7632c.j()));
    }
}
