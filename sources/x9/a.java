package x9;

import ca.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final o f31220a;

    private a(o oVar) {
        this.f31220a = oVar;
    }

    public static a a(b bVar) {
        o oVar = (o) bVar;
        g.b(bVar, "AdSession is null");
        g.j(oVar);
        g.g(oVar);
        a aVar = new a(oVar);
        oVar.p().g(aVar);
        return aVar;
    }

    public void b() {
        g.g(this.f31220a);
        g.i(this.f31220a);
        if (!this.f31220a.m()) {
            try {
                this.f31220a.d();
            } catch (Exception unused) {
            }
        }
        if (this.f31220a.m()) {
            this.f31220a.s();
        }
    }

    public void c() {
        g.f(this.f31220a);
        g.i(this.f31220a);
        this.f31220a.t();
    }
}
