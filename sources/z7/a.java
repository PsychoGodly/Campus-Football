package z7;

import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_HeartBeatResult */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f31436a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f31437b;

    a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f31436a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f31437b = list;
    }

    public List<String> b() {
        return this.f31437b;
    }

    public String c() {
        return this.f31436a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f31436a.equals(lVar.c()) || !this.f31437b.equals(lVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f31436a.hashCode() ^ 1000003) * 1000003) ^ this.f31437b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f31436a + ", usedDates=" + this.f31437b + "}";
    }
}
