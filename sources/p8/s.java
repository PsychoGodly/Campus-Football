package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Map;

/* compiled from: ListenRequest */
public final class s extends z<s, b> implements w0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final s DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile f1<s> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private String database_ = MaxReward.DEFAULT_LABEL;
    private p0<String, String> labels_ = p0.e();
    private int targetChangeCase_ = 0;
    private Object targetChange_;

    /* compiled from: ListenRequest */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29592a;

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
                f29592a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29592a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29592a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29592a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29592a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29592a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29592a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.s.a.<clinit>():void");
        }
    }

    /* compiled from: ListenRequest */
    public static final class b extends z.a<s, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(Map<String, String> map) {
            w();
            ((s) this.f27301b).k0().putAll(map);
            return this;
        }

        public b G(a0 a0Var) {
            w();
            ((s) this.f27301b).n0(a0Var);
            return this;
        }

        public b H(String str) {
            w();
            ((s) this.f27301b).o0(str);
            return this;
        }

        public b I(int i10) {
            w();
            ((s) this.f27301b).p0(i10);
            return this;
        }

        private b() {
            super(s.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ListenRequest */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, String> f29593a;

        static {
            b2.b bVar = b2.b.STRING;
            f29593a = o0.d(bVar, MaxReward.DEFAULT_LABEL, bVar, MaxReward.DEFAULT_LABEL);
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        z.b0(s.class, sVar);
    }

    private s() {
    }

    public static s j0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, String> k0() {
        return l0();
    }

    private p0<String, String> l0() {
        if (!this.labels_.j()) {
            this.labels_ = this.labels_.m();
        }
        return this.labels_;
    }

    public static b m0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void n0(a0 a0Var) {
        a0Var.getClass();
        this.targetChange_ = a0Var;
        this.targetChangeCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* access modifiers changed from: private */
    public void p0(int i10) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i10);
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29592a[fVar.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", a0.class, "labels_", c.f29593a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<s> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (s.class) {
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
