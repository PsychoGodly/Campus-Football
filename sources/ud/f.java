package ud;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import td.d;

/* compiled from: MapBuilder.kt */
public final class f<V> extends d<V> {

    /* renamed from: a  reason: collision with root package name */
    private final c<?, V> f38785a;

    public f(c<?, V> cVar) {
        m.e(cVar, "backing");
        this.f38785a = cVar;
    }

    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        m.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.f38785a.size();
    }

    public void clear() {
        this.f38785a.clear();
    }

    public boolean contains(Object obj) {
        return this.f38785a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f38785a.isEmpty();
    }

    public Iterator<V> iterator() {
        return this.f38785a.M();
    }

    public boolean remove(Object obj) {
        return this.f38785a.K(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        this.f38785a.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        this.f38785a.k();
        return super.retainAll(collection);
    }
}
