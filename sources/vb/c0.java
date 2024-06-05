package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.e0;

/* compiled from: ClientInfoKt.kt */
public final class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38928b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final e0.a f38929a;

    /* compiled from: ClientInfoKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ c0 a(e0.a aVar) {
            m.e(aVar, "builder");
            return new c0(aVar, (h) null);
        }
    }

    private c0(e0.a aVar) {
        this.f38929a = aVar;
    }

    public /* synthetic */ c0(e0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ e0 a() {
        z s10 = this.f38929a.build();
        m.d(s10, "_builder.build()");
        return (e0) s10;
    }

    public final f0 b() {
        f0 F = this.f38929a.F();
        m.d(F, "_builder.getMediationProvider()");
        return F;
    }

    public final void c(String str) {
        m.e(str, "value");
        this.f38929a.G(str);
    }

    public final void d(String str) {
        m.e(str, "value");
        this.f38929a.H(str);
    }

    public final void e(f0 f0Var) {
        m.e(f0Var, "value");
        this.f38929a.I(f0Var);
    }

    public final void f(String str) {
        m.e(str, "value");
        this.f38929a.J(str);
    }

    public final void g(g0 g0Var) {
        m.e(g0Var, "value");
        this.f38929a.K(g0Var);
    }

    public final void h(int i10) {
        this.f38929a.L(i10);
    }

    public final void i(String str) {
        m.e(str, "value");
        this.f38929a.M(str);
    }

    public final void j(boolean z10) {
        this.f38929a.N(z10);
    }
}
