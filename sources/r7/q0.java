package r7;

import p8.d0;
import r7.p;
import u7.i;
import u7.l;
import u7.r;
import u7.z;
import y7.b;

/* compiled from: KeyFieldFilter */
public class q0 extends p {

    /* renamed from: d  reason: collision with root package name */
    private final l f30000d = l.f(h().y0());

    q0(r rVar, p.b bVar, d0 d0Var) {
        super(rVar, bVar, d0Var);
        b.d(z.B(d0Var), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
    }

    public boolean d(i iVar) {
        return j(iVar.getKey().compareTo(this.f30000d));
    }
}
