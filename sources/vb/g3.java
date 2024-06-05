package vb;

import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: TimestampsOuterClass */
public final class g3 extends z<g3, a> implements w0 {
    /* access modifiers changed from: private */
    public static final g3 DEFAULT_INSTANCE;
    private static volatile f1<g3> PARSER = null;
    public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long sessionTimestamp_;
    private t1 timestamp_;

    /* compiled from: TimestampsOuterClass */
    public static final class a extends z.a<g3, a> implements w0 {
        /* synthetic */ a(f3 f3Var) {
            this();
        }

        public a F(long j10) {
            w();
            ((g3) this.f27301b).k0(j10);
            return this;
        }

        public a G(t1 t1Var) {
            w();
            ((g3) this.f27301b).l0(t1Var);
            return this;
        }

        private a() {
            super(g3.DEFAULT_INSTANCE);
        }
    }

    static {
        g3 g3Var = new g3();
        DEFAULT_INSTANCE = g3Var;
        z.b0(g3.class, g3Var);
    }

    private g3() {
    }

    public static g3 h0() {
        return DEFAULT_INSTANCE;
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void k0(long j10) {
        this.sessionTimestamp_ = j10;
    }

    /* access modifiers changed from: private */
    public void l0(t1 t1Var) {
        t1Var.getClass();
        this.timestamp_ = t1Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (f3.f38953a[fVar.ordinal()]) {
            case 1:
                return new g3();
            case 2:
                return new a((f3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"timestamp_", "sessionTimestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<g3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (g3.class) {
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

    public t1 i0() {
        t1 t1Var = this.timestamp_;
        return t1Var == null ? t1.h0() : t1Var;
    }
}
