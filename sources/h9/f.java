package h9;

import v8.j;
import z8.a;

/* compiled from: EAN8Reader */
public final class f extends p {

    /* renamed from: i  reason: collision with root package name */
    private final int[] f28963i = new int[4];

    /* access modifiers changed from: protected */
    public int k(a aVar, int[] iArr, StringBuilder sb2) throws j {
        int[] iArr2 = this.f28963i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g10 = aVar.g();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < g10; i11++) {
            sb2.append((char) (p.i(aVar, iArr2, i10, p.f28985g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = p.m(aVar, i10, true, p.f28983e)[1];
        for (int i14 = 0; i14 < 4 && i13 < g10; i14++) {
            sb2.append((char) (p.i(aVar, iArr2, i13, p.f28985g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    /* access modifiers changed from: package-private */
    public v8.a p() {
        return v8.a.EAN_8;
    }
}
