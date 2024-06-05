package s6;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import r6.o;

/* compiled from: ImmutableCollection */
public abstract class s<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f30223a = new Object[0];

    /* compiled from: ImmutableCollection */
    static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f30224a;

        /* renamed from: b  reason: collision with root package name */
        int f30225b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f30226c;

        a(int i10) {
            i.b(i10, "initialCapacity");
            this.f30224a = new Object[i10];
        }

        private void g(int i10) {
            Object[] objArr = this.f30224a;
            if (objArr.length < i10) {
                this.f30224a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
                this.f30226c = false;
            } else if (this.f30226c) {
                this.f30224a = (Object[]) objArr.clone();
                this.f30226c = false;
            }
        }

        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(this.f30225b + collection.size());
                if (collection instanceof s) {
                    this.f30225b = ((s) collection).c(this.f30224a, this.f30225b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e10) {
            o.o(e10);
            g(this.f30225b + 1);
            Object[] objArr = this.f30224a;
            int i10 = this.f30225b;
            this.f30225b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void f(Object[] objArr, int i10) {
            o0.c(objArr, i10);
            g(this.f30225b + i10);
            System.arraycopy(objArr, 0, this.f30224a, this.f30225b, i10);
            this.f30225b += i10;
        }
    }

    /* compiled from: ImmutableCollection */
    public static abstract class b<E> {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            for (Object a10 : iterable) {
                a(a10);
            }
            return this;
        }
    }

    s() {
    }

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public u<E> b() {
        return isEmpty() ? u.y() : u.n(toArray());
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        d1 m10 = iterator();
        while (m10.hasNext()) {
            objArr[i10] = m10.next();
            i10++;
        }
        return i10;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean h();

    /* renamed from: m */
    public abstract d1<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f30223a);
    }

    public final <T> T[] toArray(T[] tArr) {
        o.o(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] e10 = e();
            if (e10 != null) {
                return q0.a(e10, g(), f(), tArr);
            }
            tArr = o0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}
