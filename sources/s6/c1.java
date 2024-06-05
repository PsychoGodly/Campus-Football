package s6;

import java.util.Iterator;
import r6.o;

/* compiled from: TransformedIterator */
abstract class c1<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterator<? extends F> f30137a;

    c1(Iterator<? extends F> it) {
        this.f30137a = (Iterator) o.o(it);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f10);

    public final boolean hasNext() {
        return this.f30137a.hasNext();
    }

    public final T next() {
        return a(this.f30137a.next());
    }

    public final void remove() {
        this.f30137a.remove();
    }
}
