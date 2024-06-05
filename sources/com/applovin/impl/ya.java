package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class ya extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f13557a = new Object[0];

    public static abstract class b {
        b() {
        }

        static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    ya() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(Object[] objArr, int i10);

    public ab a() {
        return isEmpty() ? ab.h() : ab.a(toArray());
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean e();

    public abstract qp iterator();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f13557a);
    }

    public final Object[] toArray(Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] b10 = b();
            if (b10 != null) {
                return jh.a(b10, d(), c(), objArr);
            }
            objArr = cg.b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    static abstract class a extends b {

        /* renamed from: a  reason: collision with root package name */
        Object[] f13558a;

        /* renamed from: b  reason: collision with root package name */
        int f13559b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f13560c;

        a(int i10) {
            n3.a(i10, "initialCapacity");
            this.f13558a = new Object[i10];
        }

        public a a(Object obj) {
            Preconditions.checkNotNull(obj);
            a(this.f13559b + 1);
            Object[] objArr = this.f13558a;
            int i10 = this.f13559b;
            this.f13559b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        private void a(int i10) {
            Object[] objArr = this.f13558a;
            if (objArr.length < i10) {
                this.f13558a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f13560c = false;
            } else if (this.f13560c) {
                this.f13558a = (Object[]) objArr.clone();
                this.f13560c = false;
            }
        }
    }
}
