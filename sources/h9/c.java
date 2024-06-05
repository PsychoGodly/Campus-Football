package h9;

import com.google.android.gms.common.api.a;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Arrays;
import java.util.Map;
import v8.d;
import v8.e;
import v8.f;
import v8.j;
import v8.n;
import v8.p;
import z8.a;

/* compiled from: Code39Reader */
public final class c extends k {

    /* renamed from: e  reason: collision with root package name */
    static final int[] f28950e;

    /* renamed from: f  reason: collision with root package name */
    static final int f28951f;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28952a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28953b;

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f28954c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f28955d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, CommonGatewayClient.CODE_400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f28950e = iArr;
        f28951f = iArr[39];
    }

    public c() {
        this(false);
    }

    private static String g(CharSequence charSequence) throws f {
        char c10;
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i11++;
                char charAt2 = charSequence.charAt(i11);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                c10 = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i10 = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                c10 = ':';
                            } else {
                                throw f.a();
                            }
                            sb2.append(c10);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw f.a();
                        } else {
                            i10 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i10 = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw f.a();
                    } else {
                        i10 = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw f.a();
                } else {
                    i10 = charAt2 - '@';
                }
                c10 = (char) i10;
                sb2.append(c10);
            } else {
                sb2.append(charAt);
            }
            i11++;
        }
        return sb2.toString();
    }

    private static int[] h(a aVar, int[] iArr) throws j {
        int g10 = aVar.g();
        int e10 = aVar.e(0);
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
                } else if (j(iArr) != f28951f || !aVar.i(Math.max(0, i10 - ((e10 - i10) / 2)), i10, false)) {
                    i10 += iArr[0] + iArr[1];
                    int i13 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i12] = 0;
                    i11--;
                } else {
                    return new int[]{i10, e10};
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            e10++;
        }
        throw j.a();
    }

    private static char i(int i10) throws j {
        int i11 = 0;
        while (true) {
            int[] iArr = f28950e;
            if (i11 >= iArr.length) {
                throw j.a();
            } else if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i11);
            } else {
                i11++;
            }
        }
    }

    private static int j(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = a.e.API_PRIORITY_OTHER;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            } else if (i13 <= 3) {
                return -1;
            } else {
                i10 = i11;
            }
        }
    }

    public n b(int i10, z8.a aVar, Map<e, ?> map) throws j, d, f {
        String str;
        int[] iArr = this.f28955d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f28954c;
        sb2.setLength(0);
        int[] h10 = h(aVar, iArr);
        int e10 = aVar.e(h10[1]);
        int g10 = aVar.g();
        while (true) {
            k.e(aVar, e10, iArr);
            int j10 = j(iArr);
            if (j10 >= 0) {
                char i11 = i(j10);
                sb2.append(i11);
                int i12 = e10;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int e11 = aVar.e(i12);
                if (i11 == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i14 = 0;
                    for (int i15 : iArr) {
                        i14 += i15;
                    }
                    int i16 = (e11 - e10) - i14;
                    if (e11 == g10 || (i16 << 1) >= i14) {
                        if (this.f28952a) {
                            int length = sb2.length() - 1;
                            int i17 = 0;
                            for (int i18 = 0; i18 < length; i18++) {
                                i17 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f28954c.charAt(i18));
                            }
                            if (sb2.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i17 % 43)) {
                                sb2.setLength(length);
                            } else {
                                throw d.a();
                            }
                        }
                        if (sb2.length() != 0) {
                            if (this.f28953b) {
                                str = g(sb2);
                            } else {
                                str = sb2.toString();
                            }
                            float f10 = (float) i10;
                            return new n(str, (byte[]) null, new p[]{new p(((float) (h10[1] + h10[0])) / 2.0f, f10), new p(((float) e10) + (((float) i14) / 2.0f), f10)}, v8.a.CODE_39);
                        }
                        throw j.a();
                    }
                    throw j.a();
                }
                e10 = e11;
            } else {
                throw j.a();
            }
        }
    }

    public c(boolean z10) {
        this(z10, false);
    }

    public c(boolean z10, boolean z11) {
        this.f28952a = z10;
        this.f28953b = z11;
        this.f28954c = new StringBuilder(20);
        this.f28955d = new int[9];
    }
}
