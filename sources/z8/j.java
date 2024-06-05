package z8;

import java.lang.reflect.Array;
import v8.b;
import v8.h;

/* compiled from: HybridBinarizer */
public final class j extends h {

    /* renamed from: e  reason: collision with root package name */
    private b f31500e;

    public j(h hVar) {
        super(hVar);
    }

    private static int[][] i(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        int i15 = i11;
        int[] iArr = new int[2];
        iArr[1] = i14;
        iArr[0] = i15;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 << 3;
            int i18 = i13 - 8;
            if (i17 > i18) {
                i17 = i18;
            }
            for (int i19 = 0; i19 < i14; i19++) {
                int i20 = i19 << 3;
                int i21 = i12 - 8;
                if (i20 > i21) {
                    i20 = i21;
                }
                int i22 = (i17 * i12) + i20;
                int i23 = 0;
                int i24 = 0;
                byte b10 = 0;
                byte b11 = 255;
                while (i23 < 8) {
                    for (int i25 = 0; i25 < 8; i25++) {
                        byte b12 = bArr[i22 + i25] & 255;
                        i24 += b12;
                        if (b12 < b11) {
                            b11 = b12;
                        }
                        if (b12 > b10) {
                            b10 = b12;
                        }
                    }
                    if (b10 - b11 <= 24) {
                        i23++;
                        i22 += i12;
                    }
                    while (true) {
                        i23++;
                        i22 += i12;
                        if (i23 >= 8) {
                            break;
                        }
                        for (int i26 = 0; i26 < 8; i26++) {
                            i24 += bArr[i22 + i26] & 255;
                        }
                    }
                    i23++;
                    i22 += i12;
                }
                int i27 = i24 >> 6;
                if (b10 - b11 <= 24) {
                    i27 = b11 / 2;
                    if (i16 > 0 && i19 > 0) {
                        int i28 = i16 - 1;
                        int i29 = i19 - 1;
                        int i30 = ((iArr2[i28][i19] + (iArr2[i16][i29] * 2)) + iArr2[i28][i29]) / 4;
                        if (b11 < i30) {
                            i27 = i30;
                        }
                        iArr2[i16][i19] = i27;
                    }
                }
                iArr2[i16][i19] = i27;
            }
        }
        return iArr2;
    }

    private static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i10;
        int i15 = i11;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 << 3;
            int i18 = i13 - 8;
            if (i17 > i18) {
                i17 = i18;
            }
            for (int i19 = 0; i19 < i14; i19++) {
                int i20 = i19 << 3;
                int i21 = i12 - 8;
                if (i20 <= i21) {
                    i21 = i20;
                }
                int k10 = k(i19, 2, i14 - 3);
                int k11 = k(i16, 2, i15 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[k11 + i23];
                    i22 += iArr2[k10 - 2] + iArr2[k10 - 1] + iArr2[k10] + iArr2[k10 + 1] + iArr2[k10 + 2];
                }
                l(bArr, i21, i17, i22 / 25, i12, bVar);
            }
        }
    }

    private static int k(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.m(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    public b a(h hVar) {
        return new j(hVar);
    }

    public b b() throws v8.j {
        b bVar = this.f31500e;
        if (bVar != null) {
            return bVar;
        }
        h e10 = e();
        int d10 = e10.d();
        int a10 = e10.a();
        if (d10 < 40 || a10 < 40) {
            this.f31500e = super.b();
        } else {
            byte[] b10 = e10.b();
            int i10 = d10 >> 3;
            if ((d10 & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = a10 >> 3;
            if ((a10 & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] i14 = i(b10, i11, i13, d10, a10);
            b bVar2 = new b(d10, a10);
            j(b10, i11, i13, d10, a10, i14, bVar2);
            this.f31500e = bVar2;
        }
        return this.f31500e;
    }
}
