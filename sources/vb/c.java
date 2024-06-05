package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdDataRefreshRequestOuterClass */
public final class c extends z<c, a> implements w0 {
    public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 6;
    public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
    public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile f1<c> PARSER = null;
    public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
    private i adDataRefreshToken_;
    private b0 campaignState_;
    private a1 dynamicDeviceInfo_;
    private i impressionOpportunityId_;
    private x2 sessionCounters_;
    private b3 staticDeviceInfo_;

    /* compiled from: AdDataRefreshRequestOuterClass */
    public static final class a extends z.a<c, a> implements w0 {
        /* synthetic */ a(b bVar) {
            this();
        }

        public a F(i iVar) {
            w();
            ((c) this.f27301b).m0(iVar);
            return this;
        }

        public a G(b0 b0Var) {
            w();
            ((c) this.f27301b).n0(b0Var);
            return this;
        }

        public a H(a1 a1Var) {
            w();
            ((c) this.f27301b).o0(a1Var);
            return this;
        }

        public a I(i iVar) {
            w();
            ((c) this.f27301b).p0(iVar);
            return this;
        }

        public a J(x2 x2Var) {
            w();
            ((c) this.f27301b).q0(x2Var);
            return this;
        }

        public a K(b3 b3Var) {
            w();
            ((c) this.f27301b).r0(b3Var);
            return this;
        }

        private a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.b0(c.class, cVar);
    }

    private c() {
        i iVar = i.f27039b;
        this.impressionOpportunityId_ = iVar;
        this.adDataRefreshToken_ = iVar;
    }

    public static a l0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void m0(i iVar) {
        iVar.getClass();
        this.adDataRefreshToken_ = iVar;
    }

    /* access modifiers changed from: private */
    public void n0(b0 b0Var) {
        b0Var.getClass();
        this.campaignState_ = b0Var;
    }

    /* access modifiers changed from: private */
    public void o0(a1 a1Var) {
        a1Var.getClass();
        this.dynamicDeviceInfo_ = a1Var;
    }

    /* access modifiers changed from: private */
    public void p0(i iVar) {
        iVar.getClass();
        this.impressionOpportunityId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void q0(x2 x2Var) {
        x2Var.getClass();
        this.sessionCounters_ = x2Var;
    }

    /* access modifiers changed from: private */
    public void r0(b3 b3Var) {
        b3Var.getClass();
        this.staticDeviceInfo_ = b3Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (b.f38925a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new a((b) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\n\u0006\n", new Object[]{"sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "adDataRefreshToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c.class) {
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
