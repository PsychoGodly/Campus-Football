package d9;

import b9.a;
import b9.c;
import v8.f;
import z8.b;
import z8.e;

/* compiled from: Decoder */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f28690a = new c(a.f24279m);

    private void a(byte[] bArr, int i10) throws v8.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f28690a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (b9.d unused) {
            throw v8.d.a();
        }
    }

    public e b(b bVar) throws f, v8.d {
        a aVar = new a(bVar);
        b[] b10 = b.b(aVar.c(), aVar.b());
        int i10 = 0;
        for (b c10 : b10) {
            i10 += c10.c();
        }
        byte[] bArr = new byte[i10];
        int length = b10.length;
        for (int i11 = 0; i11 < length; i11++) {
            b bVar2 = b10[i11];
            byte[] a10 = bVar2.a();
            int c11 = bVar2.c();
            a(a10, c11);
            for (int i12 = 0; i12 < c11; i12++) {
                bArr[(i12 * length) + i11] = a10[i12];
            }
        }
        return c.a(bArr);
    }
}
