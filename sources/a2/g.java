package a2;

import a2.m;
import com.applovin.mediation.MaxReward;
import java.util.List;

/* compiled from: AutoValue_LogRequest */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f112a;

    /* renamed from: b  reason: collision with root package name */
    private final long f113b;

    /* renamed from: c  reason: collision with root package name */
    private final k f114c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f115d;

    /* renamed from: e  reason: collision with root package name */
    private final String f116e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f117f;

    /* renamed from: g  reason: collision with root package name */
    private final p f118g;

    /* compiled from: AutoValue_LogRequest */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f119a;

        /* renamed from: b  reason: collision with root package name */
        private Long f120b;

        /* renamed from: c  reason: collision with root package name */
        private k f121c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f122d;

        /* renamed from: e  reason: collision with root package name */
        private String f123e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f124f;

        /* renamed from: g  reason: collision with root package name */
        private p f125g;

        b() {
        }

        public m a() {
            Long l10 = this.f119a;
            String str = MaxReward.DEFAULT_LABEL;
            if (l10 == null) {
                str = str + " requestTimeMs";
            }
            if (this.f120b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f119a.longValue(), this.f120b.longValue(), this.f121c, this.f122d, this.f123e, this.f124f, this.f125g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(k kVar) {
            this.f121c = kVar;
            return this;
        }

        public m.a c(List<l> list) {
            this.f124f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a d(Integer num) {
            this.f122d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(String str) {
            this.f123e = str;
            return this;
        }

        public m.a f(p pVar) {
            this.f125g = pVar;
            return this;
        }

        public m.a g(long j10) {
            this.f119a = Long.valueOf(j10);
            return this;
        }

        public m.a h(long j10) {
            this.f120b = Long.valueOf(j10);
            return this;
        }
    }

    public k b() {
        return this.f114c;
    }

    public List<l> c() {
        return this.f117f;
    }

    public Integer d() {
        return this.f115d;
    }

    public String e() {
        return this.f116e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f112a == mVar.g() && this.f113b == mVar.h() && ((kVar = this.f114c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f115d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f116e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f117f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f118g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f118g;
    }

    public long g() {
        return this.f112a;
    }

    public long h() {
        return this.f113b;
    }

    public int hashCode() {
        long j10 = this.f112a;
        long j11 = this.f113b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f114c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f115d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f116e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f117f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f118g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f112a + ", requestUptimeMs=" + this.f113b + ", clientInfo=" + this.f114c + ", logSource=" + this.f115d + ", logSourceName=" + this.f116e + ", logEvents=" + this.f117f + ", qosTier=" + this.f118g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f112a = j10;
        this.f113b = j11;
        this.f114c = kVar;
        this.f115d = num;
        this.f116e = str;
        this.f117f = list;
        this.f118g = pVar;
    }
}
