package s2;

import k4.a0;
import k4.r;
import s2.e0;

/* compiled from: CeaUtil */
public final class c {
    public static void a(long j10, a0 a0Var, e0[] e0VarArr) {
        while (true) {
            boolean z10 = true;
            if (a0Var.a() > 1) {
                int c10 = c(a0Var);
                int c11 = c(a0Var);
                int f10 = a0Var.f() + c11;
                if (c11 == -1 || c11 > a0Var.a()) {
                    r.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    f10 = a0Var.g();
                } else if (c10 == 4 && c11 >= 8) {
                    int G = a0Var.G();
                    int M = a0Var.M();
                    int p10 = M == 49 ? a0Var.p() : 0;
                    int G2 = a0Var.G();
                    if (M == 47) {
                        a0Var.U(1);
                    }
                    boolean z11 = G == 181 && (M == 49 || M == 47) && G2 == 3;
                    if (M == 49) {
                        if (p10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, a0Var, e0VarArr);
                    }
                }
                a0Var.T(f10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, a0 a0Var, e0[] e0VarArr) {
        int G = a0Var.G();
        if ((G & 64) != 0) {
            a0Var.U(1);
            int i10 = (G & 31) * 3;
            int f10 = a0Var.f();
            for (e0 e0Var : e0VarArr) {
                a0Var.T(f10);
                e0Var.d(a0Var, i10);
                if (j10 != -9223372036854775807L) {
                    e0Var.b(j10, 1, i10, 0, (e0.a) null);
                }
            }
        }
    }

    private static int c(a0 a0Var) {
        int i10 = 0;
        while (a0Var.a() != 0) {
            int G = a0Var.G();
            i10 += G;
            if (G != 255) {
                return i10;
            }
        }
        return -1;
    }
}
