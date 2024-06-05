package a2;

/* compiled from: AutoValue_LogResponse */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f126a;

    h(long j10) {
        this.f126a = j10;
    }

    public long c() {
        return this.f126a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || this.f126a != ((n) obj).c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f126a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f126a + "}";
    }
}
