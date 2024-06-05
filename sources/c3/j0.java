package c3;

import k4.a0;

/* compiled from: TsUtil */
public final class j0 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(a0 a0Var, int i10, int i11) {
        a0Var.T(i10);
        if (a0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int p10 = a0Var.p();
        if ((8388608 & p10) != 0 || ((2096896 & p10) >> 8) != i11) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        if (((p10 & 32) != 0) && a0Var.G() >= 7 && a0Var.a() >= 7) {
            if ((a0Var.G() & 16) != 16) {
                z10 = false;
            }
            if (z10) {
                byte[] bArr = new byte[6];
                a0Var.l(bArr, 0, 6);
                return d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
