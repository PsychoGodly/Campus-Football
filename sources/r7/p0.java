package r7;

import p8.d0;
import r7.p;
import u7.i;
import u7.r;
import u7.z;
import y7.b;

/* compiled from: InFilter */
public class p0 extends p {
    p0(r rVar, d0 d0Var) {
        super(rVar, p.b.IN, d0Var);
        b.d(z.t(d0Var), "InFilter expects an ArrayValue", new Object[0]);
    }

    public boolean d(i iVar) {
        d0 h10 = iVar.h(f());
        return h10 != null && z.p(h().q0(), h10);
    }
}
