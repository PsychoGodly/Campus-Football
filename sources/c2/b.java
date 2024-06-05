package c2;

import c2.g;
import java.util.Objects;

/* compiled from: AutoValue_BackendResponse */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f5588a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5589b;

    b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f5588a = aVar;
        this.f5589b = j10;
    }

    public long b() {
        return this.f5589b;
    }

    public g.a c() {
        return this.f5588a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f5588a.equals(gVar.c()) || this.f5589b != gVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f5589b;
        return ((this.f5588a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5588a + ", nextRequestWaitMillis=" + this.f5589b + "}";
    }
}
