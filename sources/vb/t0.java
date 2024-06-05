package vb;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;

/* compiled from: DiagnosticEventRequestOuterClass */
public final class t0 extends z<t0, a> implements w0 {
    public static final int BATCH_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final t0 DEFAULT_INSTANCE;
    private static volatile f1<t0> PARSER;
    private d0.j<s0> batch_ = z.F();

    /* compiled from: DiagnosticEventRequestOuterClass */
    public static final class a extends z.a<t0, a> implements w0 {
        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public a F(Iterable<? extends s0> iterable) {
            w();
            ((t0) this.f27301b).h0(iterable);
            return this;
        }

        public a G() {
            w();
            ((t0) this.f27301b).i0();
            return this;
        }

        public List<s0> H() {
            return Collections.unmodifiableList(((t0) this.f27301b).k0());
        }

        private a() {
            super(t0.DEFAULT_INSTANCE);
        }
    }

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        z.b0(t0.class, t0Var);
    }

    private t0() {
    }

    /* access modifiers changed from: private */
    public void h0(Iterable<? extends s0> iterable) {
        j0();
        com.google.protobuf.a.h(iterable, this.batch_);
    }

    /* access modifiers changed from: private */
    public void i0() {
        this.batch_ = z.F();
    }

    private void j0() {
        d0.j<s0> jVar = this.batch_;
        if (!jVar.t()) {
            this.batch_ = z.Q(jVar);
        }
    }

    public static t0 l0() {
        return DEFAULT_INSTANCE;
    }

    public static a m0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (q0.f39062a[fVar.ordinal()]) {
            case 1:
                return new t0();
            case 2:
                return new a((q0) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"batch_", s0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<t0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (t0.class) {
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

    public List<s0> k0() {
        return this.batch_;
    }
}
