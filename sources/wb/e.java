package wb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import vb.a1;
import vb.b0;
import vb.b3;
import vb.e0;
import vb.g3;
import vb.m2;
import vb.x2;

/* compiled from: HeaderBiddingTokenOuterClass */
public final class e extends z<e, a> implements w0 {
    public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
    public static final int CLIENT_INFO_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 8;
    private static volatile f1<e> PARSER = null;
    public static final int PII_FIELD_NUMBER = 9;
    public static final int SESSION_COUNTERS_FIELD_NUMBER = 6;
    public static final int SESSION_TOKEN_FIELD_NUMBER = 3;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 7;
    public static final int TCF_FIELD_NUMBER = 11;
    public static final int TIMESTAMPS_FIELD_NUMBER = 5;
    public static final int TOKEN_ID_FIELD_NUMBER = 1;
    public static final int TOKEN_NUMBER_FIELD_NUMBER = 2;
    private int bitField0_;
    private b0 campaignState_;
    private e0 clientInfo_;
    private a1 dynamicDeviceInfo_;
    private m2 pii_;
    private x2 sessionCounters_;
    private i sessionToken_;
    private b3 staticDeviceInfo_;
    private i tcf_;
    private g3 timestamps_;
    private i tokenId_;
    private int tokenNumber_;

    /* compiled from: HeaderBiddingTokenOuterClass */
    public static final class a extends z.a<e, a> implements w0 {
        /* synthetic */ a(d dVar) {
            this();
        }

        public a F(b0 b0Var) {
            w();
            ((e) this.f27301b).q0(b0Var);
            return this;
        }

        public a G(e0 e0Var) {
            w();
            ((e) this.f27301b).r0(e0Var);
            return this;
        }

        public a H(a1 a1Var) {
            w();
            ((e) this.f27301b).s0(a1Var);
            return this;
        }

        public a I(m2 m2Var) {
            w();
            ((e) this.f27301b).t0(m2Var);
            return this;
        }

        public a J(x2 x2Var) {
            w();
            ((e) this.f27301b).u0(x2Var);
            return this;
        }

        public a K(i iVar) {
            w();
            ((e) this.f27301b).v0(iVar);
            return this;
        }

        public a L(b3 b3Var) {
            w();
            ((e) this.f27301b).w0(b3Var);
            return this;
        }

        public a M(g3 g3Var) {
            w();
            ((e) this.f27301b).x0(g3Var);
            return this;
        }

        public a N(i iVar) {
            w();
            ((e) this.f27301b).y0(iVar);
            return this;
        }

        public a O(int i10) {
            w();
            ((e) this.f27301b).z0(i10);
            return this;
        }

        private a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.b0(e.class, eVar);
    }

    private e() {
        i iVar = i.f27039b;
        this.tokenId_ = iVar;
        this.sessionToken_ = iVar;
        this.tcf_ = iVar;
    }

    public static a p0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void q0(b0 b0Var) {
        b0Var.getClass();
        this.campaignState_ = b0Var;
    }

    /* access modifiers changed from: private */
    public void r0(e0 e0Var) {
        e0Var.getClass();
        this.clientInfo_ = e0Var;
    }

    /* access modifiers changed from: private */
    public void s0(a1 a1Var) {
        a1Var.getClass();
        this.dynamicDeviceInfo_ = a1Var;
    }

    /* access modifiers changed from: private */
    public void t0(m2 m2Var) {
        m2Var.getClass();
        this.pii_ = m2Var;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void u0(x2 x2Var) {
        x2Var.getClass();
        this.sessionCounters_ = x2Var;
    }

    /* access modifiers changed from: private */
    public void v0(i iVar) {
        iVar.getClass();
        this.sessionToken_ = iVar;
    }

    /* access modifiers changed from: private */
    public void w0(b3 b3Var) {
        b3Var.getClass();
        this.staticDeviceInfo_ = b3Var;
    }

    /* access modifiers changed from: private */
    public void x0(g3 g3Var) {
        g3Var.getClass();
        this.timestamps_ = g3Var;
    }

    /* access modifiers changed from: private */
    public void y0(i iVar) {
        iVar.getClass();
        this.tokenId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void z0(int i10) {
        this.tokenNumber_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (d.f39193a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a((d) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\t\u0005\t\u0006\t\u0007\t\b\t\tဉ\u0000\n\t\u000bည\u0001", new Object[]{"bitField0_", "tokenId_", "tokenNumber_", "sessionToken_", "clientInfo_", "timestamps_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "pii_", "campaignState_", "tcf_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e.class) {
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
