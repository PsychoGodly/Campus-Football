package o8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: BundledQuery */
public final class a extends z<a, b> implements w0 {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private String parent_ = MaxReward.DEFAULT_LABEL;
    private int queryTypeCase_ = 0;
    private Object queryType_;

    /* renamed from: o8.a$a  reason: collision with other inner class name */
    /* compiled from: BundledQuery */
    static /* synthetic */ class C0320a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29486a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z$f[] r0 = com.google.protobuf.z.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29486a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29486a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29486a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29486a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29486a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29486a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29486a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o8.a.C0320a.<clinit>():void");
        }
    }

    /* compiled from: BundledQuery */
    public static final class b extends z.a<a, b> implements w0 {
        /* synthetic */ b(C0320a aVar) {
            this();
        }

        public b F(c cVar) {
            w();
            ((a) this.f27301b).n0(cVar);
            return this;
        }

        public b G(String str) {
            w();
            ((a) this.f27301b).o0(str);
            return this;
        }

        public b H(p8.z zVar) {
            w();
            ((a) this.f27301b).p0(zVar);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BundledQuery */
    public enum c implements d0.c {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: f  reason: collision with root package name */
        private static final d0.d<c> f29490f = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f29492a;

        /* renamed from: o8.a$c$a  reason: collision with other inner class name */
        /* compiled from: BundledQuery */
        class C0321a implements d0.d<c> {
            C0321a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            f29490f = new C0321a();
        }

        private c(int i10) {
            this.f29492a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return FIRST;
            }
            if (i10 != 1) {
                return null;
            }
            return LAST;
        }

        public final int I() {
            if (this != UNRECOGNIZED) {
                return this.f29492a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        z.b0(a.class, aVar);
    }

    private a() {
    }

    public static b l0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    public static a m0(byte[] bArr) throws e0 {
        return (a) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void n0(c cVar) {
        this.limitType_ = cVar.I();
    }

    /* access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* access modifiers changed from: private */
    public void p0(p8.z zVar) {
        zVar.getClass();
        this.queryType_ = zVar;
        this.queryTypeCase_ = 2;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (C0320a.f29486a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b((C0320a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", p8.z.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a.class) {
                        f1Var = PARSER;
                        if (f1Var == null) {
                            f1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = f1Var;
                        }
                    }
                }
                return f1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c i0() {
        c a10 = c.a(this.limitType_);
        return a10 == null ? c.UNRECOGNIZED : a10;
    }

    public String j0() {
        return this.parent_;
    }

    public p8.z k0() {
        if (this.queryTypeCase_ == 2) {
            return (p8.z) this.queryType_;
        }
        return p8.z.p0();
    }
}
