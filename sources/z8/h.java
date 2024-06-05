package z8;

import v8.b;
import v8.j;

/* compiled from: GlobalHistogramBinarizer */
public class h extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f31496d = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private byte[] f31497b = f31496d;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f31498c = new int[32];

    public h(v8.h hVar) {
        super(hVar);
    }

    private static int g(int[] iArr) throws j {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (iArr[i13] > i10) {
                i10 = iArr[i13];
                i12 = i13;
            }
            if (iArr[i13] > i11) {
                i11 = iArr[i13];
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i12;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i12 <= i14) {
            int i19 = i12;
            i12 = i14;
            i14 = i19;
        }
        if (i12 - i14 > length / 16) {
            int i20 = i12 - 1;
            int i21 = i20;
            int i22 = -1;
            while (i20 > i14) {
                int i23 = i20 - i14;
                int i24 = i23 * i23 * (i12 - i20) * (i11 - iArr[i20]);
                if (i24 > i22) {
                    i21 = i20;
                    i22 = i24;
                }
                i20--;
            }
            return i21 << 3;
        }
        throw j.a();
    }

    private void h(int i10) {
        if (this.f31497b.length < i10) {
            this.f31497b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f31498c[i11] = 0;
        }
    }

    public b b() throws j {
        v8.h e10 = e();
        int d10 = e10.d();
        int a10 = e10.a();
        b bVar = new b(d10, a10);
        h(d10);
        int[] iArr = this.f31498c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] c10 = e10.c((a10 * i10) / 5, this.f31497b);
            int i11 = (d10 << 2) / 5;
            for (int i12 = d10 / 5; i12 < i11; i12++) {
                int i13 = (c10[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int g10 = g(iArr);
        byte[] b10 = e10.b();
        for (int i14 = 0; i14 < a10; i14++) {
            int i15 = i14 * d10;
            for (int i16 = 0; i16 < d10; i16++) {
                if ((b10[i15 + i16] & 255) < g10) {
                    bVar.m(i16, i14);
                }
            }
        }
        return bVar;
    }

    public a c(int i10, a aVar) throws j {
        v8.h e10 = e();
        int d10 = e10.d();
        if (aVar == null || aVar.g() < d10) {
            aVar = new a(d10);
        } else {
            aVar.a();
        }
        h(d10);
        byte[] c10 = e10.c(i10, this.f31497b);
        int[] iArr = this.f31498c;
        for (int i11 = 0; i11 < d10; i11++) {
            int i12 = (c10[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int g10 = g(iArr);
        if (d10 < 3) {
            for (int i13 = 0; i13 < d10; i13++) {
                if ((c10[i13] & 255) < g10) {
                    aVar.l(i13);
                }
            }
        } else {
            int i14 = 1;
            byte b10 = c10[1] & 255;
            byte b11 = c10[0] & 255;
            byte b12 = b10;
            while (i14 < d10 - 1) {
                int i15 = i14 + 1;
                byte b13 = c10[i15] & 255;
                if ((((b12 << 2) - b11) - b13) / 2 < g10) {
                    aVar.l(i14);
                }
                b11 = b12;
                i14 = i15;
                b12 = b13;
            }
        }
        return aVar;
    }
}
