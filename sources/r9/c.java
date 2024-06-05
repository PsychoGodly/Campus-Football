package r9;

import a9.a;
import java.util.Map;
import v8.e;
import v8.f;
import v8.j;
import v8.p;
import v8.q;
import z8.b;
import z8.g;
import z8.i;
import z8.k;

/* compiled from: Detector */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f30101a;

    /* renamed from: b  reason: collision with root package name */
    private q f30102b;

    public c(b bVar) {
        this.f30101a = bVar;
    }

    private float b(p pVar, p pVar2) {
        float j10 = j((int) pVar.c(), (int) pVar.d(), (int) pVar2.c(), (int) pVar2.d());
        float j11 = j((int) pVar2.c(), (int) pVar2.d(), (int) pVar.c(), (int) pVar.d());
        if (Float.isNaN(j10)) {
            return j11 / 7.0f;
        }
        return Float.isNaN(j11) ? j10 / 7.0f : (j10 + j11) / 14.0f;
    }

    private static int c(p pVar, p pVar2, p pVar3, float f10) throws j {
        int c10 = ((a.c(p.b(pVar, pVar2) / f10) + a.c(p.b(pVar, pVar3) / f10)) / 2) + 7;
        int i10 = c10 & 3;
        if (i10 == 0) {
            return c10 + 1;
        }
        if (i10 == 2) {
            return c10 - 1;
        }
        if (i10 != 3) {
            return c10;
        }
        throw j.a();
    }

    private static k d(p pVar, p pVar2, p pVar3, p pVar4, int i10) {
        float f10;
        float f11;
        float f12;
        float f13 = ((float) i10) - 3.5f;
        if (pVar4 != null) {
            f11 = pVar4.c();
            f10 = pVar4.d();
            f12 = f13 - 3.0f;
        } else {
            f11 = (pVar2.c() - pVar.c()) + pVar3.c();
            f10 = (pVar2.d() - pVar.d()) + pVar3.d();
            f12 = f13;
        }
        return k.b(3.5f, 3.5f, f13, 3.5f, f12, f12, 3.5f, f13, pVar.c(), pVar.d(), pVar2.c(), pVar2.d(), f11, f10, pVar3.c(), pVar3.d());
    }

    private static b h(b bVar, k kVar, int i10) throws j {
        return i.b().d(bVar, i10, i10, kVar);
    }

    private float i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        c cVar;
        boolean z11;
        int i19 = 1;
        boolean z12 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z12) {
            i16 = i10;
            i17 = i11;
            i14 = i12;
            i15 = i13;
        } else {
            i17 = i10;
            i16 = i11;
            i15 = i12;
            i14 = i13;
        }
        int abs = Math.abs(i15 - i17);
        int abs2 = Math.abs(i14 - i16);
        int i20 = (-abs) / 2;
        int i21 = -1;
        int i22 = i17 < i15 ? 1 : -1;
        if (i16 < i14) {
            i21 = 1;
        }
        int i23 = i15 + i22;
        int i24 = i17;
        int i25 = i16;
        int i26 = 0;
        while (true) {
            if (i24 == i23) {
                i18 = i23;
                break;
            }
            int i27 = z12 ? i25 : i24;
            int i28 = z12 ? i24 : i25;
            if (i26 == i19) {
                cVar = this;
                z10 = z12;
                i18 = i23;
                z11 = true;
            } else {
                cVar = this;
                z10 = z12;
                i18 = i23;
                z11 = false;
            }
            if (z11 == cVar.f30101a.d(i27, i28)) {
                if (i26 == 2) {
                    return a.b(i24, i25, i17, i16);
                }
                i26++;
            }
            i20 += abs2;
            if (i20 > 0) {
                if (i25 == i14) {
                    break;
                }
                i25 += i21;
                i20 -= abs;
            }
            i24 += i22;
            i23 = i18;
            z12 = z10;
            i19 = 1;
        }
        if (i26 == 2) {
            return a.b(i18, i14, i17, i16);
        }
        return Float.NaN;
    }

    private float j(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float i14 = i(i10, i11, i12, i13);
        int i15 = i10 - (i12 - i10);
        int i16 = 0;
        if (i15 < 0) {
            f10 = ((float) i10) / ((float) (i10 - i15));
            i15 = 0;
        } else if (i15 >= this.f30101a.k()) {
            f10 = ((float) ((this.f30101a.k() - 1) - i10)) / ((float) (i15 - i10));
            i15 = this.f30101a.k() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = (float) i11;
        int i17 = (int) (f12 - (((float) (i13 - i11)) * f10));
        if (i17 < 0) {
            f11 = f12 / ((float) (i11 - i17));
        } else if (i17 >= this.f30101a.g()) {
            f11 = ((float) ((this.f30101a.g() - 1) - i11)) / ((float) (i17 - i11));
            i16 = this.f30101a.g() - 1;
        } else {
            i16 = i17;
            f11 = 1.0f;
        }
        return (i14 + i(i10, i11, (int) (((float) i10) + (((float) (i15 - i10)) * f11)), i16)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    public final float a(p pVar, p pVar2, p pVar3) {
        return (b(pVar, pVar2) + b(pVar, pVar3)) / 2.0f;
    }

    public final g e(Map<e, ?> map) throws j, f {
        q qVar;
        if (map == null) {
            qVar = null;
        } else {
            qVar = (q) map.get(e.NEED_RESULT_POINT_CALLBACK);
        }
        this.f30102b = qVar;
        return g(new e(this.f30101a, qVar).e(map));
    }

    /* access modifiers changed from: protected */
    public final a f(float f10, int i10, int i11, float f11) throws j {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f30101a.k() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (((float) min) >= f12) {
            int max2 = Math.max(0, i11 - i12);
            int min2 = Math.min(this.f30101a.g() - 1, i11 + i12) - max2;
            if (((float) min2) >= f12) {
                return new b(this.f30101a, max, max2, min, min2, f10, this.f30102b).c();
            }
            throw j.a();
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public final g g(f fVar) throws j, f {
        p[] pVarArr;
        d b10 = fVar.b();
        d c10 = fVar.c();
        d a10 = fVar.a();
        float a11 = a(b10, c10, a10);
        if (a11 >= 1.0f) {
            int c11 = c(b10, c10, a10, a11);
            q9.j g10 = q9.j.g(c11);
            int e10 = g10.e() - 7;
            a aVar = null;
            if (g10.d().length > 0) {
                float c12 = (c10.c() - b10.c()) + a10.c();
                float d10 = (c10.d() - b10.d()) + a10.d();
                float f10 = 1.0f - (3.0f / ((float) e10));
                int c13 = (int) (b10.c() + ((c12 - b10.c()) * f10));
                int d11 = (int) (b10.d() + (f10 * (d10 - b10.d())));
                int i10 = 4;
                while (true) {
                    if (i10 > 16) {
                        break;
                    }
                    try {
                        aVar = f(a11, c13, d11, (float) i10);
                        break;
                    } catch (j unused) {
                        i10 <<= 1;
                    }
                }
            }
            b h10 = h(this.f30101a, d(b10, c10, a10, aVar, c11), c11);
            if (aVar == null) {
                pVarArr = new p[]{a10, b10, c10};
            } else {
                pVarArr = new p[]{a10, b10, c10, aVar};
            }
            return new g(h10, pVarArr);
        }
        throw j.a();
    }
}
