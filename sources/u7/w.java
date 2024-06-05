package u7;

import y6.q;

/* compiled from: SnapshotVersion */
public final class w implements Comparable<w> {

    /* renamed from: b  reason: collision with root package name */
    public static final w f30653b = new w(new q(0, 0));

    /* renamed from: a  reason: collision with root package name */
    private final q f30654a;

    public w(q qVar) {
        this.f30654a = qVar;
    }

    /* renamed from: a */
    public int compareTo(w wVar) {
        return this.f30654a.compareTo(wVar.f30654a);
    }

    public q c() {
        return this.f30654a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w) && compareTo((w) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f30654a.d() + ", nanos=" + this.f30654a.c() + ")";
    }
}
