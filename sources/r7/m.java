package r7;

import u7.i;

/* compiled from: DocumentViewChange */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final a f29943a;

    /* renamed from: b  reason: collision with root package name */
    private final i f29944b;

    /* compiled from: DocumentViewChange */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private m(a aVar, i iVar) {
        this.f29943a = aVar;
        this.f29944b = iVar;
    }

    public static m a(a aVar, i iVar) {
        return new m(aVar, iVar);
    }

    public i b() {
        return this.f29944b;
    }

    public a c() {
        return this.f29943a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f29943a.equals(mVar.f29943a) || !this.f29944b.equals(mVar.f29944b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((1891 + this.f29943a.hashCode()) * 31) + this.f29944b.getKey().hashCode()) * 31) + this.f29944b.getData().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f29944b + "," + this.f29943a + ")";
    }
}
