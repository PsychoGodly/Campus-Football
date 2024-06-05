package f8;

import f8.d;

/* compiled from: AutoValue_InstallationResponse */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f28859a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28860b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28861c;

    /* renamed from: d  reason: collision with root package name */
    private final f f28862d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f28863e;

    /* compiled from: AutoValue_InstallationResponse */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f28864a;

        /* renamed from: b  reason: collision with root package name */
        private String f28865b;

        /* renamed from: c  reason: collision with root package name */
        private String f28866c;

        /* renamed from: d  reason: collision with root package name */
        private f f28867d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f28868e;

        b() {
        }

        public d a() {
            return new a(this.f28864a, this.f28865b, this.f28866c, this.f28867d, this.f28868e);
        }

        public d.a b(f fVar) {
            this.f28867d = fVar;
            return this;
        }

        public d.a c(String str) {
            this.f28865b = str;
            return this;
        }

        public d.a d(String str) {
            this.f28866c = str;
            return this;
        }

        public d.a e(d.b bVar) {
            this.f28868e = bVar;
            return this;
        }

        public d.a f(String str) {
            this.f28864a = str;
            return this;
        }
    }

    public f b() {
        return this.f28862d;
    }

    public String c() {
        return this.f28860b;
    }

    public String d() {
        return this.f28861c;
    }

    public d.b e() {
        return this.f28863e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f28859a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f28860b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f28861c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f28862d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f28863e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f28859a;
    }

    public int hashCode() {
        String str = this.f28859a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f28860b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28861c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f28862d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f28863e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f28859a + ", fid=" + this.f28860b + ", refreshToken=" + this.f28861c + ", authToken=" + this.f28862d + ", responseCode=" + this.f28863e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f28859a = str;
        this.f28860b = str2;
        this.f28861c = str3;
        this.f28862d = fVar;
        this.f28863e = bVar;
    }
}
