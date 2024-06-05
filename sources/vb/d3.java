package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: TestDataOuterClass */
public final class d3 extends z<d3, a> implements w0 {
    /* access modifiers changed from: private */
    public static final d3 DEFAULT_INSTANCE;
    public static final int FORCE_CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int FORCE_COUNTRY_FIELD_NUMBER = 2;
    public static final int FORCE_COUNTRY_SUBDIVISION_FIELD_NUMBER = 3;
    private static volatile f1<d3> PARSER;
    private int bitField0_;
    private String forceCampaignId_ = MaxReward.DEFAULT_LABEL;
    private String forceCountrySubdivision_ = MaxReward.DEFAULT_LABEL;
    private String forceCountry_ = MaxReward.DEFAULT_LABEL;

    /* compiled from: TestDataOuterClass */
    public static final class a extends z.a<d3, a> implements w0 {
        /* synthetic */ a(c3 c3Var) {
            this();
        }

        private a() {
            super(d3.DEFAULT_INSTANCE);
        }
    }

    static {
        d3 d3Var = new d3();
        DEFAULT_INSTANCE = d3Var;
        z.b0(d3.class, d3Var);
    }

    private d3() {
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (c3.f38931a[fVar.ordinal()]) {
            case 1:
                return new d3();
            case 2:
                return new a((c3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "forceCampaignId_", "forceCountry_", "forceCountrySubdivision_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<d3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (d3.class) {
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
