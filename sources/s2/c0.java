package s2;

/* compiled from: SeekPoint */
public final class c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f22383c = new c0(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f22384a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22385b;

    public c0(long j10, long j11) {
        this.f22384a = j10;
        this.f22385b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f22384a == c0Var.f22384a && this.f22385b == c0Var.f22385b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f22384a) * 31) + ((int) this.f22385b);
    }

    public String toString() {
        return "[timeUs=" + this.f22384a + ", position=" + this.f22385b + "]";
    }
}
