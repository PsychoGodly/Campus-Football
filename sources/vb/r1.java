package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.s3;

/* compiled from: LimitedSessionTokenKt.kt */
public final class r1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39074b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final s3.a f39075a;

    /* compiled from: LimitedSessionTokenKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ r1 a(s3.a aVar) {
            m.e(aVar, "builder");
            return new r1(aVar, (h) null);
        }
    }

    private r1(s3.a aVar) {
        this.f39075a = aVar;
    }

    public /* synthetic */ r1(s3.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ s3 a() {
        z s10 = this.f39075a.build();
        m.d(s10, "_builder.build()");
        return (s3) s10;
    }

    public final f0 b() {
        f0 F = this.f39075a.F();
        m.d(F, "_builder.getMediationProvider()");
        return F;
    }

    public final void c(String str) {
        m.e(str, "value");
        this.f39075a.G(str);
    }

    public final void d(String str) {
        m.e(str, "value");
        this.f39075a.H(str);
    }

    public final void e(String str) {
        m.e(str, "value");
        this.f39075a.I(str);
    }

    public final void f(String str) {
        m.e(str, "value");
        this.f39075a.J(str);
    }

    public final void g(String str) {
        m.e(str, "value");
        this.f39075a.K(str);
    }

    public final void h(f0 f0Var) {
        m.e(f0Var, "value");
        this.f39075a.L(f0Var);
    }

    public final void i(String str) {
        m.e(str, "value");
        this.f39075a.M(str);
    }

    public final void j(String str) {
        m.e(str, "value");
        this.f39075a.N(str);
    }

    public final void k(g0 g0Var) {
        m.e(g0Var, "value");
        this.f39075a.O(g0Var);
    }

    public final void l(int i10) {
        this.f39075a.P(i10);
    }

    public final void m(String str) {
        m.e(str, "value");
        this.f39075a.Q(str);
    }
}
