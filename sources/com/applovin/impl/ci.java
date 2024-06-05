package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.h2;

final class ci extends h2 {

    private static final class b implements h2.f {

        /* renamed from: a  reason: collision with root package name */
        private final io f6983a;

        /* renamed from: b  reason: collision with root package name */
        private final yg f6984b;

        private b(io ioVar) {
            this.f6983a = ioVar;
            this.f6984b = new yg();
        }

        public void a() {
            this.f6984b.a(yp.f13667f);
        }

        private h2.e a(yg ygVar, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (ygVar.a() >= 4) {
                if (ci.b(ygVar.c(), ygVar.d()) != 442) {
                    ygVar.g(1);
                } else {
                    ygVar.g(4);
                    long c10 = di.c(ygVar);
                    if (c10 != -9223372036854775807L) {
                        long b10 = this.f6983a.b(c10);
                        if (b10 > j10) {
                            if (j12 == -9223372036854775807L) {
                                return h2.e.a(b10, j11);
                            }
                            return h2.e.a(j11 + ((long) i11));
                        } else if (100000 + b10 > j10) {
                            return h2.e.a(j11 + ((long) ygVar.d()));
                        } else {
                            i11 = ygVar.d();
                            j12 = b10;
                        }
                    }
                    a(ygVar);
                    i10 = ygVar.d();
                }
            }
            if (j12 != -9223372036854775807L) {
                return h2.e.b(j12, j11 + ((long) i10));
            }
            return h2.e.f8203d;
        }

        public h2.e a(j8 j8Var, long j10) {
            long f10 = j8Var.f();
            int min = (int) Math.min(20000, j8Var.a() - f10);
            this.f6984b.d(min);
            j8Var.c(this.f6984b.c(), 0, min);
            return a(this.f6984b, j10, f10);
        }

        private static void a(yg ygVar) {
            int e10 = ygVar.e();
            if (ygVar.a() < 10) {
                ygVar.f(e10);
                return;
            }
            ygVar.g(9);
            int w10 = ygVar.w() & 7;
            if (ygVar.a() < w10) {
                ygVar.f(e10);
                return;
            }
            ygVar.g(w10);
            if (ygVar.a() < 4) {
                ygVar.f(e10);
                return;
            }
            if (ci.b(ygVar.c(), ygVar.d()) == 443) {
                ygVar.g(4);
                int C = ygVar.C();
                if (ygVar.a() < C) {
                    ygVar.f(e10);
                    return;
                }
                ygVar.g(C);
            }
            while (ygVar.a() >= 4 && (r1 = ci.b(ygVar.c(), ygVar.d())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                ygVar.g(4);
                if (ygVar.a() < 2) {
                    ygVar.f(e10);
                    return;
                } else {
                    ygVar.f(Math.min(ygVar.e(), ygVar.d() + ygVar.C()));
                }
            }
        }
    }

    public ci(io ioVar, long j10, long j11) {
        super(new h2.b(), new b(ioVar), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10 + 2] & 255) << 8);
    }
}
