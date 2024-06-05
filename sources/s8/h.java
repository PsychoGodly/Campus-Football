package s8;

import ge.a;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: UnmodifiableCollections.kt */
public final class h<K, V> implements Map.Entry<K, V>, a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Map.Entry<K, V> f30313a;

    public h(Map.Entry<? extends K, ? extends V> entry) {
        m.e(entry, "delegate");
        this.f30313a = entry;
    }

    public K getKey() {
        return this.f30313a.getKey();
    }

    public V getValue() {
        return this.f30313a.getValue();
    }

    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
