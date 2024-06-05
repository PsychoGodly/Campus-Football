package cb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SignalsStorage */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, T> f31959a = new ConcurrentHashMap();

    public T a(String str) {
        return this.f31959a.get(str);
    }

    public void b(String str, T t10) {
        this.f31959a.put(str, t10);
    }
}
