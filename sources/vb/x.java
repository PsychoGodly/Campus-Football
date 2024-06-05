package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.a0;

/* compiled from: CampaignKt.kt */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39110b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final a0.a f39111a;

    /* compiled from: CampaignKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ x a(a0.a aVar) {
            m.e(aVar, "builder");
            return new x(aVar, (h) null);
        }
    }

    private x(a0.a aVar) {
        this.f39111a = aVar;
    }

    public /* synthetic */ x(a0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ a0 a() {
        z s10 = this.f39111a.build();
        m.d(s10, "_builder.build()");
        return (a0) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f39111a.F(iVar);
    }

    public final void c(int i10) {
        this.f39111a.G(i10);
    }

    public final void d(i iVar) {
        m.e(iVar, "value");
        this.f39111a.H(iVar);
    }

    public final void e(g3 g3Var) {
        m.e(g3Var, "value");
        this.f39111a.I(g3Var);
    }

    public final void f(String str) {
        m.e(str, "value");
        this.f39111a.J(str);
    }

    public final void g(g3 g3Var) {
        m.e(g3Var, "value");
        this.f39111a.K(g3Var);
    }
}
