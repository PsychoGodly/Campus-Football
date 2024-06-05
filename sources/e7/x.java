package e7;

import b8.b;

/* compiled from: Lazy */
public class x<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f28796c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f28797a = f28796c;

    /* renamed from: b  reason: collision with root package name */
    private volatile b<T> f28798b;

    public x(b<T> bVar) {
        this.f28798b = bVar;
    }

    public T get() {
        T t10 = this.f28797a;
        T t11 = f28796c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f28797a;
                if (t10 == t11) {
                    t10 = this.f28798b.get();
                    this.f28797a = t10;
                    this.f28798b = null;
                }
            }
        }
        return t10;
    }
}
