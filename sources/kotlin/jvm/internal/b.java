package kotlin.jvm.internal;

import ge.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
final class b<T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f36038a;

    /* renamed from: b  reason: collision with root package name */
    private int f36039b;

    public b(T[] tArr) {
        m.e(tArr, "array");
        this.f36038a = tArr;
    }

    public boolean hasNext() {
        return this.f36039b < this.f36038a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f36038a;
            int i10 = this.f36039b;
            this.f36039b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f36039b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
