package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: OperativeEventRequestOuterClass */
public final class g2 extends z<g2, a> implements w0 {
    /* access modifiers changed from: private */
    public static final g2 DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile f1<g2> PARSER;
    private int errorType_;
    private String message_ = MaxReward.DEFAULT_LABEL;

    /* compiled from: OperativeEventRequestOuterClass */
    public static final class a extends z.a<g2, a> implements w0 {
        /* synthetic */ a(f2 f2Var) {
            this();
        }

        public a F(h2 h2Var) {
            w();
            ((g2) this.f27301b).i0(h2Var);
            return this;
        }

        public a G(String str) {
            w();
            ((g2) this.f27301b).j0(str);
            return this;
        }

        private a() {
            super(g2.DEFAULT_INSTANCE);
        }
    }

    static {
        g2 g2Var = new g2();
        DEFAULT_INSTANCE = g2Var;
        z.b0(g2.class, g2Var);
    }

    private g2() {
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void i0(h2 h2Var) {
        this.errorType_ = h2Var.I();
    }

    /* access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (f2.f38952a[fVar.ordinal()]) {
            case 1:
                return new g2();
            case 2:
                return new a((f2) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorType_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<g2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (g2.class) {
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
