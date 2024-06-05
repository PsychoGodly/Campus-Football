package w;

import v.e;
import v.g;

/* compiled from: GuidelineReference */
class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f23077e.f();
        eVar.f23079f.f();
        this.f23490f = ((g) eVar).p1();
    }

    private void q(f fVar) {
        this.f23492h.f23442k.add(fVar);
        fVar.f23443l.add(this.f23492h);
    }

    public void a(d dVar) {
        f fVar = this.f23492h;
        if (fVar.f23434c && !fVar.f23441j) {
            this.f23492h.d((int) ((((float) fVar.f23443l.get(0).f23438g) * ((g) this.f23486b).s1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        g gVar = (g) this.f23486b;
        int q12 = gVar.q1();
        int r12 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            if (q12 != -1) {
                this.f23492h.f23443l.add(this.f23486b.f23070a0.f23077e.f23492h);
                this.f23486b.f23070a0.f23077e.f23492h.f23442k.add(this.f23492h);
                this.f23492h.f23437f = q12;
            } else if (r12 != -1) {
                this.f23492h.f23443l.add(this.f23486b.f23070a0.f23077e.f23493i);
                this.f23486b.f23070a0.f23077e.f23493i.f23442k.add(this.f23492h);
                this.f23492h.f23437f = -r12;
            } else {
                f fVar = this.f23492h;
                fVar.f23433b = true;
                fVar.f23443l.add(this.f23486b.f23070a0.f23077e.f23493i);
                this.f23486b.f23070a0.f23077e.f23493i.f23442k.add(this.f23492h);
            }
            q(this.f23486b.f23077e.f23492h);
            q(this.f23486b.f23077e.f23493i);
            return;
        }
        if (q12 != -1) {
            this.f23492h.f23443l.add(this.f23486b.f23070a0.f23079f.f23492h);
            this.f23486b.f23070a0.f23079f.f23492h.f23442k.add(this.f23492h);
            this.f23492h.f23437f = q12;
        } else if (r12 != -1) {
            this.f23492h.f23443l.add(this.f23486b.f23070a0.f23079f.f23493i);
            this.f23486b.f23070a0.f23079f.f23493i.f23442k.add(this.f23492h);
            this.f23492h.f23437f = -r12;
        } else {
            f fVar2 = this.f23492h;
            fVar2.f23433b = true;
            fVar2.f23443l.add(this.f23486b.f23070a0.f23079f.f23493i);
            this.f23486b.f23070a0.f23079f.f23493i.f23442k.add(this.f23492h);
        }
        q(this.f23486b.f23079f.f23492h);
        q(this.f23486b.f23079f.f23493i);
    }

    public void e() {
        if (((g) this.f23486b).p1() == 1) {
            this.f23486b.j1(this.f23492h.f23438g);
        } else {
            this.f23486b.k1(this.f23492h.f23438g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f23492h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
