package w;

import v.d;
import v.e;

/* compiled from: WidgetRun */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f23485a;

    /* renamed from: b  reason: collision with root package name */
    e f23486b;

    /* renamed from: c  reason: collision with root package name */
    m f23487c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f23488d;

    /* renamed from: e  reason: collision with root package name */
    g f23489e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f23490f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f23491g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f23492h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f23493i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f23494j = b.NONE;

    /* compiled from: WidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23495a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23495a = r0
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23495a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23495a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23495a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23495a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.p.a.<clinit>():void");
        }
    }

    /* compiled from: WidgetRun */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f23486b = eVar;
    }

    private void l(int i10, int i11) {
        int i12;
        int i13 = this.f23485a;
        if (i13 == 0) {
            this.f23489e.d(g(i11, i10));
        } else if (i13 == 1) {
            this.f23489e.d(Math.min(g(this.f23489e.f23453m, i10), i11));
        } else if (i13 == 2) {
            e I = this.f23486b.I();
            if (I != null) {
                g gVar = (i10 == 0 ? I.f23077e : I.f23079f).f23489e;
                if (gVar.f23441j) {
                    e eVar = this.f23486b;
                    this.f23489e.d(g((int) ((((float) gVar.f23438g) * (i10 == 0 ? eVar.B : eVar.E)) + 0.5f), i10));
                }
            }
        } else if (i13 == 3) {
            e eVar2 = this.f23486b;
            p pVar = eVar2.f23077e;
            e.b bVar = pVar.f23488d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f23485a == 3) {
                n nVar = eVar2.f23079f;
                if (nVar.f23488d == bVar2 && nVar.f23485a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar = eVar2.f23079f;
            }
            if (pVar.f23489e.f23441j) {
                float t10 = eVar2.t();
                if (i10 == 1) {
                    i12 = (int) ((((float) pVar.f23489e.f23438g) / t10) + 0.5f);
                } else {
                    i12 = (int) ((t10 * ((float) pVar.f23489e.f23438g)) + 0.5f);
                }
                this.f23489e.d(i12);
            }
        }
    }

    public void a(d dVar) {
    }

    /* access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f23443l.add(fVar2);
        fVar.f23437f = i10;
        fVar2.f23442k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f23443l.add(fVar2);
        fVar.f23443l.add(this.f23489e);
        fVar.f23439h = i10;
        fVar.f23440i = gVar;
        fVar2.f23442k.add(fVar);
        gVar.f23442k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f23486b;
            int i13 = eVar.A;
            i12 = Math.max(eVar.f23119z, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f23486b;
            int i14 = eVar2.D;
            int max = Math.max(eVar2.C, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public final f h(d dVar) {
        d dVar2 = dVar.f23054f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f23052d;
        int i10 = a.f23495a[dVar2.f23053e.ordinal()];
        if (i10 == 1) {
            return eVar.f23077e.f23492h;
        }
        if (i10 == 2) {
            return eVar.f23077e.f23493i;
        }
        if (i10 == 3) {
            return eVar.f23079f.f23492h;
        }
        if (i10 == 4) {
            return eVar.f23079f.f23467k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f23079f.f23493i;
    }

    /* access modifiers changed from: protected */
    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f23054f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f23052d;
        p pVar = i10 == 0 ? eVar.f23077e : eVar.f23079f;
        int i11 = a.f23495a[dVar2.f23053e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f23493i;
        }
        return pVar.f23492h;
    }

    public long j() {
        g gVar = this.f23489e;
        if (gVar.f23441j) {
            return (long) gVar.f23438g;
        }
        return 0;
    }

    public boolean k() {
        return this.f23491g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(d dVar, d dVar2, d dVar3, int i10) {
        float f10;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f23441j && h11.f23441j) {
            int e10 = h10.f23438g + dVar2.e();
            int e11 = h11.f23438g - dVar3.e();
            int i11 = e11 - e10;
            if (!this.f23489e.f23441j && this.f23488d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f23489e;
            if (gVar.f23441j) {
                if (gVar.f23438g == i11) {
                    this.f23492h.d(e10);
                    this.f23493i.d(e11);
                    return;
                }
                e eVar = this.f23486b;
                if (i10 == 0) {
                    f10 = eVar.w();
                } else {
                    f10 = eVar.P();
                }
                if (h10 == h11) {
                    e10 = h10.f23438g;
                    e11 = h11.f23438g;
                    f10 = 0.5f;
                }
                this.f23492h.d((int) (((float) e10) + 0.5f + (((float) ((e11 - e10) - this.f23489e.f23438g)) * f10)));
                this.f23493i.d(this.f23492h.f23438g + this.f23489e.f23438g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
