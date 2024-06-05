package h9;

import java.util.EnumMap;
import java.util.Map;
import v8.j;
import v8.n;
import v8.o;
import v8.p;
import z8.a;

/* compiled from: UPCEANExtension2Support */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f28974a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f28975b = new StringBuilder();

    m() {
    }

    private int a(a aVar, int[] iArr, StringBuilder sb2) throws j {
        int[] iArr2 = this.f28974a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g10 = aVar.g();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < g10; i12++) {
            int i13 = p.i(aVar, iArr2, i10, p.f28986h);
            sb2.append((char) ((i13 % 10) + 48));
            for (int i14 : iArr2) {
                i10 += i14;
            }
            if (i13 >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = aVar.f(aVar.e(i10));
            }
        }
        if (sb2.length() != 2) {
            throw j.a();
        } else if (Integer.parseInt(sb2.toString()) % 4 == i11) {
            return i10;
        } else {
            throw j.a();
        }
    }

    private static Map<o, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(o.class);
        enumMap.put(o.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    public n b(int i10, a aVar, int[] iArr) throws j {
        StringBuilder sb2 = this.f28975b;
        sb2.setLength(0);
        int a10 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<o, Object> c10 = c(sb3);
        float f10 = (float) i10;
        n nVar = new n(sb3, (byte[]) null, new p[]{new p(((float) (iArr[0] + iArr[1])) / 2.0f, f10), new p((float) a10, f10)}, v8.a.UPC_EAN_EXTENSION);
        if (c10 != null) {
            nVar.g(c10);
        }
        return nVar;
    }
}
