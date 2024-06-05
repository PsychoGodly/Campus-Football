package ld;

import dd.j1;
import dd.p;
import dd.r0;
import r6.i;
import r6.o;

/* compiled from: GracefulSwitchLoadBalancer */
public final class d extends a {

    /* renamed from: l  reason: collision with root package name */
    static final r0.i f36135l = new c();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r0 f36136c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final r0.d f36137d;

    /* renamed from: e  reason: collision with root package name */
    private r0.c f36138e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public r0 f36139f;

    /* renamed from: g  reason: collision with root package name */
    private r0.c f36140g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public r0 f36141h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public p f36142i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public r0.i f36143j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f36144k;

    /* compiled from: GracefulSwitchLoadBalancer */
    class a extends r0 {

        /* renamed from: ld.d$a$a  reason: collision with other inner class name */
        /* compiled from: GracefulSwitchLoadBalancer */
        class C0415a extends r0.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j1 f36146a;

            C0415a(j1 j1Var) {
                this.f36146a = j1Var;
            }

            public r0.e a(r0.f fVar) {
                return r0.e.f(this.f36146a);
            }

            public String toString() {
                return i.b(C0415a.class).d("error", this.f36146a).toString();
            }
        }

        a() {
        }

        public void c(j1 j1Var) {
            d.this.f36137d.f(p.TRANSIENT_FAILURE, new C0415a(j1Var));
        }

        public void d(r0.g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        public void f() {
        }
    }

    /* compiled from: GracefulSwitchLoadBalancer */
    class b extends b {

        /* renamed from: a  reason: collision with root package name */
        r0 f36148a;

        b() {
        }

        public void f(p pVar, r0.i iVar) {
            if (this.f36148a == d.this.f36141h) {
                o.v(d.this.f36144k, "there's pending lb while current lb has been out of READY");
                p unused = d.this.f36142i = pVar;
                r0.i unused2 = d.this.f36143j = iVar;
                if (pVar == p.READY) {
                    d.this.q();
                }
            } else if (this.f36148a == d.this.f36139f) {
                boolean unused3 = d.this.f36144k = pVar == p.READY;
                if (d.this.f36144k || d.this.f36141h == d.this.f36136c) {
                    d.this.f36137d.f(pVar, iVar);
                } else {
                    d.this.q();
                }
            }
        }

        /* access modifiers changed from: protected */
        public r0.d g() {
            return d.this.f36137d;
        }
    }

    /* compiled from: GracefulSwitchLoadBalancer */
    class c extends r0.i {
        c() {
        }

        public r0.e a(r0.f fVar) {
            return r0.e.g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public d(r0.d dVar) {
        a aVar = new a();
        this.f36136c = aVar;
        this.f36139f = aVar;
        this.f36141h = aVar;
        this.f36137d = (r0.d) o.p(dVar, "helper");
    }

    /* access modifiers changed from: private */
    public void q() {
        this.f36137d.f(this.f36142i, this.f36143j);
        this.f36139f.f();
        this.f36139f = this.f36141h;
        this.f36138e = this.f36140g;
        this.f36141h = this.f36136c;
        this.f36140g = null;
    }

    public void f() {
        this.f36141h.f();
        this.f36139f.f();
    }

    /* access modifiers changed from: protected */
    public r0 g() {
        r0 r0Var = this.f36141h;
        return r0Var == this.f36136c ? this.f36139f : r0Var;
    }

    public void r(r0.c cVar) {
        o.p(cVar, "newBalancerFactory");
        if (!cVar.equals(this.f36140g)) {
            this.f36141h.f();
            this.f36141h = this.f36136c;
            this.f36140g = null;
            this.f36142i = p.CONNECTING;
            this.f36143j = f36135l;
            if (!cVar.equals(this.f36138e)) {
                b bVar = new b();
                r0 a10 = cVar.a(bVar);
                bVar.f36148a = a10;
                this.f36141h = a10;
                this.f36140g = cVar;
                if (!this.f36144k) {
                    q();
                }
            }
        }
    }
}
