package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.Map;

/* compiled from: MapValue */
public final class u extends z<u, b> implements w0 {
    /* access modifiers changed from: private */
    public static final u DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile f1<u> PARSER;
    private p0<String, d0> fields_ = p0.e();

    /* compiled from: MapValue */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29603a;

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
                f29603a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29603a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29603a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29603a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29603a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29603a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29603a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.u.a.<clinit>():void");
        }
    }

    /* compiled from: MapValue */
    public static final class b extends z.a<u, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean F(String str) {
            str.getClass();
            return ((u) this.f27301b).i0().containsKey(str);
        }

        public b G(Map<String, d0> map) {
            w();
            ((u) this.f27301b).l0().putAll(map);
            return this;
        }

        public b H(String str, d0 d0Var) {
            str.getClass();
            d0Var.getClass();
            w();
            ((u) this.f27301b).l0().put(str, d0Var);
            return this;
        }

        public b I(String str) {
            str.getClass();
            w();
            ((u) this.f27301b).l0().remove(str);
            return this;
        }

        private b() {
            super(u.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: MapValue */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, d0> f29604a = o0.d(b2.b.STRING, MaxReward.DEFAULT_LABEL, b2.b.MESSAGE, d0.t0());
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        z.b0(u.class, uVar);
    }

    private u() {
    }

    public static u g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, d0> l0() {
        return n0();
    }

    private p0<String, d0> m0() {
        return this.fields_;
    }

    private p0<String, d0> n0() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.m();
        }
        return this.fields_;
    }

    public static b o0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29603a[fVar.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f29604a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<u> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (u.class) {
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

    public int h0() {
        return m0().size();
    }

    public Map<String, d0> i0() {
        return Collections.unmodifiableMap(m0());
    }

    public d0 j0(String str, d0 d0Var) {
        str.getClass();
        p0<String, d0> m02 = m0();
        return m02.containsKey(str) ? m02.get(str) : d0Var;
    }

    public d0 k0(String str) {
        str.getClass();
        p0<String, d0> m02 = m0();
        if (m02.containsKey(str)) {
            return m02.get(str);
        }
        throw new IllegalArgumentException();
    }
}
