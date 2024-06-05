package w7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import p8.e0;

/* compiled from: WriteBatch */
public final class e extends z<e, b> implements w0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile f1<e> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private d0.j<e0> baseWrites_ = z.F();
    private int batchId_;
    private t1 localWriteTime_;
    private d0.j<e0> writes_ = z.F();

    /* compiled from: WriteBatch */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30849a;

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
                f30849a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30849a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30849a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30849a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30849a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30849a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30849a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.e.a.<clinit>():void");
        }
    }

    /* compiled from: WriteBatch */
    public static final class b extends z.a<e, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(e0 e0Var) {
            w();
            ((e) this.f27301b).j0(e0Var);
            return this;
        }

        public b G(e0 e0Var) {
            w();
            ((e) this.f27301b).k0(e0Var);
            return this;
        }

        public b H(int i10) {
            w();
            ((e) this.f27301b).w0(i10);
            return this;
        }

        public b I(t1 t1Var) {
            w();
            ((e) this.f27301b).x0(t1Var);
            return this;
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.b0(e.class, eVar);
    }

    private e() {
    }

    /* access modifiers changed from: private */
    public void j0(e0 e0Var) {
        e0Var.getClass();
        l0();
        this.baseWrites_.add(e0Var);
    }

    /* access modifiers changed from: private */
    public void k0(e0 e0Var) {
        e0Var.getClass();
        m0();
        this.writes_.add(e0Var);
    }

    private void l0() {
        d0.j<e0> jVar = this.baseWrites_;
        if (!jVar.t()) {
            this.baseWrites_ = z.Q(jVar);
        }
    }

    private void m0() {
        d0.j<e0> jVar = this.writes_;
        if (!jVar.t()) {
            this.writes_ = z.Q(jVar);
        }
    }

    public static b t0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    public static e u0(i iVar) throws com.google.protobuf.e0 {
        return (e) z.U(DEFAULT_INSTANCE, iVar);
    }

    public static e v0(byte[] bArr) throws com.google.protobuf.e0 {
        return (e) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void w0(int i10) {
        this.batchId_ = i10;
    }

    /* access modifiers changed from: private */
    public void x0(t1 t1Var) {
        t1Var.getClass();
        this.localWriteTime_ = t1Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        Class<e0> cls = e0.class;
        switch (a.f30849a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", cls, "localWriteTime_", "baseWrites_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e.class) {
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

    public e0 n0(int i10) {
        return this.baseWrites_.get(i10);
    }

    public int o0() {
        return this.baseWrites_.size();
    }

    public int p0() {
        return this.batchId_;
    }

    public t1 q0() {
        t1 t1Var = this.localWriteTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public e0 r0(int i10) {
        return this.writes_.get(i10);
    }

    public int s0() {
        return this.writes_.size();
    }
}
