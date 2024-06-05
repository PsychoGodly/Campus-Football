package n8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;

/* compiled from: Index */
public final class a extends z<a, b> implements w0 {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private d0.j<c> fields_ = z.F();
    private String name_ = MaxReward.DEFAULT_LABEL;
    private int queryScope_;
    private int state_;

    /* renamed from: n8.a$a  reason: collision with other inner class name */
    /* compiled from: Index */
    static /* synthetic */ class C0313a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29444a;

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
                f29444a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29444a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29444a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29444a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29444a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29444a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29444a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n8.a.C0313a.<clinit>():void");
        }
    }

    /* compiled from: Index */
    public static final class b extends z.a<a, b> implements w0 {
        /* synthetic */ b(C0313a aVar) {
            this();
        }

        public b F(c.b bVar) {
            w();
            ((a) this.f27301b).h0((c) bVar.build());
            return this;
        }

        public b G(d dVar) {
            w();
            ((a) this.f27301b).m0(dVar);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Index */
    public static final class c extends z<c, b> implements w0 {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile f1<c> PARSER;
        private String fieldPath_ = MaxReward.DEFAULT_LABEL;
        private int valueModeCase_ = 0;
        private Object valueMode_;

        /* renamed from: n8.a$c$a  reason: collision with other inner class name */
        /* compiled from: Index */
        public enum C0314a implements d0.c {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: f  reason: collision with root package name */
            private static final d0.d<C0314a> f29448f = null;

            /* renamed from: a  reason: collision with root package name */
            private final int f29450a;

            /* renamed from: n8.a$c$a$a  reason: collision with other inner class name */
            /* compiled from: Index */
            class C0315a implements d0.d<C0314a> {
                C0315a() {
                }

                /* renamed from: b */
                public C0314a a(int i10) {
                    return C0314a.a(i10);
                }
            }

            static {
                f29448f = new C0315a();
            }

            private C0314a(int i10) {
                this.f29450a = i10;
            }

            public static C0314a a(int i10) {
                if (i10 == 0) {
                    return ARRAY_CONFIG_UNSPECIFIED;
                }
                if (i10 != 1) {
                    return null;
                }
                return CONTAINS;
            }

            public final int I() {
                if (this != UNRECOGNIZED) {
                    return this.f29450a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* compiled from: Index */
        public static final class b extends z.a<c, b> implements w0 {
            /* synthetic */ b(C0313a aVar) {
                this();
            }

            public b F(C0314a aVar) {
                w();
                ((c) this.f27301b).m0(aVar);
                return this;
            }

            public b G(String str) {
                w();
                ((c) this.f27301b).n0(str);
                return this;
            }

            public b H(C0316c cVar) {
                w();
                ((c) this.f27301b).o0(cVar);
                return this;
            }

            private b() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: n8.a$c$c  reason: collision with other inner class name */
        /* compiled from: Index */
        public enum C0316c implements d0.c {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: g  reason: collision with root package name */
            private static final d0.d<C0316c> f29455g = null;

            /* renamed from: a  reason: collision with root package name */
            private final int f29457a;

            /* renamed from: n8.a$c$c$a  reason: collision with other inner class name */
            /* compiled from: Index */
            class C0317a implements d0.d<C0316c> {
                C0317a() {
                }

                /* renamed from: b */
                public C0316c a(int i10) {
                    return C0316c.a(i10);
                }
            }

            static {
                f29455g = new C0317a();
            }

            private C0316c(int i10) {
                this.f29457a = i10;
            }

            public static C0316c a(int i10) {
                if (i10 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return ASCENDING;
                }
                if (i10 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            public final int I() {
                if (this != UNRECOGNIZED) {
                    return this.f29457a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* compiled from: Index */
        public enum d {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            private final int f29462a;

            private d(int i10) {
                this.f29462a = i10;
            }

            public static d a(int i10) {
                if (i10 == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i10 == 2) {
                    return ORDER;
                }
                if (i10 != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            z.b0(c.class, cVar);
        }

        private c() {
        }

        public static b l0() {
            return (b) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void m0(C0314a aVar) {
            this.valueMode_ = Integer.valueOf(aVar.I());
            this.valueModeCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void n0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* access modifiers changed from: private */
        public void o0(C0316c cVar) {
            this.valueMode_ = Integer.valueOf(cVar.I());
            this.valueModeCase_ = 2;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (C0313a.f29444a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new b((C0313a) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<c> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (c.class) {
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

        public String i0() {
            return this.fieldPath_;
        }

        public C0316c j0() {
            if (this.valueModeCase_ != 2) {
                return C0316c.ORDER_UNSPECIFIED;
            }
            C0316c a10 = C0316c.a(((Integer) this.valueMode_).intValue());
            return a10 == null ? C0316c.UNRECOGNIZED : a10;
        }

        public d k0() {
            return d.a(this.valueModeCase_);
        }
    }

    /* compiled from: Index */
    public enum d implements d0.c {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: g  reason: collision with root package name */
        private static final d0.d<d> f29467g = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f29469a;

        /* renamed from: n8.a$d$a  reason: collision with other inner class name */
        /* compiled from: Index */
        class C0318a implements d0.d<d> {
            C0318a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        static {
            f29467g = new C0318a();
        }

        private d(int i10) {
            this.f29469a = i10;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return QUERY_SCOPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return COLLECTION;
            }
            if (i10 != 2) {
                return null;
            }
            return COLLECTION_GROUP;
        }

        public final int I() {
            if (this != UNRECOGNIZED) {
                return this.f29469a;
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

    /* access modifiers changed from: private */
    public void h0(c cVar) {
        cVar.getClass();
        i0();
        this.fields_.add(cVar);
    }

    private void i0() {
        d0.j<c> jVar = this.fields_;
        if (!jVar.t()) {
            this.fields_ = z.Q(jVar);
        }
    }

    public static b k0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    public static a l0(byte[] bArr) throws e0 {
        return (a) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void m0(d dVar) {
        this.queryScope_ = dVar.I();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (C0313a.f29444a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b((C0313a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
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

    public List<c> j0() {
        return this.fields_;
    }
}
