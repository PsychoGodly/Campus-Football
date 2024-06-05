package j2;

import b2.i;
import b2.o;
import java.util.Objects;

/* compiled from: AutoValue_PersistedEvent */
final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f19239a;

    /* renamed from: b  reason: collision with root package name */
    private final o f19240b;

    /* renamed from: c  reason: collision with root package name */
    private final i f19241c;

    b(long j10, o oVar, i iVar) {
        this.f19239a = j10;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f19240b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f19241c = iVar;
    }

    public i b() {
        return this.f19241c;
    }

    public long c() {
        return this.f19239a;
    }

    public o d() {
        return this.f19240b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f19239a != kVar.c() || !this.f19240b.equals(kVar.d()) || !this.f19241c.equals(kVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f19239a;
        return this.f19241c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f19240b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f19239a + ", transportContext=" + this.f19240b + ", event=" + this.f19241c + "}";
    }
}
