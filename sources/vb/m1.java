package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: InitializationRequestOuterClass */
public final class m1 extends z<m1, a> implements w0 {
    public static final int BUNDLE_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final m1 DEFAULT_INSTANCE;
    public static final int DEVICE_MAKE_FIELD_NUMBER = 2;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 4;
    private static volatile f1<m1> PARSER = null;
    public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 5;
    private int bitField0_;
    private String bundleId_ = MaxReward.DEFAULT_LABEL;
    private String deviceMake_ = MaxReward.DEFAULT_LABEL;
    private String deviceModel_ = MaxReward.DEFAULT_LABEL;
    private String osVersion_ = MaxReward.DEFAULT_LABEL;
    private int trackingAuthStatus_;

    /* compiled from: InitializationRequestOuterClass */
    public static final class a extends z.a<m1, a> implements w0 {
        /* synthetic */ a(l1 l1Var) {
            this();
        }

        public a F(String str) {
            w();
            ((m1) this.f27301b).k0(str);
            return this;
        }

        public a G(String str) {
            w();
            ((m1) this.f27301b).l0(str);
            return this;
        }

        public a H(String str) {
            w();
            ((m1) this.f27301b).m0(str);
            return this;
        }

        public a I(String str) {
            w();
            ((m1) this.f27301b).n0(str);
            return this;
        }

        private a() {
            super(m1.DEFAULT_INSTANCE);
        }
    }

    static {
        m1 m1Var = new m1();
        DEFAULT_INSTANCE = m1Var;
        z.b0(m1.class, m1Var);
    }

    private m1() {
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.bundleId_ = str;
    }

    /* access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.deviceMake_ = str;
    }

    /* access modifiers changed from: private */
    public void m0(String str) {
        str.getClass();
        this.deviceModel_ = str;
    }

    /* access modifiers changed from: private */
    public void n0(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (l1.f39015a[fVar.ordinal()]) {
            case 1:
                return new m1();
            case 2:
                return new a((l1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005င\u0000", new Object[]{"bitField0_", "bundleId_", "deviceMake_", "deviceModel_", "osVersion_", "trackingAuthStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<m1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (m1.class) {
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
