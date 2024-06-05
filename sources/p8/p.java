package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;
import p8.b;

/* compiled from: DocumentTransform */
public final class p extends z<p, b> implements w0 {
    /* access modifiers changed from: private */
    public static final p DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile f1<p> PARSER;
    private String document_ = MaxReward.DEFAULT_LABEL;
    private d0.j<c> fieldTransforms_ = z.F();

    /* compiled from: DocumentTransform */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29570a;

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
                f29570a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29570a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29570a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29570a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29570a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29570a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29570a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.p.a.<clinit>():void");
        }
    }

    /* compiled from: DocumentTransform */
    public static final class b extends z.a<p, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: DocumentTransform */
    public static final class c extends z<c, a> implements w0 {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile f1<c> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private String fieldPath_ = MaxReward.DEFAULT_LABEL;
        private int transformTypeCase_ = 0;
        private Object transformType_;

        /* compiled from: DocumentTransform */
        public static final class a extends z.a<c, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a F(b.C0323b bVar) {
                w();
                ((c) this.f27301b).r0((b) bVar.build());
                return this;
            }

            public a G(String str) {
                w();
                ((c) this.f27301b).s0(str);
                return this;
            }

            public a H(d0 d0Var) {
                w();
                ((c) this.f27301b).t0(d0Var);
                return this;
            }

            public a I(b.C0323b bVar) {
                w();
                ((c) this.f27301b).u0((b) bVar.build());
                return this;
            }

            public a J(b bVar) {
                w();
                ((c) this.f27301b).v0(bVar);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: DocumentTransform */
        public enum b implements d0.c {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: f  reason: collision with root package name */
            private static final d0.d<b> f29574f = null;

            /* renamed from: a  reason: collision with root package name */
            private final int f29576a;

            /* compiled from: DocumentTransform */
            class a implements d0.d<b> {
                a() {
                }

                /* renamed from: b */
                public b a(int i10) {
                    return b.a(i10);
                }
            }

            static {
                f29574f = new a();
            }

            private b(int i10) {
                this.f29576a = i10;
            }

            public static b a(int i10) {
                if (i10 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i10 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            public final int I() {
                if (this != UNRECOGNIZED) {
                    return this.f29576a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: p8.p$c$c  reason: collision with other inner class name */
        /* compiled from: DocumentTransform */
        public enum C0324c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            private final int f29585a;

            private C0324c(int i10) {
                this.f29585a = i10;
            }

            public static C0324c a(int i10) {
                if (i10 == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i10) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            z.b0(c.class, cVar);
        }

        private c() {
        }

        public static a q0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void r0(b bVar) {
            bVar.getClass();
            this.transformType_ = bVar;
            this.transformTypeCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void s0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* access modifiers changed from: private */
        public void t0(d0 d0Var) {
            d0Var.getClass();
            this.transformType_ = d0Var;
            this.transformTypeCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void u0(b bVar) {
            bVar.getClass();
            this.transformType_ = bVar;
            this.transformTypeCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void v0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.I());
            this.transformTypeCase_ = 2;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            Class<b> cls = b.class;
            Class<d0> cls2 = d0.class;
            switch (a.f29570a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", cls2, cls2, cls2, cls, cls});
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

        public b k0() {
            if (this.transformTypeCase_ == 6) {
                return (b) this.transformType_;
            }
            return b.l0();
        }

        public String l0() {
            return this.fieldPath_;
        }

        public d0 m0() {
            if (this.transformTypeCase_ == 3) {
                return (d0) this.transformType_;
            }
            return d0.t0();
        }

        public b n0() {
            if (this.transformTypeCase_ == 7) {
                return (b) this.transformType_;
            }
            return b.l0();
        }

        public b o0() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b a10 = b.a(((Integer) this.transformType_).intValue());
            return a10 == null ? b.UNRECOGNIZED : a10;
        }

        public C0324c p0() {
            return C0324c.a(this.transformTypeCase_);
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        z.b0(p.class, pVar);
    }

    private p() {
    }

    public static p f0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29570a[fVar.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<p> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (p.class) {
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

    public List<c> g0() {
        return this.fieldTransforms_;
    }
}
