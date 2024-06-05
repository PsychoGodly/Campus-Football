package td;

import ge.a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.m;

/* compiled from: Collections.kt */
final class g<T> implements Collection<T>, a {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f38612a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38613b;

    public g(T[] tArr, boolean z10) {
        m.e(tArr, "values");
        this.f38612a = tArr;
        this.f38613b = z10;
    }

    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f38612a.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return m.i(this.f38612a, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        m.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f38612a.length == 0;
    }

    public Iterator<T> iterator() {
        return c.a(this.f38612a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public final Object[] toArray() {
        return p.a(this.f38612a, this.f38613b);
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        return kotlin.jvm.internal.g.b(this, tArr);
    }
}
