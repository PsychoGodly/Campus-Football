package c9;

import d9.d;
import java.util.List;
import java.util.Map;
import v8.c;
import v8.e;
import v8.f;
import v8.j;
import v8.l;
import v8.n;
import v8.o;
import v8.p;
import z8.b;
import z8.g;

/* compiled from: DataMatrixReader */
public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f24310b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final d f24311a = new d();

    private static b b(b bVar) throws j {
        int[] j10 = bVar.j();
        int[] e10 = bVar.e();
        if (j10 == null || e10 == null) {
            throw j.a();
        }
        int c10 = c(j10, bVar);
        int i10 = j10[1];
        int i11 = e10[1];
        int i12 = j10[0];
        int i13 = ((e10[0] - i12) + 1) / c10;
        int i14 = ((i11 - i10) + 1) / c10;
        if (i13 <= 0 || i14 <= 0) {
            throw j.a();
        }
        int i15 = c10 / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        b bVar2 = new b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * c10) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (bVar.d((i20 * c10) + i17, i19)) {
                    bVar2.m(i20, i18);
                }
            }
        }
        return bVar2;
    }

    private static int c(int[] iArr, b bVar) throws j {
        int k10 = bVar.k();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < k10 && bVar.d(i10, i11)) {
            i10++;
        }
        if (i10 != k10) {
            int i12 = i10 - iArr[0];
            if (i12 != 0) {
                return i12;
            }
            throw j.a();
        }
        throw j.a();
    }

    public n a(c cVar, Map<e, ?> map) throws j, v8.d, f {
        p[] pVarArr;
        z8.e eVar;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g c10 = new e9.a(cVar.a()).c();
            z8.e b10 = this.f24311a.b(c10.a());
            pVarArr = c10.b();
            eVar = b10;
        } else {
            eVar = this.f24311a.b(b(cVar.a()));
            pVarArr = f24310b;
        }
        n nVar = new n(eVar.h(), eVar.e(), pVarArr, v8.a.DATA_MATRIX);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            nVar.h(o.BYTE_SEGMENTS, a10);
        }
        String b11 = eVar.b();
        if (b11 != null) {
            nVar.h(o.ERROR_CORRECTION_LEVEL, b11);
        }
        return nVar;
    }

    public void reset() {
    }
}
