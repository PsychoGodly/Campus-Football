package a2;

import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_BatchedLogRequest */
final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f93a;

    d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f93a = list;
    }

    public List<m> c() {
        return this.f93a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f93a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f93a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f93a + "}";
    }
}
