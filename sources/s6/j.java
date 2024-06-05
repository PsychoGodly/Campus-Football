package s6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import r6.o;
import r6.p;

/* compiled from: Collections2 */
public final class j {

    /* compiled from: Collections2 */
    static class a<E> extends AbstractCollection<E> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<E> f30183a;

        /* renamed from: b  reason: collision with root package name */
        final p<? super E> f30184b;

        a(Collection<E> collection, p<? super E> pVar) {
            this.f30183a = collection;
            this.f30184b = pVar;
        }

        public boolean add(E e10) {
            o.d(this.f30184b.apply(e10));
            return this.f30183a.add(e10);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                o.d(this.f30184b.apply(apply));
            }
            return this.f30183a.addAll(collection);
        }

        public void clear() {
            b0.g(this.f30183a, this.f30184b);
        }

        public boolean contains(Object obj) {
            if (j.c(this.f30183a, obj)) {
                return this.f30184b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return j.a(this, collection);
        }

        public boolean isEmpty() {
            return !b0.a(this.f30183a, this.f30184b);
        }

        public Iterator<E> iterator() {
            return c0.i(this.f30183a.iterator(), this.f30184b);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.f30183a.remove(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f30183a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f30184b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f30183a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f30184b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public int size() {
            int i10 = 0;
            for (E apply : this.f30183a) {
                if (this.f30184b.apply(apply)) {
                    i10++;
                }
            }
            return i10;
        }

        public Object[] toArray() {
            return e0.i(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return e0.i(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i10) {
        i.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
    }

    static boolean c(Collection<?> collection, Object obj) {
        o.o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
