package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.c;

/* compiled from: AdDataRefreshRequestKt.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0449a f38922b = new C0449a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final c.a f38923a;

    /* renamed from: vb.a$a  reason: collision with other inner class name */
    /* compiled from: AdDataRefreshRequestKt.kt */
    public static final class C0449a {
        private C0449a() {
        }

        public /* synthetic */ C0449a(h hVar) {
            this();
        }

        public final /* synthetic */ a a(c.a aVar) {
            m.e(aVar, "builder");
            return new a(aVar, (h) null);
        }
    }

    private a(c.a aVar) {
        this.f38923a = aVar;
    }

    public /* synthetic */ a(c.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ c a() {
        z s10 = this.f38923a.build();
        m.d(s10, "_builder.build()");
        return (c) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f38923a.F(iVar);
    }

    public final void c(b0 b0Var) {
        m.e(b0Var, "value");
        this.f38923a.G(b0Var);
    }

    public final void d(a1 a1Var) {
        m.e(a1Var, "value");
        this.f38923a.H(a1Var);
    }

    public final void e(i iVar) {
        m.e(iVar, "value");
        this.f38923a.I(iVar);
    }

    public final void f(x2 x2Var) {
        m.e(x2Var, "value");
        this.f38923a.J(x2Var);
    }

    public final void g(b3 b3Var) {
        m.e(b3Var, "value");
        this.f38923a.K(b3Var);
    }
}
