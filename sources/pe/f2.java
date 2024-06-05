package pe;

/* compiled from: JobSupport.kt */
public class f2 extends k2 implements a0 {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37304c = P0();

    public f2(c2 c2Var) {
        super(true);
        c0(c2Var);
    }

    private final boolean P0() {
        k2 r10;
        u X = X();
        v vVar = X instanceof v ? (v) X : null;
        if (!(vVar == null || (r10 = vVar.r()) == null)) {
            while (!r10.U()) {
                u X2 = r10.X();
                v vVar2 = X2 instanceof v ? (v) X2 : null;
                if (vVar2 != null) {
                    r10 = vVar2.r();
                    if (r10 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean U() {
        return this.f37304c;
    }

    public boolean V() {
        return true;
    }
}
