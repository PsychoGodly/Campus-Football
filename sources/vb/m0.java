package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: DeveloperConsentOuterClass */
public final class m0 extends z<m0, a> implements w0 {
    public static final int CUSTOM_TYPE_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final m0 DEFAULT_INSTANCE;
    private static volatile f1<m0> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String customType_ = MaxReward.DEFAULT_LABEL;
    private int type_;
    private int value_;

    /* compiled from: DeveloperConsentOuterClass */
    public static final class a extends z.a<m0, a> implements w0 {
        /* synthetic */ a(j0 j0Var) {
            this();
        }

        public n0 F() {
            return ((m0) this.f27301b).i0();
        }

        public a G(String str) {
            w();
            ((m0) this.f27301b).k0(str);
            return this;
        }

        public a H(n0 n0Var) {
            w();
            ((m0) this.f27301b).l0(n0Var);
            return this;
        }

        public a I(l0 l0Var) {
            w();
            ((m0) this.f27301b).m0(l0Var);
            return this;
        }

        private a() {
            super(m0.DEFAULT_INSTANCE);
        }
    }

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        z.b0(m0.class, m0Var);
    }

    private m0() {
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.customType_ = str;
    }

    /* access modifiers changed from: private */
    public void l0(n0 n0Var) {
        this.type_ = n0Var.I();
    }

    /* access modifiers changed from: private */
    public void m0(l0 l0Var) {
        this.value_ = l0Var.I();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (j0.f38982a[fVar.ordinal()]) {
            case 1:
                return new m0();
            case 2:
                return new a((j0) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\f", new Object[]{"bitField0_", "type_", "customType_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<m0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (m0.class) {
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

    public n0 i0() {
        n0 c10 = n0.c(this.type_);
        return c10 == null ? n0.UNRECOGNIZED : c10;
    }
}
