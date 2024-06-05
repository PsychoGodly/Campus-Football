package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.v;

/* compiled from: AllowedPiiKt.kt */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39082b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final v.a f39083a;

    /* compiled from: AllowedPiiKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ t a(v.a aVar) {
            m.e(aVar, "builder");
            return new t(aVar, (h) null);
        }
    }

    private t(v.a aVar) {
        this.f39083a = aVar;
    }

    public /* synthetic */ t(v.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ v a() {
        z s10 = this.f39083a.build();
        m.d(s10, "_builder.build()");
        return (v) s10;
    }

    public final boolean b() {
        return this.f39083a.F();
    }

    public final boolean c() {
        return this.f39083a.G();
    }

    public final void d(boolean z10) {
        this.f39083a.H(z10);
    }

    public final void e(boolean z10) {
        this.f39083a.I(z10);
    }
}
