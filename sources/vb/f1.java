package vb;

import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: GetTokenEventRequestOuterClass */
public final class f1 extends z<f1, a> implements w0 {
    /* access modifiers changed from: private */
    public static final f1 DEFAULT_INSTANCE;
    public static final int INTERSTITIAL_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f1<f1> PARSER = null;
    public static final int REWARDED_FIELD_NUMBER = 1;
    private int bitField0_;
    private i interstitial_;
    private i rewarded_;

    /* compiled from: GetTokenEventRequestOuterClass */
    public static final class a extends z.a<f1, a> implements w0 {
        /* synthetic */ a(e1 e1Var) {
            this();
        }

        private a() {
            super(f1.DEFAULT_INSTANCE);
        }
    }

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        z.b0(f1.class, f1Var);
    }

    private f1() {
        i iVar = i.f27039b;
        this.rewarded_ = iVar;
        this.interstitial_ = iVar;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (e1.f38936a[fVar.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new a((e1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"bitField0_", "rewarded_", "interstitial_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f1<f1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (f1.class) {
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
