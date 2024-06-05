package xd;

import fe.l;
import kotlin.jvm.internal.m;
import xd.g;
import xd.g.b;

/* compiled from: CoroutineContextImpl.kt */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: a  reason: collision with root package name */
    private final l<g.b, E> f39340a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c<?> f39341b;

    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        m.e(cVar, "baseKey");
        m.e(lVar, "safeCast");
        this.f39340a = lVar;
        this.f39341b = cVar instanceof b ? ((b) cVar).f39341b : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        m.e(cVar, "key");
        return cVar == this || this.f39341b == cVar;
    }

    public final E b(g.b bVar) {
        m.e(bVar, "element");
        return (g.b) this.f39340a.invoke(bVar);
    }
}
