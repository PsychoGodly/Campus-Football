package w;

import v.d;
import v.e;
import v.h;
import w.f;
import w.p;

/* compiled from: VerticalWidgetRun */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f23467k;

    /* renamed from: l  reason: collision with root package name */
    g f23468l = null;

    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w.p$b[] r0 = w.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23469a = r0
                w.p$b r1 = w.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23469a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.p$b r1 = w.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23469a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.p$b r1 = w.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f23467k = fVar;
        this.f23492h.f23436e = f.a.TOP;
        this.f23493i.f23436e = f.a.BOTTOM;
        fVar.f23436e = f.a.BASELINE;
        this.f23490f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        float f11;
        float f12;
        int i11 = a.f23469a[this.f23494j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            e eVar = this.f23486b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f23489e;
        if (gVar.f23434c && !gVar.f23441j && this.f23488d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f23486b;
            int i12 = eVar2.f23115x;
            if (i12 == 2) {
                e I = eVar2.I();
                if (I != null) {
                    g gVar2 = I.f23079f.f23489e;
                    if (gVar2.f23441j) {
                        float f13 = this.f23486b.E;
                        this.f23489e.d((int) ((((float) gVar2.f23438g) * f13) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f23077e.f23489e.f23441j) {
                int u10 = eVar2.u();
                if (u10 == -1) {
                    e eVar3 = this.f23486b;
                    f12 = (float) eVar3.f23077e.f23489e.f23438g;
                    f11 = eVar3.t();
                } else if (u10 == 0) {
                    e eVar4 = this.f23486b;
                    f10 = ((float) eVar4.f23077e.f23489e.f23438g) * eVar4.t();
                    i10 = (int) (f10 + 0.5f);
                    this.f23489e.d(i10);
                } else if (u10 != 1) {
                    i10 = 0;
                    this.f23489e.d(i10);
                } else {
                    e eVar5 = this.f23486b;
                    f12 = (float) eVar5.f23077e.f23489e.f23438g;
                    f11 = eVar5.t();
                }
                f10 = f12 / f11;
                i10 = (int) (f10 + 0.5f);
                this.f23489e.d(i10);
            }
        }
        f fVar = this.f23492h;
        if (fVar.f23434c) {
            f fVar2 = this.f23493i;
            if (fVar2.f23434c) {
                if (!fVar.f23441j || !fVar2.f23441j || !this.f23489e.f23441j) {
                    if (!this.f23489e.f23441j && this.f23488d == e.b.MATCH_CONSTRAINT) {
                        e eVar6 = this.f23486b;
                        if (eVar6.f23113w == 0 && !eVar6.i0()) {
                            int i13 = this.f23492h.f23443l.get(0).f23438g;
                            f fVar3 = this.f23492h;
                            int i14 = i13 + fVar3.f23437f;
                            int i15 = this.f23493i.f23443l.get(0).f23438g + this.f23493i.f23437f;
                            fVar3.d(i14);
                            this.f23493i.d(i15);
                            this.f23489e.d(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f23489e.f23441j && this.f23488d == e.b.MATCH_CONSTRAINT && this.f23485a == 1 && this.f23492h.f23443l.size() > 0 && this.f23493i.f23443l.size() > 0) {
                        int i16 = (this.f23493i.f23443l.get(0).f23438g + this.f23493i.f23437f) - (this.f23492h.f23443l.get(0).f23438g + this.f23492h.f23437f);
                        g gVar3 = this.f23489e;
                        int i17 = gVar3.f23453m;
                        if (i16 < i17) {
                            gVar3.d(i16);
                        } else {
                            gVar3.d(i17);
                        }
                    }
                    if (this.f23489e.f23441j && this.f23492h.f23443l.size() > 0 && this.f23493i.f23443l.size() > 0) {
                        f fVar4 = this.f23492h.f23443l.get(0);
                        f fVar5 = this.f23493i.f23443l.get(0);
                        int i18 = fVar4.f23438g + this.f23492h.f23437f;
                        int i19 = fVar5.f23438g + this.f23493i.f23437f;
                        float P = this.f23486b.P();
                        if (fVar4 == fVar5) {
                            i18 = fVar4.f23438g;
                            i19 = fVar5.f23438g;
                            P = 0.5f;
                        }
                        this.f23492h.d((int) (((float) i18) + 0.5f + (((float) ((i19 - i18) - this.f23489e.f23438g)) * P)));
                        this.f23493i.d(this.f23492h.f23438g + this.f23489e.f23438g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e I;
        e I2;
        e eVar = this.f23486b;
        if (eVar.f23069a) {
            this.f23489e.d(eVar.v());
        }
        if (!this.f23489e.f23441j) {
            this.f23488d = this.f23486b.R();
            if (this.f23486b.X()) {
                this.f23468l = new a(this);
            }
            e.b bVar = this.f23488d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f23486b.I()) != null && I2.R() == e.b.FIXED) {
                    int v10 = (I2.v() - this.f23486b.P.e()) - this.f23486b.R.e();
                    b(this.f23492h, I2.f23079f.f23492h, this.f23486b.P.e());
                    b(this.f23493i, I2.f23079f.f23493i, -this.f23486b.R.e());
                    this.f23489e.d(v10);
                    return;
                } else if (this.f23488d == e.b.FIXED) {
                    this.f23489e.d(this.f23486b.v());
                }
            }
        } else if (this.f23488d == e.b.MATCH_PARENT && (I = this.f23486b.I()) != null && I.R() == e.b.FIXED) {
            b(this.f23492h, I.f23079f.f23492h, this.f23486b.P.e());
            b(this.f23493i, I.f23079f.f23493i, -this.f23486b.R.e());
            return;
        }
        g gVar = this.f23489e;
        boolean z10 = gVar.f23441j;
        if (z10) {
            e eVar2 = this.f23486b;
            if (eVar2.f23069a) {
                d[] dVarArr = eVar2.W;
                if (dVarArr[2].f23054f != null && dVarArr[3].f23054f != null) {
                    if (eVar2.i0()) {
                        this.f23492h.f23437f = this.f23486b.W[2].e();
                        this.f23493i.f23437f = -this.f23486b.W[3].e();
                    } else {
                        f h10 = h(this.f23486b.W[2]);
                        if (h10 != null) {
                            b(this.f23492h, h10, this.f23486b.W[2].e());
                        }
                        f h11 = h(this.f23486b.W[3]);
                        if (h11 != null) {
                            b(this.f23493i, h11, -this.f23486b.W[3].e());
                        }
                        this.f23492h.f23433b = true;
                        this.f23493i.f23433b = true;
                    }
                    if (this.f23486b.X()) {
                        b(this.f23467k, this.f23492h, this.f23486b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f23054f != null) {
                    f h12 = h(dVarArr[2]);
                    if (h12 != null) {
                        b(this.f23492h, h12, this.f23486b.W[2].e());
                        b(this.f23493i, this.f23492h, this.f23489e.f23438g);
                        if (this.f23486b.X()) {
                            b(this.f23467k, this.f23492h, this.f23486b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f23054f != null) {
                    f h13 = h(dVarArr[3]);
                    if (h13 != null) {
                        b(this.f23493i, h13, -this.f23486b.W[3].e());
                        b(this.f23492h, this.f23493i, -this.f23489e.f23438g);
                    }
                    if (this.f23486b.X()) {
                        b(this.f23467k, this.f23492h, this.f23486b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f23054f != null) {
                    f h14 = h(dVarArr[4]);
                    if (h14 != null) {
                        b(this.f23467k, h14, 0);
                        b(this.f23492h, this.f23467k, -this.f23486b.n());
                        b(this.f23493i, this.f23492h, this.f23489e.f23438g);
                        return;
                    }
                    return;
                } else if (!(eVar2 instanceof h) && eVar2.I() != null && this.f23486b.m(d.b.CENTER).f23054f == null) {
                    b(this.f23492h, this.f23486b.I().f23079f.f23492h, this.f23486b.W());
                    b(this.f23493i, this.f23492h, this.f23489e.f23438g);
                    if (this.f23486b.X()) {
                        b(this.f23467k, this.f23492h, this.f23486b.n());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z10 || this.f23488d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            e eVar3 = this.f23486b;
            int i10 = eVar3.f23115x;
            if (i10 == 2) {
                e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f23079f.f23489e;
                    this.f23489e.f23443l.add(gVar2);
                    gVar2.f23442k.add(this.f23489e);
                    g gVar3 = this.f23489e;
                    gVar3.f23433b = true;
                    gVar3.f23442k.add(this.f23492h);
                    this.f23489e.f23442k.add(this.f23493i);
                }
            } else if (i10 == 3 && !eVar3.i0()) {
                e eVar4 = this.f23486b;
                if (eVar4.f23113w != 3) {
                    g gVar4 = eVar4.f23077e.f23489e;
                    this.f23489e.f23443l.add(gVar4);
                    gVar4.f23442k.add(this.f23489e);
                    g gVar5 = this.f23489e;
                    gVar5.f23433b = true;
                    gVar5.f23442k.add(this.f23492h);
                    this.f23489e.f23442k.add(this.f23493i);
                }
            }
        }
        e eVar5 = this.f23486b;
        d[] dVarArr2 = eVar5.W;
        if (dVarArr2[2].f23054f != null && dVarArr2[3].f23054f != null) {
            if (eVar5.i0()) {
                this.f23492h.f23437f = this.f23486b.W[2].e();
                this.f23493i.f23437f = -this.f23486b.W[3].e();
            } else {
                f h15 = h(this.f23486b.W[2]);
                f h16 = h(this.f23486b.W[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f23494j = p.b.CENTER;
            }
            if (this.f23486b.X()) {
                c(this.f23467k, this.f23492h, 1, this.f23468l);
            }
        } else if (dVarArr2[2].f23054f != null) {
            f h17 = h(dVarArr2[2]);
            if (h17 != null) {
                b(this.f23492h, h17, this.f23486b.W[2].e());
                c(this.f23493i, this.f23492h, 1, this.f23489e);
                if (this.f23486b.X()) {
                    c(this.f23467k, this.f23492h, 1, this.f23468l);
                }
                e.b bVar2 = this.f23488d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f23486b.t() > 0.0f) {
                    l lVar = this.f23486b.f23077e;
                    if (lVar.f23488d == bVar3) {
                        lVar.f23489e.f23442k.add(this.f23489e);
                        this.f23489e.f23443l.add(this.f23486b.f23077e.f23489e);
                        this.f23489e.f23432a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f23054f != null) {
            f h18 = h(dVarArr2[3]);
            if (h18 != null) {
                b(this.f23493i, h18, -this.f23486b.W[3].e());
                c(this.f23492h, this.f23493i, -1, this.f23489e);
                if (this.f23486b.X()) {
                    c(this.f23467k, this.f23492h, 1, this.f23468l);
                }
            }
        } else if (dVarArr2[4].f23054f != null) {
            f h19 = h(dVarArr2[4]);
            if (h19 != null) {
                b(this.f23467k, h19, 0);
                c(this.f23492h, this.f23467k, -1, this.f23468l);
                c(this.f23493i, this.f23492h, 1, this.f23489e);
            }
        } else if (!(eVar5 instanceof h) && eVar5.I() != null) {
            b(this.f23492h, this.f23486b.I().f23079f.f23492h, this.f23486b.W());
            c(this.f23493i, this.f23492h, 1, this.f23489e);
            if (this.f23486b.X()) {
                c(this.f23467k, this.f23492h, 1, this.f23468l);
            }
            e.b bVar4 = this.f23488d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f23486b.t() > 0.0f) {
                l lVar2 = this.f23486b.f23077e;
                if (lVar2.f23488d == bVar5) {
                    lVar2.f23489e.f23442k.add(this.f23489e);
                    this.f23489e.f23443l.add(this.f23486b.f23077e.f23489e);
                    this.f23489e.f23432a = this;
                }
            }
        }
        if (this.f23489e.f23443l.size() == 0) {
            this.f23489e.f23434c = true;
        }
    }

    public void e() {
        f fVar = this.f23492h;
        if (fVar.f23441j) {
            this.f23486b.k1(fVar.f23438g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f23487c = null;
        this.f23492h.c();
        this.f23493i.c();
        this.f23467k.c();
        this.f23489e.c();
        this.f23491g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f23488d != e.b.MATCH_CONSTRAINT || this.f23486b.f23115x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f23491g = false;
        this.f23492h.c();
        this.f23492h.f23441j = false;
        this.f23493i.c();
        this.f23493i.f23441j = false;
        this.f23467k.c();
        this.f23467k.f23441j = false;
        this.f23489e.f23441j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f23486b.r();
    }
}
