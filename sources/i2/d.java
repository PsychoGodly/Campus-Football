package i2;

import com.applovin.mediation.MaxReward;
import i2.g;
import java.util.Objects;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f18878a;

    /* renamed from: b  reason: collision with root package name */
    private final long f18879b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f18880c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f18881a;

        /* renamed from: b  reason: collision with root package name */
        private Long f18882b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f18883c;

        b() {
        }

        public g.b a() {
            Long l10 = this.f18881a;
            String str = MaxReward.DEFAULT_LABEL;
            if (l10 == null) {
                str = str + " delta";
            }
            if (this.f18882b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f18883c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f18881a.longValue(), this.f18882b.longValue(), this.f18883c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.b.a b(long j10) {
            this.f18881a = Long.valueOf(j10);
            return this;
        }

        public g.b.a c(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f18883c = set;
            return this;
        }

        public g.b.a d(long j10) {
            this.f18882b = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f18878a;
    }

    /* access modifiers changed from: package-private */
    public Set<g.c> c() {
        return this.f18880c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f18879b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        if (this.f18878a == bVar.b() && this.f18879b == bVar.d() && this.f18880c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18878a;
        long j11 = this.f18879b;
        return this.f18880c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f18878a + ", maxAllowedDelay=" + this.f18879b + ", flags=" + this.f18880c + "}";
    }

    private d(long j10, long j11, Set<g.c> set) {
        this.f18878a = j10;
        this.f18879b = j11;
        this.f18880c = set;
    }
}
