package l8;

import java.util.Objects;

/* compiled from: AutoValue_LibraryVersion */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f29193a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29194b;

    a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f29193a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f29194b = str2;
    }

    public String b() {
        return this.f29193a;
    }

    public String c() {
        return this.f29194b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f29193a.equals(fVar.b()) || !this.f29194b.equals(fVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f29193a.hashCode() ^ 1000003) * 1000003) ^ this.f29194b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f29193a + ", version=" + this.f29194b + "}";
    }
}
