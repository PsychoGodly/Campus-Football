package vb;

import com.google.protobuf.z;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import s8.b;
import vb.m3;

/* compiled from: TransactionEventRequestKt.kt */
public final class i3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38979b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final m3.a f38980a;

    /* compiled from: TransactionEventRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ i3 a(m3.a aVar) {
            m.e(aVar, "builder");
            return new i3(aVar, (h) null);
        }
    }

    private i3(m3.a aVar) {
        this.f38980a = aVar;
    }

    public /* synthetic */ i3(m3.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ m3 a() {
        z s10 = this.f38980a.build();
        m.d(s10, "_builder.build()");
        return (m3) s10;
    }

    public final /* synthetic */ void b(b bVar, Iterable iterable) {
        m.e(bVar, "<this>");
        m.e(iterable, "values");
        this.f38980a.F(iterable);
    }

    public final /* synthetic */ b c() {
        List<l3> G = this.f38980a.G();
        m.d(G, "_builder.getTransactionDataList()");
        return new b(G);
    }

    public final void d(k3 k3Var) {
        m.e(k3Var, "value");
        this.f38980a.H(k3Var);
    }

    public final void e(a1 a1Var) {
        m.e(a1Var, "value");
        this.f38980a.I(a1Var);
    }

    public final void f(b3 b3Var) {
        m.e(b3Var, "value");
        this.f38980a.J(b3Var);
    }
}
