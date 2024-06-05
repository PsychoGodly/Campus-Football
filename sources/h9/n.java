package h9;

import com.applovin.mediation.MaxReward;
import java.util.EnumMap;
import java.util.Map;
import v8.j;
import v8.o;
import v8.p;
import z8.a;

/* compiled from: UPCEANExtension5Support */
final class n {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f28976c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f28977a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f28978b = new StringBuilder();

    n() {
    }

    private int a(a aVar, int[] iArr, StringBuilder sb2) throws j {
        int[] iArr2 = this.f28977a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g10 = aVar.g();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && i10 < g10; i12++) {
            int i13 = p.i(aVar, iArr2, i10, p.f28986h);
            sb2.append((char) ((i13 % 10) + 48));
            for (int i14 : iArr2) {
                i10 += i14;
            }
            if (i13 >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                i10 = aVar.f(aVar.e(i10));
            }
        }
        if (sb2.length() == 5) {
            if (d(sb2.toString()) == c(i11)) {
                return i10;
            }
            throw j.a();
        }
        throw j.a();
    }

    private static int c(int i10) throws j {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f28976c[i11]) {
                return i11;
            }
        }
        throw j.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    private static String e(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = MaxReward.DEFAULT_LABEL;
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i10 = parseInt % 100;
        if (i10 < 10) {
            str2 = "0" + i10;
        } else {
            str2 = String.valueOf(i10);
        }
        return str3 + valueOf + '.' + str2;
    }

    private static Map<o, Object> f(String str) {
        String e10;
        if (str.length() != 5 || (e10 = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(o.class);
        enumMap.put(o.SUGGESTED_PRICE, e10);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    public v8.n b(int i10, a aVar, int[] iArr) throws j {
        StringBuilder sb2 = this.f28978b;
        sb2.setLength(0);
        int a10 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<o, Object> f10 = f(sb3);
        float f11 = (float) i10;
        v8.n nVar = new v8.n(sb3, (byte[]) null, new p[]{new p(((float) (iArr[0] + iArr[1])) / 2.0f, f11), new p((float) a10, f11)}, v8.a.UPC_EAN_EXTENSION);
        if (f10 != null) {
            nVar.g(f10);
        }
        return nVar;
    }
}
