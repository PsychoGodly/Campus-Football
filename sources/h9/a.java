package h9;

import com.google.android.gms.common.api.a;
import v8.j;

/* compiled from: CodaBarReader */
public final class a extends k {

    /* renamed from: d  reason: collision with root package name */
    static final char[] f28943d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e  reason: collision with root package name */
    static final int[] f28944e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f28945f = {'A', 'B', 'C', 'D'};

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f28946a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private int[] f28947b = new int[80];

    /* renamed from: c  reason: collision with root package name */
    private int f28948c = 0;

    static boolean g(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void h(int i10) {
        int[] iArr = this.f28947b;
        int i11 = this.f28948c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f28948c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[(i12 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f28947b = iArr2;
        }
    }

    private int i() throws j {
        for (int i10 = 1; i10 < this.f28948c; i10 += 2) {
            int k10 = k(i10);
            if (k10 != -1 && g(f28945f, f28943d[k10])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f28947b[i12];
                }
                if (i10 == 1 || this.f28947b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw j.a();
    }

    private void j(z8.a aVar) throws j {
        int i10 = 0;
        this.f28948c = 0;
        int f10 = aVar.f(0);
        int g10 = aVar.g();
        if (f10 < g10) {
            boolean z10 = true;
            while (f10 < g10) {
                if (aVar.c(f10) ^ z10) {
                    i10++;
                } else {
                    h(i10);
                    z10 = !z10;
                    i10 = 1;
                }
                f10++;
            }
            h(i10);
            return;
        }
        throw j.a();
    }

    private int k(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f28948c) {
            return -1;
        }
        int[] iArr = this.f28947b;
        int i12 = a.e.API_PRIORITY_OTHER;
        int i13 = 0;
        int i14 = a.e.API_PRIORITY_OTHER;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f28944e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    private void l(int i10) throws j {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f28946a.length() - 1;
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            int i14 = f28944e[this.f28946a.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                iArr[i16] = iArr[i16] + this.f28947b[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            fArr2[i18] = ((((float) iArr[i17]) / ((float) iArr2[i17])) + (((float) iArr[i18]) / ((float) iArr2[i18]))) / 2.0f;
            fArr[i17] = fArr2[i18];
            fArr[i18] = ((((float) iArr[i18]) * 2.0f) + 1.5f) / ((float) iArr2[i18]);
        }
        loop3:
        while (true) {
            int i19 = f28944e[this.f28946a.charAt(i11)];
            int i20 = 6;
            while (i20 >= 0) {
                int i21 = (i20 & 1) + ((i19 & 1) << 1);
                float f10 = (float) this.f28947b[i10 + i20];
                if (f10 >= fArr2[i21] && f10 <= fArr[i21]) {
                    i19 >>= 1;
                    i20--;
                }
            }
            if (i11 < length) {
                i10 += 8;
                i11++;
            } else {
                return;
            }
        }
        throw j.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v8.n b(int r11, z8.a r12, java.util.Map<v8.e, ?> r13) throws v8.j {
        /*
            r10 = this;
            int[] r0 = r10.f28947b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.j(r12)
            int r12 = r10.i()
            java.lang.StringBuilder r0 = r10.f28946a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.k(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f28946a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f28946a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f28945f
            char[] r6 = f28943d
            char r2 = r6[r2]
            boolean r2 = g(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f28948c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f28947b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = 0
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f28947b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f28948c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x005d:
            r10.l(r12)
            r0 = 0
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f28946a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f28946a
            char[] r3 = f28943d
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f28946a
            char r0 = r0.charAt(r1)
            char[] r2 = f28945f
            boolean r0 = g(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f28946a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = g(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f28946a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            v8.e r0 = v8.e.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f28946a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f28946a
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = 0
            r0 = 0
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f28947b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f28947b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            v8.n r0 = new v8.n
            java.lang.StringBuilder r2 = r10.f28946a
            java.lang.String r2 = r2.toString()
            r3 = 0
            v8.p[] r4 = new v8.p[r6]
            v8.p r6 = new v8.p
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            v8.p r13 = new v8.p
            r13.<init>(r12, r11)
            r4[r5] = r13
            v8.a r11 = v8.a.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f2:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x00f7:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x00fc:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x0101:
            v8.j r11 = v8.j.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.a.b(int, z8.a, java.util.Map):v8.n");
    }
}
