package h9;

import v8.j;
import z8.a;

/* compiled from: EAN13Reader */
public final class e extends p {

    /* renamed from: j  reason: collision with root package name */
    static final int[] f28961j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i  reason: collision with root package name */
    private final int[] f28962i = new int[4];

    private static void q(StringBuilder sb2, int i10) throws j {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f28961j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public int k(a aVar, int[] iArr, StringBuilder sb2) throws j {
        int[] iArr2 = this.f28962i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g10 = aVar.g();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < g10; i12++) {
            int i13 = p.i(aVar, iArr2, i10, p.f28986h);
            sb2.append((char) ((i13 % 10) + 48));
            for (int i14 : iArr2) {
                i10 += i14;
            }
            if (i13 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        q(sb2, i11);
        int i15 = p.m(aVar, i10, true, p.f28983e)[1];
        for (int i16 = 0; i16 < 6 && i15 < g10; i16++) {
            sb2.append((char) (p.i(aVar, iArr2, i15, p.f28985g) + 48));
            for (int i17 : iArr2) {
                i15 += i17;
            }
        }
        return i15;
    }

    /* access modifiers changed from: package-private */
    public v8.a p() {
        return v8.a.EAN_13;
    }
}
