package h0;

import fe.a;
import i0.b;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.g1;
import pe.p0;
import pe.q0;
import pe.z2;

/* compiled from: DataStoreFactory.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f18454a = new g();

    private g() {
    }

    public static /* synthetic */ f b(g gVar, k kVar, b bVar, List list, p0 p0Var, a aVar, int i10, Object obj) {
        b bVar2 = (i10 & 2) != 0 ? null : bVar;
        if ((i10 & 4) != 0) {
            list = q.d();
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            g1 g1Var = g1.f37308a;
            p0Var = q0.a(g1.b().plus(z2.b((c2) null, 1, (Object) null)));
        }
        return gVar.a(kVar, bVar2, list2, p0Var, aVar);
    }

    public final <T> f<T> a(k<T> kVar, b<T> bVar, List<? extends d<T>> list, p0 p0Var, a<? extends File> aVar) {
        m.e(kVar, "serializer");
        m.e(list, "migrations");
        m.e(p0Var, "scope");
        m.e(aVar, "produceFile");
        return new m(aVar, kVar, p.b(e.f18436a.b(list)), new i0.a(), p0Var);
    }
}
