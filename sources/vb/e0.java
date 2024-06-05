package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: ClientInfoOuterClass */
public final class e0 extends z<e0, a> implements w0 {
    public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 7;
    /* access modifiers changed from: private */
    public static final e0 DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 3;
    public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 6;
    public static final int MEDIATION_VERSION_FIELD_NUMBER = 8;
    private static volatile f1<e0> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    public static final int SDK_VERSION_NAME_FIELD_NUMBER = 2;
    public static final int TEST_FIELD_NUMBER = 4;
    private int bitField0_;
    private String customMediationName_ = MaxReward.DEFAULT_LABEL;
    private String gameId_ = MaxReward.DEFAULT_LABEL;
    private int mediationProvider_;
    private String mediationVersion_ = MaxReward.DEFAULT_LABEL;
    private int platform_;
    private String sdkVersionName_ = MaxReward.DEFAULT_LABEL;
    private int sdkVersion_;
    private boolean test_;

    /* compiled from: ClientInfoOuterClass */
    public static final class a extends z.a<e0, a> implements w0 {
        /* synthetic */ a(d0 d0Var) {
            this();
        }

        public f0 F() {
            return ((e0) this.f27301b).n0();
        }

        public a G(String str) {
            w();
            ((e0) this.f27301b).p0(str);
            return this;
        }

        public a H(String str) {
            w();
            ((e0) this.f27301b).q0(str);
            return this;
        }

        public a I(f0 f0Var) {
            w();
            ((e0) this.f27301b).r0(f0Var);
            return this;
        }

        public a J(String str) {
            w();
            ((e0) this.f27301b).s0(str);
            return this;
        }

        public a K(g0 g0Var) {
            w();
            ((e0) this.f27301b).t0(g0Var);
            return this;
        }

        public a L(int i10) {
            w();
            ((e0) this.f27301b).u0(i10);
            return this;
        }

        public a M(String str) {
            w();
            ((e0) this.f27301b).v0(str);
            return this;
        }

        public a N(boolean z10) {
            w();
            ((e0) this.f27301b).w0(z10);
            return this;
        }

        private a() {
            super(e0.DEFAULT_INSTANCE);
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        z.b0(e0.class, e0Var);
    }

    private e0() {
    }

    public static a o0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void p0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.customMediationName_ = str;
    }

    /* access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.gameId_ = str;
    }

    /* access modifiers changed from: private */
    public void r0(f0 f0Var) {
        this.mediationProvider_ = f0Var.I();
    }

    /* access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediationVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void t0(g0 g0Var) {
        this.platform_ = g0Var.I();
    }

    /* access modifiers changed from: private */
    public void u0(int i10) {
        this.sdkVersion_ = i10;
    }

    /* access modifiers changed from: private */
    public void v0(String str) {
        str.getClass();
        this.sdkVersionName_ = str;
    }

    /* access modifiers changed from: private */
    public void w0(boolean z10) {
        this.test_ = z10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (d0.f38933a[fVar.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new a((d0) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f\u0006\f\u0007ለ\u0000\bለ\u0001", new Object[]{"bitField0_", "sdkVersion_", "sdkVersionName_", "gameId_", "test_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e0.class) {
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

    public f0 n0() {
        f0 c10 = f0.c(this.mediationProvider_);
        return c10 == null ? f0.UNRECOGNIZED : c10;
    }
}
