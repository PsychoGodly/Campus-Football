package te;

import fe.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.c0;
import ue.p0;
import xd.d;
import xd.g;

/* compiled from: ChannelFlow.kt */
public final class f {
    /* JADX INFO: finally extract failed */
    public static final <T, V> Object b(g gVar, V v10, Object obj, p<? super V, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        Object c10 = p0.c(gVar, obj);
        try {
            Object invoke = ((p) c0.b(pVar, 2)).invoke(v10, new x(dVar, gVar));
            p0.a(gVar, c10);
            if (invoke == d.c()) {
                h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            p0.a(gVar, c10);
            throw th;
        }
    }

    public static /* synthetic */ Object c(g gVar, Object obj, Object obj2, p pVar, d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = p0.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final <T> se.f<T> d(se.f<? super T> fVar, g gVar) {
        return fVar instanceof w ? true : fVar instanceof r ? fVar : new z(fVar, gVar);
    }
}
