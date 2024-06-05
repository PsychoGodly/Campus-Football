package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.x2;

/* compiled from: SessionCountersKt.kt */
public final class v2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39102b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final x2.a f39103a;

    /* compiled from: SessionCountersKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ v2 a(x2.a aVar) {
            m.e(aVar, "builder");
            return new v2(aVar, (h) null);
        }
    }

    private v2(x2.a aVar) {
        this.f39103a = aVar;
    }

    public /* synthetic */ v2(x2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ x2 a() {
        z s10 = this.f39103a.build();
        m.d(s10, "_builder.build()");
        return (x2) s10;
    }

    public final int b() {
        return this.f39103a.F();
    }

    public final int c() {
        return this.f39103a.G();
    }

    public final int d() {
        return this.f39103a.H();
    }

    public final int e() {
        return this.f39103a.I();
    }

    public final int f() {
        return this.f39103a.J();
    }

    public final void g(int i10) {
        this.f39103a.K(i10);
    }

    public final void h(int i10) {
        this.f39103a.L(i10);
    }

    public final void i(int i10) {
        this.f39103a.M(i10);
    }

    public final void j(int i10) {
        this.f39103a.N(i10);
    }

    public final void k(int i10) {
        this.f39103a.O(i10);
    }
}
