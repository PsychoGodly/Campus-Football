package ie;

import java.io.Serializable;
import kotlin.jvm.internal.h;
import zd.b;

/* compiled from: Random.kt */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33334a = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final c f33335b = b.f39547a.b();

    /* compiled from: Random.kt */
    public static final class a extends c implements Serializable {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public int b(int i10) {
            return c.f33335b.b(i10);
        }

        public int c() {
            return c.f33335b.c();
        }

        public int d(int i10, int i11) {
            return c.f33335b.d(i10, i11);
        }

        public long e() {
            return c.f33335b.e();
        }

        public long f(long j10, long j11) {
            return c.f33335b.f(j10, j11);
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public int d(int i10, int i11) {
        int i12;
        int c10;
        int i13;
        int c11;
        boolean z10;
        d.b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i12 = b(d.d(i14));
            } else {
                do {
                    c10 = c() >>> 1;
                    i13 = c10 % i14;
                } while ((c10 - i13) + (i14 - 1) < 0);
                i12 = i13;
            }
            return i10 + i12;
        }
        do {
            c11 = c();
            z10 = false;
            if (i10 <= c11 && c11 < i11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return c11;
    }

    public abstract long e();

    public long f(long j10, long j11) {
        long e10;
        boolean z10;
        long j12;
        long e11;
        long j13;
        int c10;
        d.c(j10, j11);
        long j14 = j11 - j10;
        if (j14 > 0) {
            if (((-j14) & j14) == j14) {
                int i10 = (int) j14;
                int i11 = (int) (j14 >>> 32);
                if (i10 != 0) {
                    c10 = b(d.d(i10));
                } else if (i11 == 1) {
                    c10 = c();
                } else {
                    j12 = (((long) b(d.d(i11))) << 32) + (((long) c()) & 4294967295L);
                }
                j12 = ((long) c10) & 4294967295L;
            } else {
                do {
                    e11 = e() >>> 1;
                    j13 = e11 % j14;
                } while ((e11 - j13) + (j14 - 1) < 0);
                j12 = j13;
            }
            return j10 + j12;
        }
        do {
            e10 = e();
            z10 = false;
            if (j10 <= e10 && e10 < j11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return e10;
    }
}
