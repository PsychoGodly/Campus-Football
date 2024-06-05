package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.s;

/* compiled from: AdResponseKt.kt */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39060b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final s.a f39061a;

    /* compiled from: AdResponseKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ q a(s.a aVar) {
            m.e(aVar, "builder");
            return new q(aVar, (h) null);
        }
    }

    private q(s.a aVar) {
        this.f39061a = aVar;
    }

    public /* synthetic */ q(s.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ s a() {
        z s10 = this.f39061a.build();
        m.d(s10, "_builder.build()");
        return (s) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f39061a.F(iVar);
    }

    public final void c(i iVar) {
        m.e(iVar, "value");
        this.f39061a.G(iVar);
    }

    public final void d(int i10) {
        this.f39061a.H(i10);
    }

    public final void e(d1 d1Var) {
        m.e(d1Var, "value");
        this.f39061a.I(d1Var);
    }

    public final void f(i iVar) {
        m.e(iVar, "value");
        this.f39061a.J(iVar);
    }

    public final void g(int i10) {
        this.f39061a.K(i10);
    }

    public final void h(i iVar) {
        m.e(iVar, "value");
        this.f39061a.L(iVar);
    }

    public final void i(y3 y3Var) {
        m.e(y3Var, "value");
        this.f39061a.M(y3Var);
    }
}
