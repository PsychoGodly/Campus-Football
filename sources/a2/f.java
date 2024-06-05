package a2;

import a2.l;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f98a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f99b;

    /* renamed from: c  reason: collision with root package name */
    private final long f100c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f101d;

    /* renamed from: e  reason: collision with root package name */
    private final String f102e;

    /* renamed from: f  reason: collision with root package name */
    private final long f103f;

    /* renamed from: g  reason: collision with root package name */
    private final o f104g;

    /* compiled from: AutoValue_LogEvent */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f105a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f106b;

        /* renamed from: c  reason: collision with root package name */
        private Long f107c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f108d;

        /* renamed from: e  reason: collision with root package name */
        private String f109e;

        /* renamed from: f  reason: collision with root package name */
        private Long f110f;

        /* renamed from: g  reason: collision with root package name */
        private o f111g;

        b() {
        }

        public l a() {
            Long l10 = this.f105a;
            String str = MaxReward.DEFAULT_LABEL;
            if (l10 == null) {
                str = str + " eventTimeMs";
            }
            if (this.f107c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f110f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f105a.longValue(), this.f106b, this.f107c.longValue(), this.f108d, this.f109e, this.f110f.longValue(), this.f111g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(Integer num) {
            this.f106b = num;
            return this;
        }

        public l.a c(long j10) {
            this.f105a = Long.valueOf(j10);
            return this;
        }

        public l.a d(long j10) {
            this.f107c = Long.valueOf(j10);
            return this;
        }

        public l.a e(o oVar) {
            this.f111g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a f(byte[] bArr) {
            this.f108d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f109e = str;
            return this;
        }

        public l.a h(long j10) {
            this.f110f = Long.valueOf(j10);
            return this;
        }
    }

    public Integer b() {
        return this.f99b;
    }

    public long c() {
        return this.f98a;
    }

    public long d() {
        return this.f100c;
    }

    public o e() {
        return this.f104g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f98a == lVar.c() && ((num = this.f99b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f100c == lVar.d()) {
            if (Arrays.equals(this.f101d, lVar instanceof f ? ((f) lVar).f101d : lVar.f()) && ((str = this.f102e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f103f == lVar.h()) {
                o oVar = this.f104g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f101d;
    }

    public String g() {
        return this.f102e;
    }

    public long h() {
        return this.f103f;
    }

    public int hashCode() {
        long j10 = this.f98a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f99b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f100c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f101d)) * 1000003;
        String str = this.f102e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f103f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f104g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f98a + ", eventCode=" + this.f99b + ", eventUptimeMs=" + this.f100c + ", sourceExtension=" + Arrays.toString(this.f101d) + ", sourceExtensionJsonProto3=" + this.f102e + ", timezoneOffsetSeconds=" + this.f103f + ", networkConnectionInfo=" + this.f104g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f98a = j10;
        this.f99b = num;
        this.f100c = j11;
        this.f101d = bArr;
        this.f102e = str;
        this.f103f = j12;
        this.f104g = oVar;
    }
}
