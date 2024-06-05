package ud;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.m;
import td.f;

/* compiled from: MapBuilder.kt */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends f<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return e((Map.Entry) obj);
    }

    public final boolean e(E e10) {
        m.e(e10, "element");
        return f(e10);
    }

    public abstract boolean f(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean g(Map.Entry<?, ?> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return g((Map.Entry) obj);
    }
}
