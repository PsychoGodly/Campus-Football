package r7;

import p8.d0;
import r7.p;
import u7.i;
import u7.r;
import u7.z;
import y7.b;

/* compiled from: ArrayContainsAnyFilter */
public class e extends p {
    e(r rVar, d0 d0Var) {
        super(rVar, p.b.ARRAY_CONTAINS_ANY, d0Var);
        b.d(z.t(d0Var), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    public boolean d(i iVar) {
        d0 h10 = iVar.h(f());
        if (!z.t(h10)) {
            return false;
        }
        for (d0 p10 : h10.q0().g()) {
            if (z.p(h().q0(), p10)) {
                return true;
            }
        }
        return false;
    }
}
