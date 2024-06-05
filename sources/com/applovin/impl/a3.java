package com.applovin.impl;

import com.applovin.impl.ro;

public abstract class a3 {
    public static void a(long j10, yg ygVar, ro[] roVarArr) {
        while (true) {
            boolean z10 = true;
            if (ygVar.a() > 1) {
                int a10 = a(ygVar);
                int a11 = a(ygVar);
                int d10 = ygVar.d() + a11;
                if (a11 == -1 || a11 > ygVar.a()) {
                    kc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    d10 = ygVar.e();
                } else if (a10 == 4 && a11 >= 8) {
                    int w10 = ygVar.w();
                    int C = ygVar.C();
                    int j11 = C == 49 ? ygVar.j() : 0;
                    int w11 = ygVar.w();
                    if (C == 47) {
                        ygVar.g(1);
                    }
                    boolean z11 = w10 == 181 && (C == 49 || C == 47) && w11 == 3;
                    if (C == 49) {
                        if (j11 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, ygVar, roVarArr);
                    }
                }
                ygVar.f(d10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, yg ygVar, ro[] roVarArr) {
        int w10 = ygVar.w();
        if ((w10 & 64) != 0) {
            ygVar.g(1);
            int i10 = (w10 & 31) * 3;
            int d10 = ygVar.d();
            for (ro roVar : roVarArr) {
                ygVar.f(d10);
                roVar.a(ygVar, i10);
                if (j10 != -9223372036854775807L) {
                    roVar.a(j10, 1, i10, 0, (ro.a) null);
                }
            }
        }
    }

    private static int a(yg ygVar) {
        int i10 = 0;
        while (ygVar.a() != 0) {
            int w10 = ygVar.w();
            i10 += w10;
            if (w10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
