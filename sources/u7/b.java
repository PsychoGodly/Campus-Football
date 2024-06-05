package u7;

import java.util.Objects;
import u7.q;

/* compiled from: AutoValue_FieldIndex_IndexOffset */
final class b extends q.a {

    /* renamed from: c  reason: collision with root package name */
    private final w f30607c;

    /* renamed from: d  reason: collision with root package name */
    private final l f30608d;

    /* renamed from: f  reason: collision with root package name */
    private final int f30609f;

    b(w wVar, l lVar, int i10) {
        Objects.requireNonNull(wVar, "Null readTime");
        this.f30607c = wVar;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f30608d = lVar;
        this.f30609f = i10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        if (!this.f30607c.equals(aVar.i()) || !this.f30608d.equals(aVar.g()) || this.f30609f != aVar.h()) {
            return false;
        }
        return true;
    }

    public l g() {
        return this.f30608d;
    }

    public int h() {
        return this.f30609f;
    }

    public int hashCode() {
        return ((((this.f30607c.hashCode() ^ 1000003) * 1000003) ^ this.f30608d.hashCode()) * 1000003) ^ this.f30609f;
    }

    public w i() {
        return this.f30607c;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f30607c + ", documentKey=" + this.f30608d + ", largestBatchId=" + this.f30609f + "}";
    }
}
