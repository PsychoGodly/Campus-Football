package pe;

import kotlin.jvm.internal.m;

/* compiled from: JobSupport.kt */
public abstract class j2 extends e0 implements i1, x1 {

    /* renamed from: d  reason: collision with root package name */
    public k2 f37326d;

    public p2 b() {
        return null;
    }

    public void dispose() {
        r().B0(this);
    }

    public boolean isActive() {
        return true;
    }

    public final k2 r() {
        k2 k2Var = this.f37326d;
        if (k2Var != null) {
            return k2Var;
        }
        m.t("job");
        return null;
    }

    public final void s(k2 k2Var) {
        this.f37326d = k2Var;
    }

    public String toString() {
        return u0.a(this) + '@' + u0.b(this) + "[job@" + u0.b(r()) + ']';
    }
}
