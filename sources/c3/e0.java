package c3;

import java.io.IOException;
import k4.a0;
import k4.j0;
import k4.n0;
import s2.a;
import s2.m;

/* compiled from: TsBinarySearchSeeker */
final class e0 extends s2.a {

    /* compiled from: TsBinarySearchSeeker */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final j0 f5662a;

        /* renamed from: b  reason: collision with root package name */
        private final a0 f5663b = new a0();

        /* renamed from: c  reason: collision with root package name */
        private final int f5664c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5665d;

        public a(int i10, j0 j0Var, int i11) {
            this.f5664c = i10;
            this.f5662a = j0Var;
            this.f5665d = i11;
        }

        private a.e c(a0 a0Var, long j10, long j11) {
            int a10;
            int i10;
            a0 a0Var2 = a0Var;
            long j12 = j11;
            int g10 = a0Var.g();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (i10 = a10 + 188) <= g10) {
                long c10 = j0.c(a0Var2, (a10 = j0.a(a0Var.e(), a0Var.f(), g10)), this.f5664c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f5662a.b(c10);
                    if (b10 > j10) {
                        if (j15 == -9223372036854775807L) {
                            return a.e.d(b10, j12);
                        }
                        return a.e.e(j12 + j14);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j12 + ((long) a10));
                    } else {
                        j14 = (long) a10;
                        j15 = b10;
                    }
                }
                a0Var2.T(i10);
                j13 = (long) i10;
            }
            if (j15 != -9223372036854775807L) {
                return a.e.f(j15, j12 + j13);
            }
            return a.e.f22374d;
        }

        public void a() {
            this.f5663b.Q(n0.f19743f);
        }

        public a.e b(m mVar, long j10) throws IOException {
            long c10 = mVar.c();
            int min = (int) Math.min((long) this.f5665d, mVar.b() - c10);
            this.f5663b.P(min);
            mVar.p(this.f5663b.e(), 0, min);
            return c(this.f5663b, j10, c10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0(k4.j0 r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            s2.a$b r1 = new s2.a$b
            r1.<init>()
            c3.e0$a r2 = new c3.e0$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.e0.<init>(k4.j0, long, long, int, int):void");
    }
}
