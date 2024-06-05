package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList */
final class m0 extends c<Long> implements d0.i, RandomAccess, g1 {

    /* renamed from: d  reason: collision with root package name */
    private static final m0 f27141d;

    /* renamed from: b  reason: collision with root package name */
    private long[] f27142b;

    /* renamed from: c  reason: collision with root package name */
    private int f27143c;

    static {
        m0 m0Var = new m0(new long[0], 0);
        f27141d = m0Var;
        m0Var.i();
    }

    m0() {
        this(new long[10], 0);
    }

    private void f(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f27143c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        long[] jArr = this.f27142b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f27142b, i10, jArr2, i10 + 1, this.f27143c - i10);
            this.f27142b = jArr2;
        }
        this.f27142b[i10] = j10;
        this.f27143c++;
        this.modCount++;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f27143c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f27143c;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        b();
        d0.a(collection);
        if (!(collection instanceof m0)) {
            return super.addAll(collection);
        }
        m0 m0Var = (m0) collection;
        int i10 = m0Var.f27143c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27143c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f27142b;
            if (i12 > jArr.length) {
                this.f27142b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(m0Var.f27142b, 0, this.f27142b, this.f27143c, m0Var.f27143c);
            this.f27143c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i10, Long l10) {
        f(i10, l10.longValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public boolean add(Long l10) {
        g(l10.longValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return super.equals(obj);
        }
        m0 m0Var = (m0) obj;
        if (this.f27143c != m0Var.f27143c) {
            return false;
        }
        long[] jArr = m0Var.f27142b;
        for (int i10 = 0; i10 < this.f27143c; i10++) {
            if (this.f27142b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void g(long j10) {
        b();
        int i10 = this.f27143c;
        long[] jArr = this.f27142b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f27142b = jArr2;
        }
        long[] jArr3 = this.f27142b;
        int i11 = this.f27143c;
        this.f27143c = i11 + 1;
        jArr3[i11] = j10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27143c; i11++) {
            i10 = (i10 * 31) + d0.f(this.f27142b[i11]);
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f27142b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public Long get(int i10) {
        return Long.valueOf(n(i10));
    }

    public long n(int i10) {
        h(i10);
        return this.f27142b[i10];
    }

    /* renamed from: p */
    public d0.i d(int i10) {
        if (i10 >= this.f27143c) {
            return new m0(Arrays.copyOf(this.f27142b, i10), this.f27143c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public Long remove(int i10) {
        b();
        h(i10);
        long[] jArr = this.f27142b;
        long j10 = jArr[i10];
        int i11 = this.f27143c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f27143c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f27142b;
            System.arraycopy(jArr, i11, jArr, i10, this.f27143c - i11);
            this.f27143c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f27143c;
    }

    /* renamed from: u */
    public Long set(int i10, Long l10) {
        return Long.valueOf(v(i10, l10.longValue()));
    }

    public long v(int i10, long j10) {
        b();
        h(i10);
        long[] jArr = this.f27142b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    private m0(long[] jArr, int i10) {
        this.f27142b = jArr;
        this.f27143c = i10;
    }
}
