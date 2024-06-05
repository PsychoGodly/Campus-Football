package com.applovin.impl;

import com.applovin.impl.zh;
import java.util.ArrayList;
import java.util.zip.Inflater;

abstract class ai {
    private static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean a(yg ygVar) {
        ygVar.g(4);
        int j10 = ygVar.j();
        ygVar.f(0);
        if (j10 == 1886547818) {
            return true;
        }
        return false;
    }

    private static zh.a b(yg ygVar) {
        int j10 = ygVar.j();
        if (j10 > 10000) {
            return null;
        }
        float[] fArr = new float[j10];
        for (int i10 = 0; i10 < j10; i10++) {
            fArr[i10] = ygVar.i();
        }
        int j11 = ygVar.j();
        if (j11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) j10) * 2.0d) / log);
        xg xgVar = new xg(ygVar.c());
        int i11 = 8;
        xgVar.c(ygVar.d() * 8);
        float[] fArr2 = new float[(j11 * 5)];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < j11) {
            int i15 = 0;
            while (i15 < i12) {
                int a10 = iArr[i15] + a(xgVar.a(ceil));
                if (a10 >= j10 || a10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[a10];
                iArr[i15] = a10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        xgVar.c((xgVar.e() + 7) & -8);
        int i16 = 32;
        int a11 = xgVar.a(32);
        zh.b[] bVarArr = new zh.b[a11];
        int i17 = 0;
        while (i17 < a11) {
            int a12 = xgVar.a(i11);
            int a13 = xgVar.a(i11);
            int a14 = xgVar.a(i16);
            if (a14 > 128000) {
                return null;
            }
            int i18 = a12;
            int ceil2 = (int) Math.ceil(Math.log(((double) j11) * d10) / log);
            float[] fArr3 = new float[(a14 * 3)];
            float[] fArr4 = new float[(a14 * 2)];
            int i19 = 0;
            for (int i20 = 0; i20 < a14; i20++) {
                i19 += a(xgVar.a(ceil2));
                if (i19 < 0 || i19 >= j11) {
                    return null;
                }
                int i21 = i20 * 3;
                int i22 = i19 * 5;
                fArr3[i21] = fArr2[i22];
                fArr3[i21 + 1] = fArr2[i22 + 1];
                fArr3[i21 + 2] = fArr2[i22 + 2];
                int i23 = i20 * 2;
                fArr4[i23] = fArr2[i22 + 3];
                fArr4[i23 + 1] = fArr2[i22 + 4];
            }
            bVarArr[i17] = new zh.b(i18, fArr3, fArr4, a13);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new zh.a(bVarArr);
    }

    private static ArrayList c(yg ygVar) {
        if (ygVar.w() != 0) {
            return null;
        }
        ygVar.g(7);
        int j10 = ygVar.j();
        if (j10 == 1684433976) {
            yg ygVar2 = new yg();
            Inflater inflater = new Inflater(true);
            try {
                if (!yp.a(ygVar, ygVar2, inflater)) {
                    return null;
                }
                inflater.end();
                ygVar = ygVar2;
            } finally {
                inflater.end();
            }
        } else if (j10 != 1918990112) {
            return null;
        }
        return e(ygVar);
    }

    private static ArrayList d(yg ygVar) {
        int j10;
        ygVar.g(8);
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        while (d10 < e10 && (j10 = ygVar.j() + d10) > d10 && j10 <= e10) {
            int j11 = ygVar.j();
            if (j11 == 2037673328 || j11 == 1836279920) {
                ygVar.e(j10);
                return c(ygVar);
            }
            ygVar.f(j10);
            d10 = j10;
        }
        return null;
    }

    private static ArrayList e(yg ygVar) {
        ArrayList arrayList = new ArrayList();
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        while (d10 < e10) {
            int j10 = ygVar.j() + d10;
            if (j10 <= d10 || j10 > e10) {
                return null;
            }
            if (ygVar.j() == 1835365224) {
                zh.a b10 = b(ygVar);
                if (b10 == null) {
                    return null;
                }
                arrayList.add(b10);
            }
            ygVar.f(j10);
            d10 = j10;
        }
        return arrayList;
    }

    public static zh a(byte[] bArr, int i10) {
        ArrayList arrayList;
        yg ygVar = new yg(bArr);
        try {
            arrayList = a(ygVar) ? d(ygVar) : c(ygVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new zh((zh.a) arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new zh((zh.a) arrayList.get(0), (zh.a) arrayList.get(1), i10);
    }
}
