package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: NativeConfigurationOuterClass */
public final class b2 extends z<b2, a> implements w0 {
    /* access modifiers changed from: private */
    public static final b2 DEFAULT_INSTANCE;
    public static final int MAX_DURATION_FIELD_NUMBER = 1;
    private static volatile f1<b2> PARSER = null;
    public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
    public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
    public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
    public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
    public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
    private int maxDuration_;
    private float retryJitterPct_;
    private int retryMaxInterval_;
    private float retryScalingFactor_;
    private int retryWaitBase_;
    private boolean shouldStoreLocally_;

    /* compiled from: NativeConfigurationOuterClass */
    public static final class a extends z.a<b2, a> implements w0 {
        /* synthetic */ a(v1 v1Var) {
            this();
        }

        public a F(int i10) {
            w();
            ((b2) this.f27301b).s0(i10);
            return this;
        }

        public a G(float f10) {
            w();
            ((b2) this.f27301b).t0(f10);
            return this;
        }

        public a H(int i10) {
            w();
            ((b2) this.f27301b).u0(i10);
            return this;
        }

        public a I(float f10) {
            w();
            ((b2) this.f27301b).v0(f10);
            return this;
        }

        public a J(int i10) {
            w();
            ((b2) this.f27301b).w0(i10);
            return this;
        }

        public a K(boolean z10) {
            w();
            ((b2) this.f27301b).x0(z10);
            return this;
        }

        private a() {
            super(b2.DEFAULT_INSTANCE);
        }
    }

    static {
        b2 b2Var = new b2();
        DEFAULT_INSTANCE = b2Var;
        z.b0(b2.class, b2Var);
    }

    private b2() {
    }

    public static b2 l0() {
        return DEFAULT_INSTANCE;
    }

    public static a r0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void s0(int i10) {
        this.maxDuration_ = i10;
    }

    /* access modifiers changed from: private */
    public void t0(float f10) {
        this.retryJitterPct_ = f10;
    }

    /* access modifiers changed from: private */
    public void u0(int i10) {
        this.retryMaxInterval_ = i10;
    }

    /* access modifiers changed from: private */
    public void v0(float f10) {
        this.retryScalingFactor_ = f10;
    }

    /* access modifiers changed from: private */
    public void w0(int i10) {
        this.retryWaitBase_ = i10;
    }

    /* access modifiers changed from: private */
    public void x0(boolean z10) {
        this.shouldStoreLocally_ = z10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new b2();
            case 2:
                return new a((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b2.class) {
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

    public int m0() {
        return this.maxDuration_;
    }

    public float n0() {
        return this.retryJitterPct_;
    }

    public int o0() {
        return this.retryMaxInterval_;
    }

    public int p0() {
        return this.retryWaitBase_;
    }

    public boolean q0() {
        return this.shouldStoreLocally_;
    }
}
