package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: NativeConfigurationOuterClass */
public final class a2 extends z<a2, a> implements w0 {
    /* access modifiers changed from: private */
    public static final a2 DEFAULT_INSTANCE;
    private static volatile f1<a2> PARSER = null;
    public static final int RETRY_POLICY_FIELD_NUMBER = 1;
    public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
    private b2 retryPolicy_;
    private c2 timeoutPolicy_;

    /* compiled from: NativeConfigurationOuterClass */
    public static final class a extends z.a<a2, a> implements w0 {
        /* synthetic */ a(v1 v1Var) {
            this();
        }

        public a F(b2 b2Var) {
            w();
            ((a2) this.f27301b).l0(b2Var);
            return this;
        }

        public a G(c2 c2Var) {
            w();
            ((a2) this.f27301b).m0(c2Var);
            return this;
        }

        private a() {
            super(a2.DEFAULT_INSTANCE);
        }
    }

    static {
        a2 a2Var = new a2();
        DEFAULT_INSTANCE = a2Var;
        z.b0(a2.class, a2Var);
    }

    private a2() {
    }

    public static a2 h0() {
        return DEFAULT_INSTANCE;
    }

    public static a k0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void l0(b2 b2Var) {
        b2Var.getClass();
        this.retryPolicy_ = b2Var;
    }

    /* access modifiers changed from: private */
    public void m0(c2 c2Var) {
        c2Var.getClass();
        this.timeoutPolicy_ = c2Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new a2();
            case 2:
                return new a((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"retryPolicy_", "timeoutPolicy_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a2.class) {
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

    public b2 i0() {
        b2 b2Var = this.retryPolicy_;
        return b2Var == null ? b2.l0() : b2Var;
    }

    public c2 j0() {
        c2 c2Var = this.timeoutPolicy_;
        return c2Var == null ? c2.k0() : c2Var;
    }
}
