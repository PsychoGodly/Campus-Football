package ud;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: MapBuilder.kt */
public final class d<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final c<K, V> f38783a;

    public d(c<K, V> cVar) {
        m.e(cVar, "backing");
        this.f38783a = cVar;
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        m.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.f38783a.size();
    }

    public void clear() {
        this.f38783a.clear();
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        return this.f38783a.m(collection);
    }

    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        m.e(entry, "element");
        return this.f38783a.n(entry);
    }

    public boolean g(Map.Entry entry) {
        m.e(entry, "element");
        return this.f38783a.G(entry);
    }

    /* renamed from: h */
    public boolean add(Map.Entry<K, V> entry) {
        m.e(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.f38783a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f38783a.r();
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        this.f38783a.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        this.f38783a.k();
        return super.retainAll(collection);
    }
}
