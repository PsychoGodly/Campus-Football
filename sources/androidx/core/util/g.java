package androidx.core.util;

/* compiled from: Pools */
public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f3084c = new Object();

    public g(int i10) {
        super(i10);
    }

    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f3084c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    public T b() {
        T b10;
        synchronized (this.f3084c) {
            b10 = super.b();
        }
        return b10;
    }
}
