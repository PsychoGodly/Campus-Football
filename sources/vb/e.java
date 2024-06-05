package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdDataRefreshResponseOuterClass */
public final class e extends z<e, a> implements w0 {
    public static final int AD_DATA_FIELD_NUMBER = 1;
    public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 4;
    public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    private static volatile f1<e> PARSER = null;
    public static final int TRACKING_TOKEN_FIELD_NUMBER = 3;
    private i adDataRefreshToken_;
    private int adDataVersion_;
    private i adData_;
    private int bitField0_;
    private d1 error_;
    private i trackingToken_;

    /* compiled from: AdDataRefreshResponseOuterClass */
    public static final class a extends z.a<e, a> implements w0 {
        /* synthetic */ a(d dVar) {
            this();
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
        this.adData_ = iVar;
        this.trackingToken_ = iVar;
        this.adDataRefreshToken_ = iVar;
    }

    public static e h0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (d.f38932a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a((d) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\n\u0005ဉ\u0000", new Object[]{"bitField0_", "adData_", "adDataVersion_", "trackingToken_", "adDataRefreshToken_", "error_"});
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

    public i f0() {
        return this.adData_;
    }

    public i g0() {
        return this.adDataRefreshToken_;
    }

    public i i0() {
        return this.trackingToken_;
    }

    public boolean j0() {
        return (this.bitField0_ & 1) != 0;
    }
}
