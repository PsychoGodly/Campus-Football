package rb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: Protos */
public final class d extends z<d, a> implements w0 {
    public static final int ASPECTTOLERANCE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final d DEFAULT_INSTANCE;
    private static volatile f1<d> PARSER = null;
    public static final int USEAUTOFOCUS_FIELD_NUMBER = 2;
    private double aspectTolerance_;
    private boolean useAutoFocus_;

    /* compiled from: Protos */
    public static final class a extends z.a<d, a> implements w0 {
        /* synthetic */ a(c cVar) {
            this();
        }

        public a F(double d10) {
            w();
            ((d) this.f27301b).l0(d10);
            return this;
        }

        public a G(boolean z10) {
            w();
            ((d) this.f27301b).m0(z10);
            return this;
        }

        private a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        z.b0(d.class, dVar);
    }

    private d() {
    }

    public static d i0() {
        return DEFAULT_INSTANCE;
    }

    public static a k0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void l0(double d10) {
        this.aspectTolerance_ = d10;
    }

    /* access modifiers changed from: private */
    public void m0(boolean z10) {
        this.useAutoFocus_ = z10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (c.f37879a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new a((c) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0007", new Object[]{"aspectTolerance_", "useAutoFocus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<d> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (d.class) {
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

    public double h0() {
        return this.aspectTolerance_;
    }

    public boolean j0() {
        return this.useAutoFocus_;
    }
}
