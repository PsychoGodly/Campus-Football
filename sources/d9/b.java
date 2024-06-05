package d9;

import d9.e;

/* compiled from: DataBlock */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f28674a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f28675b;

    private b(int i10, byte[] bArr) {
        this.f28674a = i10;
        this.f28675b = bArr;
    }

    static b[] b(byte[] bArr, e eVar) {
        e.c d10 = eVar.d();
        e.b[] a10 = d10.a();
        int i10 = 0;
        for (e.b a11 : a10) {
            i10 += a11.a();
        }
        b[] bVarArr = new b[i10];
        int i11 = 0;
        for (e.b bVar : a10) {
            int i12 = 0;
            while (i12 < bVar.a()) {
                int b10 = bVar.b();
                bVarArr[i11] = new b(b10, new byte[(d10.b() + b10)]);
                i12++;
                i11++;
            }
        }
        int length = bVarArr[0].f28675b.length - d10.b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                bVarArr[i16].f28675b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z10 = eVar.i() == 24;
        int i17 = z10 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            bVarArr[i18].f28675b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = bVarArr[0].f28675b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i11) {
                int i20 = z10 ? (i19 + 8) % i11 : i19;
                bVarArr[i20].f28675b[(!z10 || i20 <= 7) ? length : length - 1] = bArr[i14];
                i19++;
                i14++;
            }
            length++;
        }
        if (i14 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public byte[] a() {
        return this.f28675b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f28674a;
    }
}
