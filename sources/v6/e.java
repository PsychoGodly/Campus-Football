package v6;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import r6.o;

/* compiled from: Ints */
public final class e extends f {

    /* compiled from: Ints */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final int[] f30690a;

        /* renamed from: b  reason: collision with root package name */
        final int f30691b;

        /* renamed from: c  reason: collision with root package name */
        final int f30692c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: b */
        public Integer get(int i10) {
            o.m(i10, size());
            return Integer.valueOf(this.f30690a[this.f30691b + i10]);
        }

        /* renamed from: c */
        public Integer set(int i10, Integer num) {
            o.m(i10, size());
            int[] iArr = this.f30690a;
            int i11 = this.f30691b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) o.o(num)).intValue();
            return Integer.valueOf(i12);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && e.i(this.f30690a, ((Integer) obj).intValue(), this.f30691b, this.f30692c) != -1;
        }

        /* access modifiers changed from: package-private */
        public int[] e() {
            return Arrays.copyOfRange(this.f30690a, this.f30691b, this.f30692c);
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
                if (this.f30690a[this.f30691b + i10] != aVar.f30690a[aVar.f30691b + i10]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f30691b; i11 < this.f30692c; i11++) {
                i10 = (i10 * 31) + e.g(this.f30690a[i11]);
            }
            return i10;
        }

        public int indexOf(Object obj) {
            int a10;
            if (!(obj instanceof Integer) || (a10 = e.i(this.f30690a, ((Integer) obj).intValue(), this.f30691b, this.f30692c)) < 0) {
                return -1;
            }
            return a10 - this.f30691b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b10;
            if (!(obj instanceof Integer) || (b10 = e.j(this.f30690a, ((Integer) obj).intValue(), this.f30691b, this.f30692c)) < 0) {
                return -1;
            }
            return b10 - this.f30691b;
        }

        public int size() {
            return this.f30692c - this.f30691b;
        }

        public List<Integer> subList(int i10, int i11) {
            o.t(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f30690a;
            int i12 = this.f30691b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f30690a[this.f30691b]);
            int i10 = this.f30691b;
            while (true) {
                i10++;
                if (i10 < this.f30692c) {
                    sb2.append(", ");
                    sb2.append(this.f30690a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f30690a = iArr;
            this.f30691b = i10;
            this.f30692c = i11;
        }
    }

    public static List<Integer> c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        o.j(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10, int i11, int i12) {
        o.i(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int g(int i10) {
        return i10;
    }

    public static int h(int[] iArr, int i10) {
        return i(iArr, i10, 0, iArr.length);
    }

    /* access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static int j(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int k(long j10) {
        return j10 > 2147483647L ? a.e.API_PRIORITY_OTHER : j10 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j10;
    }

    public static int[] l(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) o.o(array[i10])).intValue();
        }
        return iArr;
    }
}
