package r7;

import p8.d0;
import r7.p;
import u7.i;
import u7.r;
import u7.z;
import y7.b;

/* compiled from: NotInFilter */
public class x0 extends p {
    x0(r rVar, d0 d0Var) {
        super(rVar, p.b.NOT_IN, d0Var);
        b.d(z.t(d0Var), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    public boolean d(i iVar) {
        d0 h10;
        if (!z.p(h().q0(), z.f30660b) && (h10 = iVar.h(f())) != null && !z.p(h().q0(), h10)) {
            return true;
        }
        return false;
    }
}
