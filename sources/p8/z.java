package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;
import p8.j;

/* compiled from: StructuredQuery */
public final class z extends com.google.protobuf.z<z, b> implements w0 {
    /* access modifiers changed from: private */
    public static final z DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile f1<z> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private j endAt_;
    private d0.j<c> from_ = com.google.protobuf.z.F();
    private a0 limit_;
    private int offset_;
    private d0.j<i> orderBy_ = com.google.protobuf.z.F();
    private j select_;
    private j startAt_;
    private h where_;

    /* compiled from: StructuredQuery */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29614a;

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
                f29614a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29614a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29614a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29614a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29614a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29614a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29614a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.z.a.<clinit>():void");
        }
    }

    /* compiled from: StructuredQuery */
    public static final class b extends z.a<z, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(c.a aVar) {
            w();
            ((z) this.f27301b).l0((c) aVar.build());
            return this;
        }

        public b G(i iVar) {
            w();
            ((z) this.f27301b).m0(iVar);
            return this;
        }

        public b H(j.b bVar) {
            w();
            ((z) this.f27301b).D0((j) bVar.build());
            return this;
        }

        public b I(a0.b bVar) {
            w();
            ((z) this.f27301b).E0((a0) bVar.build());
            return this;
        }

        public b J(j.b bVar) {
            w();
            ((z) this.f27301b).F0((j) bVar.build());
            return this;
        }

        public b K(h hVar) {
            w();
            ((z) this.f27301b).G0(hVar);
            return this;
        }

        private b() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: StructuredQuery */
    public static final class c extends com.google.protobuf.z<c, a> implements w0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        private static volatile f1<c> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = MaxReward.DEFAULT_LABEL;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<c, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(boolean z10) {
                w();
                ((c) this.f27301b).k0(z10);
                return this;
            }

            public a G(String str) {
                w();
                ((c) this.f27301b).l0(str);
                return this;
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

        public static a j0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void k0(boolean z10) {
            this.allDescendants_ = z10;
        }

        /* access modifiers changed from: private */
        public void l0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

        public boolean h0() {
            return this.allDescendants_;
        }

        public String i0() {
            return this.collectionId_;
        }
    }

    /* compiled from: StructuredQuery */
    public static final class d extends com.google.protobuf.z<d, a> implements w0 {
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f1<d> PARSER;
        private d0.j<h> filters_ = com.google.protobuf.z.F();
        private int op_;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<d, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(Iterable<? extends h> iterable) {
                w();
                ((d) this.f27301b).h0(iterable);
                return this;
            }

            public a G(b bVar) {
                w();
                ((d) this.f27301b).n0(bVar);
                return this;
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery */
        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: g  reason: collision with root package name */
            private static final d0.d<b> f29619g = null;

            /* renamed from: a  reason: collision with root package name */
            private final int f29621a;

            /* compiled from: StructuredQuery */
            class a implements d0.d<b> {
                a() {
                }

                /* renamed from: b */
                public b a(int i10) {
                    return b.a(i10);
                }
            }

            static {
                f29619g = new a();
            }

            private b(int i10) {
                this.f29621a = i10;
            }

            public static b a(int i10) {
                if (i10 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return AND;
                }
                if (i10 != 2) {
                    return null;
                }
                return OR;
            }

            public final int I() {
                if (this != UNRECOGNIZED) {
                    return this.f29621a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.z.b0(d.class, dVar);
        }

        private d() {
        }

        /* access modifiers changed from: private */
        public void h0(Iterable<? extends h> iterable) {
            i0();
            com.google.protobuf.a.h(iterable, this.filters_);
        }

        private void i0() {
            d0.j<h> jVar = this.filters_;
            if (!jVar.t()) {
                this.filters_ = com.google.protobuf.z.Q(jVar);
            }
        }

        public static d j0() {
            return DEFAULT_INSTANCE;
        }

        public static a m0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void n0(b bVar) {
            this.op_ = bVar.I();
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
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

        public List<h> k0() {
            return this.filters_;
        }

        public b l0() {
            b a10 = b.a(this.op_);
            return a10 == null ? b.UNRECOGNIZED : a10;
        }
    }

    /* compiled from: StructuredQuery */
    public enum e implements d0.c {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: g  reason: collision with root package name */
        private static final d0.d<e> f29626g = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f29628a;

        /* compiled from: StructuredQuery */
        class a implements d0.d<e> {
            a() {
            }

            /* renamed from: b */
            public e a(int i10) {
                return e.a(i10);
            }
        }

        static {
            f29626g = new a();
        }

        private e(int i10) {
            this.f29628a = i10;
        }

        public static e a(int i10) {
            if (i10 == 0) {
                return DIRECTION_UNSPECIFIED;
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
                return this.f29628a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* compiled from: StructuredQuery */
    public static final class f extends com.google.protobuf.z<f, a> implements w0 {
        /* access modifiers changed from: private */
        public static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile f1<f> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private g field_;
        private int op_;
        private d0 value_;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<f, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(g gVar) {
                w();
                ((f) this.f27301b).n0(gVar);
                return this;
            }

            public a G(b bVar) {
                w();
                ((f) this.f27301b).o0(bVar);
                return this;
            }

            public a H(d0 d0Var) {
                w();
                ((f) this.f27301b).p0(d0Var);
                return this;
            }

            private a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery */
        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);
            

            /* renamed from: o  reason: collision with root package name */
            private static final d0.d<b> f29641o = null;

            /* renamed from: a  reason: collision with root package name */
            private final int f29643a;

            /* compiled from: StructuredQuery */
            class a implements d0.d<b> {
                a() {
                }

                /* renamed from: b */
                public b a(int i10) {
                    return b.a(i10);
                }
            }

            static {
                f29641o = new a();
            }

            private b(int i10) {
                this.f29643a = i10;
            }

            public static b a(int i10) {
                switch (i10) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            public final int I() {
                if (this != UNRECOGNIZED) {
                    return this.f29643a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            com.google.protobuf.z.b0(f.class, fVar);
        }

        private f() {
        }

        public static f i0() {
            return DEFAULT_INSTANCE;
        }

        public static a m0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void n0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        /* access modifiers changed from: private */
        public void o0(b bVar) {
            this.op_ = bVar.I();
        }

        /* access modifiers changed from: private */
        public void p0(d0 d0Var) {
            d0Var.getClass();
            this.value_ = d0Var;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<f> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (f.class) {
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

        public g j0() {
            g gVar = this.field_;
            return gVar == null ? g.g0() : gVar;
        }

        public b k0() {
            b a10 = b.a(this.op_);
            return a10 == null ? b.UNRECOGNIZED : a10;
        }

        public d0 l0() {
            d0 d0Var = this.value_;
            return d0Var == null ? d0.t0() : d0Var;
        }
    }

    /* compiled from: StructuredQuery */
    public static final class g extends com.google.protobuf.z<g, a> implements w0 {
        /* access modifiers changed from: private */
        public static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile f1<g> PARSER;
        private String fieldPath_ = MaxReward.DEFAULT_LABEL;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<g, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(String str) {
                w();
                ((g) this.f27301b).j0(str);
                return this;
            }

            private a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            com.google.protobuf.z.b0(g.class, gVar);
        }

        private g() {
        }

        public static g g0() {
            return DEFAULT_INSTANCE;
        }

        public static a i0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void j0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<g> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (g.class) {
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

        public String h0() {
            return this.fieldPath_;
        }
    }

    /* compiled from: StructuredQuery */
    public static final class h extends com.google.protobuf.z<h, a> implements w0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile f1<h> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<h, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(d.a aVar) {
                w();
                ((h) this.f27301b).o0((d) aVar.build());
                return this;
            }

            public a G(f.a aVar) {
                w();
                ((h) this.f27301b).p0((f) aVar.build());
                return this;
            }

            public a H(k.a aVar) {
                w();
                ((h) this.f27301b).q0((k) aVar.build());
                return this;
            }

            private a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery */
        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            private final int f29649a;

            private b(int i10) {
                this.f29649a = i10;
            }

            public static b a(int i10) {
                if (i10 == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i10 == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i10 == 2) {
                    return FIELD_FILTER;
                }
                if (i10 != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            com.google.protobuf.z.b0(h.class, hVar);
        }

        private h() {
        }

        public static h j0() {
            return DEFAULT_INSTANCE;
        }

        public static a n0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void o0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void p0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void q0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<h> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (h.class) {
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

        public d i0() {
            if (this.filterTypeCase_ == 1) {
                return (d) this.filterType_;
            }
            return d.j0();
        }

        public f k0() {
            if (this.filterTypeCase_ == 2) {
                return (f) this.filterType_;
            }
            return f.i0();
        }

        public b l0() {
            return b.a(this.filterTypeCase_);
        }

        public k m0() {
            if (this.filterTypeCase_ == 3) {
                return (k) this.filterType_;
            }
            return k.h0();
        }
    }

    /* compiled from: StructuredQuery */
    public static final class i extends com.google.protobuf.z<i, a> implements w0 {
        /* access modifiers changed from: private */
        public static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile f1<i> PARSER;
        private int direction_;
        private g field_;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<i, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(e eVar) {
                w();
                ((i) this.f27301b).k0(eVar);
                return this;
            }

            public a G(g gVar) {
                w();
                ((i) this.f27301b).l0(gVar);
                return this;
            }

            private a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            com.google.protobuf.z.b0(i.class, iVar);
        }

        private i() {
        }

        public static a j0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void k0(e eVar) {
            this.direction_ = eVar.I();
        }

        /* access modifiers changed from: private */
        public void l0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<i> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (i.class) {
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

        public e h0() {
            e a10 = e.a(this.direction_);
            return a10 == null ? e.UNRECOGNIZED : a10;
        }

        public g i0() {
            g gVar = this.field_;
            return gVar == null ? g.g0() : gVar;
        }
    }

    /* compiled from: StructuredQuery */
    public static final class j extends com.google.protobuf.z<j, a> implements w0 {
        /* access modifiers changed from: private */
        public static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile f1<j> PARSER;
        private d0.j<g> fields_ = com.google.protobuf.z.F();

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<j, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            private a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            com.google.protobuf.z.b0(j.class, jVar);
        }

        private j() {
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<j> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (j.class) {
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

    /* compiled from: StructuredQuery */
    public static final class k extends com.google.protobuf.z<k, a> implements w0 {
        /* access modifiers changed from: private */
        public static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f1<k> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* compiled from: StructuredQuery */
        public static final class a extends z.a<k, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(g gVar) {
                w();
                ((k) this.f27301b).l0(gVar);
                return this;
            }

            public a G(b bVar) {
                w();
                ((k) this.f27301b).m0(bVar);
                return this;
            }

            private a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery */
        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);
            

            /* renamed from: i  reason: collision with root package name */
            private static final d0.d<b> f29656i = null;

            /* renamed from: a  reason: collision with root package name */
            private final int f29658a;

            /* compiled from: StructuredQuery */
            class a implements d0.d<b> {
                a() {
                }

                /* renamed from: b */
                public b a(int i10) {
                    return b.a(i10);
                }
            }

            static {
                f29656i = new a();
            }

            private b(int i10) {
                this.f29658a = i10;
            }

            public static b a(int i10) {
                if (i10 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i10 == 2) {
                    return IS_NAN;
                }
                if (i10 == 3) {
                    return IS_NULL;
                }
                if (i10 == 4) {
                    return IS_NOT_NAN;
                }
                if (i10 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            public final int I() {
                if (this != UNRECOGNIZED) {
                    return this.f29658a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            com.google.protobuf.z.b0(k.class, kVar);
        }

        private k() {
        }

        public static k h0() {
            return DEFAULT_INSTANCE;
        }

        public static a k0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void l0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void m0(b bVar) {
            this.op_ = bVar.I();
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29614a[fVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a((a) null);
                case 3:
                    return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<k> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (k.class) {
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

        public g i0() {
            if (this.operandTypeCase_ == 2) {
                return (g) this.operandType_;
            }
            return g.g0();
        }

        public b j0() {
            b a10 = b.a(this.op_);
            return a10 == null ? b.UNRECOGNIZED : a10;
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.protobuf.z.b0(z.class, zVar);
    }

    private z() {
    }

    public static b C0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void D0(j jVar) {
        jVar.getClass();
        this.endAt_ = jVar;
    }

    /* access modifiers changed from: private */
    public void E0(a0 a0Var) {
        a0Var.getClass();
        this.limit_ = a0Var;
    }

    /* access modifiers changed from: private */
    public void F0(j jVar) {
        jVar.getClass();
        this.startAt_ = jVar;
    }

    /* access modifiers changed from: private */
    public void G0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
    }

    /* access modifiers changed from: private */
    public void l0(c cVar) {
        cVar.getClass();
        n0();
        this.from_.add(cVar);
    }

    /* access modifiers changed from: private */
    public void m0(i iVar) {
        iVar.getClass();
        o0();
        this.orderBy_.add(iVar);
    }

    private void n0() {
        d0.j<c> jVar = this.from_;
        if (!jVar.t()) {
            this.from_ = com.google.protobuf.z.Q(jVar);
        }
    }

    private void o0() {
        d0.j<i> jVar = this.orderBy_;
        if (!jVar.t()) {
            this.orderBy_ = com.google.protobuf.z.Q(jVar);
        }
    }

    public static z p0() {
        return DEFAULT_INSTANCE;
    }

    public boolean A0() {
        return this.startAt_ != null;
    }

    public boolean B0() {
        return this.where_ != null;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29614a[fVar.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new b((a) null);
            case 3:
                return com.google.protobuf.z.S(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<z> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (z.class) {
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

    public j q0() {
        j jVar = this.endAt_;
        return jVar == null ? j.k0() : jVar;
    }

    public c r0(int i10) {
        return this.from_.get(i10);
    }

    public int s0() {
        return this.from_.size();
    }

    public a0 t0() {
        a0 a0Var = this.limit_;
        return a0Var == null ? a0.g0() : a0Var;
    }

    public i u0(int i10) {
        return this.orderBy_.get(i10);
    }

    public int v0() {
        return this.orderBy_.size();
    }

    public j w0() {
        j jVar = this.startAt_;
        return jVar == null ? j.k0() : jVar;
    }

    public h x0() {
        h hVar = this.where_;
        return hVar == null ? h.j0() : hVar;
    }

    public boolean y0() {
        return this.endAt_ != null;
    }

    public boolean z0() {
        return this.limit_ != null;
    }
}
