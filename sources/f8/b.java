package f8;

import com.applovin.mediation.MaxReward;
import f8.f;

/* compiled from: AutoValue_TokenResult */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f28869a;

    /* renamed from: b  reason: collision with root package name */
    private final long f28870b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f28871c;

    /* renamed from: f8.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TokenResult */
    static final class C0302b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f28872a;

        /* renamed from: b  reason: collision with root package name */
        private Long f28873b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f28874c;

        C0302b() {
        }

        public f a() {
            Long l10 = this.f28873b;
            String str = MaxReward.DEFAULT_LABEL;
            if (l10 == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f28872a, this.f28873b.longValue(), this.f28874c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(f.b bVar) {
            this.f28874c = bVar;
            return this;
        }

        public f.a c(String str) {
            this.f28872a = str;
            return this;
        }

        public f.a d(long j10) {
            this.f28873b = Long.valueOf(j10);
            return this;
        }
    }

    public f.b b() {
        return this.f28871c;
    }

    public String c() {
        return this.f28869a;
    }

    public long d() {
        return this.f28870b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f28869a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f28870b == fVar.d()) {
                f.b bVar = this.f28871c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f28869a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f28870b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f28871c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f28869a + ", tokenExpirationTimestamp=" + this.f28870b + ", responseCode=" + this.f28871c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f28869a = str;
        this.f28870b = j10;
        this.f28871c = bVar;
    }
}
