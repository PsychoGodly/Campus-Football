package com.applovin.impl;

abstract class ik {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8561a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f8561a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(j8 j8Var) {
        return a(j8Var, true, false);
    }

    private static boolean a(j8 j8Var, boolean z10, boolean z11) {
        boolean z12;
        j8 j8Var2 = j8Var;
        long a10 = j8Var.a();
        long j10 = 4096;
        long j11 = -1;
        int i10 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
        if (i10 != 0 && a10 <= 4096) {
            j10 = a10;
        }
        int i11 = (int) j10;
        yg ygVar = new yg(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            ygVar.d(8);
            if (!j8Var2.b(ygVar.c(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long y10 = ygVar.y();
            int j12 = ygVar.j();
            int i13 = 16;
            if (y10 == 1) {
                j8Var2.c(ygVar.c(), 8, 8);
                ygVar.e(16);
                y10 = ygVar.s();
            } else {
                if (y10 == 0) {
                    long a11 = j8Var.a();
                    if (a11 != j11) {
                        y10 = (a11 - j8Var.d()) + ((long) 8);
                    }
                }
                i13 = 8;
            }
            long j13 = (long) i13;
            if (y10 < j13) {
                return z13;
            }
            i12 += i13;
            if (j12 == 1836019574) {
                i11 += (int) y10;
                if (i10 != 0 && ((long) i11) > a10) {
                    i11 = (int) a10;
                }
                j11 = -1;
            } else if (j12 == 1836019558 || j12 == 1836475768) {
                z12 = true;
            } else {
                long j14 = a10;
                int i14 = i12;
                if ((((long) i12) + y10) - j13 >= ((long) i11)) {
                    break;
                }
                int i15 = (int) (y10 - j13);
                i12 = i14 + i15;
                if (j12 != 1718909296) {
                    boolean z15 = z11;
                    if (i15 != 0) {
                        j8Var2.c(i15);
                    }
                } else if (i15 < 8) {
                    return false;
                } else {
                    ygVar.d(i15);
                    j8Var2.c(ygVar.c(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            boolean z16 = z11;
                            break;
                        }
                        if (i17 == 1) {
                            ygVar.g(4);
                            boolean z17 = z11;
                        } else if (a(ygVar.j(), z11)) {
                            z14 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z14) {
                        return false;
                    }
                }
                a10 = j14;
                j11 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean a(j8 j8Var, boolean z10) {
        return a(j8Var, false, z10);
    }
}
