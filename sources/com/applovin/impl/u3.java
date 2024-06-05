package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

class u3 extends AbstractMap implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient int[] f12489a;

    /* renamed from: b  reason: collision with root package name */
    transient long[] f12490b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f12491c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f12492d;

    /* renamed from: f  reason: collision with root package name */
    transient float f12493f;

    /* renamed from: g  reason: collision with root package name */
    transient int f12494g;

    /* renamed from: h  reason: collision with root package name */
    private transient int f12495h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public transient int f12496i;

    /* renamed from: j  reason: collision with root package name */
    private transient Set f12497j;

    /* renamed from: k  reason: collision with root package name */
    private transient Set f12498k;

    /* renamed from: l  reason: collision with root package name */
    private transient Collection f12499l;

    class a extends e {
        a() {
            super(u3.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public Object a(int i10) {
            return u3.this.f12491c[i10];
        }
    }

    class b extends e {
        b() {
            super(u3.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry a(int i10) {
            return new g(i10);
        }
    }

    class c extends e {
        c() {
            super(u3.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public Object a(int i10) {
            return u3.this.f12492d[i10];
        }
    }

    class d extends AbstractSet {
        d() {
        }

        public void clear() {
            u3.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a10 = u3.this.a(entry.getKey());
            if (a10 == -1 || !Objects.equal(u3.this.f12492d[a10], entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator iterator() {
            return u3.this.e();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a10 = u3.this.a(entry.getKey());
            if (a10 == -1 || !Objects.equal(u3.this.f12492d[a10], entry.getValue())) {
                return false;
            }
            Object unused = u3.this.f(a10);
            return true;
        }

        public int size() {
            return u3.this.f12496i;
        }
    }

    class f extends AbstractSet {
        f() {
        }

        public void clear() {
            u3.this.clear();
        }

        public boolean contains(Object obj) {
            return u3.this.containsKey(obj);
        }

        public Iterator iterator() {
            return u3.this.h();
        }

        public boolean remove(Object obj) {
            int a10 = u3.this.a(obj);
            if (a10 == -1) {
                return false;
            }
            Object unused = u3.this.f(a10);
            return true;
        }

        public int size() {
            return u3.this.f12496i;
        }
    }

    final class g extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Object f12509a;

        /* renamed from: b  reason: collision with root package name */
        private int f12510b;

        g(int i10) {
            this.f12509a = u3.this.f12491c[i10];
            this.f12510b = i10;
        }

        private void a() {
            int i10 = this.f12510b;
            if (i10 == -1 || i10 >= u3.this.size() || !Objects.equal(this.f12509a, u3.this.f12491c[this.f12510b])) {
                this.f12510b = u3.this.a(this.f12509a);
            }
        }

        public Object getKey() {
            return this.f12509a;
        }

        public Object getValue() {
            a();
            int i10 = this.f12510b;
            if (i10 == -1) {
                return null;
            }
            return u3.this.f12492d[i10];
        }

        public Object setValue(Object obj) {
            a();
            int i10 = this.f12510b;
            if (i10 == -1) {
                u3.this.put(this.f12509a, obj);
                return null;
            }
            Object[] objArr = u3.this.f12492d;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
    }

    class h extends AbstractCollection {
        h() {
        }

        public void clear() {
            u3.this.clear();
        }

        public Iterator iterator() {
            return u3.this.i();
        }

        public int size() {
            return u3.this.f12496i;
        }
    }

    u3() {
        a(3, 1.0f);
    }

    private static int a(long j10) {
        return (int) (j10 >>> 32);
    }

    private static long a(long j10, int i10) {
        return (j10 & -4294967296L) | (((long) i10) & 4294967295L);
    }

    private static int b(long j10) {
        return (int) j10;
    }

    private static long[] d(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    private static int[] e(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int g() {
        return this.f12489a.length - 1;
    }

    private void h(int i10) {
        int length = this.f12490b.length;
        if (i10 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = a.e.API_PRIORITY_OTHER;
            }
            if (max != length) {
                g(max);
            }
        }
    }

    private void i(int i10) {
        if (this.f12489a.length >= 1073741824) {
            this.f12495h = a.e.API_PRIORITY_OTHER;
            return;
        }
        int i11 = ((int) (((float) i10) * this.f12493f)) + 1;
        int[] e10 = e(i10);
        long[] jArr = this.f12490b;
        int length = e10.length - 1;
        for (int i12 = 0; i12 < this.f12496i; i12++) {
            int a10 = a(jArr[i12]);
            int i13 = a10 & length;
            int i14 = e10[i13];
            e10[i13] = i12;
            jArr[i12] = (((long) a10) << 32) | (((long) i14) & 4294967295L);
        }
        this.f12495h = i11;
        this.f12489a = e10;
    }

    /* access modifiers changed from: package-private */
    public int a(int i10, int i11) {
        return i10 - 1;
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
    }

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f12496i) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void c(int i10) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f12491c;
            objArr[i10] = objArr[size];
            Object[] objArr2 = this.f12492d;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f12490b;
            long j10 = jArr[size];
            jArr[i10] = j10;
            jArr[size] = -1;
            int a10 = a(j10) & g();
            int[] iArr = this.f12489a;
            int i11 = iArr[a10];
            if (i11 == size) {
                iArr[a10] = i10;
                return;
            }
            while (true) {
                long j11 = this.f12490b[i11];
                int b10 = b(j11);
                if (b10 == size) {
                    this.f12490b[i11] = a(j11, i10);
                    return;
                }
                i11 = b10;
            }
        } else {
            this.f12491c[i10] = null;
            this.f12492d[i10] = null;
            this.f12490b[i10] = -1;
        }
    }

    public void clear() {
        this.f12494g++;
        Arrays.fill(this.f12491c, 0, this.f12496i, (Object) null);
        Arrays.fill(this.f12492d, 0, this.f12496i, (Object) null);
        Arrays.fill(this.f12489a, -1);
        Arrays.fill(this.f12490b, -1);
        this.f12496i = 0;
    }

    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        for (int i10 = 0; i10 < this.f12496i; i10++) {
            if (Objects.equal(obj, this.f12492d[i10])) {
                return true;
            }
        }
        return false;
    }

    public Set entrySet() {
        Set set = this.f12498k;
        if (set != null) {
            return set;
        }
        Set b10 = b();
        this.f12498k = b10;
        return b10;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return isEmpty() ? -1 : 0;
    }

    public Object get(Object obj) {
        int a10 = a(obj);
        a(a10);
        if (a10 == -1) {
            return null;
        }
        return this.f12492d[a10];
    }

    public boolean isEmpty() {
        return this.f12496i == 0;
    }

    public Set keySet() {
        Set set = this.f12497j;
        if (set != null) {
            return set;
        }
        Set c10 = c();
        this.f12497j = c10;
        return c10;
    }

    public Object put(Object obj, Object obj2) {
        long[] jArr = this.f12490b;
        Object[] objArr = this.f12491c;
        Object[] objArr2 = this.f12492d;
        int a10 = ia.a(obj);
        int g10 = g() & a10;
        int i10 = this.f12496i;
        int[] iArr = this.f12489a;
        int i11 = iArr[g10];
        if (i11 == -1) {
            iArr[g10] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (a(j10) != a10 || !Objects.equal(obj, objArr[i11])) {
                    int b10 = b(j10);
                    if (b10 == -1) {
                        jArr[i11] = a(j10, i10);
                        break;
                    }
                    i11 = b10;
                } else {
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = obj2;
                    a(i11);
                    return obj3;
                }
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            int i12 = i10 + 1;
            h(i12);
            a(i10, obj, obj2, a10);
            this.f12496i = i12;
            if (i10 >= this.f12495h) {
                i(this.f12489a.length * 2);
            }
            this.f12494g++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public Object remove(Object obj) {
        return a(obj, ia.a(obj));
    }

    public int size() {
        return this.f12496i;
    }

    public Collection values() {
        Collection collection = this.f12499l;
        if (collection != null) {
            return collection;
        }
        Collection d10 = d();
        this.f12499l = d10;
        return d10;
    }

    /* access modifiers changed from: private */
    public Object f(int i10) {
        return a(this.f12491c[i10], a(this.f12490b[i10]));
    }

    /* access modifiers changed from: package-private */
    public Set b() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f12491c = Arrays.copyOf(this.f12491c, i10);
        this.f12492d = Arrays.copyOf(this.f12492d, i10);
        long[] jArr = this.f12490b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1);
        }
        this.f12490b = copyOf;
    }

    /* access modifiers changed from: package-private */
    public Collection d() {
        return new h();
    }

    /* access modifiers changed from: package-private */
    public Iterator e() {
        return new b();
    }

    private abstract class e implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        int f12504a;

        /* renamed from: b  reason: collision with root package name */
        int f12505b;

        /* renamed from: c  reason: collision with root package name */
        int f12506c;

        private e() {
            this.f12504a = u3.this.f12494g;
            this.f12505b = u3.this.f();
            this.f12506c = -1;
        }

        private void a() {
            if (u3.this.f12494g != this.f12504a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract Object a(int i10);

        public boolean hasNext() {
            return this.f12505b >= 0;
        }

        public Object next() {
            a();
            if (hasNext()) {
                int i10 = this.f12505b;
                this.f12506c = i10;
                Object a10 = a(i10);
                this.f12505b = u3.this.b(this.f12505b);
                return a10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            n3.a(this.f12506c >= 0);
            this.f12504a++;
            Object unused = u3.this.f(this.f12506c);
            this.f12505b = u3.this.a(this.f12505b, this.f12506c);
            this.f12506c = -1;
        }

        /* synthetic */ e(u3 u3Var, a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public int a(Object obj) {
        int a10 = ia.a(obj);
        int i10 = this.f12489a[g() & a10];
        while (i10 != -1) {
            long j10 = this.f12490b[i10];
            if (a(j10) == a10 && Objects.equal(obj, this.f12491c[i10])) {
                return i10;
            }
            i10 = b(j10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Iterator h() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, float f10) {
        boolean z10 = false;
        Preconditions.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        if (f10 > 0.0f) {
            z10 = true;
        }
        Preconditions.checkArgument(z10, "Illegal load factor");
        int a10 = ia.a(i10, (double) f10);
        this.f12489a = e(a10);
        this.f12493f = f10;
        this.f12491c = new Object[i10];
        this.f12492d = new Object[i10];
        this.f12490b = d(i10);
        this.f12495h = Math.max(1, (int) (((float) a10) * f10));
    }

    /* access modifiers changed from: package-private */
    public Iterator i() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public Set c() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, Object obj, Object obj2, int i11) {
        this.f12490b[i10] = (((long) i11) << 32) | 4294967295L;
        this.f12491c[i10] = obj;
        this.f12492d[i10] = obj2;
    }

    private Object a(Object obj, int i10) {
        int g10 = g() & i10;
        int i11 = this.f12489a[g10];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (a(this.f12490b[i11]) != i10 || !Objects.equal(obj, this.f12491c[i11])) {
                int b10 = b(this.f12490b[i11]);
                if (b10 == -1) {
                    return null;
                }
                int i13 = b10;
                i12 = i11;
                i11 = i13;
            } else {
                Object obj2 = this.f12492d[i11];
                if (i12 == -1) {
                    this.f12489a[g10] = b(this.f12490b[i11]);
                } else {
                    long[] jArr = this.f12490b;
                    jArr[i12] = a(jArr[i12], b(jArr[i11]));
                }
                c(i11);
                this.f12496i--;
                this.f12494g++;
                return obj2;
            }
        }
    }

    public static u3 a() {
        return new u3();
    }
}
