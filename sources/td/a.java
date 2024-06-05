package td;

import fe.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: AbstractCollection.kt */
public abstract class a<E> implements Collection<E>, ge.a {

    /* renamed from: td.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractCollection.kt */
    static final class C0440a extends n implements l<E, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<E> f38596a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0440a(a<? extends E> aVar) {
            super(1);
            this.f38596a = aVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(E e10) {
            return e10 == this.f38596a ? "(this Collection)" : String.valueOf(e10);
        }
    }

    protected a() {
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object a10 : this) {
            if (m.a(a10, e10)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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

    public Object[] toArray() {
        return g.a(this);
    }

    public String toString() {
        return y.y(this, ", ", "[", "]", 0, (CharSequence) null, new C0440a(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        return g.b(this, tArr);
    }
}
