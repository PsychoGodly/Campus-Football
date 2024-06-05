package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdPlayerConfigRequestOuterClass */
public final class i extends z<i, a> implements w0 {
    public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
    private static volatile f1<i> PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
    public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
    private int bitField0_;
    private com.google.protobuf.i configurationToken_;
    private com.google.protobuf.i impressionOpportunityId_;
    private String placementId_ = MaxReward.DEFAULT_LABEL;
    private int webviewVersion_;

    /* compiled from: AdPlayerConfigRequestOuterClass */
    public static final class a extends z.a<i, a> implements w0 {
        /* synthetic */ a(h hVar) {
            this();
        }

        public a F(com.google.protobuf.i iVar) {
            w();
            ((i) this.f27301b).j0(iVar);
            return this;
        }

        public a G(com.google.protobuf.i iVar) {
            w();
            ((i) this.f27301b).k0(iVar);
            return this;
        }

        public a H(String str) {
            w();
            ((i) this.f27301b).l0(str);
            return this;
        }

        private a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        z.b0(i.class, iVar);
    }

    private i() {
        com.google.protobuf.i iVar = com.google.protobuf.i.f27039b;
        this.configurationToken_ = iVar;
        this.impressionOpportunityId_ = iVar;
    }

    public static a i0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void j0(com.google.protobuf.i iVar) {
        iVar.getClass();
        this.configurationToken_ = iVar;
    }

    /* access modifiers changed from: private */
    public void k0(com.google.protobuf.i iVar) {
        iVar.getClass();
        this.impressionOpportunityId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.placementId_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (h.f38965a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new a((h) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0004\n\tင\u0000", new Object[]{"bitField0_", "configurationToken_", "placementId_", "impressionOpportunityId_", "webviewVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<i> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (i.class) {
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
