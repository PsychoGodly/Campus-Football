package oe;

import ke.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: Duration.kt */
public final class b implements Comparable<b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36768b = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f36769c = g(0);

    /* renamed from: d  reason: collision with root package name */
    private static final long f36770d = d.i(4611686018427387903L);

    /* renamed from: f  reason: collision with root package name */
    private static final long f36771f = d.i(-4611686018427387903L);

    /* renamed from: a  reason: collision with root package name */
    private final long f36772a;

    /* compiled from: Duration.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final long a() {
            return b.f36769c;
        }
    }

    public static final double A(long j10, e eVar) {
        m.e(eVar, "unit");
        if (j10 == f36770d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f36771f) {
            return Double.NEGATIVE_INFINITY;
        }
        return f.a((double) s(j10), r(j10), eVar);
    }

    public static final long B(long j10, e eVar) {
        m.e(eVar, "unit");
        if (j10 == f36770d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f36771f) {
            return Long.MIN_VALUE;
        }
        return f.b(s(j10), r(j10), eVar);
    }

    public static String C(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f36770d) {
            return "Infinity";
        }
        if (j10 == f36771f) {
            return "-Infinity";
        }
        boolean y10 = y(j10);
        StringBuilder sb2 = new StringBuilder();
        if (y10) {
            sb2.append('-');
        }
        long i10 = i(j10);
        long k10 = k(i10);
        int j11 = j(i10);
        int o10 = o(i10);
        int q10 = q(i10);
        int p10 = p(i10);
        int i11 = 0;
        boolean z10 = k10 != 0;
        boolean z11 = j11 != 0;
        boolean z12 = o10 != 0;
        boolean z13 = (q10 == 0 && p10 == 0) ? false : true;
        if (z10) {
            sb2.append(k10);
            sb2.append('d');
            i11 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(j11);
            sb2.append('h');
            i11 = i12;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(o10);
            sb2.append('m');
            i11 = i13;
        }
        if (z13) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (q10 != 0 || z10 || z11 || z12) {
                d(j10, sb2, q10, p10, 9, "s", false);
            } else if (p10 >= 1000000) {
                d(j10, sb2, p10 / 1000000, p10 % 1000000, 6, "ms", false);
            } else if (p10 >= 1000) {
                d(j10, sb2, p10 / 1000, p10 % 1000, 3, "us", false);
            } else {
                sb2.append(p10);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (y10 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        m.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long D(long j10) {
        return d.h(-s(j10), ((int) j10) & 1);
    }

    private static final long c(long j10, long j11, long j12) {
        long g10 = d.n(j12);
        long j13 = j11 + g10;
        if (!new f(-4611686018426L, 4611686018426L).g(j13)) {
            return d.i(i.f(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return d.k(d.m(j13) + (j12 - d.m(g10)));
    }

    private static final void d(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String S = p.S(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = S.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (S.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append(S, 0, ((i15 + 2) / 3) * 3);
                m.d(sb2, "this.append(value, startIndex, endIndex)");
            } else {
                sb2.append(S, 0, i15);
                m.d(sb2, "this.append(value, startIndex, endIndex)");
            }
        }
        sb2.append(str);
    }

    public static int f(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return m.g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return y(j10) ? -i10 : i10;
    }

    public static long g(long j10) {
        if (c.a()) {
            if (w(j10)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).g(s(j10))) {
                    throw new AssertionError(s(j10) + " ns is out of nanoseconds range");
                }
            } else if (!new f(-4611686018427387903L, 4611686018427387903L).g(s(j10))) {
                throw new AssertionError(s(j10) + " ms is out of milliseconds range");
            } else if (new f(-4611686018426L, 4611686018426L).g(s(j10))) {
                throw new AssertionError(s(j10) + " ms is denormalized");
            }
        }
        return j10;
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).E();
    }

    public static final long i(long j10) {
        return y(j10) ? D(j10) : j10;
    }

    public static final int j(long j10) {
        if (x(j10)) {
            return 0;
        }
        return (int) (l(j10) % ((long) 24));
    }

    public static final long k(long j10) {
        return B(j10, e.DAYS);
    }

    public static final long l(long j10) {
        return B(j10, e.HOURS);
    }

    public static final long m(long j10) {
        return B(j10, e.MINUTES);
    }

    public static final long n(long j10) {
        return B(j10, e.SECONDS);
    }

    public static final int o(long j10) {
        if (x(j10)) {
            return 0;
        }
        return (int) (m(j10) % ((long) 60));
    }

    public static final int p(long j10) {
        long j11;
        if (x(j10)) {
            return 0;
        }
        if (v(j10)) {
            j11 = d.m(s(j10) % ((long) 1000));
        } else {
            j11 = s(j10) % ((long) 1000000000);
        }
        return (int) j11;
    }

    public static final int q(long j10) {
        if (x(j10)) {
            return 0;
        }
        return (int) (n(j10) % ((long) 60));
    }

    private static final e r(long j10) {
        return w(j10) ? e.NANOSECONDS : e.MILLISECONDS;
    }

    private static final long s(long j10) {
        return j10 >> 1;
    }

    public static int t(long j10) {
        return nf.b.a(j10);
    }

    public static final boolean u(long j10) {
        return !x(j10);
    }

    private static final boolean v(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean w(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean x(long j10) {
        return j10 == f36770d || j10 == f36771f;
    }

    public static final boolean y(long j10) {
        return j10 < 0;
    }

    public static final long z(long j10, long j11) {
        if (x(j10)) {
            if (u(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (x(j11)) {
            return j11;
        } else {
            if ((((int) j10) & 1) == (((int) j11) & 1)) {
                long s10 = s(j10) + s(j11);
                if (w(j10)) {
                    return d.l(s10);
                }
                return d.j(s10);
            } else if (v(j10)) {
                return c(j10, s(j10), s(j11));
            } else {
                return c(j10, s(j11), s(j10));
            }
        }
    }

    public final /* synthetic */ long E() {
        return this.f36772a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return e(((b) obj).E());
    }

    public int e(long j10) {
        return f(this.f36772a, j10);
    }

    public boolean equals(Object obj) {
        return h(this.f36772a, obj);
    }

    public int hashCode() {
        return t(this.f36772a);
    }

    public String toString() {
        return C(this.f36772a);
    }
}
