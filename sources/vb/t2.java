package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.b2;

/* compiled from: RequestRetryPolicyKt.kt */
public final class t2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39084b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final b2.a f39085a;

    /* compiled from: RequestRetryPolicyKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ t2 a(b2.a aVar) {
            m.e(aVar, "builder");
            return new t2(aVar, (h) null);
        }
    }

    private t2(b2.a aVar) {
        this.f39085a = aVar;
    }

    public /* synthetic */ t2(b2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ b2 a() {
        z s10 = this.f39085a.build();
        m.d(s10, "_builder.build()");
        return (b2) s10;
    }

    public final void b(int i10) {
        this.f39085a.F(i10);
    }

    public final void c(float f10) {
        this.f39085a.G(f10);
    }

    public final void d(int i10) {
        this.f39085a.H(i10);
    }

    public final void e(float f10) {
        this.f39085a.I(f10);
    }

    public final void f(int i10) {
        this.f39085a.J(i10);
    }

    public final void g(boolean z10) {
        this.f39085a.K(z10);
    }
}
