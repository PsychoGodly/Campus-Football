package s6;

import java.util.ListIterator;

/* compiled from: UnmodifiableListIterator */
public abstract class e1<E> extends d1<E> implements ListIterator<E> {
    protected e1() {
    }

    @Deprecated
    public final void add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e10) {
        throw new UnsupportedOperationException();
    }
}
