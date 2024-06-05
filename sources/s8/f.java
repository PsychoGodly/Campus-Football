package s8;

import ge.a;
import java.util.ListIterator;
import kotlin.jvm.internal.m;

/* compiled from: UnmodifiableCollections.kt */
public final class f<E> implements ListIterator<E>, a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ListIterator<E> f30309a;

    public f(ListIterator<? extends E> listIterator) {
        m.e(listIterator, "delegate");
        this.f30309a = listIterator;
    }

    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.f30309a.hasNext();
    }

    public boolean hasPrevious() {
        return this.f30309a.hasPrevious();
    }

    public E next() {
        return this.f30309a.next();
    }

    public int nextIndex() {
        return this.f30309a.nextIndex();
    }

    public E previous() {
        return this.f30309a.previous();
    }

    public int previousIndex() {
        return this.f30309a.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
