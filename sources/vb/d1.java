package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: ErrorOuterClass */
public final class d1 extends z<d1, a> implements w0 {
    /* access modifiers changed from: private */
    public static final d1 DEFAULT_INSTANCE;
    public static final int ERROR_TEXT_FIELD_NUMBER = 2;
    private static volatile f1<d1> PARSER;
    private String errorText_ = MaxReward.DEFAULT_LABEL;

    /* compiled from: ErrorOuterClass */
    public static final class a extends z.a<d1, a> implements w0 {
        /* synthetic */ a(c1 c1Var) {
            this();
        }

        public a F(String str) {
            w();
            ((d1) this.f27301b).j0(str);
            return this;
        }

        private a() {
            super(d1.DEFAULT_INSTANCE);
        }
    }

    static {
        d1 d1Var = new d1();
        DEFAULT_INSTANCE = d1Var;
        z.b0(d1.class, d1Var);
    }

    private d1() {
    }

    public static d1 g0() {
        return DEFAULT_INSTANCE;
    }

    public static a i0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.errorText_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (c1.f38930a[fVar.ordinal()]) {
            case 1:
                return new d1();
            case 2:
                return new a((c1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"errorText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<d1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (d1.class) {
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

    public String h0() {
        return this.errorText_;
    }
}
