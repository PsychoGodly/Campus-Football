package vb;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;

/* compiled from: DeveloperConsentOuterClass */
public final class k0 extends z<k0, a> implements w0 {
    /* access modifiers changed from: private */
    public static final k0 DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile f1<k0> PARSER;
    private d0.j<m0> options_ = z.F();

    /* compiled from: DeveloperConsentOuterClass */
    public static final class a extends z.a<k0, a> implements w0 {
        /* synthetic */ a(j0 j0Var) {
            this();
        }

        public a F(Iterable<? extends m0> iterable) {
            w();
            ((k0) this.f27301b).g0(iterable);
            return this;
        }

        public List<m0> G() {
            return Collections.unmodifiableList(((k0) this.f27301b).i0());
        }

        private a() {
            super(k0.DEFAULT_INSTANCE);
        }
    }

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        z.b0(k0.class, k0Var);
    }

    private k0() {
    }

    /* access modifiers changed from: private */
    public void g0(Iterable<? extends m0> iterable) {
        h0();
        com.google.protobuf.a.h(iterable, this.options_);
    }

    private void h0() {
        d0.j<m0> jVar = this.options_;
        if (!jVar.t()) {
            this.options_ = z.Q(jVar);
        }
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (j0.f38982a[fVar.ordinal()]) {
            case 1:
                return new k0();
            case 2:
                return new a((j0) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"options_", m0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<k0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (k0.class) {
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

    public List<m0> i0() {
        return this.options_;
    }
}
