package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.Map;

/* compiled from: DiagnosticEventRequestOuterClass */
public final class s0 extends z<s0, a> implements w0 {
    public static final int AD_TYPE_FIELD_NUMBER = 10;
    public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final s0 DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 7;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
    public static final int INT_TAGS_FIELD_NUMBER = 6;
    public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
    private static volatile f1<s0> PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
    public static final int STRING_TAGS_FIELD_NUMBER = 5;
    public static final int TIMESTAMPS_FIELD_NUMBER = 3;
    public static final int TIME_VALUE_FIELD_NUMBER = 4;
    private int adType_;
    private int bitField0_;
    private String customEventType_ = MaxReward.DEFAULT_LABEL;
    private int eventId_;
    private int eventType_;
    private i impressionOpportunityId_ = i.f27039b;
    private p0<String, Integer> intTags_ = p0.e();
    private boolean isHeaderBidding_;
    private String placementId_ = MaxReward.DEFAULT_LABEL;
    private p0<String, String> stringTags_ = p0.e();
    private double timeValue_;
    private g3 timestamps_;

    /* compiled from: DiagnosticEventRequestOuterClass */
    public static final class a extends z.a<s0, a> implements w0 {
        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public Map<String, Integer> F() {
            return Collections.unmodifiableMap(((s0) this.f27301b).q0());
        }

        public Map<String, String> G() {
            return Collections.unmodifiableMap(((s0) this.f27301b).t0());
        }

        public a H(Map<String, Integer> map) {
            w();
            ((s0) this.f27301b).r0().putAll(map);
            return this;
        }

        public a I(Map<String, String> map) {
            w();
            ((s0) this.f27301b).s0().putAll(map);
            return this;
        }

        public a J(String str, String str2) {
            str.getClass();
            str2.getClass();
            w();
            ((s0) this.f27301b).s0().put(str, str2);
            return this;
        }

        public a K(r0 r0Var) {
            w();
            ((s0) this.f27301b).z0(r0Var);
            return this;
        }

        public a L(String str) {
            w();
            ((s0) this.f27301b).A0(str);
            return this;
        }

        public a M(u0 u0Var) {
            w();
            ((s0) this.f27301b).B0(u0Var);
            return this;
        }

        public a N(i iVar) {
            w();
            ((s0) this.f27301b).C0(iVar);
            return this;
        }

        public a O(boolean z10) {
            w();
            ((s0) this.f27301b).D0(z10);
            return this;
        }

        public a P(String str) {
            w();
            ((s0) this.f27301b).E0(str);
            return this;
        }

        public a Q(double d10) {
            w();
            ((s0) this.f27301b).F0(d10);
            return this;
        }

        public a R(g3 g3Var) {
            w();
            ((s0) this.f27301b).G0(g3Var);
            return this;
        }

        private a() {
            super(s0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: DiagnosticEventRequestOuterClass */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, Integer> f39077a = o0.d(b2.b.STRING, MaxReward.DEFAULT_LABEL, b2.b.UINT32, 0);
    }

    /* compiled from: DiagnosticEventRequestOuterClass */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, String> f39078a;

        static {
            b2.b bVar = b2.b.STRING;
            f39078a = o0.d(bVar, MaxReward.DEFAULT_LABEL, bVar, MaxReward.DEFAULT_LABEL);
        }
    }

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        z.b0(s0.class, s0Var);
    }

    private s0() {
    }

    /* access modifiers changed from: private */
    public void A0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.customEventType_ = str;
    }

    /* access modifiers changed from: private */
    public void B0(u0 u0Var) {
        this.eventType_ = u0Var.I();
    }

    /* access modifiers changed from: private */
    public void C0(i iVar) {
        iVar.getClass();
        this.bitField0_ |= 4;
        this.impressionOpportunityId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void D0(boolean z10) {
        this.bitField0_ |= 32;
        this.isHeaderBidding_ = z10;
    }

    /* access modifiers changed from: private */
    public void E0(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.placementId_ = str;
    }

    /* access modifiers changed from: private */
    public void F0(double d10) {
        this.bitField0_ |= 2;
        this.timeValue_ = d10;
    }

    /* access modifiers changed from: private */
    public void G0(g3 g3Var) {
        g3Var.getClass();
        this.timestamps_ = g3Var;
    }

    /* access modifiers changed from: private */
    public Map<String, Integer> r0() {
        return v0();
    }

    /* access modifiers changed from: private */
    public Map<String, String> s0() {
        return w0();
    }

    private p0<String, Integer> u0() {
        return this.intTags_;
    }

    private p0<String, Integer> v0() {
        if (!this.intTags_.j()) {
            this.intTags_ = this.intTags_.m();
        }
        return this.intTags_;
    }

    private p0<String, String> w0() {
        if (!this.stringTags_.j()) {
            this.stringTags_ = this.stringTags_.m();
        }
        return this.stringTags_;
    }

    private p0<String, String> x0() {
        return this.stringTags_;
    }

    public static a y0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void z0(r0 r0Var) {
        this.adType_ = r0Var.I();
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (q0.f39062a[fVar.ordinal()]) {
            case 1:
                return new s0();
            case 2:
                return new a((q0) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\t\u0004က\u0001\u00052\u00062\u0007\u0004\bည\u0002\tለ\u0003\nဌ\u0004\u000bဇ\u0005", new Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", c.f39078a, "intTags_", b.f39077a, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<s0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (s0.class) {
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

    public u0 p0() {
        u0 c10 = u0.c(this.eventType_);
        return c10 == null ? u0.UNRECOGNIZED : c10;
    }

    public Map<String, Integer> q0() {
        return Collections.unmodifiableMap(u0());
    }

    public Map<String, String> t0() {
        return Collections.unmodifiableMap(x0());
    }
}
