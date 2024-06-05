package r6;

/* compiled from: Absent */
final class a<T> extends l<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a<Object> f29787a = new a<>();

    private a() {
    }

    static <T> l<T> e() {
        return f29787a;
    }

    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
