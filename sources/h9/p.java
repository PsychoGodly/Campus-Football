package h9;

import java.util.Arrays;
import java.util.Map;
import v8.d;
import v8.e;
import v8.f;
import v8.j;
import v8.m;
import v8.n;
import v8.o;
import v8.q;
import z8.a;

/* compiled from: UPCEANReader */
public abstract class p extends k {

    /* renamed from: d  reason: collision with root package name */
    static final int[] f28982d = {1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f28983e = {1, 1, 1, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f28984f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g  reason: collision with root package name */
    static final int[][] f28985g;

    /* renamed from: h  reason: collision with root package name */
    static final int[][] f28986h;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f28987a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final o f28988b = new o();

    /* renamed from: c  reason: collision with root package name */
    private final g f28989c = new g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f28985g = iArr;
        int[][] iArr2 = new int[20][];
        f28986h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f28985g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f28986h[i10] = iArr4;
        }
    }

    protected p() {
    }

    static boolean h(CharSequence charSequence) throws f {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw f.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw f.a();
            }
            i12 += charAt2;
        }
        if (i12 % 10 == 0) {
            return true;
        }
        return false;
    }

    static int i(a aVar, int[] iArr, int i10, int[][] iArr2) throws j {
        k.e(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float d10 = k.d(iArr, iArr2[i12], 0.7f);
            if (d10 < f10) {
                i11 = i12;
                f10 = d10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw j.a();
    }

    static int[] m(a aVar, int i10, boolean z10, int[] iArr) throws j {
        return n(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    private static int[] n(a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws j {
        int g10 = aVar.g();
        int f10 = z10 ? aVar.f(i10) : aVar.e(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = f10;
        while (f10 < g10) {
            if (aVar.c(f10) ^ z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                int i13 = length - 1;
                if (i11 != i13) {
                    i11++;
                } else if (k.d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i12, f10};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            f10++;
        }
        throw j.a();
    }

    static int[] o(a aVar) throws j {
        int[] iArr = new int[f28982d.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f28982d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = n(aVar, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = aVar.i(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    public n b(int i10, a aVar, Map<e, ?> map) throws j, d, f {
        return l(i10, aVar, o(aVar), map);
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) throws f {
        return h(str);
    }

    /* access modifiers changed from: package-private */
    public int[] j(a aVar, int i10) throws j {
        return m(aVar, i10, false, f28982d);
    }

    /* access modifiers changed from: protected */
    public abstract int k(a aVar, int[] iArr, StringBuilder sb2) throws j;

    public n l(int i10, a aVar, int[] iArr, Map<e, ?> map) throws j, d, f {
        q qVar;
        int i11;
        String c10;
        int[] iArr2 = null;
        if (map == null) {
            qVar = null;
        } else {
            qVar = (q) map.get(e.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z10 = true;
        if (qVar != null) {
            qVar.a(new v8.p(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i10));
        }
        StringBuilder sb2 = this.f28987a;
        sb2.setLength(0);
        int k10 = k(aVar, iArr, sb2);
        if (qVar != null) {
            qVar.a(new v8.p((float) k10, (float) i10));
        }
        int[] j10 = j(aVar, k10);
        if (qVar != null) {
            qVar.a(new v8.p(((float) (j10[0] + j10[1])) / 2.0f, (float) i10));
        }
        int i12 = j10[1];
        int i13 = (i12 - j10[0]) + i12;
        if (i13 >= aVar.g() || !aVar.i(i12, i13, false)) {
            throw j.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw f.a();
        } else if (g(sb3)) {
            v8.a p10 = p();
            float f10 = (float) i10;
            n nVar = new n(sb3, (byte[]) null, new v8.p[]{new v8.p(((float) (iArr[1] + iArr[0])) / 2.0f, f10), new v8.p(((float) (j10[1] + j10[0])) / 2.0f, f10)}, p10);
            try {
                n a10 = this.f28988b.a(i10, aVar, j10[1]);
                nVar.h(o.UPC_EAN_EXTENSION, a10.f());
                nVar.g(a10.d());
                nVar.a(a10.e());
                i11 = a10.f().length();
            } catch (m unused) {
                i11 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        z10 = false;
                        break;
                    } else if (i11 == iArr2[i14]) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (!z10) {
                    throw j.a();
                }
            }
            if ((p10 == v8.a.EAN_13 || p10 == v8.a.UPC_A) && (c10 = this.f28989c.c(sb3)) != null) {
                nVar.h(o.POSSIBLE_COUNTRY, c10);
            }
            return nVar;
        } else {
            throw d.a();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract v8.a p();
}
