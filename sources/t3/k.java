package t3;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import k4.n0;
import n2.r1;

/* compiled from: SegmentBase */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f22649a;

    /* renamed from: b  reason: collision with root package name */
    final long f22650b;

    /* renamed from: c  reason: collision with root package name */
    final long f22651c;

    /* compiled from: SegmentBase */
    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f22652d;

        /* renamed from: e  reason: collision with root package name */
        final long f22653e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f22654f;

        /* renamed from: g  reason: collision with root package name */
        private final long f22655g;

        /* renamed from: h  reason: collision with root package name */
        private final long f22656h;

        /* renamed from: i  reason: collision with root package name */
        final long f22657i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f22652d = j12;
            this.f22653e = j13;
            this.f22654f = list;
            this.f22657i = j14;
            this.f22655g = j15;
            this.f22656h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            if (g10 != -1) {
                return g10;
            }
            return (long) ((int) (i((j11 - this.f22656h) + this.f22657i, j10) - d(j10, j11)));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f22655g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f22656h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f22652d;
        }

        public long f(long j10, long j11) {
            if (this.f22654f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f22657i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f22654f;
            if (list != null) {
                return (list.get((int) (j10 - this.f22652d)).f22663b * 1000000) / this.f22650b;
            }
            long g10 = g(j11);
            if (g10 == -1 || j10 != (e() + g10) - 1) {
                return (this.f22653e * 1000000) / this.f22650b;
            }
            return j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f22654f == null) {
                long j12 = this.f22652d + (j10 / ((this.f22653e * 1000000) / this.f22650b));
                if (j12 < e10) {
                    return e10;
                }
                if (g10 == -1) {
                    return j12;
                }
                return Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            return j14 == e10 ? j14 : j13;
        }

        public final long j(long j10) {
            long j11;
            List<d> list = this.f22654f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f22652d)).f22662a - this.f22651c;
            } else {
                j11 = (j10 - this.f22652d) * this.f22653e;
            }
            return n0.O0(j11, 1000000, this.f22650b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f22654f != null;
        }
    }

    /* compiled from: SegmentBase */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<i> f22658j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f22658j = list2;
        }

        public long g(long j10) {
            return (long) this.f22658j.size();
        }

        public i k(j jVar, long j10) {
            return this.f22658j.get((int) (j10 - this.f22652d));
        }

        public boolean l() {
            return true;
        }
    }

    /* compiled from: SegmentBase */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f22659j;

        /* renamed from: k  reason: collision with root package name */
        final n f22660k;

        /* renamed from: l  reason: collision with root package name */
        final long f22661l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f22659j = nVar;
            this.f22660k = nVar2;
            this.f22661l = j13;
        }

        public i a(j jVar) {
            n nVar = this.f22659j;
            if (nVar == null) {
                return k.super.a(jVar);
            }
            r1 r1Var = jVar.f22636b;
            return new i(nVar.a(r1Var.f20643a, 0, r1Var.f20650i, 0), 0, -1);
        }

        public long g(long j10) {
            List<d> list = this.f22654f;
            if (list != null) {
                return (long) list.size();
            }
            long j11 = this.f22661l;
            if (j11 != -1) {
                return (j11 - this.f22652d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return u6.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f22650b)), BigInteger.valueOf(this.f22653e).multiply(BigInteger.valueOf(1000000)), RoundingMode.CEILING).longValue();
            }
            return -1;
        }

        public i k(j jVar, long j10) {
            long j11;
            List<d> list = this.f22654f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f22652d)).f22662a;
            } else {
                j11 = (j10 - this.f22652d) * this.f22653e;
            }
            long j12 = j11;
            n nVar = this.f22660k;
            r1 r1Var = jVar.f22636b;
            return new i(nVar.a(r1Var.f20643a, j10, r1Var.f20650i, j12), 0, -1);
        }
    }

    /* compiled from: SegmentBase */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f22662a;

        /* renamed from: b  reason: collision with root package name */
        final long f22663b;

        public d(long j10, long j11) {
            this.f22662a = j10;
            this.f22663b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f22662a == dVar.f22662a && this.f22663b == dVar.f22663b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f22662a) * 31) + ((int) this.f22663b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f22649a = iVar;
        this.f22650b = j10;
        this.f22651c = j11;
    }

    public i a(j jVar) {
        return this.f22649a;
    }

    public long b() {
        return n0.O0(this.f22651c, 1000000, this.f22650b);
    }

    /* compiled from: SegmentBase */
    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f22664d;

        /* renamed from: e  reason: collision with root package name */
        final long f22665e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f22664d = j12;
            this.f22665e = j13;
        }

        public i c() {
            long j10 = this.f22665e;
            if (j10 <= 0) {
                return null;
            }
            return new i((String) null, this.f22664d, j10);
        }

        public e() {
            this((i) null, 1, 0, 0, 0);
        }
    }
}
