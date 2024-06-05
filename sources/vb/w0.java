package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.a1;

/* compiled from: DynamicDeviceInfoKt.kt */
public final class w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39107b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final a1.a.C0450a f39108a;

    /* compiled from: DynamicDeviceInfoKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ w0 a(a1.a.C0450a aVar) {
            m.e(aVar, "builder");
            return new w0(aVar, (h) null);
        }
    }

    private w0(a1.a.C0450a aVar) {
        this.f39108a = aVar;
    }

    public /* synthetic */ w0(a1.a.C0450a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ a1.a a() {
        z s10 = this.f39108a.build();
        m.d(s10, "_builder.build()");
        return (a1.a) s10;
    }

    public final void b(boolean z10) {
        this.f39108a.F(z10);
    }

    public final void c(long j10) {
        this.f39108a.G(j10);
    }

    public final void d(long j10) {
        this.f39108a.H(j10);
    }

    public final void e(double d10) {
        this.f39108a.I(d10);
    }

    public final void f(boolean z10) {
        this.f39108a.J(z10);
    }

    public final void g(boolean z10) {
        this.f39108a.K(z10);
    }

    public final void h(int i10) {
        this.f39108a.L(i10);
    }

    public final void i(int i10) {
        this.f39108a.M(i10);
    }

    public final void j(boolean z10) {
        this.f39108a.N(z10);
    }

    public final void k(double d10) {
        this.f39108a.O(d10);
    }
}
