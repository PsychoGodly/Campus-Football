package j8;

import com.applovin.mediation.MaxReward;

/* compiled from: MessagingClientEvent */
public final class a {

    /* renamed from: p  reason: collision with root package name */
    private static final a f29033p = new C0307a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f29034a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29035b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29036c;

    /* renamed from: d  reason: collision with root package name */
    private final c f29037d;

    /* renamed from: e  reason: collision with root package name */
    private final d f29038e;

    /* renamed from: f  reason: collision with root package name */
    private final String f29039f;

    /* renamed from: g  reason: collision with root package name */
    private final String f29040g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29041h;

    /* renamed from: i  reason: collision with root package name */
    private final int f29042i;

    /* renamed from: j  reason: collision with root package name */
    private final String f29043j;

    /* renamed from: k  reason: collision with root package name */
    private final long f29044k;

    /* renamed from: l  reason: collision with root package name */
    private final b f29045l;

    /* renamed from: m  reason: collision with root package name */
    private final String f29046m;

    /* renamed from: n  reason: collision with root package name */
    private final long f29047n;

    /* renamed from: o  reason: collision with root package name */
    private final String f29048o;

    /* renamed from: j8.a$a  reason: collision with other inner class name */
    /* compiled from: MessagingClientEvent */
    public static final class C0307a {

        /* renamed from: a  reason: collision with root package name */
        private long f29049a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f29050b = MaxReward.DEFAULT_LABEL;

        /* renamed from: c  reason: collision with root package name */
        private String f29051c = MaxReward.DEFAULT_LABEL;

        /* renamed from: d  reason: collision with root package name */
        private c f29052d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f29053e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f29054f = MaxReward.DEFAULT_LABEL;

        /* renamed from: g  reason: collision with root package name */
        private String f29055g = MaxReward.DEFAULT_LABEL;

        /* renamed from: h  reason: collision with root package name */
        private int f29056h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f29057i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f29058j = MaxReward.DEFAULT_LABEL;

        /* renamed from: k  reason: collision with root package name */
        private long f29059k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f29060l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f29061m = MaxReward.DEFAULT_LABEL;

        /* renamed from: n  reason: collision with root package name */
        private long f29062n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f29063o = MaxReward.DEFAULT_LABEL;

        C0307a() {
        }

        public a a() {
            return new a(this.f29049a, this.f29050b, this.f29051c, this.f29052d, this.f29053e, this.f29054f, this.f29055g, this.f29056h, this.f29057i, this.f29058j, this.f29059k, this.f29060l, this.f29061m, this.f29062n, this.f29063o);
        }

        public C0307a b(String str) {
            this.f29061m = str;
            return this;
        }

        public C0307a c(String str) {
            this.f29055g = str;
            return this;
        }

        public C0307a d(String str) {
            this.f29063o = str;
            return this;
        }

        public C0307a e(b bVar) {
            this.f29060l = bVar;
            return this;
        }

        public C0307a f(String str) {
            this.f29051c = str;
            return this;
        }

        public C0307a g(String str) {
            this.f29050b = str;
            return this;
        }

        public C0307a h(c cVar) {
            this.f29052d = cVar;
            return this;
        }

        public C0307a i(String str) {
            this.f29054f = str;
            return this;
        }

        public C0307a j(long j10) {
            this.f29049a = j10;
            return this;
        }

        public C0307a k(d dVar) {
            this.f29053e = dVar;
            return this;
        }

        public C0307a l(String str) {
            this.f29058j = str;
            return this;
        }

        public C0307a m(int i10) {
            this.f29057i = i10;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent */
    public enum b implements n7.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29068a;

        private b(int i10) {
            this.f29068a = i10;
        }

        public int I() {
            return this.f29068a;
        }
    }

    /* compiled from: MessagingClientEvent */
    public enum c implements n7.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29074a;

        private c(int i10) {
            this.f29074a = i10;
        }

        public int I() {
            return this.f29074a;
        }
    }

    /* compiled from: MessagingClientEvent */
    public enum d implements n7.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29080a;

        private d(int i10) {
            this.f29080a = i10;
        }

        public int I() {
            return this.f29080a;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f29034a = j10;
        this.f29035b = str;
        this.f29036c = str2;
        this.f29037d = cVar;
        this.f29038e = dVar;
        this.f29039f = str3;
        this.f29040g = str4;
        this.f29041h = i10;
        this.f29042i = i11;
        this.f29043j = str5;
        this.f29044k = j11;
        this.f29045l = bVar;
        this.f29046m = str6;
        this.f29047n = j12;
        this.f29048o = str7;
    }

    public static C0307a p() {
        return new C0307a();
    }

    @n7.d(tag = 13)
    public String a() {
        return this.f29046m;
    }

    @n7.d(tag = 11)
    public long b() {
        return this.f29044k;
    }

    @n7.d(tag = 14)
    public long c() {
        return this.f29047n;
    }

    @n7.d(tag = 7)
    public String d() {
        return this.f29040g;
    }

    @n7.d(tag = 15)
    public String e() {
        return this.f29048o;
    }

    @n7.d(tag = 12)
    public b f() {
        return this.f29045l;
    }

    @n7.d(tag = 3)
    public String g() {
        return this.f29036c;
    }

    @n7.d(tag = 2)
    public String h() {
        return this.f29035b;
    }

    @n7.d(tag = 4)
    public c i() {
        return this.f29037d;
    }

    @n7.d(tag = 6)
    public String j() {
        return this.f29039f;
    }

    @n7.d(tag = 8)
    public int k() {
        return this.f29041h;
    }

    @n7.d(tag = 1)
    public long l() {
        return this.f29034a;
    }

    @n7.d(tag = 5)
    public d m() {
        return this.f29038e;
    }

    @n7.d(tag = 10)
    public String n() {
        return this.f29043j;
    }

    @n7.d(tag = 9)
    public int o() {
        return this.f29042i;
    }
}
