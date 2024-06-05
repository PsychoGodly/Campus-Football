package ke;

import ie.c;
import ie.d;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: _Ranges.kt */
class i extends h {
    public static int a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long b(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
        } else if (i10 < i11) {
            return i11;
        } else {
            return i10 > i12 ? i12 : i10;
        }
    }

    public static long f(long j10, long j11, long j12) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
        } else if (j10 < j11) {
            return j11;
        } else {
            return j10 > j12 ? j12 : j10;
        }
    }

    public static a g(int i10, int i11) {
        return a.f36005d.a(i10, i11, -1);
    }

    public static int h(c cVar, c cVar2) {
        m.e(cVar, "<this>");
        m.e(cVar2, "random");
        try {
            return d.e(cVar2, cVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static c i(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return c.f36013f.a();
        }
        return new c(i10, i11 - 1);
    }
}
