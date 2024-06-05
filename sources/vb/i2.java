package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: OperativeEventRequestOuterClass */
public final class i2 extends z<i2, a> implements w0 {
    public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final i2 DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
    private static volatile f1<i2> PARSER = null;
    public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
    public static final int SID_FIELD_NUMBER = 6;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
    public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
    private i additionalData_;
    private b0 campaignState_;
    private a1 dynamicDeviceInfo_;
    private i eventId_;
    private int eventType_;
    private i impressionOpportunityId_;
    private x2 sessionCounters_;
    private String sid_ = MaxReward.DEFAULT_LABEL;
    private b3 staticDeviceInfo_;
    private i trackingToken_;

    /* compiled from: OperativeEventRequestOuterClass */
    public static final class a extends z.a<i2, a> implements w0 {
        /* synthetic */ a(f2 f2Var) {
            this();
        }

        public a F(i iVar) {
            w();
            ((i2) this.f27301b).q0(iVar);
            return this;
        }

        public a G(b0 b0Var) {
            w();
            ((i2) this.f27301b).r0(b0Var);
            return this;
        }

        public a H(a1 a1Var) {
            w();
            ((i2) this.f27301b).s0(a1Var);
            return this;
        }

        public a I(i iVar) {
            w();
            ((i2) this.f27301b).t0(iVar);
            return this;
        }

        public a J(j2 j2Var) {
            w();
            ((i2) this.f27301b).u0(j2Var);
            return this;
        }

        public a K(i iVar) {
            w();
            ((i2) this.f27301b).v0(iVar);
            return this;
        }

        public a L(x2 x2Var) {
            w();
            ((i2) this.f27301b).w0(x2Var);
            return this;
        }

        public a M(String str) {
            w();
            ((i2) this.f27301b).x0(str);
            return this;
        }

        public a N(b3 b3Var) {
            w();
            ((i2) this.f27301b).y0(b3Var);
            return this;
        }

        public a O(i iVar) {
            w();
            ((i2) this.f27301b).z0(iVar);
            return this;
        }

        private a() {
            super(i2.DEFAULT_INSTANCE);
        }
    }

    static {
        i2 i2Var = new i2();
        DEFAULT_INSTANCE = i2Var;
        z.b0(i2.class, i2Var);
    }

    private i2() {
        i iVar = i.f27039b;
        this.eventId_ = iVar;
        this.impressionOpportunityId_ = iVar;
        this.trackingToken_ = iVar;
        this.additionalData_ = iVar;
    }

    public static a p0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void q0(i iVar) {
        iVar.getClass();
        this.additionalData_ = iVar;
    }

    /* access modifiers changed from: private */
    public void r0(b0 b0Var) {
        b0Var.getClass();
        this.campaignState_ = b0Var;
    }

    /* access modifiers changed from: private */
    public void s0(a1 a1Var) {
        a1Var.getClass();
        this.dynamicDeviceInfo_ = a1Var;
    }

    /* access modifiers changed from: private */
    public void t0(i iVar) {
        iVar.getClass();
        this.eventId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void u0(j2 j2Var) {
        this.eventType_ = j2Var.I();
    }

    /* access modifiers changed from: private */
    public void v0(i iVar) {
        iVar.getClass();
        this.impressionOpportunityId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void w0(x2 x2Var) {
        x2Var.getClass();
        this.sessionCounters_ = x2Var;
    }

    /* access modifiers changed from: private */
    public void x0(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* access modifiers changed from: private */
    public void y0(b3 b3Var) {
        b3Var.getClass();
        this.staticDeviceInfo_ = b3Var;
    }

    /* access modifiers changed from: private */
    public void z0(i iVar) {
        iVar.getClass();
        this.trackingToken_ = iVar;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (f2.f38952a[fVar.ordinal()]) {
            case 1:
                return new i2();
            case 2:
                return new a((f2) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\n\u0002\f\u0003\n\u0004\n\u0005\n\u0006Ȉ\u0007\t\b\t\t\t\n\t", new Object[]{"eventId_", "eventType_", "impressionOpportunityId_", "trackingToken_", "additionalData_", "sid_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<i2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (i2.class) {
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
