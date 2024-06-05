package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdResponseOuterClass */
public final class s extends z<s, a> implements w0 {
    public static final int AD_DATA_FIELD_NUMBER = 6;
    public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
    public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
    /* access modifiers changed from: private */
    public static final s DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
    private static volatile f1<s> PARSER = null;
    public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
    public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
    private i adDataRefreshToken_;
    private int adDataVersion_;
    private i adData_;
    private int bitField0_;
    private d1 error_;
    private int impressionConfigurationVersion_;
    private i impressionConfiguration_;
    private i trackingToken_;
    private y3 webviewConfiguration_;

    /* compiled from: AdResponseOuterClass */
    public static final class a extends z.a<s, a> implements w0 {
        /* synthetic */ a(r rVar) {
            this();
        }

        public a F(i iVar) {
            w();
            ((s) this.f27301b).w0(iVar);
            return this;
        }

        public a G(i iVar) {
            w();
            ((s) this.f27301b).x0(iVar);
            return this;
        }

        public a H(int i10) {
            w();
            ((s) this.f27301b).y0(i10);
            return this;
        }

        public a I(d1 d1Var) {
            w();
            ((s) this.f27301b).z0(d1Var);
            return this;
        }

        public a J(i iVar) {
            w();
            ((s) this.f27301b).A0(iVar);
            return this;
        }

        public a K(int i10) {
            w();
            ((s) this.f27301b).B0(i10);
            return this;
        }

        public a L(i iVar) {
            w();
            ((s) this.f27301b).C0(iVar);
            return this;
        }

        public a M(y3 y3Var) {
            w();
            ((s) this.f27301b).D0(y3Var);
            return this;
        }

        private a() {
            super(s.DEFAULT_INSTANCE);
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        z.b0(s.class, sVar);
    }

    private s() {
        i iVar = i.f27039b;
        this.trackingToken_ = iVar;
        this.impressionConfiguration_ = iVar;
        this.adDataRefreshToken_ = iVar;
        this.adData_ = iVar;
    }

    /* access modifiers changed from: private */
    public void A0(i iVar) {
        iVar.getClass();
        this.impressionConfiguration_ = iVar;
    }

    /* access modifiers changed from: private */
    public void B0(int i10) {
        this.impressionConfigurationVersion_ = i10;
    }

    /* access modifiers changed from: private */
    public void C0(i iVar) {
        iVar.getClass();
        this.trackingToken_ = iVar;
    }

    /* access modifiers changed from: private */
    public void D0(y3 y3Var) {
        y3Var.getClass();
        this.webviewConfiguration_ = y3Var;
        this.bitField0_ |= 1;
    }

    public static s p0() {
        return DEFAULT_INSTANCE;
    }

    public static a v0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void w0(i iVar) {
        iVar.getClass();
        this.adData_ = iVar;
    }

    /* access modifiers changed from: private */
    public void x0(i iVar) {
        iVar.getClass();
        this.adDataRefreshToken_ = iVar;
    }

    /* access modifiers changed from: private */
    public void y0(int i10) {
        this.adDataVersion_ = i10;
    }

    /* access modifiers changed from: private */
    public void z0(d1 d1Var) {
        d1Var.getClass();
        this.error_ = d1Var;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (r.f39066a[fVar.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new a((r) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<s> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (s.class) {
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

    public i n0() {
        return this.adData_;
    }

    public i o0() {
        return this.adDataRefreshToken_;
    }

    public d1 q0() {
        d1 d1Var = this.error_;
        return d1Var == null ? d1.g0() : d1Var;
    }

    public i r0() {
        return this.impressionConfiguration_;
    }

    public i s0() {
        return this.trackingToken_;
    }

    public y3 t0() {
        y3 y3Var = this.webviewConfiguration_;
        return y3Var == null ? y3.g0() : y3Var;
    }

    public boolean u0() {
        return (this.bitField0_ & 2) != 0;
    }
}
