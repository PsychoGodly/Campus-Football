package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import p8.z;

/* compiled from: Target */
public final class a0 extends z<a0, b> implements w0 {
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile f1<a0> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private com.google.protobuf.a0 expectedCount_;
    private boolean once_;
    private int resumeTypeCase_ = 0;
    private Object resumeType_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    /* compiled from: Target */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29512a;

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
                f29512a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29512a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29512a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29512a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29512a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29512a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29512a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.a0.a.<clinit>():void");
        }
    }

    /* compiled from: Target */
    public static final class b extends z.a<a0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(c cVar) {
            w();
            ((a0) this.f27301b).m0(cVar);
            return this;
        }

        public b G(a0.b bVar) {
            w();
            ((a0) this.f27301b).n0((com.google.protobuf.a0) bVar.build());
            return this;
        }

        public b H(d dVar) {
            w();
            ((a0) this.f27301b).o0(dVar);
            return this;
        }

        public b I(t1 t1Var) {
            w();
            ((a0) this.f27301b).p0(t1Var);
            return this;
        }

        public b J(i iVar) {
            w();
            ((a0) this.f27301b).q0(iVar);
            return this;
        }

        public b K(int i10) {
            w();
            ((a0) this.f27301b).r0(i10);
            return this;
        }

        private b() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Target */
    public static final class c extends z<c, a> implements w0 {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile f1<c> PARSER;
        private d0.j<String> documents_ = z.F();

        /* compiled from: Target */
        public static final class a extends z.a<c, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(String str) {
                w();
                ((c) this.f27301b).g0(str);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            z.b0(c.class, cVar);
        }

        private c() {
        }

        /* access modifiers changed from: private */
        public void g0(String str) {
            str.getClass();
            h0();
            this.documents_.add(str);
        }

        private void h0() {
            d0.j<String> jVar = this.documents_;
            if (!jVar.t()) {
                this.documents_ = z.Q(jVar);
            }
        }

        public static c i0() {
            return DEFAULT_INSTANCE;
        }

        public static a l0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29512a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

        public String j0(int i10) {
            return this.documents_.get(i10);
        }

        public int k0() {
            return this.documents_.size();
        }
    }

    /* compiled from: Target */
    public static final class d extends z<d, a> implements w0 {
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile f1<d> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private String parent_ = MaxReward.DEFAULT_LABEL;
        private int queryTypeCase_ = 0;
        private Object queryType_;

        /* compiled from: Target */
        public static final class a extends z.a<d, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(String str) {
                w();
                ((d) this.f27301b).l0(str);
                return this;
            }

            public a G(z.b bVar) {
                w();
                ((d) this.f27301b).m0((z) bVar.build());
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.z.b0(d.class, dVar);
        }

        private d() {
        }

        public static d h0() {
            return DEFAULT_INSTANCE;
        }

        public static a k0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void l0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* access modifiers changed from: private */
        public void m0(z zVar) {
            zVar.getClass();
            this.queryType_ = zVar;
            this.queryTypeCase_ = 2;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29512a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", z.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<d> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (d.class) {
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
            return this.parent_;
        }

        public z j0() {
            if (this.queryTypeCase_ == 2) {
                return (z) this.queryType_;
            }
            return z.p0();
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.protobuf.z.b0(a0.class, a0Var);
    }

    private a0() {
    }

    public static b l0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void m0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* access modifiers changed from: private */
    public void n0(com.google.protobuf.a0 a0Var) {
        a0Var.getClass();
        this.expectedCount_ = a0Var;
    }

    /* access modifiers changed from: private */
    public void o0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void p0(t1 t1Var) {
        t1Var.getClass();
        this.resumeType_ = t1Var;
        this.resumeTypeCase_ = 11;
    }

    /* access modifiers changed from: private */
    public void q0(i iVar) {
        iVar.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = iVar;
    }

    /* access modifiers changed from: private */
    public void r0(int i10) {
        this.targetId_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29512a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new b((a) null);
            case 3:
                return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\f\t", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", d.class, c.class, "targetId_", "once_", t1.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a0.class) {
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
}
