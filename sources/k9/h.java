package k9;

import z8.a;

/* compiled from: AI01decoder */
abstract class h extends j {
    h(a aVar) {
        super(aVar);
    }

    private static void e(StringBuilder sb2, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int charAt = sb2.charAt(i13 + i10) - '0';
            if ((i13 & 1) == 0) {
                charAt *= 3;
            }
            i12 += charAt;
        }
        int i14 = 10 - (i12 % 10);
        if (i14 != 10) {
            i11 = i14;
        }
        sb2.append(i11);
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb2, int i10) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        g(sb2, i10, length);
    }

    /* access modifiers changed from: package-private */
    public final void g(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int f10 = b().f((i12 * 10) + i10, 10);
            if (f10 / 100 == 0) {
                sb2.append('0');
            }
            if (f10 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f10);
        }
        e(sb2, i11);
    }
}
