package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.y8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class v8 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public y8 f12717a;

        public a(y8 y8Var) {
            this.f12717a = y8Var;
        }
    }

    public static boolean a(j8 j8Var) {
        yg ygVar = new yg(4);
        j8Var.c(ygVar.c(), 0, 4);
        if (ygVar.y() == 1716281667) {
            return true;
        }
        return false;
    }

    public static int b(j8 j8Var) {
        j8Var.b();
        yg ygVar = new yg(2);
        j8Var.c(ygVar.c(), 0, 2);
        int C = ygVar.C();
        if ((C >> 2) == 16382) {
            j8Var.b();
            return C;
        }
        j8Var.b();
        throw ah.a("First frame does not start with sync code.", (Throwable) null);
    }

    private static y8 c(j8 j8Var) {
        byte[] bArr = new byte[38];
        j8Var.d(bArr, 0, 38);
        return new y8(bArr, 4);
    }

    public static void d(j8 j8Var) {
        yg ygVar = new yg(4);
        j8Var.d(ygVar.c(), 0, 4);
        if (ygVar.y() != 1716281667) {
            throw ah.a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    private static List c(j8 j8Var, int i10) {
        yg ygVar = new yg(i10);
        j8Var.d(ygVar.c(), 0, i10);
        ygVar.g(4);
        return Arrays.asList(gr.a(ygVar, false, false).f8125b);
    }

    public static we a(j8 j8Var, boolean z10) {
        we a10 = new va().a(j8Var, z10 ? null : ta.f12312b);
        if (a10 == null || a10.c() == 0) {
            return null;
        }
        return a10;
    }

    public static boolean a(j8 j8Var, a aVar) {
        j8Var.b();
        xg xgVar = new xg(new byte[4]);
        j8Var.c(xgVar.f13324a, 0, 4);
        boolean f10 = xgVar.f();
        int a10 = xgVar.a(7);
        int a11 = xgVar.a(24) + 4;
        if (a10 == 0) {
            aVar.f12717a = c(j8Var);
        } else {
            y8 y8Var = aVar.f12717a;
            if (y8Var == null) {
                throw new IllegalArgumentException();
            } else if (a10 == 3) {
                aVar.f12717a = y8Var.a(b(j8Var, a11));
            } else if (a10 == 4) {
                aVar.f12717a = y8Var.b(c(j8Var, a11));
            } else if (a10 == 6) {
                aVar.f12717a = y8Var.a(Collections.singletonList(a(j8Var, a11)));
            } else {
                j8Var.a(a11);
            }
        }
        return f10;
    }

    public static we b(j8 j8Var, boolean z10) {
        j8Var.b();
        long d10 = j8Var.d();
        we a10 = a(j8Var, z10);
        j8Var.a((int) (j8Var.d() - d10));
        return a10;
    }

    private static y8.a b(j8 j8Var, int i10) {
        yg ygVar = new yg(i10);
        j8Var.d(ygVar.c(), 0, i10);
        return a(ygVar);
    }

    public static y8.a a(yg ygVar) {
        ygVar.g(1);
        int z10 = ygVar.z();
        long d10 = ((long) ygVar.d()) + ((long) z10);
        int i10 = z10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long s10 = ygVar.s();
            if (s10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = s10;
            jArr2[i11] = ygVar.s();
            ygVar.g(2);
            i11++;
        }
        ygVar.g((int) (d10 - ((long) ygVar.d())));
        return new y8.a(jArr, jArr2);
    }

    private static ih a(j8 j8Var, int i10) {
        yg ygVar = new yg(i10);
        j8Var.d(ygVar.c(), 0, i10);
        ygVar.g(4);
        int j10 = ygVar.j();
        String a10 = ygVar.a(ygVar.j(), Charsets.US_ASCII);
        String c10 = ygVar.c(ygVar.j());
        int j11 = ygVar.j();
        int j12 = ygVar.j();
        int j13 = ygVar.j();
        int j14 = ygVar.j();
        int j15 = ygVar.j();
        byte[] bArr = new byte[j15];
        ygVar.a(bArr, 0, j15);
        return new ih(j10, a10, c10, j11, j12, j13, j14, bArr);
    }
}
