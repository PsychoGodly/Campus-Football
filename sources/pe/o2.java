package pe;

/* compiled from: MainCoroutineDispatcher.kt */
public abstract class o2 extends k0 {
    public abstract o2 b1();

    /* access modifiers changed from: protected */
    public final String c1() {
        o2 o2Var;
        o2 c10 = g1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            o2Var = c10.b1();
        } catch (UnsupportedOperationException unused) {
            o2Var = null;
        }
        if (this == o2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String c12 = c1();
        if (c12 != null) {
            return c12;
        }
        return u0.a(this) + '@' + u0.b(this);
    }
}
