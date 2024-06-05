package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdPlayerConfigResponseOuterClass */
public final class k extends z<k, a> implements w0 {
    public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 6;
    public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
    private static volatile f1<k> PARSER = null;
    public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
    public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
    private i adDataRefreshToken_;
    private int bitField0_;
    private d1 error_;
    private int impressionConfigurationVersion_;
    private i impressionConfiguration_;
    private i trackingToken_;
    private y3 webviewConfiguration_;

    /* compiled from: AdPlayerConfigResponseOuterClass */
    public static final class a extends z.a<k, a> implements w0 {
        /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        z.b0(k.class, kVar);
    }

    private k() {
        i iVar = i.f27039b;
        this.trackingToken_ = iVar;
        this.impressionConfiguration_ = iVar;
        this.adDataRefreshToken_ = iVar;
    }

    public static k g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (j.f38981a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new a((j) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006ဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<k> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (k.class) {
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

    public i f0() {
        return this.adDataRefreshToken_;
    }

    public d1 h0() {
        d1 d1Var = this.error_;
        return d1Var == null ? d1.g0() : d1Var;
    }

    public i i0() {
        return this.impressionConfiguration_;
    }

    public int j0() {
        return this.impressionConfigurationVersion_;
    }

    public i k0() {
        return this.trackingToken_;
    }

    public y3 l0() {
        y3 y3Var = this.webviewConfiguration_;
        return y3Var == null ? y3.g0() : y3Var;
    }

    public boolean m0() {
        return (this.bitField0_ & 2) != 0;
    }
}
