package e8;

import com.applovin.mediation.MaxReward;
import e8.c;
import e8.d;
import java.util.Objects;

/* compiled from: AutoValue_PersistedInstallationEntry */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f28801b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f28802c;

    /* renamed from: d  reason: collision with root package name */
    private final String f28803d;

    /* renamed from: e  reason: collision with root package name */
    private final String f28804e;

    /* renamed from: f  reason: collision with root package name */
    private final long f28805f;

    /* renamed from: g  reason: collision with root package name */
    private final long f28806g;

    /* renamed from: h  reason: collision with root package name */
    private final String f28807h;

    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f28808a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f28809b;

        /* renamed from: c  reason: collision with root package name */
        private String f28810c;

        /* renamed from: d  reason: collision with root package name */
        private String f28811d;

        /* renamed from: e  reason: collision with root package name */
        private Long f28812e;

        /* renamed from: f  reason: collision with root package name */
        private Long f28813f;

        /* renamed from: g  reason: collision with root package name */
        private String f28814g;

        public d a() {
            c.a aVar = this.f28809b;
            String str = MaxReward.DEFAULT_LABEL;
            if (aVar == null) {
                str = str + " registrationStatus";
            }
            if (this.f28812e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f28813f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f28808a, this.f28809b, this.f28810c, this.f28811d, this.f28812e.longValue(), this.f28813f.longValue(), this.f28814g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.f28810c = str;
            return this;
        }

        public d.a c(long j10) {
            this.f28812e = Long.valueOf(j10);
            return this;
        }

        public d.a d(String str) {
            this.f28808a = str;
            return this;
        }

        public d.a e(String str) {
            this.f28814g = str;
            return this;
        }

        public d.a f(String str) {
            this.f28811d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f28809b = aVar;
            return this;
        }

        public d.a h(long j10) {
            this.f28813f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f28808a = dVar.d();
            this.f28809b = dVar.g();
            this.f28810c = dVar.b();
            this.f28811d = dVar.f();
            this.f28812e = Long.valueOf(dVar.c());
            this.f28813f = Long.valueOf(dVar.h());
            this.f28814g = dVar.e();
        }
    }

    public String b() {
        return this.f28803d;
    }

    public long c() {
        return this.f28805f;
    }

    public String d() {
        return this.f28801b;
    }

    public String e() {
        return this.f28807h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f28801b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f28802c.equals(dVar.g()) && ((str = this.f28803d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f28804e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f28805f == dVar.c() && this.f28806g == dVar.h()) {
                String str4 = this.f28807h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f28804e;
    }

    public c.a g() {
        return this.f28802c;
    }

    public long h() {
        return this.f28806g;
    }

    public int hashCode() {
        String str = this.f28801b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f28802c.hashCode()) * 1000003;
        String str2 = this.f28803d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28804e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f28805f;
        long j11 = this.f28806g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f28807h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f28801b + ", registrationStatus=" + this.f28802c + ", authToken=" + this.f28803d + ", refreshToken=" + this.f28804e + ", expiresInSecs=" + this.f28805f + ", tokenCreationEpochInSecs=" + this.f28806g + ", fisError=" + this.f28807h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f28801b = str;
        this.f28802c = aVar;
        this.f28803d = str2;
        this.f28804e = str3;
        this.f28805f = j10;
        this.f28806g = j11;
        this.f28807h = str4;
    }
}
