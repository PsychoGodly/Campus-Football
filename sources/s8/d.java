package s8;

import ge.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: UnmodifiableCollections.kt */
public class d<E> implements Collection<E>, a {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<E> f30307a;

    public d(Collection<? extends E> collection) {
        m.e(collection, "delegate");
        this.f30307a = collection;
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f30307a.size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        return this.f30307a.contains(e10);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        return this.f30307a.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.f30307a.isEmpty();
    }

    public Iterator<E> iterator() {
        return new e(this.f30307a.iterator());
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public Object[] toArray() {
        return g.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        return g.b(this, tArr);
    }
}
