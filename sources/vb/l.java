package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.n;

/* compiled from: AdRequestKt.kt */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39006b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final n.a f39007a;

    /* compiled from: AdRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ l a(n.a aVar) {
            m.e(aVar, "builder");
            return new l(aVar, (h) null);
        }
    }

    private l(n.a aVar) {
        this.f39007a = aVar;
    }

    public /* synthetic */ l(n.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ n a() {
        z s10 = this.f39007a.build();
        m.d(s10, "_builder.build()");
        return (n) s10;
    }

    public final void b(o oVar) {
        m.e(oVar, "value");
        this.f39007a.F(oVar);
    }

    public final void c(p pVar) {
        m.e(pVar, "value");
        this.f39007a.G(pVar);
    }

    public final void d(b0 b0Var) {
        m.e(b0Var, "value");
        this.f39007a.H(b0Var);
    }

    public final void e(a1 a1Var) {
        m.e(a1Var, "value");
        this.f39007a.I(a1Var);
    }

    public final void f(i iVar) {
        m.e(iVar, "value");
        this.f39007a.J(iVar);
    }

    public final void g(String str) {
        m.e(str, "value");
        this.f39007a.K(str);
    }

    public final void h(boolean z10) {
        this.f39007a.L(z10);
    }

    public final void i(x2 x2Var) {
        m.e(x2Var, "value");
        this.f39007a.M(x2Var);
    }

    public final void j(b3 b3Var) {
        m.e(b3Var, "value");
        this.f39007a.N(b3Var);
    }

    public final void k(int i10) {
        this.f39007a.O(i10);
    }
}
