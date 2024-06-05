package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList */
final class g extends c<Boolean> implements d0.a, RandomAccess, g1 {

    /* renamed from: d  reason: collision with root package name */
    private static final g f27016d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f27017b;

    /* renamed from: c  reason: collision with root package name */
    private int f27018c;

    static {
        g gVar = new g(new boolean[0], 0);
        f27016d = gVar;
        gVar.i();
    }

    g() {
        this(new boolean[10], 0);
    }

    private void f(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f27018c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        boolean[] zArr = this.f27017b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f27017b, i10, zArr2, i10 + 1, this.f27018c - i10);
            this.f27017b = zArr2;
        }
        this.f27017b[i10] = z10;
        this.f27018c++;
        this.modCount++;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f27018c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f27018c;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        d0.a(collection);
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i10 = gVar.f27018c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27018c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f27017b;
            if (i12 > zArr.length) {
                this.f27017b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(gVar.f27017b, 0, this.f27017b, this.f27018c, gVar.f27018c);
            this.f27018c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i10, Boolean bool) {
        f(i10, bool.booleanValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public boolean add(Boolean bool) {
        g(bool.booleanValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f27018c != gVar.f27018c) {
            return false;
        }
        boolean[] zArr = gVar.f27017b;
        for (int i10 = 0; i10 < this.f27018c; i10++) {
            if (this.f27017b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void g(boolean z10) {
        b();
        int i10 = this.f27018c;
        boolean[] zArr = this.f27017b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f27017b = zArr2;
        }
        boolean[] zArr3 = this.f27017b;
        int i11 = this.f27018c;
        this.f27018c = i11 + 1;
        zArr3[i11] = z10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27018c; i11++) {
            i10 = (i10 * 31) + d0.c(this.f27017b[i11]);
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f27017b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public Boolean get(int i10) {
        return Boolean.valueOf(n(i10));
    }

    public boolean n(int i10) {
        h(i10);
        return this.f27017b[i10];
    }

    /* renamed from: p */
    public d0.a d(int i10) {
        if (i10 >= this.f27018c) {
            return new g(Arrays.copyOf(this.f27017b, i10), this.f27018c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public Boolean remove(int i10) {
        b();
        h(i10);
        boolean[] zArr = this.f27017b;
        boolean z10 = zArr[i10];
        int i11 = this.f27018c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f27018c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f27017b;
            System.arraycopy(zArr, i11, zArr, i10, this.f27018c - i11);
            this.f27018c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f27018c;
    }

    /* renamed from: u */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(v(i10, bool.booleanValue()));
    }

    public boolean v(int i10, boolean z10) {
        b();
        h(i10);
        boolean[] zArr = this.f27017b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    private g(boolean[] zArr, int i10) {
        this.f27017b = zArr;
        this.f27018c = i10;
    }
}
