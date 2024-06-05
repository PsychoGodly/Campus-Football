package w;

import w.f;

/* compiled from: DimensionDependency */
class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f23453m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f23436e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f23436e = f.a.VERTICAL_DIMENSION;
        }
    }

    public void d(int i10) {
        if (!this.f23441j) {
            this.f23441j = true;
            this.f23438g = i10;
            for (d next : this.f23442k) {
                next.a(next);
            }
        }
    }
}
