package y6;

/* compiled from: AutoValue_StartupTime */
final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    private final long f31314a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31315b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31316c;

    a(long j10, long j11, long j12) {
        this.f31314a = j10;
        this.f31315b = j11;
        this.f31316c = j12;
    }

    public long b() {
        return this.f31315b;
    }

    public long c() {
        return this.f31314a;
    }

    public long d() {
        return this.f31316c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f31314a == pVar.c() && this.f31315b == pVar.b() && this.f31316c == pVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f31314a;
        long j11 = this.f31315b;
        long j12 = this.f31316c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f31314a + ", elapsedRealtime=" + this.f31315b + ", uptimeMillis=" + this.f31316c + "}";
    }
}
