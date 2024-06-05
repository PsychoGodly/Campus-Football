package s6;

import java.util.NoSuchElementException;
import r6.o;

/* compiled from: AbstractIndexedListIterator */
abstract class a<E> extends e1<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f30118a;

    /* renamed from: b  reason: collision with root package name */
    private int f30119b;

    protected a(int i10, int i11) {
        o.r(i11, i10);
        this.f30118a = i10;
        this.f30119b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i10);

    public final boolean hasNext() {
        return this.f30119b < this.f30118a;
    }

    public final boolean hasPrevious() {
        return this.f30119b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.f30119b;
            this.f30119b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f30119b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f30119b - 1;
            this.f30119b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f30119b - 1;
    }
}
