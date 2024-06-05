package dd;

import r6.o;

/* compiled from: ConnectivityStateInfo */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final p f32332a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f32333b;

    private q(p pVar, j1 j1Var) {
        this.f32332a = (p) o.p(pVar, "state is null");
        this.f32333b = (j1) o.p(j1Var, "status is null");
    }

    public static q a(p pVar) {
        o.e(pVar != p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new q(pVar, j1.f32233f);
    }

    public static q b(j1 j1Var) {
        o.e(!j1Var.o(), "The error status must not be OK");
        return new q(p.TRANSIENT_FAILURE, j1Var);
    }

    public p c() {
        return this.f32332a;
    }

    public j1 d() {
        return this.f32333b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f32332a.equals(qVar.f32332a) || !this.f32333b.equals(qVar.f32333b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f32332a.hashCode() ^ this.f32333b.hashCode();
    }

    public String toString() {
        if (this.f32333b.o()) {
            return this.f32332a.toString();
        }
        return this.f32332a + "(" + this.f32333b + ")";
    }
}
