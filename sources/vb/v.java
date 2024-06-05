package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: AllowedPiiOuterClass */
public final class v extends z<v, a> implements w0 {
    /* access modifiers changed from: private */
    public static final v DEFAULT_INSTANCE;
    public static final int IDFA_FIELD_NUMBER = 1;
    public static final int IDFV_FIELD_NUMBER = 2;
    private static volatile f1<v> PARSER;
    private boolean idfa_;
    private boolean idfv_;

    /* compiled from: AllowedPiiOuterClass */
    public static final class a extends z.a<v, a> implements w0 {
        /* synthetic */ a(u uVar) {
            this();
        }

        public boolean F() {
            return ((v) this.f27301b).i0();
        }

        public boolean G() {
            return ((v) this.f27301b).j0();
        }

        public a H(boolean z10) {
            w();
            ((v) this.f27301b).k0(z10);
            return this;
        }

        public a I(boolean z10) {
            w();
            ((v) this.f27301b).l0(z10);
            return this;
        }

        private a() {
            super(v.DEFAULT_INSTANCE);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        z.b0(v.class, vVar);
    }

    private v() {
    }

    public static v h0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void k0(boolean z10) {
        this.idfa_ = z10;
    }

    /* access modifiers changed from: private */
    public void l0(boolean z10) {
        this.idfv_ = z10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (u.f39086a[fVar.ordinal()]) {
            case 1:
                return new v();
            case 2:
                return new a((u) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"idfa_", "idfv_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<v> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (v.class) {
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

    public boolean i0() {
        return this.idfa_;
    }

    public boolean j0() {
        return this.idfv_;
    }
}
