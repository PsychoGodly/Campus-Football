package td;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: AbstractList.kt */
public abstract class c<E> extends a<E> implements List<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38602a = new a((h) null);

    /* compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
            m.e(collection, "c");
            m.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a10 : collection) {
                if (!m.a(a10, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> collection) {
            m.e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* compiled from: AbstractList.kt */
    private class b implements Iterator<E>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private int f38603a;

        public b() {
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.f38603a;
        }

        /* access modifiers changed from: protected */
        public final void b(int i10) {
            this.f38603a = i10;
        }

        public boolean hasNext() {
            return this.f38603a < c.this.size();
        }

        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.f38603a;
                this.f38603a = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: td.c$c  reason: collision with other inner class name */
    /* compiled from: AbstractList.kt */
    private class C0441c extends c<E>.b implements ListIterator<E> {
        public C0441c(int i10) {
            super();
            c.f38602a.b(i10, c.this.size());
            b(i10);
        }

        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return a() > 0;
        }

        public int nextIndex() {
            return a();
        }

        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return a() - 1;
        }

        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    private static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        private final c<E> f38606b;

        /* renamed from: c  reason: collision with root package name */
        private final int f38607c;

        /* renamed from: d  reason: collision with root package name */
        private int f38608d;

        public d(c<? extends E> cVar, int i10, int i11) {
            m.e(cVar, "list");
            this.f38606b = cVar;
            this.f38607c = i10;
            c.f38602a.c(i10, i11, cVar.size());
            this.f38608d = i11 - i10;
        }

        public int b() {
            return this.f38608d;
        }

        public E get(int i10) {
            c.f38602a.a(i10, this.f38608d);
            return this.f38606b.get(this.f38607c + i10);
        }
    }

    protected c() {
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f38602a.d(this, (Collection) obj);
    }

    public abstract E get(int i10);

    public int hashCode() {
        return f38602a.e(this);
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (Object a10 : this) {
            if (m.a(a10, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (m.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C0441c(0);
    }

    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator<E> listIterator(int i10) {
        return new C0441c(i10);
    }
}
