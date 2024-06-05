package te;

import fe.p;
import xd.g;

/* compiled from: SafeCollector.kt */
public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f38702a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f38703b;

    public l(Throwable th, g gVar) {
        this.f38702a = th;
        this.f38703b = gVar;
    }

    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return this.f38703b.fold(r10, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return this.f38703b.get(cVar);
    }

    public g minusKey(g.c<?> cVar) {
        return this.f38703b.minusKey(cVar);
    }

    public g plus(g gVar) {
        return this.f38703b.plus(gVar);
    }
}
