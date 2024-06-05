package z1;

import java.util.Objects;

/* compiled from: Encoding */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f24107a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f24107a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f24107a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f24107a.equals(((b) obj).f24107a);
    }

    public int hashCode() {
        return this.f24107a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f24107a + "\"}";
    }
}
