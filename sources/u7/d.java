package u7;

import java.util.Objects;
import u7.q;

/* compiled from: AutoValue_FieldIndex_Segment */
final class d extends q.c {

    /* renamed from: a  reason: collision with root package name */
    private final r f30612a;

    /* renamed from: b  reason: collision with root package name */
    private final q.c.a f30613b;

    d(r rVar, q.c.a aVar) {
        Objects.requireNonNull(rVar, "Null fieldPath");
        this.f30612a = rVar;
        Objects.requireNonNull(aVar, "Null kind");
        this.f30613b = aVar;
    }

    public r d() {
        return this.f30612a;
    }

    public q.c.a e() {
        return this.f30613b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.c)) {
            return false;
        }
        q.c cVar = (q.c) obj;
        if (!this.f30612a.equals(cVar.d()) || !this.f30613b.equals(cVar.e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f30612a.hashCode() ^ 1000003) * 1000003) ^ this.f30613b.hashCode();
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f30612a + ", kind=" + this.f30613b + "}";
    }
}
