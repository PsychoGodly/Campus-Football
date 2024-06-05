package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public abstract class pb {

    private static class a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final int[] f10619a;

        /* renamed from: b  reason: collision with root package name */
        final int f10620b;

        /* renamed from: c  reason: collision with root package name */
        final int f10621c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            return Arrays.copyOfRange(this.f10619a, this.f10620b, this.f10621c);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && pb.c(this.f10619a, ((Integer) obj).intValue(), this.f10620b, this.f10621c) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f10619a[this.f10620b + i10] != aVar.f10619a[aVar.f10620b + i10]) {
                    return false;
                }
            }
            return true;
        }

        public Integer get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Integer.valueOf(this.f10619a[this.f10620b + i10]);
        }

        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f10620b; i11 < this.f10621c; i11++) {
                i10 = (i10 * 31) + pb.a(this.f10619a[i11]);
            }
            return i10;
        }

        public int indexOf(Object obj) {
            int a10;
            if (!(obj instanceof Integer) || (a10 = pb.c(this.f10619a, ((Integer) obj).intValue(), this.f10620b, this.f10621c)) < 0) {
                return -1;
            }
            return a10 - this.f10620b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b10;
            if (!(obj instanceof Integer) || (b10 = pb.d(this.f10619a, ((Integer) obj).intValue(), this.f10620b, this.f10621c)) < 0) {
                return -1;
            }
            return b10 - this.f10620b;
        }

        public Integer set(int i10, Integer num) {
            Preconditions.checkElementIndex(i10, size());
            int[] iArr = this.f10619a;
            int i11 = this.f10620b + i10;
            int i12 = iArr[i11];
            iArr[i11] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i12);
        }

        public int size() {
            return this.f10621c - this.f10620b;
        }

        public List subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f10619a;
            int i12 = this.f10620b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f10619a[this.f10620b]);
            int i10 = this.f10620b;
            while (true) {
                i10++;
                if (i10 < this.f10621c) {
                    sb2.append(", ");
                    sb2.append(this.f10619a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f10619a = iArr;
            this.f10620b = i10;
            this.f10621c = i11;
        }
    }

    public static int a(int i10) {
        return i10;
    }

    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static int c(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static int d(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int a(long j10) {
        int i10 = (int) j10;
        Preconditions.checkArgument(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) Preconditions.checkNotNull(array[i10])).intValue();
        }
        return iArr;
    }
}
