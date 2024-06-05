package q9;

import b9.a;
import b9.c;
import java.util.Map;
import v8.d;
import v8.f;
import z8.b;

/* compiled from: Decoder */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final c f29725a = new c(a.f24278l);

    private void a(byte[] bArr, int i10) throws d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f29725a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (b9.d unused) {
            throw d.a();
        }
    }

    private z8.e b(a aVar, Map<v8.e, ?> map) throws f, d {
        j e10 = aVar.e();
        f d10 = aVar.d().d();
        b[] b10 = b.b(aVar.c(), e10, d10);
        int i10 = 0;
        for (b c10 : b10) {
            i10 += c10.c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (b bVar : b10) {
            byte[] a10 = bVar.a();
            int c11 = bVar.c();
            a(a10, c11);
            int i12 = 0;
            while (i12 < c11) {
                bArr[i11] = a10[i12];
                i12++;
                i11++;
            }
        }
        return d.a(bArr, e10, d10, map);
    }

    public z8.e c(b bVar, Map<v8.e, ?> map) throws f, d {
        d e10;
        a aVar = new a(bVar);
        f fVar = null;
        try {
            return b(aVar, map);
        } catch (f e11) {
            f fVar2 = e11;
            e10 = null;
            fVar = fVar2;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                z8.e b10 = b(aVar, map);
                b10.m(new i(true));
                return b10;
            } catch (d | f e12) {
                if (fVar != null) {
                    throw fVar;
                } else if (e10 != null) {
                    throw e10;
                } else {
                    throw e12;
                }
            }
        } catch (d e13) {
            e10 = e13;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            z8.e b102 = b(aVar, map);
            b102.m(new i(true));
            return b102;
        }
    }
}
