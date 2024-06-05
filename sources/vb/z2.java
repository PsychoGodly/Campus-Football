package vb;

import com.google.protobuf.z;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import s8.b;
import vb.b3;

/* compiled from: StaticDeviceInfoKt.kt */
public final class z2 {

    /* renamed from: a  reason: collision with root package name */
    public static final z2 f39129a = new z2();

    /* compiled from: StaticDeviceInfoKt.kt */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0454a f39130b = new C0454a((h) null);

        /* renamed from: a  reason: collision with root package name */
        private final b3.b f39131a;

        /* renamed from: vb.z2$a$a  reason: collision with other inner class name */
        /* compiled from: StaticDeviceInfoKt.kt */
        public static final class C0454a {
            private C0454a() {
            }

            public /* synthetic */ C0454a(h hVar) {
                this();
            }

            public final /* synthetic */ a a(b3.b bVar) {
                m.e(bVar, "builder");
                return new a(bVar, (h) null);
            }
        }

        private a(b3.b bVar) {
            this.f39131a = bVar;
        }

        public /* synthetic */ a(b3.b bVar, h hVar) {
            this(bVar);
        }

        public final /* synthetic */ b3 a() {
            z s10 = this.f39131a.build();
            m.d(s10, "_builder.build()");
            return (b3) s10;
        }

        public final /* synthetic */ void b(b bVar, Iterable iterable) {
            m.e(bVar, "<this>");
            m.e(iterable, "values");
            this.f39131a.F(iterable);
        }

        public final /* synthetic */ void c(b bVar) {
            m.e(bVar, "<this>");
            this.f39131a.G();
        }

        public final b<String, Object> d() {
            List<String> H = this.f39131a.H();
            m.d(H, "_builder.getStoresList()");
            return new b<>(H);
        }

        public final void e(b3.a aVar) {
            m.e(aVar, "value");
            this.f39131a.I(aVar);
        }

        public final void f(boolean z10) {
            this.f39131a.J(z10);
        }

        public final void g(String str) {
            m.e(str, "value");
            this.f39131a.K(str);
        }

        public final void h(String str) {
            m.e(str, "value");
            this.f39131a.L(str);
        }

        public final void i(long j10) {
            this.f39131a.M(j10);
        }

        public final void j(String str) {
            m.e(str, "value");
            this.f39131a.N(str);
        }

        public final void k(String str) {
            m.e(str, "value");
            this.f39131a.O(str);
        }

        public final void l(String str) {
            m.e(str, "value");
            this.f39131a.P(str);
        }

        public final void m(String str) {
            m.e(str, "value");
            this.f39131a.Q(str);
        }

        public final void n(String str) {
            m.e(str, "value");
            this.f39131a.R(str);
        }

        public final void o(boolean z10) {
            this.f39131a.S(z10);
        }

        public final void p(int i10) {
            this.f39131a.T(i10);
        }

        public final void q(int i10) {
            this.f39131a.U(i10);
        }

        public final void r(int i10) {
            this.f39131a.V(i10);
        }

        public final void s(int i10) {
            this.f39131a.W(i10);
        }

        public final void t(long j10) {
            this.f39131a.X(j10);
        }

        public final void u(long j10) {
            this.f39131a.Y(j10);
        }

        public final void v(String str) {
            m.e(str, "value");
            this.f39131a.Z(str);
        }
    }

    private z2() {
    }
}
