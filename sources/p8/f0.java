package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: WriteRequest */
public final class f0 extends z<f0, b> implements w0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final f0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile f1<f0> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private String database_ = MaxReward.DEFAULT_LABEL;
    private p0<String, String> labels_ = p0.e();
    private String streamId_ = MaxReward.DEFAULT_LABEL;
    private i streamToken_ = i.f27039b;
    private d0.j<e0> writes_ = z.F();

    /* compiled from: WriteRequest */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29556a;

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
                f29556a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29556a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29556a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29556a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29556a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29556a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29556a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.f0.a.<clinit>():void");
        }
    }

    /* compiled from: WriteRequest */
    public static final class b extends z.a<f0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(e0 e0Var) {
            w();
            ((f0) this.f27301b).i0(e0Var);
            return this;
        }

        public b G(String str) {
            w();
            ((f0) this.f27301b).m0(str);
            return this;
        }

        public b H(i iVar) {
            w();
            ((f0) this.f27301b).n0(iVar);
            return this;
        }

        private b() {
            super(f0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WriteRequest */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, String> f29557a;

        static {
            b2.b bVar = b2.b.STRING;
            f29557a = o0.d(bVar, MaxReward.DEFAULT_LABEL, bVar, MaxReward.DEFAULT_LABEL);
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        z.b0(f0.class, f0Var);
    }

    private f0() {
    }

    /* access modifiers changed from: private */
    public void i0(e0 e0Var) {
        e0Var.getClass();
        j0();
        this.writes_.add(e0Var);
    }

    private void j0() {
        d0.j<e0> jVar = this.writes_;
        if (!jVar.t()) {
            this.writes_ = z.Q(jVar);
        }
    }

    public static f0 k0() {
        return DEFAULT_INSTANCE;
    }

    public static b l0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void m0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* access modifiers changed from: private */
    public void n0(i iVar) {
        iVar.getClass();
        this.streamToken_ = iVar;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29556a[fVar.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", e0.class, "streamToken_", "labels_", c.f29557a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<f0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (f0.class) {
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
