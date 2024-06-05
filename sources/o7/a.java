package o7;

import e7.e0;

/* compiled from: Event */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f29484a;

    /* renamed from: b  reason: collision with root package name */
    private final T f29485b;

    public a(Class<T> cls, T t10) {
        this.f29484a = (Class) e0.b(cls);
        this.f29485b = e0.b(t10);
    }

    public T a() {
        return this.f29485b;
    }

    public Class<T> b() {
        return this.f29484a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f29484a, this.f29485b});
    }
}
