package wb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.a1;
import vb.b0;
import vb.b3;
import vb.e0;
import vb.g3;
import vb.m2;
import vb.x2;
import wb.e;

/* compiled from: HeaderBiddingTokenKt.kt */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39191b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final e.a f39192a;

    /* compiled from: HeaderBiddingTokenKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ c a(e.a aVar) {
            m.e(aVar, "builder");
            return new c(aVar, (h) null);
        }
    }

    private c(e.a aVar) {
        this.f39192a = aVar;
    }

    public /* synthetic */ c(e.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ e a() {
        z s10 = this.f39192a.build();
        m.d(s10, "_builder.build()");
        return (e) s10;
    }

    public final void b(b0 b0Var) {
        m.e(b0Var, "value");
        this.f39192a.F(b0Var);
    }

    public final void c(e0 e0Var) {
        m.e(e0Var, "value");
        this.f39192a.G(e0Var);
    }

    public final void d(a1 a1Var) {
        m.e(a1Var, "value");
        this.f39192a.H(a1Var);
    }

    public final void e(m2 m2Var) {
        m.e(m2Var, "value");
        this.f39192a.I(m2Var);
    }

    public final void f(x2 x2Var) {
        m.e(x2Var, "value");
        this.f39192a.J(x2Var);
    }

    public final void g(i iVar) {
        m.e(iVar, "value");
        this.f39192a.K(iVar);
    }

    public final void h(b3 b3Var) {
        m.e(b3Var, "value");
        this.f39192a.L(b3Var);
    }

    public final void i(g3 g3Var) {
        m.e(g3Var, "value");
        this.f39192a.M(g3Var);
    }

    public final void j(i iVar) {
        m.e(iVar, "value");
        this.f39192a.N(iVar);
    }

    public final void k(int i10) {
        this.f39192a.O(i10);
    }
}
