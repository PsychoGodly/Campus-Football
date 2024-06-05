package ie;

import ke.c;
import kotlin.jvm.internal.m;

/* compiled from: Random.kt */
public final class d {
    public static final String a(Object obj, Object obj2) {
        m.e(obj, "from");
        m.e(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void c(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int e(c cVar, c cVar2) {
        m.e(cVar, "<this>");
        m.e(cVar2, "range");
        if (cVar2.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + cVar2);
        } else if (cVar2.e() < Integer.MAX_VALUE) {
            return cVar.d(cVar2.b(), cVar2.e() + 1);
        } else {
            if (cVar2.b() > Integer.MIN_VALUE) {
                return cVar.d(cVar2.b() - 1, cVar2.e()) + 1;
            }
            return cVar.c();
        }
    }

    public static final int f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
