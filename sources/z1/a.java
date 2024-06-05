package z1;

import java.util.Objects;

/* compiled from: AutoValue_Event */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f24104a;

    /* renamed from: b  reason: collision with root package name */
    private final T f24105b;

    /* renamed from: c  reason: collision with root package name */
    private final d f24106c;

    a(Integer num, T t10, d dVar) {
        this.f24104a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f24105b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f24106c = dVar;
    }

    public Integer a() {
        return this.f24104a;
    }

    public T b() {
        return this.f24105b;
    }

    public d c() {
        return this.f24106c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f24104a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (!this.f24105b.equals(cVar.b()) || !this.f24106c.equals(cVar.c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f24104a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f24105b.hashCode()) * 1000003) ^ this.f24106c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f24104a + ", payload=" + this.f24105b + ", priority=" + this.f24106c + "}";
    }
}
