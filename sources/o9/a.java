package o9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import v8.c;
import v8.e;
import v8.j;
import v8.p;
import z8.b;

/* compiled from: Detector */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29493a = {0, 4, 1, 5};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29494b = {6, 2, 7, 3};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f29495c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f29496d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(p[] pVarArr, p[] pVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            pVarArr[iArr[i10]] = pVarArr2[i10];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (v8.p[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<v8.p[]> b(boolean r8, z8.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.g()
            if (r3 >= r6) goto L_0x007c
            v8.p[] r4 = f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0052
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0052
            if (r5 == 0) goto L_0x007c
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            v8.p[] r5 = (v8.p[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0052:
            r0.add(r4)
            if (r8 == 0) goto L_0x007c
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x006a
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.d()
            goto L_0x0078
        L_0x006a:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.d()
        L_0x0078:
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.a.b(boolean, z8.b):java.util.List");
    }

    public static b c(c cVar, Map<e, ?> map, boolean z10) throws j {
        b a10 = cVar.a();
        List<p[]> b10 = b(z10, a10);
        if (b10.isEmpty()) {
            a10 = a10.clone();
            a10.l();
            b10 = b(z10, a10);
        }
        return new b(a10, b10);
    }

    private static int[] d(b bVar, int i10, int i11, int i12, boolean z10, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.d(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i15 = 0;
        int i16 = i10;
        while (i10 < i12) {
            if (bVar.d(i10, i11) ^ z11) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                int i17 = length - 1;
                if (i15 != i17) {
                    i15++;
                } else if (g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i16, i10};
                } else {
                    i16 += iArr2[0] + iArr2[1];
                    int i18 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i18);
                    iArr2[i18] = 0;
                    iArr2[i17] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z11 = !z11;
            }
            i10++;
        }
        if (i15 != length - 1 || g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i16, i10 - 1};
    }

    private static p[] e(b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18 = i10;
        p[] pVarArr = new p[4];
        int[] iArr2 = new int[iArr.length];
        int i19 = i12;
        while (true) {
            if (i19 >= i18) {
                z10 = false;
                break;
            }
            int[] d10 = d(bVar, i13, i19, i11, false, iArr, iArr2);
            if (d10 != null) {
                int i20 = i19;
                int[] iArr3 = d10;
                int i21 = i20;
                while (true) {
                    if (i21 <= 0) {
                        i17 = i21;
                        break;
                    }
                    int i22 = i21 - 1;
                    int[] d11 = d(bVar, i13, i22, i11, false, iArr, iArr2);
                    if (d11 == null) {
                        i17 = i22 + 1;
                        break;
                    }
                    iArr3 = d11;
                    i21 = i22;
                }
                float f10 = (float) i17;
                pVarArr[0] = new p((float) iArr3[0], f10);
                pVarArr[1] = new p((float) iArr3[1], f10);
                i19 = i17;
                z10 = true;
            } else {
                i19 += 5;
            }
        }
        int i23 = i19 + 1;
        if (z10) {
            int[] iArr4 = {(int) pVarArr[0].c(), (int) pVarArr[1].c()};
            int i24 = i23;
            int i25 = 0;
            while (true) {
                if (i24 >= i18) {
                    i15 = i25;
                    i16 = i24;
                    break;
                }
                i15 = i25;
                i16 = i24;
                int[] d12 = d(bVar, iArr4[0], i24, i11, false, iArr, iArr2);
                if (d12 == null || Math.abs(iArr4[0] - d12[0]) >= 5 || Math.abs(iArr4[1] - d12[1]) >= 5) {
                    if (i15 > 25) {
                        break;
                    }
                    i25 = i15 + 1;
                } else {
                    iArr4 = d12;
                    i25 = 0;
                }
                i24 = i16 + 1;
            }
            i23 = i16 - (i15 + 1);
            float f11 = (float) i23;
            pVarArr[2] = new p((float) iArr4[0], f11);
            pVarArr[3] = new p((float) iArr4[1], f11);
        }
        if (i23 - i19 < 10) {
            for (i14 = 0; i14 < 4; i14++) {
                pVarArr[i14] = null;
            }
        }
        return pVarArr;
    }

    private static p[] f(b bVar, int i10, int i11) {
        int g10 = bVar.g();
        int k10 = bVar.k();
        p[] pVarArr = new p[8];
        a(pVarArr, e(bVar, g10, k10, i10, i11, f29495c), f29493a);
        if (pVarArr[4] != null) {
            i11 = (int) pVarArr[4].c();
            i10 = (int) pVarArr[4].d();
        }
        a(pVarArr, e(bVar, g10, k10, i10, i11, f29496d), f29494b);
        return pVarArr;
    }

    private static float g(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = (float) i10;
        float f12 = f11 / ((float) i11);
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = ((float) iArr2[i13]) * f12;
            float f16 = (float) i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }
}
