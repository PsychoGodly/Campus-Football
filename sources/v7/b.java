package v7;

import java.util.Objects;

/* compiled from: AutoValue_Overlay */
final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final int f30694a;

    /* renamed from: b  reason: collision with root package name */
    private final f f30695b;

    b(int i10, f fVar) {
        this.f30694a = i10;
        Objects.requireNonNull(fVar, "Null mutation");
        this.f30695b = fVar;
    }

    public int c() {
        return this.f30694a;
    }

    public f d() {
        return this.f30695b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f30694a != kVar.c() || !this.f30695b.equals(kVar.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f30694a ^ 1000003) * 1000003) ^ this.f30695b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f30694a + ", mutation=" + this.f30695b + "}";
    }
}
