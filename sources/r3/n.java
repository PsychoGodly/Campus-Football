package r3;

import j4.l;
import j4.p;
import k4.a;
import n2.r1;

/* compiled from: MediaChunk */
public abstract class n extends f {

    /* renamed from: j  reason: collision with root package name */
    public final long f22178j;

    public n(l lVar, p pVar, r1 r1Var, int i10, Object obj, long j10, long j11, long j12) {
        super(lVar, pVar, 1, r1Var, i10, obj, j10, j11);
        a.e(r1Var);
        this.f22178j = j12;
    }

    public long g() {
        long j10 = this.f22178j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1;
    }

    public abstract boolean h();
}
