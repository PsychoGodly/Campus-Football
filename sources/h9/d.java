package h9;

import java.util.Arrays;
import java.util.Map;
import v8.e;
import v8.f;
import v8.j;
import v8.n;
import v8.p;
import z8.a;

/* compiled from: Code93Reader */
public final class d extends k {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f28956c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    static final int[] f28957d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f28958e;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f28959a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final int[] f28960b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f28957d = iArr;
        f28958e = iArr[47];
    }

    private static void g(CharSequence charSequence) throws v8.d {
        int length = charSequence.length();
        h(charSequence, length - 2, 20);
        h(charSequence, length - 1, 15);
    }

    private static void h(CharSequence charSequence, int i10, int i11) throws v8.d {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f28956c[i12 % 47]) {
            throw v8.d.a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String i(java.lang.CharSequence r9) throws v8.f {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x009f
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0098
            r5 = 100
            if (r4 > r5) goto L_0x0098
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x0093
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x008f
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            v8.f r9 = v8.f.a()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x008f
        L_0x0047:
            v8.f r9 = v8.f.a()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x008f
        L_0x007d:
            v8.f r9 = v8.f.a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x008f
        L_0x008a:
            v8.f r9 = v8.f.a()
            throw r9
        L_0x008f:
            r1.append(r4)
            goto L_0x009b
        L_0x0093:
            v8.f r9 = v8.f.a()
            throw r9
        L_0x0098:
            r1.append(r4)
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009f:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.d.i(java.lang.CharSequence):java.lang.String");
    }

    private int[] j(a aVar) throws j {
        int g10 = aVar.g();
        int e10 = aVar.e(0);
        Arrays.fill(this.f28960b, 0);
        int[] iArr = this.f28960b;
        int length = iArr.length;
        int i10 = e10;
        boolean z10 = false;
        int i11 = 0;
        while (e10 < g10) {
            if (aVar.c(e10) ^ z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                int i12 = length - 1;
                if (i11 != i12) {
                    i11++;
                } else if (l(iArr) == f28958e) {
                    return new int[]{i10, e10};
                } else {
                    i10 += iArr[0] + iArr[1];
                    int i13 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i12] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            e10++;
        }
        throw j.a();
    }

    private static char k(int i10) throws j {
        int i11 = 0;
        while (true) {
            int[] iArr = f28957d;
            if (i11 >= iArr.length) {
                throw j.a();
            } else if (iArr[i11] == i10) {
                return f28956c[i11];
            } else {
                i11++;
            }
        }
    }

    private static int l(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((((float) iArr[i13]) * 9.0f) / ((float) i10));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    public n b(int i10, a aVar, Map<e, ?> map) throws j, v8.d, f {
        int[] j10 = j(aVar);
        int e10 = aVar.e(j10[1]);
        int g10 = aVar.g();
        int[] iArr = this.f28960b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f28959a;
        sb2.setLength(0);
        while (true) {
            k.e(aVar, e10, iArr);
            int l10 = l(iArr);
            if (l10 >= 0) {
                char k10 = k(l10);
                sb2.append(k10);
                int i11 = e10;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int e11 = aVar.e(i11);
                if (k10 == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    if (e11 == g10 || !aVar.c(e11)) {
                        throw j.a();
                    } else if (sb2.length() >= 2) {
                        g(sb2);
                        sb2.setLength(sb2.length() - 2);
                        float f10 = (float) i10;
                        return new n(i(sb2), (byte[]) null, new p[]{new p(((float) (j10[1] + j10[0])) / 2.0f, f10), new p(((float) e10) + (((float) i13) / 2.0f), f10)}, v8.a.CODE_93);
                    } else {
                        throw j.a();
                    }
                } else {
                    e10 = e11;
                }
            } else {
                throw j.a();
            }
        }
    }
}
