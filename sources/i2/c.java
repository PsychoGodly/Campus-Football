package i2;

import i2.g;
import java.util.Map;
import java.util.Objects;
import l2.a;
import z1.d;

/* compiled from: AutoValue_SchedulerConfig */
final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final a f18876a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, g.b> f18877b;

    c(a aVar, Map<d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f18876a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f18877b = map;
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.f18876a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f18876a.equals(gVar.e()) || !this.f18877b.equals(gVar.h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Map<d, g.b> h() {
        return this.f18877b;
    }

    public int hashCode() {
        return ((this.f18876a.hashCode() ^ 1000003) * 1000003) ^ this.f18877b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f18876a + ", values=" + this.f18877b + "}";
    }
}
