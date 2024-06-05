package r7;

import java.util.List;
import u7.i;
import u7.l;

/* compiled from: KeyFieldNotInFilter */
public class s0 extends p {

    /* renamed from: d  reason: collision with root package name */
    private final List<l> f30008d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    s0(u7.r r2, p8.d0 r3) {
        /*
            r1 = this;
            r7.p$b r0 = r7.p.b.NOT_IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f30008d = r2
            java.util.List r3 = r7.r0.k(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.s0.<init>(u7.r, p8.d0):void");
    }

    public boolean d(i iVar) {
        return !this.f30008d.contains(iVar.getKey());
    }
}
