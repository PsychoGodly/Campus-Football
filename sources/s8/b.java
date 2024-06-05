package s8;

import ge.a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: DslList.kt */
public final class b<E, P> implements List<E>, a {

    /* renamed from: a  reason: collision with root package name */
    private final List<E> f30305a;

    public b(List<? extends E> list) {
        m.e(list, "delegate");
        this.f30305a = list;
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f30305a.size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f30305a.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        return this.f30305a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return m.a(this.f30305a, obj);
    }

    public E get(int i10) {
        return this.f30305a.get(i10);
    }

    public int hashCode() {
        return this.f30305a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f30305a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f30305a.isEmpty();
    }

    public Iterator<E> iterator() {
        return new e(this.f30305a.iterator());
    }

    public int lastIndexOf(Object obj) {
        return this.f30305a.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return new f(this.f30305a.listIterator());
    }

    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return this.f30305a.subList(i10, i11);
    }

    public Object[] toArray() {
        return g.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        return g.b(this, tArr);
    }

    public String toString() {
        return this.f30305a.toString();
    }

    public ListIterator<E> listIterator(int i10) {
        return new f(this.f30305a.listIterator(i10));
    }
}
