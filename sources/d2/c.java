package d2;

/* compiled from: InstanceFactory */
public final class c<T> implements b<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final c<Object> f17657b = new c<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final T f17658a;

    private c(T t10) {
        this.f17658a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    public T get() {
        return this.f17658a;
    }
}
