package s6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r6.o;
import s6.s;

/* compiled from: ImmutableList */
public abstract class u<E> extends s<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final e1<Object> f30250b = new b(r0.f30220f, 0);

    /* compiled from: ImmutableList */
    public static final class a<E> extends s.a<E> {
        public a() {
            this(4);
        }

        /* renamed from: h */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public u<E> k() {
            this.f30226c = true;
            return u.o(this.f30224a, this.f30225b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* compiled from: ImmutableList */
    static class b<E> extends a<E> {

        /* renamed from: c  reason: collision with root package name */
        private final u<E> f30251c;

        b(u<E> uVar, int i10) {
            super(uVar.size(), i10);
            this.f30251c = uVar;
        }

        /* access modifiers changed from: protected */
        public E a(int i10) {
            return this.f30251c.get(i10);
        }
    }

    /* compiled from: ImmutableList */
    private static class c<E> extends u<E> {

        /* renamed from: c  reason: collision with root package name */
        private final transient u<E> f30252c;

        c(u<E> uVar) {
            this.f30252c = uVar;
        }

        private int I(int i10) {
            return (size() - 1) - i10;
        }

        private int J(int i10) {
            return size() - i10;
        }

        public u<E> E() {
            return this.f30252c;
        }

        /* renamed from: G */
        public u<E> subList(int i10, int i11) {
            o.t(i10, i11, size());
            return this.f30252c.subList(J(i11), J(i10)).E();
        }

        public boolean contains(Object obj) {
            return this.f30252c.contains(obj);
        }

        public E get(int i10) {
            o.m(i10, size());
            return this.f30252c.get(I(i10));
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return this.f30252c.h();
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f30252c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return I(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return u.super.iterator();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f30252c.indexOf(obj);
            if (indexOf >= 0) {
                return I(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return u.super.listIterator();
        }

        public int size() {
            return this.f30252c.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return u.super.listIterator(i10);
        }
    }

    /* compiled from: ImmutableList */
    class d extends u<E> {

        /* renamed from: c  reason: collision with root package name */
        final transient int f30253c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f30254d;

        d(int i10, int i11) {
            this.f30253c = i10;
            this.f30254d = i11;
        }

        /* renamed from: G */
        public u<E> subList(int i10, int i11) {
            o.t(i10, i11, this.f30254d);
            u uVar = u.this;
            int i12 = this.f30253c;
            return uVar.subList(i10 + i12, i11 + i12);
        }

        /* access modifiers changed from: package-private */
        public Object[] e() {
            return u.this.e();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return u.this.g() + this.f30253c + this.f30254d;
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return u.this.g() + this.f30253c;
        }

        public E get(int i10) {
            o.m(i10, this.f30254d);
            return u.this.get(i10 + this.f30253c);
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return u.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return u.super.listIterator();
        }

        public int size() {
            return this.f30254d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return u.super.listIterator(i10);
        }
    }

    u() {
    }

    public static <E> u<E> A(E e10, E e11) {
        return q(e10, e11);
    }

    public static <E> u<E> B(E e10, E e11, E e12) {
        return q(e10, e11, e12);
    }

    public static <E> u<E> C(E e10, E e11, E e12, E e13, E e14) {
        return q(e10, e11, e12, e13, e14);
    }

    public static <E> u<E> D(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return q(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> u<E> F(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        o.o(comparator);
        Object[] j10 = b0.j(iterable);
        o0.b(j10);
        Arrays.sort(j10, comparator);
        return n(j10);
    }

    static <E> u<E> n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static <E> u<E> o(Object[] objArr, int i10) {
        if (i10 == 0) {
            return y();
        }
        return new r0(objArr, i10);
    }

    public static <E> a<E> p() {
        return new a<>();
    }

    private static <E> u<E> q(Object... objArr) {
        return n(o0.b(objArr));
    }

    public static <E> u<E> u(Collection<? extends E> collection) {
        if (!(collection instanceof s)) {
            return q(collection.toArray());
        }
        u<E> b10 = ((s) collection).b();
        return b10.h() ? n(b10.toArray()) : b10;
    }

    public static <E> u<E> v(E[] eArr) {
        if (eArr.length == 0) {
            return y();
        }
        return q((Object[]) eArr.clone());
    }

    public static <E> u<E> y() {
        return r0.f30220f;
    }

    public static <E> u<E> z(E e10) {
        return q(e10);
    }

    public u<E> E() {
        return size() <= 1 ? this : new c(this);
    }

    /* renamed from: G */
    public u<E> subList(int i10, int i11) {
        o.t(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return y();
        }
        return H(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public u<E> H(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final u<E> b() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return e0.c(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return e0.d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return e0.f(this, obj);
    }

    /* renamed from: m */
    public d1<E> iterator() {
        return listIterator();
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public e1<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: x */
    public e1<E> listIterator(int i10) {
        o.r(i10, size());
        if (isEmpty()) {
            return f30250b;
        }
        return new b(this, i10);
    }
}
