package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import p8.z;

/* compiled from: StructuredAggregationQuery */
public final class y extends z<y, c> implements w0 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final y DEFAULT_INSTANCE;
    private static volatile f1<y> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private d0.j<b> aggregations_ = z.F();
    private int queryTypeCase_ = 0;
    private Object queryType_;

    /* compiled from: StructuredAggregationQuery */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29613a;

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
                f29613a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29613a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29613a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29613a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29613a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29613a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29613a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.y.a.<clinit>():void");
        }
    }

    /* compiled from: StructuredAggregationQuery */
    public static final class b extends z<b, C0326b> implements w0 {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        private static volatile f1<b> PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private String alias_ = MaxReward.DEFAULT_LABEL;
        private int operatorCase_ = 0;
        private Object operator_;

        /* compiled from: StructuredAggregationQuery */
        public static final class a extends z<a, C0325a> implements w0 {
            /* access modifiers changed from: private */
            public static final a DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile f1<a> PARSER;
            private z.g field_;

            /* renamed from: p8.y$b$a$a  reason: collision with other inner class name */
            /* compiled from: StructuredAggregationQuery */
            public static final class C0325a extends z.a<a, C0325a> implements w0 {
                /* synthetic */ C0325a(a aVar) {
                    this();
                }

                public C0325a F(z.g gVar) {
                    w();
                    ((a) this.f27301b).h0(gVar);
                    return this;
                }

                private C0325a() {
                    super(a.DEFAULT_INSTANCE);
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                com.google.protobuf.z.b0(a.class, aVar);
            }

            private a() {
            }

            public static C0325a g0() {
                return (C0325a) DEFAULT_INSTANCE.y();
            }

            /* access modifiers changed from: private */
            public void h0(z.g gVar) {
                gVar.getClass();
                this.field_ = gVar;
            }

            /* access modifiers changed from: protected */
            public final Object D(z.f fVar, Object obj, Object obj2) {
                switch (a.f29613a[fVar.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0325a((a) null);
                    case 3:
                        return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"field_"});
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
        }

        /* renamed from: p8.y$b$b  reason: collision with other inner class name */
        /* compiled from: StructuredAggregationQuery */
        public static final class C0326b extends z.a<b, C0326b> implements w0 {
            /* synthetic */ C0326b(a aVar) {
                this();
            }

            public C0326b F(String str) {
                w();
                ((b) this.f27301b).k0(str);
                return this;
            }

            public C0326b G(a aVar) {
                w();
                ((b) this.f27301b).l0(aVar);
                return this;
            }

            public C0326b H(c cVar) {
                w();
                ((b) this.f27301b).m0(cVar);
                return this;
            }

            public C0326b I(d dVar) {
                w();
                ((b) this.f27301b).n0(dVar);
                return this;
            }

            private C0326b() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredAggregationQuery */
        public static final class c extends com.google.protobuf.z<c, a> implements w0 {
            /* access modifiers changed from: private */
            public static final c DEFAULT_INSTANCE;
            private static volatile f1<c> PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private b0 upTo_;

            /* compiled from: StructuredAggregationQuery */
            public static final class a extends z.a<c, a> implements w0 {
                /* synthetic */ a(a aVar) {
                    this();
                }

                private a() {
                    super(c.DEFAULT_INSTANCE);
                }
            }

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                com.google.protobuf.z.b0(c.class, cVar);
            }

            private c() {
            }

            public static c f0() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: protected */
            public final Object D(z.f fVar, Object obj, Object obj2) {
                switch (a.f29613a[fVar.ordinal()]) {
                    case 1:
                        return new c();
                    case 2:
                        return new a((a) null);
                    case 3:
                        return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"upTo_"});
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
        }

        /* compiled from: StructuredAggregationQuery */
        public static final class d extends com.google.protobuf.z<d, a> implements w0 {
            /* access modifiers changed from: private */
            public static final d DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile f1<d> PARSER;
            private z.g field_;

            /* compiled from: StructuredAggregationQuery */
            public static final class a extends z.a<d, a> implements w0 {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a F(z.g gVar) {
                    w();
                    ((d) this.f27301b).h0(gVar);
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

            public static a g0() {
                return (a) DEFAULT_INSTANCE.y();
            }

            /* access modifiers changed from: private */
            public void h0(z.g gVar) {
                gVar.getClass();
                this.field_ = gVar;
            }

            /* access modifiers changed from: protected */
            public final Object D(z.f fVar, Object obj, Object obj2) {
                switch (a.f29613a[fVar.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a((a) null);
                    case 3:
                        return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"field_"});
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
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.z.b0(b.class, bVar);
        }

        private b() {
        }

        public static C0326b j0() {
            return (C0326b) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void k0(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* access modifiers changed from: private */
        public void l0(a aVar) {
            aVar.getClass();
            this.operator_ = aVar;
            this.operatorCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void m0(c cVar) {
            cVar.getClass();
            this.operator_ = cVar;
            this.operatorCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void n0(d dVar) {
            dVar.getClass();
            this.operator_ = dVar;
            this.operatorCase_ = 2;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29613a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new C0326b((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", c.class, d.class, a.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<b> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (b.class) {
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

    /* compiled from: StructuredAggregationQuery */
    public static final class c extends z.a<y, c> implements w0 {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c F(Iterable<? extends b> iterable) {
            w();
            ((y) this.f27301b).h0(iterable);
            return this;
        }

        public c G(z zVar) {
            w();
            ((y) this.f27301b).k0(zVar);
            return this;
        }

        private c() {
            super(y.DEFAULT_INSTANCE);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.protobuf.z.b0(y.class, yVar);
    }

    private y() {
    }

    /* access modifiers changed from: private */
    public void h0(Iterable<? extends b> iterable) {
        i0();
        com.google.protobuf.a.h(iterable, this.aggregations_);
    }

    private void i0() {
        d0.j<b> jVar = this.aggregations_;
        if (!jVar.t()) {
            this.aggregations_ = com.google.protobuf.z.Q(jVar);
        }
    }

    public static c j0() {
        return (c) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void k0(z zVar) {
        zVar.getClass();
        this.queryType_ = zVar;
        this.queryTypeCase_ = 1;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29613a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new c((a) null);
            case 3:
                return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", z.class, "aggregations_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<y> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (y.class) {
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
