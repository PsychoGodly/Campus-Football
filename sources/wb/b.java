package wb;

import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: HeaderBiddingAdMarkupOuterClass */
public final class b extends z<b, a> implements w0 {
    public static final int AD_DATA_FIELD_NUMBER = 1;
    public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
    public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final b DEFAULT_INSTANCE;
    private static volatile f1<b> PARSER;
    private int adDataVersion_;
    private i adData_;
    private i configurationToken_;

    /* compiled from: HeaderBiddingAdMarkupOuterClass */
    public static final class a extends z.a<b, a> implements w0 {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        z.b0(b.class, bVar);
    }

    private b() {
        i iVar = i.f27039b;
        this.adData_ = iVar;
        this.configurationToken_ = iVar;
    }

    public static b i0() {
        return DEFAULT_INSTANCE;
    }

    public static b j0(byte[] bArr) throws e0 {
        return (b) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f39190a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new a((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n", new Object[]{"adData_", "adDataVersion_", "configurationToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b.class) {
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

    public int g0() {
        return this.adDataVersion_;
    }

    public i h0() {
        return this.configurationToken_;
    }
}
