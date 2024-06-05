package p9;

import java.util.List;
import java.util.Map;
import q9.e;
import q9.i;
import v8.c;
import v8.d;
import v8.f;
import v8.j;
import v8.l;
import v8.n;
import v8.o;
import v8.p;
import z8.b;
import z8.g;

/* compiled from: QRCodeReader */
public class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f29659b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final e f29660a = new e();

    private static b b(b bVar) throws j {
        int[] j10 = bVar.j();
        int[] e10 = bVar.e();
        if (j10 == null || e10 == null) {
            throw j.a();
        }
        float c10 = c(j10, bVar);
        int i10 = j10[1];
        int i11 = e10[1];
        int i12 = j10[0];
        int i13 = e10[0];
        if (i12 >= i13 || i10 >= i11) {
            throw j.a();
        }
        int i14 = i11 - i10;
        if (i14 == i13 - i12 || (i13 = i12 + i14) < bVar.k()) {
            int round = Math.round(((float) ((i13 - i12) + 1)) / c10);
            int round2 = Math.round(((float) (i14 + 1)) / c10);
            if (round <= 0 || round2 <= 0) {
                throw j.a();
            } else if (round2 == round) {
                int i15 = (int) (c10 / 2.0f);
                int i16 = i10 + i15;
                int i17 = i12 + i15;
                int i18 = (((int) (((float) (round - 1)) * c10)) + i17) - i13;
                if (i18 > 0) {
                    if (i18 <= i15) {
                        i17 -= i18;
                    } else {
                        throw j.a();
                    }
                }
                int i19 = (((int) (((float) (round2 - 1)) * c10)) + i16) - i11;
                if (i19 > 0) {
                    if (i19 <= i15) {
                        i16 -= i19;
                    } else {
                        throw j.a();
                    }
                }
                b bVar2 = new b(round, round2);
                for (int i20 = 0; i20 < round2; i20++) {
                    int i21 = ((int) (((float) i20) * c10)) + i16;
                    for (int i22 = 0; i22 < round; i22++) {
                        if (bVar.d(((int) (((float) i22) * c10)) + i17, i21)) {
                            bVar2.m(i22, i20);
                        }
                    }
                }
                return bVar2;
            } else {
                throw j.a();
            }
        } else {
            throw j.a();
        }
    }

    private static float c(int[] iArr, b bVar) throws j {
        int g10 = bVar.g();
        int k10 = bVar.k();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < k10 && i11 < g10) {
            if (z10 != bVar.d(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 != k10 && i11 != g10) {
            return ((float) (i10 - iArr[0])) / 7.0f;
        }
        throw j.a();
    }

    public final n a(c cVar, Map<v8.e, ?> map) throws j, d, f {
        p[] pVarArr;
        z8.e eVar;
        if (map == null || !map.containsKey(v8.e.PURE_BARCODE)) {
            g e10 = new r9.c(cVar.a()).e(map);
            z8.e c10 = this.f29660a.c(e10.a(), map);
            pVarArr = e10.b();
            eVar = c10;
        } else {
            eVar = this.f29660a.c(b(cVar.a()), map);
            pVarArr = f29659b;
        }
        if (eVar.d() instanceof i) {
            ((i) eVar.d()).a(pVarArr);
        }
        n nVar = new n(eVar.h(), eVar.e(), pVarArr, v8.a.QR_CODE);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            nVar.h(o.BYTE_SEGMENTS, a10);
        }
        String b10 = eVar.b();
        if (b10 != null) {
            nVar.h(o.ERROR_CORRECTION_LEVEL, b10);
        }
        if (eVar.i()) {
            nVar.h(o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.g()));
            nVar.h(o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.f()));
        }
        return nVar;
    }

    public void reset() {
    }
}
