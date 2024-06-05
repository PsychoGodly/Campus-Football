package a2;

import a2.a;

/* compiled from: AutoValue_AndroidClientInfo */
final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f69a;

    /* renamed from: b  reason: collision with root package name */
    private final String f70b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71c;

    /* renamed from: d  reason: collision with root package name */
    private final String f72d;

    /* renamed from: e  reason: collision with root package name */
    private final String f73e;

    /* renamed from: f  reason: collision with root package name */
    private final String f74f;

    /* renamed from: g  reason: collision with root package name */
    private final String f75g;

    /* renamed from: h  reason: collision with root package name */
    private final String f76h;

    /* renamed from: i  reason: collision with root package name */
    private final String f77i;

    /* renamed from: j  reason: collision with root package name */
    private final String f78j;

    /* renamed from: k  reason: collision with root package name */
    private final String f79k;

    /* renamed from: l  reason: collision with root package name */
    private final String f80l;

    /* compiled from: AutoValue_AndroidClientInfo */
    static final class b extends a.C0000a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f81a;

        /* renamed from: b  reason: collision with root package name */
        private String f82b;

        /* renamed from: c  reason: collision with root package name */
        private String f83c;

        /* renamed from: d  reason: collision with root package name */
        private String f84d;

        /* renamed from: e  reason: collision with root package name */
        private String f85e;

        /* renamed from: f  reason: collision with root package name */
        private String f86f;

        /* renamed from: g  reason: collision with root package name */
        private String f87g;

        /* renamed from: h  reason: collision with root package name */
        private String f88h;

        /* renamed from: i  reason: collision with root package name */
        private String f89i;

        /* renamed from: j  reason: collision with root package name */
        private String f90j;

        /* renamed from: k  reason: collision with root package name */
        private String f91k;

        /* renamed from: l  reason: collision with root package name */
        private String f92l;

        b() {
        }

        public a a() {
            return new c(this.f81a, this.f82b, this.f83c, this.f84d, this.f85e, this.f86f, this.f87g, this.f88h, this.f89i, this.f90j, this.f91k, this.f92l);
        }

        public a.C0000a b(String str) {
            this.f92l = str;
            return this;
        }

        public a.C0000a c(String str) {
            this.f90j = str;
            return this;
        }

        public a.C0000a d(String str) {
            this.f84d = str;
            return this;
        }

        public a.C0000a e(String str) {
            this.f88h = str;
            return this;
        }

        public a.C0000a f(String str) {
            this.f83c = str;
            return this;
        }

        public a.C0000a g(String str) {
            this.f89i = str;
            return this;
        }

        public a.C0000a h(String str) {
            this.f87g = str;
            return this;
        }

        public a.C0000a i(String str) {
            this.f91k = str;
            return this;
        }

        public a.C0000a j(String str) {
            this.f82b = str;
            return this;
        }

        public a.C0000a k(String str) {
            this.f86f = str;
            return this;
        }

        public a.C0000a l(String str) {
            this.f85e = str;
            return this;
        }

        public a.C0000a m(Integer num) {
            this.f81a = num;
            return this;
        }
    }

    public String b() {
        return this.f80l;
    }

    public String c() {
        return this.f78j;
    }

    public String d() {
        return this.f72d;
    }

    public String e() {
        return this.f76h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f69a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f70b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f71c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f72d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f73e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f74f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f75g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f76h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f77i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f78j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f79k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f80l;
                                                    if (str11 == null) {
                                                        if (aVar.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f71c;
    }

    public String g() {
        return this.f77i;
    }

    public String h() {
        return this.f75g;
    }

    public int hashCode() {
        Integer num = this.f69a;
        int i10 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f70b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f71c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f72d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f73e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f74f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f75g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f76h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f77i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f78j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f79k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f80l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode11 ^ i10;
    }

    public String i() {
        return this.f79k;
    }

    public String j() {
        return this.f70b;
    }

    public String k() {
        return this.f74f;
    }

    public String l() {
        return this.f73e;
    }

    public Integer m() {
        return this.f69a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f69a + ", model=" + this.f70b + ", hardware=" + this.f71c + ", device=" + this.f72d + ", product=" + this.f73e + ", osBuild=" + this.f74f + ", manufacturer=" + this.f75g + ", fingerprint=" + this.f76h + ", locale=" + this.f77i + ", country=" + this.f78j + ", mccMnc=" + this.f79k + ", applicationBuild=" + this.f80l + "}";
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f69a = num;
        this.f70b = str;
        this.f71c = str2;
        this.f72d = str3;
        this.f73e = str4;
        this.f74f = str5;
        this.f75g = str6;
        this.f76h = str7;
        this.f77i = str8;
        this.f78j = str9;
        this.f79k = str10;
        this.f80l = str11;
    }
}
