package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: NativeConfigurationOuterClass */
public final class w1 extends z<w1, a> implements w0 {
    /* access modifiers changed from: private */
    public static final w1 DEFAULT_INSTANCE;
    public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
    public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
    private static volatile f1<w1> PARSER = null;
    public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
    private int getTokenTimeoutMs_;
    private int loadTimeoutMs_;
    private int showTimeoutMs_;

    /* compiled from: NativeConfigurationOuterClass */
    public static final class a extends z.a<w1, a> implements w0 {
        /* synthetic */ a(v1 v1Var) {
            this();
        }

        public a F(int i10) {
            w();
            ((w1) this.f27301b).m0(i10);
            return this;
        }

        public a G(int i10) {
            w();
            ((w1) this.f27301b).n0(i10);
            return this;
        }

        public a H(int i10) {
            w();
            ((w1) this.f27301b).o0(i10);
            return this;
        }

        private a() {
            super(w1.DEFAULT_INSTANCE);
        }
    }

    static {
        w1 w1Var = new w1();
        DEFAULT_INSTANCE = w1Var;
        z.b0(w1.class, w1Var);
    }

    private w1() {
    }

    public static w1 i0() {
        return DEFAULT_INSTANCE;
    }

    public static a l0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void m0(int i10) {
        this.getTokenTimeoutMs_ = i10;
    }

    /* access modifiers changed from: private */
    public void n0(int i10) {
        this.loadTimeoutMs_ = i10;
    }

    /* access modifiers changed from: private */
    public void o0(int i10) {
        this.showTimeoutMs_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new w1();
            case 2:
                return new a((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<w1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (w1.class) {
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
        return this.loadTimeoutMs_;
    }

    public int k0() {
        return this.showTimeoutMs_;
    }
}
