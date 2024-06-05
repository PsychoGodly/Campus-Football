package a3;

import java.io.IOException;
import k4.a0;
import s2.m;

/* compiled from: Sniffer */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f321a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f321a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(m mVar) throws IOException {
        return c(mVar, true, false);
    }

    private static boolean c(m mVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        m mVar2 = mVar;
        long b10 = mVar.b();
        long j10 = 4096;
        long j11 = -1;
        int i10 = (b10 > -1 ? 1 : (b10 == -1 ? 0 : -1));
        if (i10 != 0 && b10 <= 4096) {
            j10 = b10;
        }
        int i11 = (int) j10;
        a0 a0Var = new a0(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            a0Var.P(8);
            if (!mVar2.g(a0Var.e(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long I = a0Var.I();
            int p10 = a0Var.p();
            int i13 = 16;
            if (I == 1) {
                mVar2.p(a0Var.e(), 8, 8);
                a0Var.S(16);
                I = a0Var.z();
            } else {
                if (I == 0) {
                    long b11 = mVar.b();
                    if (b11 != j11) {
                        I = (b11 - mVar.h()) + ((long) 8);
                    }
                }
                i13 = 8;
            }
            long j12 = (long) i13;
            if (I < j12) {
                return z13;
            }
            i12 += i13;
            if (p10 == 1836019574) {
                i11 += (int) I;
                if (i10 != 0 && ((long) i11) > b10) {
                    i11 = (int) b10;
                }
                j11 = -1;
            } else if (p10 == 1836019558 || p10 == 1836475768) {
                z12 = true;
            } else {
                long j13 = b10;
                int i14 = i12;
                if ((((long) i12) + I) - j12 >= ((long) i11)) {
                    break;
                }
                int i15 = (int) (I - j12);
                i12 = i14 + i15;
                if (p10 != 1718909296) {
                    boolean z15 = z11;
                    if (i15 != 0) {
                        mVar2.i(i15);
                    }
                } else if (i15 < 8) {
                    return false;
                } else {
                    a0Var.P(i15);
                    mVar2.p(a0Var.e(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            boolean z16 = z11;
                            break;
                        }
                        if (i17 == 1) {
                            a0Var.U(4);
                            boolean z17 = z11;
                        } else if (a(a0Var.p(), z11)) {
                            z14 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z14) {
                        return false;
                    }
                }
                b10 = j13;
                j11 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean d(m mVar, boolean z10) throws IOException {
        return c(mVar, false, z10);
    }
}
