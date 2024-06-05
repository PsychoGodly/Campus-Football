package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: CampaignStateOuterClass */
public final class a0 extends z<a0, a> implements w0 {
    public static final int DATA_FIELD_NUMBER = 2;
    public static final int DATA_VERSION_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
    public static final int LOAD_TIMESTAMP_FIELD_NUMBER = 5;
    private static volatile f1<a0> PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 3;
    public static final int SHOW_TIMESTAMP_FIELD_NUMBER = 6;
    private int bitField0_;
    private int dataVersion_;
    private i data_;
    private i impressionOpportunityId_;
    private g3 loadTimestamp_;
    private String placementId_ = MaxReward.DEFAULT_LABEL;
    private g3 showTimestamp_;

    /* compiled from: CampaignStateOuterClass */
    public static final class a extends z.a<a0, a> implements w0 {
        /* synthetic */ a(z zVar) {
            this();
        }

        public a F(i iVar) {
            w();
            ((a0) this.f27301b).n0(iVar);
            return this;
        }

        public a G(int i10) {
            w();
            ((a0) this.f27301b).o0(i10);
            return this;
        }

        public a H(i iVar) {
            w();
            ((a0) this.f27301b).p0(iVar);
            return this;
        }

        public a I(g3 g3Var) {
            w();
            ((a0) this.f27301b).q0(g3Var);
            return this;
        }

        public a J(String str) {
            w();
            ((a0) this.f27301b).r0(str);
            return this;
        }

        public a K(g3 g3Var) {
            w();
            ((a0) this.f27301b).s0(g3Var);
            return this;
        }

        private a() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        z.b0(a0.class, a0Var);
    }

    private a0() {
        i iVar = i.f27039b;
        this.data_ = iVar;
        this.impressionOpportunityId_ = iVar;
    }

    public static a m0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void n0(i iVar) {
        iVar.getClass();
        this.data_ = iVar;
    }

    /* access modifiers changed from: private */
    public void o0(int i10) {
        this.dataVersion_ = i10;
    }

    /* access modifiers changed from: private */
    public void p0(i iVar) {
        iVar.getClass();
        this.impressionOpportunityId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void q0(g3 g3Var) {
        g3Var.getClass();
        this.loadTimestamp_ = g3Var;
    }

    /* access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.placementId_ = str;
    }

    /* access modifiers changed from: private */
    public void s0(g3 g3Var) {
        g3Var.getClass();
        this.showTimestamp_ = g3Var;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (z.f39121a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new a((z) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003Ȉ\u0004\n\u0005\t\u0006ဉ\u0000", new Object[]{"bitField0_", "dataVersion_", "data_", "placementId_", "impressionOpportunityId_", "loadTimestamp_", "showTimestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a0.class) {
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

    public boolean l0() {
        return (this.bitField0_ & 1) != 0;
    }
}
