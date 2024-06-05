package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: InitializationRequestOuterClass */
public final class n1 extends z<n1, a> implements w0 {
    public static final int ANALYTICS_USER_ID_FIELD_NUMBER = 8;
    public static final int AUID_FIELD_NUMBER = 7;
    public static final int AUID_STRING_FIELD_NUMBER = 11;
    public static final int CACHE_FIELD_NUMBER = 5;
    public static final int CLIENT_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final n1 DEFAULT_INSTANCE;
    public static final int DEVICE_INFO_FIELD_NUMBER = 9;
    public static final int IDFI_FIELD_NUMBER = 3;
    public static final int IS_FIRST_INIT_FIELD_NUMBER = 10;
    public static final int LEGACY_FLOW_USER_CONSENT_FIELD_NUMBER = 6;
    private static volatile f1<n1> PARSER = null;
    public static final int PRIVACY_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    private String analyticsUserId_;
    private String auidString_;
    private i auid_;
    private int bitField0_;
    private i cache_;
    private e0 clientInfo_;
    private m1 deviceInfo_;
    private String idfi_ = MaxReward.DEFAULT_LABEL;
    private boolean isFirstInit_;
    private String legacyFlowUserConsent_;
    private i privacy_;
    private i sessionId_;

    /* compiled from: InitializationRequestOuterClass */
    public static final class a extends z.a<n1, a> implements w0 {
        /* synthetic */ a(l1 l1Var) {
            this();
        }

        public a F(String str) {
            w();
            ((n1) this.f27301b).r0(str);
            return this;
        }

        public a G(i iVar) {
            w();
            ((n1) this.f27301b).s0(iVar);
            return this;
        }

        public a H(String str) {
            w();
            ((n1) this.f27301b).t0(str);
            return this;
        }

        public a I(i iVar) {
            w();
            ((n1) this.f27301b).u0(iVar);
            return this;
        }

        public a J(e0 e0Var) {
            w();
            ((n1) this.f27301b).v0(e0Var);
            return this;
        }

        public a K(m1 m1Var) {
            w();
            ((n1) this.f27301b).w0(m1Var);
            return this;
        }

        public a L(String str) {
            w();
            ((n1) this.f27301b).x0(str);
            return this;
        }

        public a M(boolean z10) {
            w();
            ((n1) this.f27301b).y0(z10);
            return this;
        }

        public a N(String str) {
            w();
            ((n1) this.f27301b).z0(str);
            return this;
        }

        public a O(i iVar) {
            w();
            ((n1) this.f27301b).A0(iVar);
            return this;
        }

        public a P(i iVar) {
            w();
            ((n1) this.f27301b).B0(iVar);
            return this;
        }

        private a() {
            super(n1.DEFAULT_INSTANCE);
        }
    }

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        z.b0(n1.class, n1Var);
    }

    private n1() {
        i iVar = i.f27039b;
        this.privacy_ = iVar;
        this.sessionId_ = iVar;
        this.cache_ = iVar;
        this.legacyFlowUserConsent_ = MaxReward.DEFAULT_LABEL;
        this.auid_ = iVar;
        this.analyticsUserId_ = MaxReward.DEFAULT_LABEL;
        this.auidString_ = MaxReward.DEFAULT_LABEL;
    }

    /* access modifiers changed from: private */
    public void A0(i iVar) {
        iVar.getClass();
        this.bitField0_ |= 1;
        this.privacy_ = iVar;
    }

    /* access modifiers changed from: private */
    public void B0(i iVar) {
        iVar.getClass();
        this.sessionId_ = iVar;
    }

    public static a q0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.analyticsUserId_ = str;
    }

    /* access modifiers changed from: private */
    public void s0(i iVar) {
        iVar.getClass();
        this.bitField0_ |= 8;
        this.auid_ = iVar;
    }

    /* access modifiers changed from: private */
    public void t0(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.auidString_ = str;
    }

    /* access modifiers changed from: private */
    public void u0(i iVar) {
        iVar.getClass();
        this.bitField0_ |= 2;
        this.cache_ = iVar;
    }

    /* access modifiers changed from: private */
    public void v0(e0 e0Var) {
        e0Var.getClass();
        this.clientInfo_ = e0Var;
    }

    /* access modifiers changed from: private */
    public void w0(m1 m1Var) {
        m1Var.getClass();
        this.deviceInfo_ = m1Var;
    }

    /* access modifiers changed from: private */
    public void x0(String str) {
        str.getClass();
        this.idfi_ = str;
    }

    /* access modifiers changed from: private */
    public void y0(boolean z10) {
        this.isFirstInit_ = z10;
    }

    /* access modifiers changed from: private */
    public void z0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.legacyFlowUserConsent_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (l1.f39015a[fVar.ordinal()]) {
            case 1:
                return new n1();
            case 2:
                return new a((l1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\t\u0002ည\u0000\u0003Ȉ\u0004\n\u0005ည\u0001\u0006ለ\u0002\u0007ည\u0003\bለ\u0004\t\t\n\u0007\u000bለ\u0005", new Object[]{"bitField0_", "clientInfo_", "privacy_", "idfi_", "sessionId_", "cache_", "legacyFlowUserConsent_", "auid_", "analyticsUserId_", "deviceInfo_", "isFirstInit_", "auidString_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<n1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (n1.class) {
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
