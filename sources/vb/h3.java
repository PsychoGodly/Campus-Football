package vb;

import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.l3;

/* compiled from: TransactionDataKt.kt */
public final class h3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38975b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final l3.a f38976a;

    /* compiled from: TransactionDataKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ h3 a(l3.a aVar) {
            m.e(aVar, "builder");
            return new h3(aVar, (h) null);
        }
    }

    private h3(l3.a aVar) {
        this.f38976a = aVar;
    }

    public /* synthetic */ h3(l3.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ l3 a() {
        z s10 = this.f38976a.build();
        m.d(s10, "_builder.build()");
        return (l3) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f38976a.F(iVar);
    }

    public final void c(String str) {
        m.e(str, "value");
        this.f38976a.G(str);
    }

    public final void d(String str) {
        m.e(str, "value");
        this.f38976a.H(str);
    }

    public final void e(t1 t1Var) {
        m.e(t1Var, "value");
        this.f38976a.I(t1Var);
    }

    public final void f(String str) {
        m.e(str, "value");
        this.f38976a.J(str);
    }

    public final void g(String str) {
        m.e(str, "value");
        this.f38976a.K(str);
    }

    public final void h(n3 n3Var) {
        m.e(n3Var, "value");
        this.f38976a.L(n3Var);
    }
}
