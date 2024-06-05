package s6;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator */
public abstract class d1<E> implements Iterator<E> {
    protected d1() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
