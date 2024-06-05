package com.applovin.impl;

public abstract class u8 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f12543a;
    }

    private static boolean a(yg ygVar, y8 y8Var, int i10) {
        int b10 = b(ygVar, i10);
        return b10 != -1 && b10 <= y8Var.f13540b;
    }

    private static boolean b(yg ygVar, y8 y8Var, int i10) {
        int i11 = y8Var.f13543e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            if (i10 == y8Var.f13544f) {
                return true;
            }
            return false;
        } else if (i10 == 12) {
            if (ygVar.w() * 1000 == i11) {
                return true;
            }
            return false;
        } else if (i10 > 14) {
            return false;
        } else {
            int C = ygVar.C();
            if (i10 == 14) {
                C *= 10;
            }
            if (C == i11) {
                return true;
            }
            return false;
        }
    }

    private static boolean a(yg ygVar, int i10) {
        return ygVar.w() == yp.b(ygVar.c(), i10, ygVar.d() - 1, 0);
    }

    private static boolean b(int i10, y8 y8Var) {
        if (i10 <= 7) {
            return i10 == y8Var.f13545g - 1;
        }
        if (i10 > 10 || y8Var.f13545g != 2) {
            return false;
        }
        return true;
    }

    private static boolean a(yg ygVar, y8 y8Var, boolean z10, a aVar) {
        try {
            long D = ygVar.D();
            if (!z10) {
                D *= (long) y8Var.f13540b;
            }
            aVar.f12543a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(yg ygVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return ygVar.w() + 1;
            case 7:
                return ygVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static boolean a(yg ygVar, y8 y8Var, int i10, a aVar) {
        yg ygVar2 = ygVar;
        y8 y8Var2 = y8Var;
        int d10 = ygVar.d();
        long y10 = ygVar.y();
        long j10 = y10 >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((y10 >> 12) & 15);
        int i12 = (int) ((y10 >> 8) & 15);
        int i13 = (int) (15 & (y10 >> 4));
        int i14 = (int) ((y10 >> 1) & 7);
        boolean z11 = (y10 & 1) == 1;
        if (!b(i13, y8Var2) || !a(i14, y8Var2) || z11 || !a(ygVar2, y8Var2, z10, aVar) || !a(ygVar2, y8Var2, i11) || !b(ygVar2, y8Var2, i12) || !a(ygVar2, d10)) {
            return false;
        }
        return true;
    }

    private static boolean a(int i10, y8 y8Var) {
        return i10 == 0 || i10 == y8Var.f13547i;
    }

    public static boolean a(j8 j8Var, y8 y8Var, int i10, a aVar) {
        long d10 = j8Var.d();
        byte[] bArr = new byte[2];
        j8Var.c(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            j8Var.b();
            j8Var.c((int) (d10 - j8Var.f()));
            return false;
        }
        yg ygVar = new yg(16);
        System.arraycopy(bArr, 0, ygVar.c(), 0, 2);
        ygVar.e(l8.a(j8Var, ygVar.c(), 2, 14));
        j8Var.b();
        j8Var.c((int) (d10 - j8Var.f()));
        return a(ygVar, y8Var, i10, aVar);
    }

    public static long a(j8 j8Var, y8 y8Var) {
        j8Var.b();
        boolean z10 = true;
        j8Var.c(1);
        byte[] bArr = new byte[1];
        j8Var.c(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        j8Var.c(2);
        int i10 = z10 ? 7 : 6;
        yg ygVar = new yg(i10);
        ygVar.e(l8.a(j8Var, ygVar.c(), 0, i10));
        j8Var.b();
        a aVar = new a();
        if (a(ygVar, y8Var, z10, aVar)) {
            return aVar.f12543a;
        }
        throw ah.a((String) null, (Throwable) null);
    }
}
