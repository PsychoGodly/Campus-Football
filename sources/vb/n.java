package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdRequestOuterClass */
public final class n extends z<n, a> implements w0 {
    public static final int AD_REQUEST_TYPE_FIELD_NUMBER = 11;
    public static final int BANNER_SIZE_FIELD_NUMBER = 12;
    public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final n DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
    public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile f1<n> PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 6;
    public static final int REQUEST_IMPRESSION_CONFIGURATION_FIELD_NUMBER = 7;
    public static final int SCAR_SIGNAL_FIELD_NUMBER = 8;
    public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
    public static final int TCF_FIELD_NUMBER = 10;
    public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
    private int adRequestType_;
    private p bannerSize_;
    private int bitField0_;
    private b0 campaignState_;
    private a1 dynamicDeviceInfo_;
    private i impressionOpportunityId_;
    private String placementId_ = MaxReward.DEFAULT_LABEL;
    private boolean requestImpressionConfiguration_;
    private i scarSignal_;
    private x2 sessionCounters_;
    private b3 staticDeviceInfo_;
    private i tcf_;
    private int webviewVersion_;

    /* compiled from: AdRequestOuterClass */
    public static final class a extends z.a<n, a> implements w0 {
        /* synthetic */ a(m mVar) {
            this();
        }

        public a F(o oVar) {
            w();
            ((n) this.f27301b).q0(oVar);
            return this;
        }

        public a G(p pVar) {
            w();
            ((n) this.f27301b).r0(pVar);
            return this;
        }

        public a H(b0 b0Var) {
            w();
            ((n) this.f27301b).s0(b0Var);
            return this;
        }

        public a I(a1 a1Var) {
            w();
            ((n) this.f27301b).t0(a1Var);
            return this;
        }

        public a J(i iVar) {
            w();
            ((n) this.f27301b).u0(iVar);
            return this;
        }

        public a K(String str) {
            w();
            ((n) this.f27301b).v0(str);
            return this;
        }

        public a L(boolean z10) {
            w();
            ((n) this.f27301b).w0(z10);
            return this;
        }

        public a M(x2 x2Var) {
            w();
            ((n) this.f27301b).x0(x2Var);
            return this;
        }

        public a N(b3 b3Var) {
            w();
            ((n) this.f27301b).y0(b3Var);
            return this;
        }

        public a O(int i10) {
            w();
            ((n) this.f27301b).z0(i10);
            return this;
        }

        private a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        z.b0(n.class, nVar);
    }

    private n() {
        i iVar = i.f27039b;
        this.impressionOpportunityId_ = iVar;
        this.scarSignal_ = iVar;
        this.tcf_ = iVar;
    }

    public static a p0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void q0(o oVar) {
        this.adRequestType_ = oVar.I();
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void r0(p pVar) {
        pVar.getClass();
        this.bannerSize_ = pVar;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void s0(b0 b0Var) {
        b0Var.getClass();
        this.campaignState_ = b0Var;
    }

    /* access modifiers changed from: private */
    public void t0(a1 a1Var) {
        a1Var.getClass();
        this.dynamicDeviceInfo_ = a1Var;
    }

    /* access modifiers changed from: private */
    public void u0(i iVar) {
        iVar.getClass();
        this.impressionOpportunityId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void v0(String str) {
        str.getClass();
        this.placementId_ = str;
    }

    /* access modifiers changed from: private */
    public void w0(boolean z10) {
        this.requestImpressionConfiguration_ = z10;
    }

    /* access modifiers changed from: private */
    public void x0(x2 x2Var) {
        x2Var.getClass();
        this.sessionCounters_ = x2Var;
    }

    /* access modifiers changed from: private */
    public void y0(b3 b3Var) {
        b3Var.getClass();
        this.staticDeviceInfo_ = b3Var;
    }

    /* access modifiers changed from: private */
    public void z0(int i10) {
        this.bitField0_ |= 1;
        this.webviewVersion_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (m.f39017a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new a((m) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\n\u0006Ȉ\u0007\u0007\b\n\tင\u0000\nည\u0001\u000bဌ\u0002\fဉ\u0003", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "placementId_", "requestImpressionConfiguration_", "scarSignal_", "webviewVersion_", "tcf_", "adRequestType_", "bannerSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<n> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (n.class) {
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
