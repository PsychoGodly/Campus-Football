package s;

import java.util.ArrayList;
import s.d;
import s.i;

/* compiled from: ArrayRow */
public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    i f22197a = null;

    /* renamed from: b  reason: collision with root package name */
    float f22198b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f22199c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<i> f22200d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public a f22201e;

    /* renamed from: f  reason: collision with root package name */
    boolean f22202f = false;

    /* compiled from: ArrayRow */
    public interface a {
        void a(i iVar, float f10);

        int b();

        float c(b bVar, boolean z10);

        void clear();

        float d(i iVar, boolean z10);

        i e(int i10);

        float f(i iVar);

        void g();

        float h(int i10);

        boolean i(i iVar);

        void j(float f10);

        void k(i iVar, float f10, boolean z10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f22259n <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int b10 = this.f22201e.b();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < b10; i10++) {
            float h10 = this.f22201e.h(i10);
            if (h10 < 0.0f) {
                i e10 = this.f22201e.e(i10);
                if ((zArr == null || !zArr[e10.f22249c]) && e10 != iVar && (((aVar = e10.f22256k) == i.a.SLACK || aVar == i.a.ERROR) && h10 < f10)) {
                    f10 = h10;
                    iVar2 = e10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f22253h) {
            this.f22198b += iVar.f22252g * this.f22201e.f(iVar);
            this.f22201e.d(iVar, z10);
            if (z10) {
                iVar.e(this);
            }
            if (d.f22209t && this.f22201e.b() == 0) {
                this.f22202f = true;
                dVar.f22216a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f22198b += bVar.f22198b * this.f22201e.c(bVar, z10);
        if (z10) {
            bVar.f22197a.e(this);
        }
        if (d.f22209t && this.f22197a != null && this.f22201e.b() == 0) {
            this.f22202f = true;
            dVar.f22216a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f22260o) {
            float f10 = this.f22201e.f(iVar);
            this.f22198b += iVar.f22262q * f10;
            this.f22201e.d(iVar, z10);
            if (z10) {
                iVar.e(this);
            }
            this.f22201e.k(dVar.f22229n.f22206d[iVar.f22261p], f10, z10);
            if (d.f22209t && this.f22201e.b() == 0) {
                this.f22202f = true;
                dVar.f22216a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f22222g.length != 0) {
            boolean z10 = false;
            while (!z10) {
                int b10 = this.f22201e.b();
                for (int i10 = 0; i10 < b10; i10++) {
                    i e10 = this.f22201e.e(i10);
                    if (e10.f22250d != -1 || e10.f22253h || e10.f22260o) {
                        this.f22200d.add(e10);
                    }
                }
                int size = this.f22200d.size();
                if (size > 0) {
                    for (int i11 = 0; i11 < size; i11++) {
                        i iVar = this.f22200d.get(i11);
                        if (iVar.f22253h) {
                            A(dVar, iVar, true);
                        } else if (iVar.f22260o) {
                            C(dVar, iVar, true);
                        } else {
                            B(dVar, dVar.f22222g[iVar.f22250d], true);
                        }
                    }
                    this.f22200d.clear();
                } else {
                    z10 = true;
                }
            }
            if (d.f22209t && this.f22197a != null && this.f22201e.b() == 0) {
                this.f22202f = true;
                dVar.f22216a = true;
            }
        }
    }

    public void a(i iVar) {
        int i10 = iVar.f22251f;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f22201e.a(iVar, f10);
    }

    public i b(d dVar, boolean[] zArr) {
        return w(zArr, (i) null);
    }

    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f22197a = null;
            this.f22201e.clear();
            for (int i10 = 0; i10 < bVar.f22201e.b(); i10++) {
                this.f22201e.k(bVar.f22201e.e(i10), bVar.f22201e.h(i10), true);
            }
        }
    }

    public void clear() {
        this.f22201e.clear();
        this.f22197a = null;
        this.f22198b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f22201e.a(dVar.o(i10, "ep"), 1.0f);
        this.f22201e.a(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(i iVar, int i10) {
        this.f22201e.a(iVar, (float) i10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f22201e.b() == 0) {
            this.f22202f = true;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public i g(d dVar) {
        boolean u10;
        boolean u11;
        int b10 = this.f22201e.b();
        i iVar = null;
        i iVar2 = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < b10; i10++) {
            float h10 = this.f22201e.h(i10);
            i e10 = this.f22201e.e(i10);
            if (e10.f22256k == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(e10, dVar);
                } else if (f10 > h10) {
                    u11 = u(e10, dVar);
                } else if (!z10 && u(e10, dVar)) {
                    f10 = h10;
                    iVar = e10;
                    z10 = true;
                }
                z10 = u11;
                f10 = h10;
                iVar = e10;
            } else if (iVar == null && h10 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(e10, dVar);
                } else if (f11 > h10) {
                    u10 = u(e10, dVar);
                } else if (!z11 && u(e10, dVar)) {
                    f11 = h10;
                    iVar2 = e10;
                    z11 = true;
                }
                z11 = u10;
                f11 = h10;
                iVar2 = e10;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public i getKey() {
        return this.f22197a;
    }

    /* access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar4, 1.0f);
            this.f22201e.a(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
            this.f22201e.a(iVar3, -1.0f);
            this.f22201e.a(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f22198b = (float) ((-i10) + i11);
            }
        } else if (f10 <= 0.0f) {
            this.f22201e.a(iVar, -1.0f);
            this.f22201e.a(iVar2, 1.0f);
            this.f22198b = (float) i10;
        } else if (f10 >= 1.0f) {
            this.f22201e.a(iVar4, -1.0f);
            this.f22201e.a(iVar3, 1.0f);
            this.f22198b = (float) (-i11);
        } else {
            float f11 = 1.0f - f10;
            this.f22201e.a(iVar, f11 * 1.0f);
            this.f22201e.a(iVar2, f11 * -1.0f);
            this.f22201e.a(iVar3, -1.0f * f10);
            this.f22201e.a(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f22198b = (((float) (-i10)) * f11) + (((float) i11) * f10);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(i iVar, int i10) {
        this.f22197a = iVar;
        float f10 = (float) i10;
        iVar.f22252g = f10;
        this.f22198b = f10;
        this.f22202f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f22197a == null && this.f22198b == 0.0f && this.f22201e.b() == 0;
    }

    /* access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f10) {
        this.f22201e.a(iVar, -1.0f);
        this.f22201e.a(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f22201e.a(iVar, -1.0f);
        this.f22201e.a(iVar2, 1.0f);
        this.f22201e.a(iVar3, f10);
        this.f22201e.a(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f22198b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
            this.f22201e.a(iVar4, 1.0f);
            this.f22201e.a(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f22201e.a(iVar3, 1.0f);
            this.f22201e.a(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
            this.f22201e.a(iVar4, f13);
            this.f22201e.a(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f22198b = (float) (i10 * -1);
            this.f22201e.a(iVar, 1.0f);
        } else {
            this.f22198b = (float) i10;
            this.f22201e.a(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f22198b = (float) i10;
        }
        if (!z10) {
            this.f22201e.a(iVar, -1.0f);
            this.f22201e.a(iVar2, 1.0f);
        } else {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f22198b = (float) i10;
        }
        if (!z10) {
            this.f22201e.a(iVar, -1.0f);
            this.f22201e.a(iVar2, 1.0f);
            this.f22201e.a(iVar3, 1.0f);
        } else {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
            this.f22201e.a(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f22198b = (float) i10;
        }
        if (!z10) {
            this.f22201e.a(iVar, -1.0f);
            this.f22201e.a(iVar2, 1.0f);
            this.f22201e.a(iVar3, -1.0f);
        } else {
            this.f22201e.a(iVar, 1.0f);
            this.f22201e.a(iVar2, -1.0f);
            this.f22201e.a(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f22201e.a(iVar3, 0.5f);
        this.f22201e.a(iVar4, 0.5f);
        this.f22201e.a(iVar, -0.5f);
        this.f22201e.a(iVar2, -0.5f);
        this.f22198b = -f10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f22198b;
        if (f10 < 0.0f) {
            this.f22198b = f10 * -1.0f;
            this.f22201e.g();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f22197a;
        return iVar != null && (iVar.f22256k == i.a.UNRESTRICTED || this.f22198b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f22201e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f22197a;
        if (iVar2 != null) {
            this.f22201e.a(iVar2, -1.0f);
            this.f22197a.f22250d = -1;
            this.f22197a = null;
        }
        float d10 = this.f22201e.d(iVar, true) * -1.0f;
        this.f22197a = iVar;
        if (d10 != 1.0f) {
            this.f22198b /= d10;
            this.f22201e.j(d10);
        }
    }

    public void y() {
        this.f22197a = null;
        this.f22201e.clear();
        this.f22198b = 0.0f;
        this.f22202f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            s.i r0 = r10.f22197a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            s.i r1 = r10.f22197a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f22198b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f22198b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            s.b$a r5 = r10.f22201e
            int r5 = r5.b()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ec
            s.b$a r6 = r10.f22201e
            s.i r6 = r6.e(r2)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            s.b$a r7 = r10.f22201e
            float r7 = r7.h(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0093:
            if (r8 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r9
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = 1
        L_0x00e8:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f22201e = new a(this, cVar);
    }
}
