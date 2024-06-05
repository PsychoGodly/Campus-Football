package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: InitializationResponseOuterClass */
public final class p1 extends z<p1, a> implements w0 {
    public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final p1 DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile f1<p1> PARSER = null;
    public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
    public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
    public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int countOfLastShownCampaigns_;
    private d1 error_;
    private z1 nativeConfiguration_;
    private p0<String, q1> scarPlacements_ = p0.e();
    private boolean triggerInitializationCompletedRequest_;
    private String universalRequestUrl_ = MaxReward.DEFAULT_LABEL;

    /* compiled from: InitializationResponseOuterClass */
    public static final class a extends z.a<p1, a> implements w0 {
        /* synthetic */ a(o1 o1Var) {
            this();
        }

        private a() {
            super(p1.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: InitializationResponseOuterClass */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, q1> f39057a = o0.d(b2.b.STRING, MaxReward.DEFAULT_LABEL, b2.b.MESSAGE, q1.f0());
    }

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        z.b0(p1.class, p1Var);
    }

    private p1() {
    }

    public static p1 f0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (o1.f39050a[fVar.ordinal()]) {
            case 1:
                return new p1();
            case 2:
                return new a((o1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001\t\u0002ለ\u0000\u0003ဉ\u0001\u0004\u0007\u0005\u0004\u00062", new Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", b.f39057a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<p1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (p1.class) {
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

    public d1 g0() {
        d1 d1Var = this.error_;
        return d1Var == null ? d1.g0() : d1Var;
    }

    public z1 h0() {
        z1 z1Var = this.nativeConfiguration_;
        return z1Var == null ? z1.o0() : z1Var;
    }

    public boolean i0() {
        return this.triggerInitializationCompletedRequest_;
    }

    public String j0() {
        return this.universalRequestUrl_;
    }

    public boolean k0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean l0() {
        return (this.bitField0_ & 1) != 0;
    }
}
