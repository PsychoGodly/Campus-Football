package vb;

import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;

/* compiled from: NativeConfigurationOuterClass */
public final class z1 extends z<z1, a> implements w0 {
    public static final int ADDITIONAL_STORE_PACKAGES_FIELD_NUMBER = 10;
    public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
    public static final int AD_POLICY_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final z1 DEFAULT_INSTANCE;
    public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
    public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
    public static final int ENABLE_OM_FIELD_NUMBER = 9;
    public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
    public static final int INIT_POLICY_FIELD_NUMBER = 2;
    public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
    public static final int OTHER_POLICY_FIELD_NUMBER = 5;
    private static volatile f1<z1> PARSER;
    private w1 adOperations_;
    private a2 adPolicy_;
    private d0.j<String> additionalStorePackages_ = z.F();
    private x1 diagnosticEvents_;
    private boolean enableIapEvent_;
    private boolean enableOm_;
    private y1 featureFlags_;
    private a2 initPolicy_;
    private a2 operativeEventPolicy_;
    private a2 otherPolicy_;

    /* compiled from: NativeConfigurationOuterClass */
    public static final class a extends z.a<z1, a> implements w0 {
        /* synthetic */ a(v1 v1Var) {
            this();
        }

        public a F(w1 w1Var) {
            w();
            ((z1) this.f27301b).y0(w1Var);
            return this;
        }

        public a G(a2 a2Var) {
            w();
            ((z1) this.f27301b).z0(a2Var);
            return this;
        }

        public a H(x1 x1Var) {
            w();
            ((z1) this.f27301b).A0(x1Var);
            return this;
        }

        public a I(a2 a2Var) {
            w();
            ((z1) this.f27301b).B0(a2Var);
            return this;
        }

        public a J(a2 a2Var) {
            w();
            ((z1) this.f27301b).C0(a2Var);
            return this;
        }

        public a K(a2 a2Var) {
            w();
            ((z1) this.f27301b).D0(a2Var);
            return this;
        }

        private a() {
            super(z1.DEFAULT_INSTANCE);
        }
    }

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        z.b0(z1.class, z1Var);
    }

    private z1() {
    }

    /* access modifiers changed from: private */
    public void A0(x1 x1Var) {
        x1Var.getClass();
        this.diagnosticEvents_ = x1Var;
    }

    /* access modifiers changed from: private */
    public void B0(a2 a2Var) {
        a2Var.getClass();
        this.initPolicy_ = a2Var;
    }

    /* access modifiers changed from: private */
    public void C0(a2 a2Var) {
        a2Var.getClass();
        this.operativeEventPolicy_ = a2Var;
    }

    /* access modifiers changed from: private */
    public void D0(a2 a2Var) {
        a2Var.getClass();
        this.otherPolicy_ = a2Var;
    }

    public static z1 o0() {
        return DEFAULT_INSTANCE;
    }

    public static a w0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    public static z1 x0(i iVar) throws e0 {
        return (z1) z.U(DEFAULT_INSTANCE, iVar);
    }

    /* access modifiers changed from: private */
    public void y0(w1 w1Var) {
        w1Var.getClass();
        this.adOperations_ = w1Var;
    }

    /* access modifiers changed from: private */
    public void z0(a2 a2Var) {
        a2Var.getClass();
        this.adPolicy_ = a2Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new z1();
            case 2:
                return new a((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\u0007\t\u0007\nȚ", new Object[]{"diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_", "additionalStorePackages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<z1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (z1.class) {
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

    public w1 l0() {
        w1 w1Var = this.adOperations_;
        return w1Var == null ? w1.i0() : w1Var;
    }

    public a2 m0() {
        a2 a2Var = this.adPolicy_;
        return a2Var == null ? a2.h0() : a2Var;
    }

    public List<String> n0() {
        return this.additionalStorePackages_;
    }

    public x1 p0() {
        x1 x1Var = this.diagnosticEvents_;
        return x1Var == null ? x1.l0() : x1Var;
    }

    public boolean q0() {
        return this.enableIapEvent_;
    }

    public boolean r0() {
        return this.enableOm_;
    }

    public y1 s0() {
        y1 y1Var = this.featureFlags_;
        return y1Var == null ? y1.g0() : y1Var;
    }

    public a2 t0() {
        a2 a2Var = this.initPolicy_;
        return a2Var == null ? a2.h0() : a2Var;
    }

    public a2 u0() {
        a2 a2Var = this.operativeEventPolicy_;
        return a2Var == null ? a2.h0() : a2Var;
    }

    public a2 v0() {
        a2 a2Var = this.otherPolicy_;
        return a2Var == null ? a2.h0() : a2Var;
    }
}
