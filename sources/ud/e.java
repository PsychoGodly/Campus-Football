package ud;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import td.f;

/* compiled from: MapBuilder.kt */
public final class e<E> extends f<E> {

    /* renamed from: a  reason: collision with root package name */
    private final c<E, ?> f38784a;

    public e(c<E, ?> cVar) {
        m.e(cVar, "backing");
        this.f38784a = cVar;
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        m.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.f38784a.size();
    }

    public void clear() {
        this.f38784a.clear();
    }

    public boolean contains(Object obj) {
        return this.f38784a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f38784a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f38784a.B();
    }

    public boolean remove(Object obj) {
        return this.f38784a.I(obj) >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        this.f38784a.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        this.f38784a.k();
        return super.retainAll(collection);
    }
}
