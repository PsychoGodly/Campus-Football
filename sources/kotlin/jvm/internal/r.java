package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
public final class r implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f36049a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36050b;

    public r(Class<?> cls, String str) {
        m.e(cls, "jClass");
        m.e(str, "moduleName");
        this.f36049a = cls;
        this.f36050b = str;
    }

    public Class<?> b() {
        return this.f36049a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && m.a(b(), ((r) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
