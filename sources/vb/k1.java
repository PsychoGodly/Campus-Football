package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.n1;

/* compiled from: InitializationRequestKt.kt */
public final class k1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38994b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final n1.a f38995a;

    /* compiled from: InitializationRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ k1 a(n1.a aVar) {
            m.e(aVar, "builder");
            return new k1(aVar, (h) null);
        }
    }

    private k1(n1.a aVar) {
        this.f38995a = aVar;
    }

    public /* synthetic */ k1(n1.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ n1 a() {
        z s10 = this.f38995a.build();
        m.d(s10, "_builder.build()");
        return (n1) s10;
    }

    public final void b(String str) {
        m.e(str, "value");
        this.f38995a.F(str);
    }

    public final void c(i iVar) {
        m.e(iVar, "value");
        this.f38995a.G(iVar);
    }

    public final void d(String str) {
        m.e(str, "value");
        this.f38995a.H(str);
    }

    public final void e(i iVar) {
        m.e(iVar, "value");
        this.f38995a.I(iVar);
    }

    public final void f(e0 e0Var) {
        m.e(e0Var, "value");
        this.f38995a.J(e0Var);
    }

    public final void g(m1 m1Var) {
        m.e(m1Var, "value");
        this.f38995a.K(m1Var);
    }

    public final void h(String str) {
        m.e(str, "value");
        this.f38995a.L(str);
    }

    public final void i(boolean z10) {
        this.f38995a.M(z10);
    }

    public final void j(String str) {
        m.e(str, "value");
        this.f38995a.N(str);
    }

    public final void k(i iVar) {
        m.e(iVar, "value");
        this.f38995a.O(iVar);
    }

    public final void l(i iVar) {
        m.e(iVar, "value");
        this.f38995a.P(iVar);
    }
}
