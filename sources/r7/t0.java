package r7;

import u7.l;

/* compiled from: LimboDocumentChange */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f30012a;

    /* renamed from: b  reason: collision with root package name */
    private final l f30013b;

    /* compiled from: LimboDocumentChange */
    public enum a {
        ADDED,
        REMOVED
    }

    public t0(a aVar, l lVar) {
        this.f30012a = aVar;
        this.f30013b = lVar;
    }

    public l a() {
        return this.f30013b;
    }

    public a b() {
        return this.f30012a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (!this.f30012a.equals(t0Var.b()) || !this.f30013b.equals(t0Var.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((2077 + this.f30012a.hashCode()) * 31) + this.f30013b.hashCode();
    }
}
