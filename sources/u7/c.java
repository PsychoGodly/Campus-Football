package u7;

import java.util.Objects;
import u7.q;

/* compiled from: AutoValue_FieldIndex_IndexState */
final class c extends q.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f30610a;

    /* renamed from: b  reason: collision with root package name */
    private final q.a f30611b;

    c(long j10, q.a aVar) {
        this.f30610a = j10;
        Objects.requireNonNull(aVar, "Null offset");
        this.f30611b = aVar;
    }

    public q.a c() {
        return this.f30611b;
    }

    public long d() {
        return this.f30610a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.b)) {
            return false;
        }
        q.b bVar = (q.b) obj;
        if (this.f30610a != bVar.d() || !this.f30611b.equals(bVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f30610a;
        return this.f30611b.hashCode() ^ ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f30610a + ", offset=" + this.f30611b + "}";
    }
}
