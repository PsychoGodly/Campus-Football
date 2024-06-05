package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AdRequestOuterClass */
public final class p extends z<p, a> implements w0 {
    /* access modifiers changed from: private */
    public static final p DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile f1<p> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private int width_;

    /* compiled from: AdRequestOuterClass */
    public static final class a extends z.a<p, a> implements w0 {
        /* synthetic */ a(m mVar) {
            this();
        }

        public a F(int i10) {
            w();
            ((p) this.f27301b).i0(i10);
            return this;
        }

        public a G(int i10) {
            w();
            ((p) this.f27301b).j0(i10);
            return this;
        }

        private a() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        z.b0(p.class, pVar);
    }

    private p() {
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void i0(int i10) {
        this.height_ = i10;
    }

    /* access modifiers changed from: private */
    public void j0(int i10) {
        this.width_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (m.f39017a[fVar.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new a((m) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<p> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (p.class) {
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
