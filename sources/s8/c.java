package s8;

import ge.a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.m;

/* compiled from: DslMap.kt */
public final class c<K, V, P> implements Map<K, V>, a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, V> f30306a;

    public c(Map<K, ? extends V> map) {
        m.e(map, "delegate");
        this.f30306a = map;
    }

    public Set<Map.Entry<K, V>> a() {
        return new g(this.f30306a.entrySet());
    }

    public Set<K> b() {
        return new i(this.f30306a.keySet());
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.f30306a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f30306a.containsValue(obj);
    }

    public int d() {
        return this.f30306a.size();
    }

    public Collection<V> e() {
        return new d(this.f30306a.values());
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    public boolean equals(Object obj) {
        return m.a(this.f30306a, obj);
    }

    public V get(Object obj) {
        return this.f30306a.get(obj);
    }

    public int hashCode() {
        return this.f30306a.hashCode();
    }

    public boolean isEmpty() {
        return this.f30306a.isEmpty();
    }

    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return d();
    }

    public String toString() {
        return this.f30306a.toString();
    }

    public final /* bridge */ Collection<V> values() {
        return e();
    }
}
