package a9;

import v8.j;
import v8.p;

/* compiled from: WhiteRectangleDetector */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final z8.b f24253a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24254b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24255c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24256d;

    /* renamed from: e  reason: collision with root package name */
    private final int f24257e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24258f;

    /* renamed from: g  reason: collision with root package name */
    private final int f24259g;

    public b(z8.b bVar) throws j {
        this(bVar, 10, bVar.k() / 2, bVar.g() / 2);
    }

    private p[] a(p pVar, p pVar2, p pVar3, p pVar4) {
        float c10 = pVar.c();
        float d10 = pVar.d();
        float c11 = pVar2.c();
        float d11 = pVar2.d();
        float c12 = pVar3.c();
        float d12 = pVar3.d();
        float c13 = pVar4.c();
        float d13 = pVar4.d();
        if (c10 < ((float) this.f24255c) / 2.0f) {
            return new p[]{new p(c13 - 1.0f, d13 + 1.0f), new p(c11 + 1.0f, d11 + 1.0f), new p(c12 - 1.0f, d12 - 1.0f), new p(c10 + 1.0f, d10 - 1.0f)};
        }
        return new p[]{new p(c13 + 1.0f, d13 + 1.0f), new p(c11 + 1.0f, d11 - 1.0f), new p(c12 - 1.0f, d12 + 1.0f), new p(c10 - 1.0f, d10 - 1.0f)};
    }

    private boolean b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f24253a.d(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f24253a.d(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private p d(float f10, float f11, float f12, float f13) {
        int c10 = a.c(a.a(f10, f11, f12, f13));
        float f14 = (float) c10;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < c10; i10++) {
            float f17 = (float) i10;
            int c11 = a.c((f17 * f15) + f10);
            int c12 = a.c((f17 * f16) + f11);
            if (this.f24253a.d(c11, c12)) {
                return new p((float) c11, (float) c12);
            }
        }
        return null;
    }

    public p[] c() throws j {
        int i10 = this.f24256d;
        int i11 = this.f24257e;
        int i12 = this.f24259g;
        int i13 = this.f24258f;
        boolean z10 = false;
        int i14 = 1;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (true) {
            if (!z11) {
                break;
            }
            boolean z17 = true;
            boolean z18 = false;
            while (true) {
                if ((z17 || !z12) && i11 < this.f24255c) {
                    z17 = b(i12, i13, i11, false);
                    if (z17) {
                        i11++;
                        z12 = true;
                        z18 = true;
                    } else if (!z12) {
                        i11++;
                    }
                }
            }
            if (i11 >= this.f24255c) {
                break;
            }
            boolean z19 = true;
            while (true) {
                if ((z19 || !z13) && i13 < this.f24254b) {
                    z19 = b(i10, i11, i13, true);
                    if (z19) {
                        i13++;
                        z13 = true;
                        z18 = true;
                    } else if (!z13) {
                        i13++;
                    }
                }
            }
            if (i13 >= this.f24254b) {
                break;
            }
            boolean z20 = true;
            while (true) {
                if ((z20 || !z14) && i10 >= 0) {
                    z20 = b(i12, i13, i10, false);
                    if (z20) {
                        i10--;
                        z14 = true;
                        z18 = true;
                    } else if (!z14) {
                        i10--;
                    }
                }
            }
            if (i10 < 0) {
                break;
            }
            z11 = z18;
            boolean z21 = true;
            while (true) {
                if ((z21 || !z16) && i12 >= 0) {
                    z21 = b(i10, i11, i12, true);
                    if (z21) {
                        i12--;
                        z11 = true;
                        z16 = true;
                    } else if (!z16) {
                        i12--;
                    }
                }
            }
            if (i12 < 0) {
                break;
            } else if (z11) {
                z15 = true;
            }
        }
        z10 = true;
        if (z10 || !z15) {
            throw j.a();
        }
        int i15 = i11 - i10;
        p pVar = null;
        p pVar2 = null;
        int i16 = 1;
        while (pVar2 == null && i16 < i15) {
            pVar2 = d((float) i10, (float) (i13 - i16), (float) (i10 + i16), (float) i13);
            i16++;
        }
        if (pVar2 != null) {
            p pVar3 = null;
            int i17 = 1;
            while (pVar3 == null && i17 < i15) {
                pVar3 = d((float) i10, (float) (i12 + i17), (float) (i10 + i17), (float) i12);
                i17++;
            }
            if (pVar3 != null) {
                p pVar4 = null;
                int i18 = 1;
                while (pVar4 == null && i18 < i15) {
                    pVar4 = d((float) i11, (float) (i12 + i18), (float) (i11 - i18), (float) i12);
                    i18++;
                }
                if (pVar4 != null) {
                    while (pVar == null && i14 < i15) {
                        pVar = d((float) i11, (float) (i13 - i14), (float) (i11 - i14), (float) i13);
                        i14++;
                    }
                    if (pVar != null) {
                        return a(pVar, pVar2, pVar4, pVar3);
                    }
                    throw j.a();
                }
                throw j.a();
            }
            throw j.a();
        }
        throw j.a();
    }

    public b(z8.b bVar, int i10, int i11, int i12) throws j {
        this.f24253a = bVar;
        int g10 = bVar.g();
        this.f24254b = g10;
        int k10 = bVar.k();
        this.f24255c = k10;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f24256d = i14;
        int i15 = i11 + i13;
        this.f24257e = i15;
        int i16 = i12 - i13;
        this.f24259g = i16;
        int i17 = i12 + i13;
        this.f24258f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= g10 || i15 >= k10) {
            throw j.a();
        }
    }
}
