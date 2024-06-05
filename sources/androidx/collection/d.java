package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* compiled from: LongSparseArray */
public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1966f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f1967a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f1968b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1969c;

    /* renamed from: d  reason: collision with root package name */
    private int f1970d;

    public d() {
        this(10);
    }

    private void d() {
        int i10 = this.f1970d;
        long[] jArr = this.f1968b;
        Object[] objArr = this.f1969c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1966f) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1967a = false;
        this.f1970d = i11;
    }

    public void a(long j10, E e10) {
        int i10 = this.f1970d;
        if (i10 == 0 || j10 > this.f1968b[i10 - 1]) {
            if (this.f1967a && i10 >= this.f1968b.length) {
                d();
            }
            int i11 = this.f1970d;
            if (i11 >= this.f1968b.length) {
                int f10 = c.f(i11 + 1);
                long[] jArr = new long[f10];
                Object[] objArr = new Object[f10];
                long[] jArr2 = this.f1968b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1969c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1968b = jArr;
                this.f1969c = objArr;
            }
            this.f1968b[i11] = j10;
            this.f1969c[i11] = e10;
            this.f1970d = i11 + 1;
            return;
        }
        j(j10, e10);
    }

    public void b() {
        int i10 = this.f1970d;
        Object[] objArr = this.f1969c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1970d = 0;
        this.f1967a = false;
    }

    /* renamed from: c */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f1968b = (long[]) this.f1968b.clone();
            dVar.f1969c = (Object[]) this.f1969c.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E e(long j10) {
        return f(j10, (Object) null);
    }

    public E f(long j10, E e10) {
        int b10 = c.b(this.f1968b, this.f1970d, j10);
        if (b10 >= 0) {
            E[] eArr = this.f1969c;
            if (eArr[b10] != f1966f) {
                return eArr[b10];
            }
        }
        return e10;
    }

    public int g(long j10) {
        if (this.f1967a) {
            d();
        }
        return c.b(this.f1968b, this.f1970d, j10);
    }

    public long i(int i10) {
        if (this.f1967a) {
            d();
        }
        return this.f1968b[i10];
    }

    public void j(long j10, E e10) {
        int b10 = c.b(this.f1968b, this.f1970d, j10);
        if (b10 >= 0) {
            this.f1969c[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f1970d;
        if (i10 < i11) {
            Object[] objArr = this.f1969c;
            if (objArr[i10] == f1966f) {
                this.f1968b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f1967a && i11 >= this.f1968b.length) {
            d();
            i10 = ~c.b(this.f1968b, this.f1970d, j10);
        }
        int i12 = this.f1970d;
        if (i12 >= this.f1968b.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f1968b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1969c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1968b = jArr;
            this.f1969c = objArr2;
        }
        int i13 = this.f1970d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f1968b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f1969c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f1970d - i10);
        }
        this.f1968b[i10] = j10;
        this.f1969c[i10] = e10;
        this.f1970d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f1969c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f1968b
            int r1 = r2.f1970d
            int r3 = androidx.collection.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f1969c
            r0 = r4[r3]
            java.lang.Object r1 = f1966f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f1967a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.d.k(long):void");
    }

    public void l(int i10) {
        Object[] objArr = this.f1969c;
        Object obj = objArr[i10];
        Object obj2 = f1966f;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1967a = true;
        }
    }

    public int m() {
        if (this.f1967a) {
            d();
        }
        return this.f1970d;
    }

    public E o(int i10) {
        if (this.f1967a) {
            d();
        }
        return this.f1969c[i10];
    }

    public String toString() {
        if (m() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1970d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1970d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            Object o10 = o(i10);
            if (o10 != this) {
                sb2.append(o10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public d(int i10) {
        this.f1967a = false;
        if (i10 == 0) {
            this.f1968b = c.f1964b;
            this.f1969c = c.f1965c;
            return;
        }
        int f10 = c.f(i10);
        this.f1968b = new long[f10];
        this.f1969c = new Object[f10];
    }
}
