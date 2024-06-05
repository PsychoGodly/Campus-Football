package pe;

import fe.p;
import xd.g;

/* compiled from: CoroutineContext.kt */
final class j3 implements g.b, g.c<j3> {

    /* renamed from: a  reason: collision with root package name */
    public static final j3 f37327a = new j3();

    private j3() {
    }

    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r10, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
