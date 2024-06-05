package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.wd;

public abstract class oc extends wo {

    /* renamed from: c  reason: collision with root package name */
    private a f10094c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f10095a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f10096b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f10097c;

        /* renamed from: d  reason: collision with root package name */
        private final qo[] f10098d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f10099e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f10100f;

        /* renamed from: g  reason: collision with root package name */
        private final qo f10101g;

        a(String[] strArr, int[] iArr, qo[] qoVarArr, int[] iArr2, int[][][] iArr3, qo qoVar) {
            this.f10096b = strArr;
            this.f10097c = iArr;
            this.f10098d = qoVarArr;
            this.f10100f = iArr3;
            this.f10099e = iArr2;
            this.f10101g = qoVar;
            this.f10095a = iArr.length;
        }

        public int a() {
            return this.f10095a;
        }

        public qo b(int i10) {
            return this.f10098d[i10];
        }

        public int a(int i10) {
            return this.f10097c[i10];
        }
    }

    private static int a(mi[] miVarArr, po poVar, int[] iArr, boolean z10) {
        int length = miVarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < miVarArr.length; i11++) {
            mi miVar = miVarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < poVar.f10688a; i13++) {
                i12 = Math.max(i12, hz.d(miVar.a(poVar.a(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    /* access modifiers changed from: protected */
    public abstract Pair a(a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar);

    private static int[] a(mi miVar, po poVar) {
        int[] iArr = new int[poVar.f10688a];
        for (int i10 = 0; i10 < poVar.f10688a; i10++) {
            iArr[i10] = miVar.a(poVar.a(i10));
        }
        return iArr;
    }

    private static int[] a(mi[] miVarArr) {
        int length = miVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = miVarArr[i10].m();
        }
        return iArr;
    }

    public final void a(Object obj) {
        this.f10094c = (a) obj;
    }

    public final xo a(mi[] miVarArr, qo qoVar, wd.a aVar, go goVar) {
        int[] iArr;
        mi[] miVarArr2 = miVarArr;
        qo qoVar2 = qoVar;
        int[] iArr2 = new int[(miVarArr2.length + 1)];
        int length = miVarArr2.length + 1;
        po[][] poVarArr = new po[length][];
        int[][][] iArr3 = new int[(miVarArr2.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = qoVar2.f11066a;
            poVarArr[i10] = new po[i11];
            iArr3[i10] = new int[i11][];
        }
        int[] a10 = a(miVarArr);
        for (int i12 = 0; i12 < qoVar2.f11066a; i12++) {
            po a11 = qoVar2.a(i12);
            int a12 = a(miVarArr, a11, iArr2, df.e(a11.a(0).f7153m) == 5);
            if (a12 == miVarArr2.length) {
                iArr = new int[a11.f10688a];
            } else {
                iArr = a(miVarArr2[a12], a11);
            }
            int i13 = iArr2[a12];
            poVarArr[a12][i13] = a11;
            iArr3[a12][i13] = iArr;
            iArr2[a12] = i13 + 1;
        }
        qo[] qoVarArr = new qo[miVarArr2.length];
        String[] strArr = new String[miVarArr2.length];
        int[] iArr4 = new int[miVarArr2.length];
        for (int i14 = 0; i14 < miVarArr2.length; i14++) {
            int i15 = iArr2[i14];
            qoVarArr[i14] = new qo((po[]) yp.a((Object[]) poVarArr[i14], i15));
            iArr3[i14] = (int[][]) yp.a((Object[]) iArr3[i14], i15);
            strArr[i14] = miVarArr2[i14].getName();
            iArr4[i14] = miVarArr2[i14].e();
        }
        a aVar2 = new a(strArr, iArr4, qoVarArr, a10, iArr3, new qo((po[]) yp.a((Object[]) poVarArr[miVarArr2.length], iArr2[miVarArr2.length])));
        Pair a13 = a(aVar2, iArr3, a10, aVar, goVar);
        return new xo((ni[]) a13.first, (f8[]) a13.second, aVar2);
    }
}
