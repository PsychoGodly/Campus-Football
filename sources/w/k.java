package w;

import v.a;
import v.e;
import w.f;

/* compiled from: HelperReferences */
class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f23492h.f23442k.add(fVar);
        fVar.f23443l.add(this.f23492h);
    }

    public void a(d dVar) {
        a aVar = (a) this.f23486b;
        int s12 = aVar.s1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f23492h.f23443l) {
            int i12 = fVar.f23438g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (s12 == 0 || s12 == 2) {
            this.f23492h.d(i11 + aVar.t1());
        } else {
            this.f23492h.d(i10 + aVar.t1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e eVar = this.f23486b;
        if (eVar instanceof a) {
            this.f23492h.f23433b = true;
            a aVar = (a) eVar;
            int s12 = aVar.s1();
            boolean r12 = aVar.r1();
            int i10 = 0;
            if (s12 == 0) {
                this.f23492h.f23436e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    e eVar2 = aVar.L0[i10];
                    if (r12 || eVar2.T() != 8) {
                        f fVar = eVar2.f23077e.f23492h;
                        fVar.f23442k.add(this.f23492h);
                        this.f23492h.f23443l.add(fVar);
                    }
                    i10++;
                }
                q(this.f23486b.f23077e.f23492h);
                q(this.f23486b.f23077e.f23493i);
            } else if (s12 == 1) {
                this.f23492h.f23436e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    e eVar3 = aVar.L0[i10];
                    if (r12 || eVar3.T() != 8) {
                        f fVar2 = eVar3.f23077e.f23493i;
                        fVar2.f23442k.add(this.f23492h);
                        this.f23492h.f23443l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f23486b.f23077e.f23492h);
                q(this.f23486b.f23077e.f23493i);
            } else if (s12 == 2) {
                this.f23492h.f23436e = f.a.TOP;
                while (i10 < aVar.M0) {
                    e eVar4 = aVar.L0[i10];
                    if (r12 || eVar4.T() != 8) {
                        f fVar3 = eVar4.f23079f.f23492h;
                        fVar3.f23442k.add(this.f23492h);
                        this.f23492h.f23443l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f23486b.f23079f.f23492h);
                q(this.f23486b.f23079f.f23493i);
            } else if (s12 == 3) {
                this.f23492h.f23436e = f.a.BOTTOM;
                while (i10 < aVar.M0) {
                    e eVar5 = aVar.L0[i10];
                    if (r12 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f23079f.f23493i;
                        fVar4.f23442k.add(this.f23492h);
                        this.f23492h.f23443l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f23486b.f23079f.f23492h);
                q(this.f23486b.f23079f.f23493i);
            }
        }
    }

    public void e() {
        e eVar = this.f23486b;
        if (eVar instanceof a) {
            int s12 = ((a) eVar).s1();
            if (s12 == 0 || s12 == 1) {
                this.f23486b.j1(this.f23492h.f23438g);
            } else {
                this.f23486b.k1(this.f23492h.f23438g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f23487c = null;
        this.f23492h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
