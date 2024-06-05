package com.applovin.impl;

import android.util.Pair;

abstract class or {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10535a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10536b;

        private a(int i10, long j10) {
            this.f10535a = i10;
            this.f10536b = j10;
        }

        public static a a(j8 j8Var, yg ygVar) {
            j8Var.c(ygVar.c(), 0, 8);
            ygVar.f(0);
            return new a(ygVar.j(), ygVar.p());
        }
    }

    public static nr a(j8 j8Var) {
        byte[] bArr;
        a1.a((Object) j8Var);
        yg ygVar = new yg(16);
        if (a.a(j8Var, ygVar).f10535a != 1380533830) {
            return null;
        }
        j8Var.c(ygVar.c(), 0, 4);
        ygVar.f(0);
        int j10 = ygVar.j();
        if (j10 != 1463899717) {
            kc.b("WavHeaderReader", "Unsupported RIFF format: " + j10);
            return null;
        }
        a a10 = a.a(j8Var, ygVar);
        while (a10.f10535a != 1718449184) {
            j8Var.c((int) a10.f10536b);
            a10 = a.a(j8Var, ygVar);
        }
        a1.b(a10.f10536b >= 16);
        j8Var.c(ygVar.c(), 0, 16);
        ygVar.f(0);
        int r10 = ygVar.r();
        int r11 = ygVar.r();
        int q10 = ygVar.q();
        int q11 = ygVar.q();
        int r12 = ygVar.r();
        int r13 = ygVar.r();
        int i10 = ((int) a10.f10536b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            j8Var.c(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = yp.f13667f;
        }
        return new nr(r10, r11, q10, q11, r12, r13, bArr);
    }

    public static Pair b(j8 j8Var) {
        a1.a((Object) j8Var);
        j8Var.b();
        yg ygVar = new yg(8);
        a a10 = a.a(j8Var, ygVar);
        while (true) {
            int i10 = a10.f10535a;
            if (i10 != 1684108385) {
                if (!(i10 == 1380533830 || i10 == 1718449184)) {
                    kc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f10535a);
                }
                long j10 = a10.f10536b + 8;
                if (a10.f10535a == 1380533830) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    j8Var.a((int) j10);
                    a10 = a.a(j8Var, ygVar);
                } else {
                    throw ah.a("Chunk is too large (~2GB+) to skip; id: " + a10.f10535a);
                }
            } else {
                j8Var.a(8);
                long f10 = j8Var.f();
                long j11 = a10.f10536b + f10;
                long a11 = j8Var.a();
                if (a11 != -1 && j11 > a11) {
                    kc.d("WavHeaderReader", "Data exceeds input length: " + j11 + ", " + a11);
                    j11 = a11;
                }
                return Pair.create(Long.valueOf(f10), Long.valueOf(j11));
            }
        }
    }
}
