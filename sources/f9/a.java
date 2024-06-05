package f9;

import g9.c;
import java.util.Map;
import v8.d;
import v8.e;
import v8.f;
import v8.j;
import v8.l;
import v8.n;
import v8.o;
import v8.p;
import z8.b;

/* compiled from: MaxiCodeReader */
public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f28892b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final c f28893a = new c();

    private static b b(b bVar) throws j {
        int[] f10 = bVar.f();
        if (f10 != null) {
            int i10 = f10[0];
            int i11 = f10[1];
            int i12 = f10[2];
            int i13 = f10[3];
            b bVar2 = new b(30, 33);
            for (int i14 = 0; i14 < 33; i14++) {
                int i15 = (((i14 * i13) + (i13 / 2)) / 33) + i11;
                for (int i16 = 0; i16 < 30; i16++) {
                    if (bVar.d(((((i16 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30) + i10, i15)) {
                        bVar2.m(i16, i14);
                    }
                }
            }
            return bVar2;
        }
        throw j.a();
    }

    public n a(v8.c cVar, Map<e, ?> map) throws j, d, f {
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            throw j.a();
        }
        z8.e b10 = this.f28893a.b(b(cVar.a()), map);
        n nVar = new n(b10.h(), b10.e(), f28892b, v8.a.MAXICODE);
        String b11 = b10.b();
        if (b11 != null) {
            nVar.h(o.ERROR_CORRECTION_LEVEL, b11);
        }
        return nVar;
    }

    public void reset() {
    }
}
