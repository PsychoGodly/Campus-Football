package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.t3;

/* compiled from: UniversalRequestKt.kt */
public final class p3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39058b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final t3.b.a f39059a;

    /* compiled from: UniversalRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ p3 a(t3.b.a aVar) {
            m.e(aVar, "builder");
            return new p3(aVar, (h) null);
        }
    }

    private p3(t3.b.a aVar) {
        this.f39059a = aVar;
    }

    public /* synthetic */ p3(t3.b.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ t3.b a() {
        z s10 = this.f39059a.build();
        m.d(s10, "_builder.build()");
        return (t3.b) s10;
    }

    public final t0 b() {
        t0 F = this.f39059a.F();
        m.d(F, "_builder.getDiagnosticEventRequest()");
        return F;
    }

    public final void c(c cVar) {
        m.e(cVar, "value");
        this.f39059a.G(cVar);
    }

    public final void d(i iVar) {
        m.e(iVar, "value");
        this.f39059a.H(iVar);
    }

    public final void e(n nVar) {
        m.e(nVar, "value");
        this.f39059a.I(nVar);
    }

    public final void f(t0 t0Var) {
        m.e(t0Var, "value");
        this.f39059a.J(t0Var);
    }

    public final void g(i1 i1Var) {
        m.e(i1Var, "value");
        this.f39059a.K(i1Var);
    }

    public final void h(n1 n1Var) {
        m.e(n1Var, "value");
        this.f39059a.L(n1Var);
    }

    public final void i(i2 i2Var) {
        m.e(i2Var, "value");
        this.f39059a.M(i2Var);
    }

    public final void j(p2 p2Var) {
        m.e(p2Var, "value");
        this.f39059a.N(p2Var);
    }

    public final void k(m3 m3Var) {
        m.e(m3Var, "value");
        this.f39059a.O(m3Var);
    }
}
