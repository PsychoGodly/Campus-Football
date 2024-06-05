package u7;

import java.util.List;
import java.util.Objects;
import u7.q;

/* compiled from: AutoValue_FieldIndex */
final class a extends q {

    /* renamed from: c  reason: collision with root package name */
    private final int f30603c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30604d;

    /* renamed from: e  reason: collision with root package name */
    private final List<q.c> f30605e;

    /* renamed from: f  reason: collision with root package name */
    private final q.b f30606f;

    a(int i10, String str, List<q.c> list, q.b bVar) {
        this.f30603c = i10;
        Objects.requireNonNull(str, "Null collectionGroup");
        this.f30604d = str;
        Objects.requireNonNull(list, "Null segments");
        this.f30605e = list;
        Objects.requireNonNull(bVar, "Null indexState");
        this.f30606f = bVar;
    }

    public String d() {
        return this.f30604d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f30603c != qVar.f() || !this.f30604d.equals(qVar.d()) || !this.f30605e.equals(qVar.h()) || !this.f30606f.equals(qVar.g())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.f30603c;
    }

    public q.b g() {
        return this.f30606f;
    }

    public List<q.c> h() {
        return this.f30605e;
    }

    public int hashCode() {
        return ((((((this.f30603c ^ 1000003) * 1000003) ^ this.f30604d.hashCode()) * 1000003) ^ this.f30605e.hashCode()) * 1000003) ^ this.f30606f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f30603c + ", collectionGroup=" + this.f30604d + ", segments=" + this.f30605e + ", indexState=" + this.f30606f + "}";
    }
}
