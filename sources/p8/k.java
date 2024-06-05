package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.Map;

/* compiled from: Document */
public final class k extends z<k, b> implements w0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<k> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private t1 createTime_;
    private p0<String, d0> fields_ = p0.e();
    private String name_ = MaxReward.DEFAULT_LABEL;
    private t1 updateTime_;

    /* compiled from: Document */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29564a;

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
                f29564a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29564a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29564a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29564a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29564a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29564a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29564a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.k.a.<clinit>():void");
        }
    }

    /* compiled from: Document */
    public static final class b extends z.a<k, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(Map<String, d0> map) {
            w();
            ((k) this.f27301b).k0().putAll(map);
            return this;
        }

        public b G(String str) {
            w();
            ((k) this.f27301b).q0(str);
            return this;
        }

        public b H(t1 t1Var) {
            w();
            ((k) this.f27301b).r0(t1Var);
            return this;
        }

        private b() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Document */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, d0> f29565a = o0.d(b2.b.STRING, MaxReward.DEFAULT_LABEL, b2.b.MESSAGE, d0.t0());
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        z.b0(k.class, kVar);
    }

    private k() {
    }

    public static k i0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, d0> k0() {
        return o0();
    }

    private p0<String, d0> n0() {
        return this.fields_;
    }

    private p0<String, d0> o0() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.m();
        }
        return this.fields_;
    }

    public static b p0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void r0(t1 t1Var) {
        t1Var.getClass();
        this.updateTime_ = t1Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29564a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", c.f29565a, "createTime_", "updateTime_"});
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

    public Map<String, d0> j0() {
        return Collections.unmodifiableMap(n0());
    }

    public String l0() {
        return this.name_;
    }

    public t1 m0() {
        t1 t1Var = this.updateTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }
}
