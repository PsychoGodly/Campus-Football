package c3;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import k4.a0;
import k4.j0;
import k4.n0;
import s2.a;
import s2.m;

/* compiled from: PsBinarySearchSeeker */
final class x extends s2.a {

    /* compiled from: PsBinarySearchSeeker */
    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final j0 f5968a;

        /* renamed from: b  reason: collision with root package name */
        private final a0 f5969b;

        private a.e c(a0 a0Var, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (a0Var.a() >= 4) {
                if (x.k(a0Var.e(), a0Var.f()) != 442) {
                    a0Var.U(1);
                } else {
                    a0Var.U(4);
                    long l10 = y.l(a0Var);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f5968a.b(l10);
                        if (b10 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return a.e.d(b10, j11);
                            }
                            return a.e.e(j11 + ((long) i11));
                        } else if (100000 + b10 > j10) {
                            return a.e.e(j11 + ((long) a0Var.f()));
                        } else {
                            i11 = a0Var.f();
                            j12 = b10;
                        }
                    }
                    d(a0Var);
                    i10 = a0Var.f();
                }
            }
            if (j12 != -9223372036854775807L) {
                return a.e.f(j12, j11 + ((long) i10));
            }
            return a.e.f22374d;
        }

        private static void d(a0 a0Var) {
            int g10 = a0Var.g();
            if (a0Var.a() < 10) {
                a0Var.T(g10);
                return;
            }
            a0Var.U(9);
            int G = a0Var.G() & 7;
            if (a0Var.a() < G) {
                a0Var.T(g10);
                return;
            }
            a0Var.U(G);
            if (a0Var.a() < 4) {
                a0Var.T(g10);
                return;
            }
            if (x.k(a0Var.e(), a0Var.f()) == 443) {
                a0Var.U(4);
                int M = a0Var.M();
                if (a0Var.a() < M) {
                    a0Var.T(g10);
                    return;
                }
                a0Var.U(M);
            }
            while (a0Var.a() >= 4 && (r1 = x.k(a0Var.e(), a0Var.f())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                a0Var.U(4);
                if (a0Var.a() < 2) {
                    a0Var.T(g10);
                    return;
                } else {
                    a0Var.T(Math.min(a0Var.g(), a0Var.f() + a0Var.M()));
                }
            }
        }

        public void a() {
            this.f5969b.Q(n0.f19743f);
        }

        public a.e b(m mVar, long j10) throws IOException {
            long c10 = mVar.c();
            int min = (int) Math.min(20000, mVar.b() - c10);
            this.f5969b.P(min);
            mVar.p(this.f5969b.e(), 0, min);
            return c(this.f5969b, j10, c10);
        }

        private b(j0 j0Var) {
            this.f5968a = j0Var;
            this.f5969b = new a0();
        }
    }

    public x(j0 j0Var, long j10, long j11) {
        super(new a.b(), new b(j0Var), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10 + 2] & 255) << 8);
    }
}
