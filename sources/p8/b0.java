package p8;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;

/* compiled from: TargetChange */
public final class b0 extends z<b0, b> implements w0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final b0 DEFAULT_INSTANCE;
    private static volatile f1<b0> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private t8.a cause_;
    private t1 readTime_;
    private i resumeToken_ = i.f27039b;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private d0.g targetIds_ = z.E();

    /* compiled from: TargetChange */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29514a;

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
                f29514a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29514a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29514a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29514a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29514a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29514a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29514a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.b0.a.<clinit>():void");
        }
    }

    /* compiled from: TargetChange */
    public static final class b extends z.a<b0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(b0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TargetChange */
    public enum c implements d0.c {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: i  reason: collision with root package name */
        private static final d0.d<c> f29521i = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f29523a;

        /* compiled from: TargetChange */
        class a implements d0.d<c> {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            f29521i = new a();
        }

        private c(int i10) {
            this.f29523a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return NO_CHANGE;
            }
            if (i10 == 1) {
                return ADD;
            }
            if (i10 == 2) {
                return REMOVE;
            }
            if (i10 == 3) {
                return CURRENT;
            }
            if (i10 != 4) {
                return null;
            }
            return RESET;
        }

        public final int I() {
            if (this != UNRECOGNIZED) {
                return this.f29523a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        z.b0(b0.class, b0Var);
    }

    private b0() {
    }

    public static b0 g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29514a[fVar.ordinal()]) {
            case 1:
                return new b0();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b0.class) {
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

    public t8.a f0() {
        t8.a aVar = this.cause_;
        return aVar == null ? t8.a.g0() : aVar;
    }

    public t1 h0() {
        t1 t1Var = this.readTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public i i0() {
        return this.resumeToken_;
    }

    public c j0() {
        c a10 = c.a(this.targetChangeType_);
        return a10 == null ? c.UNRECOGNIZED : a10;
    }

    public int k0() {
        return this.targetIds_.size();
    }

    public List<Integer> l0() {
        return this.targetIds_;
    }
}
