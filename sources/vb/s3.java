package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: UniversalRequestOuterClass */
public final class s3 extends z<s3, a> implements w0 {
    public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 11;
    /* access modifiers changed from: private */
    public static final s3 DEFAULT_INSTANCE;
    public static final int DEVICE_MAKE_FIELD_NUMBER = 1;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
    public static final int GAME_ID_FIELD_NUMBER = 8;
    public static final int IDFI_FIELD_NUMBER = 4;
    public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 10;
    public static final int MEDIATION_VERSION_FIELD_NUMBER = 12;
    public static final int OS_VERSION_FIELD_NUMBER = 3;
    private static volatile f1<s3> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 9;
    public static final int SDK_VERSION_FIELD_NUMBER = 5;
    public static final int SDK_VERSION_NAME_FIELD_NUMBER = 7;
    private int bitField0_;
    private String customMediationName_ = MaxReward.DEFAULT_LABEL;
    private String deviceMake_ = MaxReward.DEFAULT_LABEL;
    private String deviceModel_ = MaxReward.DEFAULT_LABEL;
    private String gameId_ = MaxReward.DEFAULT_LABEL;
    private String idfi_ = MaxReward.DEFAULT_LABEL;
    private int mediationProvider_;
    private String mediationVersion_ = MaxReward.DEFAULT_LABEL;
    private String osVersion_ = MaxReward.DEFAULT_LABEL;
    private int platform_;
    private String sdkVersionName_ = MaxReward.DEFAULT_LABEL;
    private int sdkVersion_;

    /* compiled from: UniversalRequestOuterClass */
    public static final class a extends z.a<s3, a> implements w0 {
        /* synthetic */ a(r3 r3Var) {
            this();
        }

        public f0 F() {
            return ((s3) this.f27301b).q0();
        }

        public a G(String str) {
            w();
            ((s3) this.f27301b).s0(str);
            return this;
        }

        public a H(String str) {
            w();
            ((s3) this.f27301b).t0(str);
            return this;
        }

        public a I(String str) {
            w();
            ((s3) this.f27301b).u0(str);
            return this;
        }

        public a J(String str) {
            w();
            ((s3) this.f27301b).v0(str);
            return this;
        }

        public a K(String str) {
            w();
            ((s3) this.f27301b).w0(str);
            return this;
        }

        public a L(f0 f0Var) {
            w();
            ((s3) this.f27301b).x0(f0Var);
            return this;
        }

        public a M(String str) {
            w();
            ((s3) this.f27301b).y0(str);
            return this;
        }

        public a N(String str) {
            w();
            ((s3) this.f27301b).z0(str);
            return this;
        }

        public a O(g0 g0Var) {
            w();
            ((s3) this.f27301b).A0(g0Var);
            return this;
        }

        public a P(int i10) {
            w();
            ((s3) this.f27301b).B0(i10);
            return this;
        }

        public a Q(String str) {
            w();
            ((s3) this.f27301b).C0(str);
            return this;
        }

        private a() {
            super(s3.DEFAULT_INSTANCE);
        }
    }

    static {
        s3 s3Var = new s3();
        DEFAULT_INSTANCE = s3Var;
        z.b0(s3.class, s3Var);
    }

    private s3() {
    }

    /* access modifiers changed from: private */
    public void A0(g0 g0Var) {
        this.platform_ = g0Var.I();
    }

    /* access modifiers changed from: private */
    public void B0(int i10) {
        this.sdkVersion_ = i10;
    }

    /* access modifiers changed from: private */
    public void C0(String str) {
        str.getClass();
        this.sdkVersionName_ = str;
    }

    public static a r0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.customMediationName_ = str;
    }

    /* access modifiers changed from: private */
    public void t0(String str) {
        str.getClass();
        this.deviceMake_ = str;
    }

    /* access modifiers changed from: private */
    public void u0(String str) {
        str.getClass();
        this.deviceModel_ = str;
    }

    /* access modifiers changed from: private */
    public void v0(String str) {
        str.getClass();
        this.gameId_ = str;
    }

    /* access modifiers changed from: private */
    public void w0(String str) {
        str.getClass();
        this.idfi_ = str;
    }

    /* access modifiers changed from: private */
    public void x0(f0 f0Var) {
        this.mediationProvider_ = f0Var.I();
    }

    /* access modifiers changed from: private */
    public void y0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediationVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void z0(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (r3.f39076a[fVar.ordinal()]) {
            case 1:
                return new s3();
            case 2:
                return new a((r3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0007Ȉ\bȈ\t\f\n\f\u000bለ\u0000\fለ\u0001", new Object[]{"bitField0_", "deviceMake_", "deviceModel_", "osVersion_", "idfi_", "sdkVersion_", "sdkVersionName_", "gameId_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<s3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (s3.class) {
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

    public f0 q0() {
        f0 c10 = f0.c(this.mediationProvider_);
        return c10 == null ? f0.UNRECOGNIZED : c10;
    }
}
