package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.z1;

/* compiled from: NativeConfigurationKt.kt */
public final class u1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39093b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final z1.a f39094a;

    /* compiled from: NativeConfigurationKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ u1 a(z1.a aVar) {
            m.e(aVar, "builder");
            return new u1(aVar, (h) null);
        }
    }

    private u1(z1.a aVar) {
        this.f39094a = aVar;
    }

    public /* synthetic */ u1(z1.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ z1 a() {
        z s10 = this.f39094a.build();
        m.d(s10, "_builder.build()");
        return (z1) s10;
    }

    public final void b(w1 w1Var) {
        m.e(w1Var, "value");
        this.f39094a.F(w1Var);
    }

    public final void c(a2 a2Var) {
        m.e(a2Var, "value");
        this.f39094a.G(a2Var);
    }

    public final void d(x1 x1Var) {
        m.e(x1Var, "value");
        this.f39094a.H(x1Var);
    }

    public final void e(a2 a2Var) {
        m.e(a2Var, "value");
        this.f39094a.I(a2Var);
    }

    public final void f(a2 a2Var) {
        m.e(a2Var, "value");
        this.f39094a.J(a2Var);
    }

    public final void g(a2 a2Var) {
        m.e(a2Var, "value");
        this.f39094a.K(a2Var);
    }
}
