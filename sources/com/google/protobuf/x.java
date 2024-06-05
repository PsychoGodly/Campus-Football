package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList */
final class x extends c<Float> implements d0.f, RandomAccess, g1 {

    /* renamed from: d  reason: collision with root package name */
    private static final x f27269d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f27270b;

    /* renamed from: c  reason: collision with root package name */
    private int f27271c;

    static {
        x xVar = new x(new float[0], 0);
        f27269d = xVar;
        xVar.i();
    }

    x() {
        this(new float[10], 0);
    }

    private void g(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f27271c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        float[] fArr = this.f27270b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f27270b, i10, fArr2, i10 + 1, this.f27271c - i10);
            this.f27270b = fArr2;
        }
        this.f27270b[i10] = f10;
        this.f27271c++;
        this.modCount++;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f27271c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f27271c;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        b();
        d0.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f27271c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27271c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f27270b;
            if (i12 > fArr.length) {
                this.f27270b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(xVar.f27270b, 0, this.f27270b, this.f27271c, xVar.f27271c);
            this.f27271c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i10, Float f10) {
        g(i10, f10.floatValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public boolean add(Float f10) {
        f(f10.floatValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f27271c != xVar.f27271c) {
            return false;
        }
        float[] fArr = xVar.f27270b;
        for (int i10 = 0; i10 < this.f27271c; i10++) {
            if (Float.floatToIntBits(this.f27270b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(float f10) {
        b();
        int i10 = this.f27271c;
        float[] fArr = this.f27270b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f27270b = fArr2;
        }
        float[] fArr3 = this.f27270b;
        int i11 = this.f27271c;
        this.f27271c = i11 + 1;
        fArr3[i11] = f10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27271c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f27270b[i11]);
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f27270b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public Float get(int i10) {
        return Float.valueOf(n(i10));
    }

    public float n(int i10) {
        h(i10);
        return this.f27270b[i10];
    }

    /* renamed from: p */
    public d0.f d(int i10) {
        if (i10 >= this.f27271c) {
            return new x(Arrays.copyOf(this.f27270b, i10), this.f27271c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public Float remove(int i10) {
        b();
        h(i10);
        float[] fArr = this.f27270b;
        float f10 = fArr[i10];
        int i11 = this.f27271c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f27271c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f27270b;
            System.arraycopy(fArr, i11, fArr, i10, this.f27271c - i11);
            this.f27271c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f27271c;
    }

    /* renamed from: u */
    public Float set(int i10, Float f10) {
        return Float.valueOf(v(i10, f10.floatValue()));
    }

    public float v(int i10, float f10) {
        b();
        h(i10);
        float[] fArr = this.f27270b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    private x(float[] fArr, int i10) {
        this.f27270b = fArr;
        this.f27271c = i10;
    }
}
