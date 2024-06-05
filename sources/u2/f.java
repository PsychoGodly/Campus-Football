package u2;

import k4.a0;
import s6.d1;
import s6.u;

/* compiled from: ListChunk */
final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final u<a> f22836a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22837b;

    private f(int i10, u<a> uVar) {
        this.f22837b = i10;
        this.f22836a = uVar;
    }

    private static a a(int i10, int i11, a0 a0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, a0Var);
            case 1751742049:
                return c.b(a0Var);
            case 1752331379:
                return d.c(a0Var);
            case 1852994675:
                return h.a(a0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, a0 a0Var) {
        a aVar;
        u.a aVar2 = new u.a();
        int g10 = a0Var.g();
        int i11 = -2;
        while (a0Var.a() > 8) {
            int t10 = a0Var.t();
            int f10 = a0Var.f() + a0Var.t();
            a0Var.S(f10);
            if (t10 == 1414744396) {
                aVar = c(a0Var.t(), a0Var);
            } else {
                aVar = a(t10, i11, a0Var);
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    i11 = ((d) aVar).b();
                }
                aVar2.a(aVar);
            }
            a0Var.T(f10);
            a0Var.S(g10);
        }
        return new f(i10, aVar2.k());
    }

    public <T extends a> T b(Class<T> cls) {
        d1<a> m10 = this.f22836a.iterator();
        while (m10.hasNext()) {
            T t10 = (a) m10.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    public int getType() {
        return this.f22837b;
    }
}
