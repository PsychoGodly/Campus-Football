package b2;

import b2.i;
import com.applovin.mediation.MaxReward;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_EventInternal */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f5390a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f5391b;

    /* renamed from: c  reason: collision with root package name */
    private final h f5392c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5393d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5394e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f5395f;

    /* renamed from: b2.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_EventInternal */
    static final class C0098b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f5396a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f5397b;

        /* renamed from: c  reason: collision with root package name */
        private h f5398c;

        /* renamed from: d  reason: collision with root package name */
        private Long f5399d;

        /* renamed from: e  reason: collision with root package name */
        private Long f5400e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f5401f;

        C0098b() {
        }

        public i d() {
            String str = this.f5396a;
            String str2 = MaxReward.DEFAULT_LABEL;
            if (str == null) {
                str2 = str2 + " transportName";
            }
            if (this.f5398c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f5399d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f5400e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f5401f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.f5396a, this.f5397b, this.f5398c, this.f5399d.longValue(), this.f5400e.longValue(), this.f5401f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f5401f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f5401f = map;
            return this;
        }

        public i.a g(Integer num) {
            this.f5397b = num;
            return this;
        }

        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f5398c = hVar;
            return this;
        }

        public i.a i(long j10) {
            this.f5399d = Long.valueOf(j10);
            return this;
        }

        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5396a = str;
            return this;
        }

        public i.a k(long j10) {
            this.f5400e = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f5395f;
    }

    public Integer d() {
        return this.f5391b;
    }

    public h e() {
        return this.f5392c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f5390a.equals(iVar.j()) || ((num = this.f5391b) != null ? !num.equals(iVar.d()) : iVar.d() != null) || !this.f5392c.equals(iVar.e()) || this.f5393d != iVar.f() || this.f5394e != iVar.k() || !this.f5395f.equals(iVar.c())) {
            return false;
        }
        return true;
    }

    public long f() {
        return this.f5393d;
    }

    public int hashCode() {
        int hashCode = (this.f5390a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5391b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f5393d;
        long j11 = this.f5394e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f5392c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f5395f.hashCode();
    }

    public String j() {
        return this.f5390a;
    }

    public long k() {
        return this.f5394e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f5390a + ", code=" + this.f5391b + ", encodedPayload=" + this.f5392c + ", eventMillis=" + this.f5393d + ", uptimeMillis=" + this.f5394e + ", autoMetadata=" + this.f5395f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f5390a = str;
        this.f5391b = num;
        this.f5392c = hVar;
        this.f5393d = j10;
        this.f5394e = j11;
        this.f5395f = map;
    }
}
