package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList */
final class c0 extends c<Integer> implements d0.g, RandomAccess, g1 {

    /* renamed from: d  reason: collision with root package name */
    private static final c0 f26974d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f26975b;

    /* renamed from: c  reason: collision with root package name */
    private int f26976c;

    static {
        c0 c0Var = new c0(new int[0], 0);
        f26974d = c0Var;
        c0Var.i();
    }

    c0() {
        this(new int[10], 0);
    }

    private void f(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f26976c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        int[] iArr = this.f26975b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f26975b, i10, iArr2, i10 + 1, this.f26976c - i10);
            this.f26975b = iArr2;
        }
        this.f26975b[i10] = i11;
        this.f26976c++;
        this.modCount++;
    }

    public static c0 g() {
        return f26974d;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f26976c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f26976c;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        d0.a(collection);
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i10 = c0Var.f26976c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26976c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f26975b;
            if (i12 > iArr.length) {
                this.f26975b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c0Var.f26975b, 0, this.f26975b, this.f26976c, c0Var.f26976c);
            this.f26976c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i10, Integer num) {
        f(i10, num.intValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public boolean add(Integer num) {
        k(num.intValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f26976c != c0Var.f26976c) {
            return false;
        }
        int[] iArr = c0Var.f26975b;
        for (int i10 = 0; i10 < this.f26976c; i10++) {
            if (this.f26975b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26976c; i11++) {
            i10 = (i10 * 31) + this.f26975b[i11];
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f26975b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public void k(int i10) {
        b();
        int i11 = this.f26976c;
        int[] iArr = this.f26975b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f26975b = iArr2;
        }
        int[] iArr3 = this.f26975b;
        int i12 = this.f26976c;
        this.f26976c = i12 + 1;
        iArr3[i12] = i10;
    }

    /* renamed from: m */
    public Integer get(int i10) {
        return Integer.valueOf(n(i10));
    }

    public int n(int i10) {
        h(i10);
        return this.f26975b[i10];
    }

    /* renamed from: p */
    public Integer remove(int i10) {
        b();
        h(i10);
        int[] iArr = this.f26975b;
        int i11 = iArr[i10];
        int i12 = this.f26976c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f26976c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* renamed from: q */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(u(i10, num.intValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f26975b;
            System.arraycopy(iArr, i11, iArr, i10, this.f26976c - i11);
            this.f26976c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f26976c;
    }

    public int u(int i10, int i11) {
        b();
        h(i10);
        int[] iArr = this.f26975b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private c0(int[] iArr, int i10) {
        this.f26975b = iArr;
        this.f26976c = i10;
    }

    public d0.g d(int i10) {
        if (i10 >= this.f26976c) {
            return new c0(Arrays.copyOf(this.f26975b, i10), this.f26976c);
        }
        throw new IllegalArgumentException();
    }
}
