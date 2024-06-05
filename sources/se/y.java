package se;

import fe.p;
import sd.w;
import xd.d;

/* compiled from: Builders.kt */
final class y<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<f<? super T>, d<? super w>, Object> f38374a;

    public y(p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        this.f38374a = pVar;
    }

    public Object f(f<? super T> fVar, d<? super w> dVar) {
        Object invoke = this.f38374a.invoke(fVar, dVar);
        return invoke == d.c() ? invoke : w.f38141a;
    }
}
