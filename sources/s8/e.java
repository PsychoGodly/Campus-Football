package s8;

import ge.a;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* compiled from: UnmodifiableCollections.kt */
public final class e<E> implements Iterator<E>, a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Iterator<E> f30308a;

    public e(Iterator<? extends E> it) {
        m.e(it, "delegate");
        this.f30308a = it;
    }

    public boolean hasNext() {
        return this.f30308a.hasNext();
    }

    public E next() {
        return this.f30308a.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
