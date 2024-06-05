package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.m0;

/* compiled from: DeveloperConsentOptionKt.kt */
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38977b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final m0.a f38978a;

    /* compiled from: DeveloperConsentOptionKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ i0 a(m0.a aVar) {
            m.e(aVar, "builder");
            return new i0(aVar, (h) null);
        }
    }

    private i0(m0.a aVar) {
        this.f38978a = aVar;
    }

    public /* synthetic */ i0(m0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ m0 a() {
        z s10 = this.f38978a.build();
        m.d(s10, "_builder.build()");
        return (m0) s10;
    }

    public final n0 b() {
        n0 F = this.f38978a.F();
        m.d(F, "_builder.getType()");
        return F;
    }

    public final void c(String str) {
        m.e(str, "value");
        this.f38978a.G(str);
    }

    public final void d(n0 n0Var) {
        m.e(n0Var, "value");
        this.f38978a.H(n0Var);
    }

    public final void e(l0 l0Var) {
        m.e(l0Var, "value");
        this.f38978a.I(l0Var);
    }
}
