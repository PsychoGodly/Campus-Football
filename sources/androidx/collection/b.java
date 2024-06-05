package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f1952f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f1953g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    private static Object[] f1954h;

    /* renamed from: i  reason: collision with root package name */
    private static int f1955i;

    /* renamed from: j  reason: collision with root package name */
    private static Object[] f1956j;

    /* renamed from: k  reason: collision with root package name */
    private static int f1957k;

    /* renamed from: a  reason: collision with root package name */
    private int[] f1958a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f1959b;

    /* renamed from: c  reason: collision with root package name */
    int f1960c;

    /* renamed from: d  reason: collision with root package name */
    private f<E, E> f1961d;

    /* compiled from: ArraySet */
    class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return b.this.f1959b[i10];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f1960c;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e10, E e11) {
            b.this.add(e10);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            b.this.m(i10);
        }

        /* access modifiers changed from: protected */
        public E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void b(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1956j;
                if (objArr != null) {
                    this.f1959b = objArr;
                    f1956j = (Object[]) objArr[0];
                    this.f1958a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1957k--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1954h;
                if (objArr2 != null) {
                    this.f1959b = objArr2;
                    f1954h = (Object[]) objArr2[0];
                    this.f1958a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1955i--;
                    return;
                }
            }
        }
        this.f1958a = new int[i10];
        this.f1959b = new Object[i10];
    }

    private static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1957k < 10) {
                    objArr[0] = f1956j;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1956j = objArr;
                    f1957k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1955i < 10) {
                    objArr[0] = f1954h;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1954h = objArr;
                    f1955i++;
                }
            }
        }
    }

    private f<E, E> f() {
        if (this.f1961d == null) {
            this.f1961d = new a();
        }
        return this.f1961d;
    }

    private int g(Object obj, int i10) {
        int i11 = this.f1960c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f1958a, i11, i10);
        if (a10 < 0 || obj.equals(this.f1959b[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f1958a[i12] == i10) {
            if (obj.equals(this.f1959b[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f1958a[i13] == i10) {
            if (obj.equals(this.f1959b[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    private int h() {
        int i10 = this.f1960c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f1958a, i10, 0);
        if (a10 < 0 || this.f1959b[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f1958a[i11] == 0) {
            if (this.f1959b[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f1958a[i12] == 0) {
            if (this.f1959b[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = g(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f1960c;
        int[] iArr = this.f1958a;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f1959b;
            b(i14);
            int[] iArr2 = this.f1958a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1959b, 0, objArr.length);
            }
            e(iArr, objArr, this.f1960c);
        }
        int i15 = this.f1960c;
        if (i12 < i15) {
            int[] iArr3 = this.f1958a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f1959b;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f1960c - i12);
        }
        this.f1958a[i12] = i10;
        this.f1959b[i12] = e10;
        this.f1960c++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        c(this.f1960c + collection.size());
        boolean z10 = false;
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public void c(int i10) {
        int[] iArr = this.f1958a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1959b;
            b(i10);
            int i11 = this.f1960c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f1958a, 0, i11);
                System.arraycopy(objArr, 0, this.f1959b, 0, this.f1960c);
            }
            e(iArr, objArr, this.f1960c);
        }
    }

    public void clear() {
        int i10 = this.f1960c;
        if (i10 != 0) {
            e(this.f1958a, this.f1959b, i10);
            this.f1958a = f1952f;
            this.f1959b = f1953g;
            this.f1960c = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f1960c) {
                try {
                    if (!set.contains(n(i10))) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f1958a;
        int i10 = this.f1960c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f1960c <= 0;
    }

    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    public E m(int i10) {
        E[] eArr = this.f1959b;
        E e10 = eArr[i10];
        int i11 = this.f1960c;
        if (i11 <= 1) {
            e(this.f1958a, eArr, i11);
            this.f1958a = f1952f;
            this.f1959b = f1953g;
            this.f1960c = 0;
        } else {
            int[] iArr = this.f1958a;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f1960c = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr = this.f1959b;
                    System.arraycopy(objArr, i14, objArr, i10, this.f1960c - i10);
                }
                this.f1959b[this.f1960c] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                b(i12);
                this.f1960c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1958a, 0, i10);
                    System.arraycopy(eArr, 0, this.f1959b, 0, i10);
                }
                int i15 = this.f1960c;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f1958a, i10, i15 - i10);
                    System.arraycopy(eArr, i16, this.f1959b, i10, this.f1960c - i10);
                }
            }
        }
        return e10;
    }

    public E n(int i10) {
        return this.f1959b[i10];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f1960c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f1959b[i10])) {
                m(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public int size() {
        return this.f1960c;
    }

    public Object[] toArray() {
        int i10 = this.f1960c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f1959b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1960c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1960c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object n10 = n(i10);
            if (n10 != this) {
                sb2.append(n10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f1958a = f1952f;
            this.f1959b = f1953g;
        } else {
            b(i10);
        }
        this.f1960c = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1960c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1960c);
        }
        System.arraycopy(this.f1959b, 0, tArr, 0, this.f1960c);
        int length = tArr.length;
        int i10 = this.f1960c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
