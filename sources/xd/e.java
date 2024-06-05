package xd;

import kotlin.jvm.internal.m;
import xd.g;

/* compiled from: ContinuationInterceptor.kt */
public interface e extends g.b {
    public static final b E1 = b.f39345a;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            m.e(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b10 = bVar.b(eVar);
                if (b10 instanceof g.b) {
                    return b10;
                }
                return null;
            } else if (e.E1 != cVar) {
                return null;
            } else {
                m.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            m.e(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.E1 == cVar ? h.f39347a : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f39347a;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class b implements g.c<e> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f39345a = new b();

        private b() {
        }
    }

    void G0(d<?> dVar);

    <T> d<T> J(d<? super T> dVar);
}
