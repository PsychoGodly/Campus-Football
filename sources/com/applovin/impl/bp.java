package com.applovin.impl;

import com.applovin.impl.h2;

final class bp extends h2 {

    private static final class a implements h2.f {

        /* renamed from: a  reason: collision with root package name */
        private final io f6749a;

        /* renamed from: b  reason: collision with root package name */
        private final yg f6750b = new yg();

        /* renamed from: c  reason: collision with root package name */
        private final int f6751c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6752d;

        public a(int i10, io ioVar, int i11) {
            this.f6751c = i10;
            this.f6749a = ioVar;
            this.f6752d = i11;
        }

        public void a() {
            this.f6750b.a(yp.f13667f);
        }

        private h2.e a(yg ygVar, long j10, long j11) {
            int a10;
            int i10;
            yg ygVar2 = ygVar;
            long j12 = j11;
            int e10 = ygVar.e();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (ygVar.a() >= 188 && (i10 = a10 + 188) <= e10) {
                long a11 = fp.a(ygVar2, (a10 = fp.a(ygVar.c(), ygVar.d(), e10)), this.f6751c);
                if (a11 != -9223372036854775807L) {
                    long b10 = this.f6749a.b(a11);
                    if (b10 > j10) {
                        if (j15 == -9223372036854775807L) {
                            return h2.e.a(b10, j12);
                        }
                        return h2.e.a(j12 + j14);
                    } else if (100000 + b10 > j10) {
                        return h2.e.a(j12 + ((long) a10));
                    } else {
                        j14 = (long) a10;
                        j15 = b10;
                    }
                }
                ygVar2.f(i10);
                j13 = (long) i10;
            }
            if (j15 != -9223372036854775807L) {
                return h2.e.b(j15, j12 + j13);
            }
            return h2.e.f8203d;
        }

        public h2.e a(j8 j8Var, long j10) {
            long f10 = j8Var.f();
            int min = (int) Math.min((long) this.f6752d, j8Var.a() - f10);
            this.f6750b.d(min);
            j8Var.c(this.f6750b.c(), 0, min);
            return a(this.f6750b, j10, f10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bp(com.applovin.impl.io r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            com.applovin.impl.h2$b r1 = new com.applovin.impl.h2$b
            r1.<init>()
            com.applovin.impl.bp$a r2 = new com.applovin.impl.bp$a
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.bp.<init>(com.applovin.impl.io, long, long, int, int):void");
    }
}
