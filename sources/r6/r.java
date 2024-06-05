package r6;

/* compiled from: Present */
final class r<T> extends l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f29819a;

    r(T t10) {
        this.f29819a = t10;
    }

    public T b() {
        return this.f29819a;
    }

    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f29819a.equals(((r) obj).f29819a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29819a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f29819a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
