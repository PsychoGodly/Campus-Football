package h9;

import java.util.Map;
import v8.e;
import v8.f;
import v8.j;
import v8.n;
import v8.p;
import z8.a;

/* compiled from: ITFReader */
public final class h extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f28966b = {6, 8, 10, 12, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f28967c = {1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f28968d = {1, 1, 3};

    /* renamed from: e  reason: collision with root package name */
    static final int[][] f28969e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    private int f28970a = -1;

    private static int g(int[] iArr) throws j {
        int length = f28969e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float d10 = k.d(iArr, f28969e[i11], 0.78f);
            if (d10 < f10) {
                i10 = i11;
                f10 = d10;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw j.a();
    }

    private int[] h(a aVar) throws j {
        aVar.k();
        try {
            int[] k10 = k(aVar, l(aVar), f28968d);
            m(aVar, k10[0]);
            int i10 = k10[0];
            k10[0] = aVar.g() - k10[1];
            k10[1] = aVar.g() - i10;
            return k10;
        } finally {
            aVar.k();
        }
    }

    private static void i(a aVar, int i10, int i11, StringBuilder sb2) throws j {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            k.e(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (g(iArr2) + 48));
            sb2.append((char) (g(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    private int[] j(a aVar) throws j {
        int[] k10 = k(aVar, l(aVar), f28967c);
        this.f28970a = (k10[1] - k10[0]) / 4;
        m(aVar, k10[0]);
        return k10;
    }

    private static int[] k(a aVar, int i10, int[] iArr) throws j {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int g10 = aVar.g();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < g10) {
            if (aVar.c(i10) ^ z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                int i13 = length - 1;
                if (i12 != i13) {
                    i12++;
                } else if (k.d(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i11, i10};
                } else {
                    i11 += iArr2[0] + iArr2[1];
                    int i14 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw j.a();
    }

    private static int l(a aVar) throws j {
        int g10 = aVar.g();
        int e10 = aVar.e(0);
        if (e10 != g10) {
            return e10;
        }
        throw j.a();
    }

    private void m(a aVar, int i10) throws j {
        int i11 = this.f28970a * 10;
        if (i11 >= i10) {
            i11 = i10;
        }
        int i12 = i10 - 1;
        while (i11 > 0 && i12 >= 0 && !aVar.c(i12)) {
            i11--;
            i12--;
        }
        if (i11 != 0) {
            throw j.a();
        }
    }

    public n b(int i10, a aVar, Map<e, ?> map) throws f, j {
        boolean z10;
        int[] j10 = j(aVar);
        int[] h10 = h(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        i(aVar, j10[1], h10[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f28966b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z10 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z10 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (z10) {
            float f10 = (float) i10;
            return new n(sb3, (byte[]) null, new p[]{new p((float) j10[1], f10), new p((float) h10[0], f10)}, v8.a.ITF);
        }
        throw f.a();
    }
}
