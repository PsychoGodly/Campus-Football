package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* compiled from: SparseArrayCompat */
public class h<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1993f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f1994a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f1995b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1996c;

    /* renamed from: d  reason: collision with root package name */
    private int f1997d;

    public h() {
        this(10);
    }

    private void d() {
        int i10 = this.f1997d;
        int[] iArr = this.f1995b;
        Object[] objArr = this.f1996c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1993f) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1994a = false;
        this.f1997d = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f1997d;
        if (i11 == 0 || i10 > this.f1995b[i11 - 1]) {
            if (this.f1994a && i11 >= this.f1995b.length) {
                d();
            }
            int i12 = this.f1997d;
            if (i12 >= this.f1995b.length) {
                int e11 = c.e(i12 + 1);
                int[] iArr = new int[e11];
                Object[] objArr = new Object[e11];
                int[] iArr2 = this.f1995b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1996c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1995b = iArr;
                this.f1996c = objArr;
            }
            this.f1995b[i12] = i10;
            this.f1996c[i12] = e10;
            this.f1997d = i12 + 1;
            return;
        }
        j(i10, e10);
    }

    public void b() {
        int i10 = this.f1997d;
        Object[] objArr = this.f1996c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1997d = 0;
        this.f1994a = false;
    }

    /* renamed from: c */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1995b = (int[]) this.f1995b.clone();
            hVar.f1996c = (Object[]) this.f1996c.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E e(int i10) {
        return f(i10, (Object) null);
    }

    public E f(int i10, E e10) {
        int a10 = c.a(this.f1995b, this.f1997d, i10);
        if (a10 >= 0) {
            E[] eArr = this.f1996c;
            if (eArr[a10] != f1993f) {
                return eArr[a10];
            }
        }
        return e10;
    }

    public int g(E e10) {
        if (this.f1994a) {
            d();
        }
        for (int i10 = 0; i10 < this.f1997d; i10++) {
            if (this.f1996c[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f1994a) {
            d();
        }
        return this.f1995b[i10];
    }

    public void j(int i10, E e10) {
        int a10 = c.a(this.f1995b, this.f1997d, i10);
        if (a10 >= 0) {
            this.f1996c[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f1997d;
        if (i11 < i12) {
            Object[] objArr = this.f1996c;
            if (objArr[i11] == f1993f) {
                this.f1995b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f1994a && i12 >= this.f1995b.length) {
            d();
            i11 = ~c.a(this.f1995b, this.f1997d, i10);
        }
        int i13 = this.f1997d;
        if (i13 >= this.f1995b.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f1995b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1996c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1995b = iArr;
            this.f1996c = objArr2;
        }
        int i14 = this.f1997d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f1995b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f1996c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f1997d - i11);
        }
        this.f1995b[i11] = i10;
        this.f1996c[i11] = e10;
        this.f1997d++;
    }

    public int k() {
        if (this.f1994a) {
            d();
        }
        return this.f1997d;
    }

    public E l(int i10) {
        if (this.f1994a) {
            d();
        }
        return this.f1996c[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1997d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1997d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            Object l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        this.f1994a = false;
        if (i10 == 0) {
            this.f1995b = c.f1963a;
            this.f1996c = c.f1965c;
            return;
        }
        int e10 = c.e(i10);
        this.f1995b = new int[e10];
        this.f1996c = new Object[e10];
    }
}
