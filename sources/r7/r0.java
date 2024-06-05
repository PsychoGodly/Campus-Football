package r7;

import java.util.ArrayList;
import java.util.List;
import p8.d0;
import r7.p;
import u7.i;
import u7.l;
import u7.z;
import y7.b;

/* compiled from: KeyFieldInFilter */
public class r0 extends p {

    /* renamed from: d  reason: collision with root package name */
    private final List<l> f30004d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    r0(u7.r r2, p8.d0 r3) {
        /*
            r1 = this;
            r7.p$b r0 = r7.p.b.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f30004d = r2
            java.util.List r3 = k(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.r0.<init>(u7.r, p8.d0):void");
    }

    static List<l> k(p.b bVar, d0 d0Var) {
        b.d(bVar == p.b.IN || bVar == p.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        b.d(z.t(d0Var), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (d0 next : d0Var.q0().g()) {
            boolean B = z.B(next);
            b.d(B, "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(l.f(next.y0()));
        }
        return arrayList;
    }

    public boolean d(i iVar) {
        return this.f30004d.contains(iVar.getKey());
    }
}
