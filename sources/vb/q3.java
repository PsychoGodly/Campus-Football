package vb;

import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.t3;

/* compiled from: UniversalRequestKt.kt */
public final class q3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39064b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final t3.c.a f39065a;

    /* compiled from: UniversalRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ q3 a(t3.c.a aVar) {
            m.e(aVar, "builder");
            return new q3(aVar, (h) null);
        }
    }

    private q3(t3.c.a aVar) {
        this.f39065a = aVar;
    }

    public /* synthetic */ q3(t3.c.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ t3.c a() {
        z s10 = this.f39065a.build();
        m.d(s10, "_builder.build()");
        return (t3.c) s10;
    }

    public final void b(t1 t1Var) {
        m.e(t1Var, "value");
        this.f39065a.F(t1Var);
    }

    public final void c(k0 k0Var) {
        m.e(k0Var, "value");
        this.f39065a.G(k0Var);
    }

    public final void d(s3 s3Var) {
        m.e(s3Var, "value");
        this.f39065a.H(s3Var);
    }

    public final void e(m2 m2Var) {
        m.e(m2Var, "value");
        this.f39065a.I(m2Var);
    }

    public final void f(t1 t1Var) {
        m.e(t1Var, "value");
        this.f39065a.J(t1Var);
    }

    public final void g(i iVar) {
        m.e(iVar, "value");
        this.f39065a.K(iVar);
    }

    public final void h(g3 g3Var) {
        m.e(g3Var, "value");
        this.f39065a.L(g3Var);
    }
}
