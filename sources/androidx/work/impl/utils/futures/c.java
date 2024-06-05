package androidx.work.impl.utils.futures;

import w6.f;

/* compiled from: SettableFuture */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> t() {
        return new c<>();
    }

    public boolean p(V v10) {
        return super.p(v10);
    }

    public boolean q(Throwable th) {
        return super.q(th);
    }

    public boolean r(f<? extends V> fVar) {
        return super.r(fVar);
    }
}
