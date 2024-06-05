package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList */
final class n extends c<Double> implements d0.b, RandomAccess, g1 {

    /* renamed from: d  reason: collision with root package name */
    private static final n f27156d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f27157b;

    /* renamed from: c  reason: collision with root package name */
    private int f27158c;

    static {
        n nVar = new n(new double[0], 0);
        f27156d = nVar;
        nVar.i();
    }

    n() {
        this(new double[10], 0);
    }

    private void g(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f27158c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        double[] dArr = this.f27157b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f27157b, i10, dArr2, i10 + 1, this.f27158c - i10);
            this.f27157b = dArr2;
        }
        this.f27157b[i10] = d10;
        this.f27158c++;
        this.modCount++;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f27158c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f27158c;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        b();
        d0.a(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i10 = nVar.f27158c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27158c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f27157b;
            if (i12 > dArr.length) {
                this.f27157b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(nVar.f27157b, 0, this.f27157b, this.f27158c, nVar.f27158c);
            this.f27158c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i10, Double d10) {
        g(i10, d10.doubleValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public boolean add(Double d10) {
        f(d10.doubleValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f27158c != nVar.f27158c) {
            return false;
        }
        double[] dArr = nVar.f27157b;
        for (int i10 = 0; i10 < this.f27158c; i10++) {
            if (Double.doubleToLongBits(this.f27157b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(double d10) {
        b();
        int i10 = this.f27158c;
        double[] dArr = this.f27157b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f27157b = dArr2;
        }
        double[] dArr3 = this.f27157b;
        int i11 = this.f27158c;
        this.f27158c = i11 + 1;
        dArr3[i11] = d10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27158c; i11++) {
            i10 = (i10 * 31) + d0.f(Double.doubleToLongBits(this.f27157b[i11]));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f27157b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public Double get(int i10) {
        return Double.valueOf(n(i10));
    }

    public double n(int i10) {
        h(i10);
        return this.f27157b[i10];
    }

    /* renamed from: p */
    public d0.b d(int i10) {
        if (i10 >= this.f27158c) {
            return new n(Arrays.copyOf(this.f27157b, i10), this.f27158c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public Double remove(int i10) {
        b();
        h(i10);
        double[] dArr = this.f27157b;
        double d10 = dArr[i10];
        int i11 = this.f27158c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f27158c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f27157b;
            System.arraycopy(dArr, i11, dArr, i10, this.f27158c - i11);
            this.f27158c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f27158c;
    }

    /* renamed from: u */
    public Double set(int i10, Double d10) {
        return Double.valueOf(v(i10, d10.doubleValue()));
    }

    public double v(int i10, double d10) {
        b();
        h(i10);
        double[] dArr = this.f27157b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    private n(double[] dArr, int i10) {
        this.f27157b = dArr;
        this.f27158c = i10;
    }
}
