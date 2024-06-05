package s6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import r6.o;

/* compiled from: ImmutableSet */
public abstract class x<E> extends s<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient u<E> f30281b;

    x() {
    }

    public static <E> x<E> A(E e10, E e11, E e12, E e13, E e14) {
        return o(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> x<E> B(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        o.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return o(length, objArr);
    }

    private static boolean C(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int n(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        o.e(z10, "collection too large");
        return 1073741824;
    }

    private static <E> x<E> o(int i10, Object... objArr) {
        if (i10 == 0) {
            return w();
        }
        if (i10 != 1) {
            int n10 = n(i10);
            Object[] objArr2 = new Object[n10];
            int i11 = n10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = o0.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int b10 = r.b(hashCode);
                while (true) {
                    int i15 = b10 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj.equals(a10)) {
                        break;
                    } else {
                        b10++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new z0(obj2);
            } else if (n(i13) < n10 / 2) {
                return o(i13, objArr);
            } else {
                if (C(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new t0(objArr, i12, objArr2, i11, i13);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return x(obj3);
        }
    }

    public static <E> x<E> p(Collection<? extends E> collection) {
        if ((collection instanceof x) && !(collection instanceof SortedSet)) {
            x<E> xVar = (x) collection;
            if (!xVar.h()) {
                return xVar;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    public static <E> x<E> q(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return w();
        }
        if (length != 1) {
            return o(eArr.length, (Object[]) eArr.clone());
        }
        return x(eArr[0]);
    }

    public static <E> x<E> w() {
        return t0.f30244j;
    }

    public static <E> x<E> x(E e10) {
        return new z0(e10);
    }

    public static <E> x<E> y(E e10, E e11) {
        return o(2, e10, e11);
    }

    public static <E> x<E> z(E e10, E e11, E e12) {
        return o(3, e10, e11, e12);
    }

    public u<E> b() {
        u<E> uVar = this.f30281b;
        if (uVar != null) {
            return uVar;
        }
        u<E> u10 = u();
        this.f30281b = u10;
        return u10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x) || !v() || !((x) obj).v() || hashCode() == obj.hashCode()) {
            return y0.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return y0.d(this);
    }

    /* renamed from: m */
    public abstract d1<E> iterator();

    /* access modifiers changed from: package-private */
    public u<E> u() {
        return u.n(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return false;
    }
}
