package xd;

import fe.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import xd.e;

/* compiled from: CoroutineContext.kt */
public interface g {

    /* compiled from: CoroutineContext.kt */
    public static final class a {

        /* renamed from: xd.g$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        static final class C0462a extends n implements p<g, b, g> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0462a f39346a = new C0462a();

            C0462a() {
                super(2);
            }

            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                c cVar;
                m.e(gVar, "acc");
                m.e(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f39347a;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.E1;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            m.e(gVar2, "context");
            return gVar2 == h.f39347a ? gVar : (g) gVar2.fold(gVar, C0462a.f39346a);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                m.e(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                m.e(cVar, "key");
                if (!m.a(bVar.getKey(), cVar)) {
                    return null;
                }
                m.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> cVar) {
                m.e(cVar, "key");
                return m.a(bVar.getKey(), cVar) ? h.f39347a : bVar;
            }

            public static g d(b bVar, g gVar) {
                m.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
