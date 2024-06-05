package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: NativeConfigurationOuterClass */
public final class c2 extends z<c2, a> implements w0 {
    public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final c2 DEFAULT_INSTANCE;
    public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
    private static volatile f1<c2> PARSER = null;
    public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
    public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
    private int connectTimeoutMs_;
    private int overallTimeoutMs_;
    private int readTimeoutMs_;
    private int writeTimeoutMs_;

    /* compiled from: NativeConfigurationOuterClass */
    public static final class a extends z.a<c2, a> implements w0 {
        /* synthetic */ a(v1 v1Var) {
            this();
        }

        public a F(int i10) {
            w();
            ((c2) this.f27301b).o0(i10);
            return this;
        }

        public a G(int i10) {
            w();
            ((c2) this.f27301b).p0(i10);
            return this;
        }

        public a H(int i10) {
            w();
            ((c2) this.f27301b).q0(i10);
            return this;
        }

        public a I(int i10) {
            w();
            ((c2) this.f27301b).r0(i10);
            return this;
        }

        private a() {
            super(c2.DEFAULT_INSTANCE);
        }
    }

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        z.b0(c2.class, c2Var);
    }

    private c2() {
    }

    public static c2 k0() {
        return DEFAULT_INSTANCE;
    }

    public static a n0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void o0(int i10) {
        this.connectTimeoutMs_ = i10;
    }

    /* access modifiers changed from: private */
    public void p0(int i10) {
        this.overallTimeoutMs_ = i10;
    }

    /* access modifiers changed from: private */
    public void q0(int i10) {
        this.readTimeoutMs_ = i10;
    }

    /* access modifiers changed from: private */
    public void r0(int i10) {
        this.writeTimeoutMs_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new c2();
            case 2:
                return new a((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c2.class) {
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

    public int j0() {
        return this.connectTimeoutMs_;
    }

    public int l0() {
        return this.readTimeoutMs_;
    }

    public int m0() {
        return this.writeTimeoutMs_;
    }
}
