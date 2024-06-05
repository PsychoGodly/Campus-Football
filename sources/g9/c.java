package g9;

import b9.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Map;
import v8.d;
import v8.f;
import z8.b;
import z8.e;

/* compiled from: Decoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b9.c f28936a = new b9.c(a.f24281o);

    private void a(byte[] bArr, int i10, int i11, int i12, int i13) throws d {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[(i14 / i15)];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f28936a.a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (b9.d unused) {
            throw d.a();
        }
    }

    public e b(b bVar, Map<v8.e, ?> map) throws f, d {
        byte[] bArr;
        byte[] a10 = new a(bVar).a();
        a(a10, 0, 10, 10, 0);
        byte b10 = a10[0] & Ascii.SI;
        if (b10 == 2 || b10 == 3 || b10 == 4) {
            byte[] bArr2 = a10;
            a(bArr2, 20, 84, 40, 1);
            a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b10 == 5) {
            byte[] bArr3 = a10;
            a(bArr3, 20, 68, 56, 1);
            a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw f.a();
        }
        System.arraycopy(a10, 0, bArr, 0, 10);
        System.arraycopy(a10, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, b10);
    }
}
