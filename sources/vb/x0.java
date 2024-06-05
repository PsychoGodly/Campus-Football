package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.a1;

/* compiled from: DynamicDeviceInfoKt.kt */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f39112a = new x0();

    /* compiled from: DynamicDeviceInfoKt.kt */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0453a f39113b = new C0453a((h) null);

        /* renamed from: a  reason: collision with root package name */
        private final a1.b f39114a;

        /* renamed from: vb.x0$a$a  reason: collision with other inner class name */
        /* compiled from: DynamicDeviceInfoKt.kt */
        public static final class C0453a {
            private C0453a() {
            }

            public /* synthetic */ C0453a(h hVar) {
                this();
            }

            public final /* synthetic */ a a(a1.b bVar) {
                m.e(bVar, "builder");
                return new a(bVar, (h) null);
            }
        }

        private a(a1.b bVar) {
            this.f39114a = bVar;
        }

        public /* synthetic */ a(a1.b bVar, h hVar) {
            this(bVar);
        }

        public final /* synthetic */ a1 a() {
            z s10 = this.f39114a.build();
            m.d(s10, "_builder.build()");
            return (a1) s10;
        }

        public final void b(a1.a aVar) {
            m.e(aVar, "value");
            this.f39114a.F(aVar);
        }

        public final void c(boolean z10) {
            this.f39114a.G(z10);
        }

        public final void d(double d10) {
            this.f39114a.H(d10);
        }

        public final void e(int i10) {
            this.f39114a.I(i10);
        }

        public final void f(z0 z0Var) {
            m.e(z0Var, "value");
            this.f39114a.J(z0Var);
        }

        public final void g(long j10) {
            this.f39114a.K(j10);
        }

        public final void h(long j10) {
            this.f39114a.L(j10);
        }

        public final void i(String str) {
            m.e(str, "value");
            this.f39114a.M(str);
        }

        public final void j(boolean z10) {
            this.f39114a.N(z10);
        }

        public final void k(boolean z10) {
            this.f39114a.O(z10);
        }

        public final void l(String str) {
            m.e(str, "value");
            this.f39114a.P(str);
        }

        public final void m(String str) {
            m.e(str, "value");
            this.f39114a.Q(str);
        }

        public final void n(String str) {
            m.e(str, "value");
            this.f39114a.R(str);
        }

        public final void o(long j10) {
            this.f39114a.S(j10);
        }

        public final void p(boolean z10) {
            this.f39114a.T(z10);
        }
    }

    private x0() {
    }
}
