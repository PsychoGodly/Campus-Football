package p8;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: TransactionOptions */
public final class c0 extends z<c0, b> implements w0 {
    /* access modifiers changed from: private */
    public static final c0 DEFAULT_INSTANCE;
    private static volatile f1<c0> PARSER = null;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    /* compiled from: TransactionOptions */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29524a;

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
                f29524a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29524a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29524a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29524a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29524a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29524a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29524a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.c0.a.<clinit>():void");
        }
    }

    /* compiled from: TransactionOptions */
    public static final class b extends z.a<c0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(c0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TransactionOptions */
    public static final class c extends z<c, a> implements w0 {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        private static volatile f1<c> PARSER = null;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        /* compiled from: TransactionOptions */
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
            z.b0(c.class, cVar);
        }

        private c() {
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29524a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", t1.class});
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

    /* compiled from: TransactionOptions */
    public static final class d extends z<d, a> implements w0 {
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        private static volatile f1<d> PARSER = null;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private i retryTransaction_ = i.f27039b;

        /* compiled from: TransactionOptions */
        public static final class a extends z.a<d, a> implements w0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            z.b0(d.class, dVar);
        }

        private d() {
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a.f29524a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a((a) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
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
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        z.b0(c0.class, c0Var);
    }

    private c0() {
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29524a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mode_", "modeCase_", c.class, d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c0.class) {
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
