package androidx.concurrent.futures;

/* compiled from: ResolvableFuture */
public final class d<V> extends a<V> {
    private d() {
    }

    public static <V> d<V> u() {
        return new d<>();
    }

    public boolean q(V v10) {
        return super.q(v10);
    }

    public boolean r(Throwable th) {
        return super.r(th);
    }
}
