package vb;

import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: UniversalResponseOuterClass */
public final class w3 extends z<w3, a> implements w0 {
    /* access modifiers changed from: private */
    public static final w3 DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
    private static volatile f1<w3> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private d1 error_;
    private t1 mutableData_;
    private b payload_;

    /* compiled from: UniversalResponseOuterClass */
    public static final class a extends z.a<w3, a> implements w0 {
        /* synthetic */ a(v3 v3Var) {
            this();
        }

        public a F(d1 d1Var) {
            w();
            ((w3) this.f27301b).n0(d1Var);
            return this;
        }

        private a() {
            super(w3.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: UniversalResponseOuterClass */
    public static final class b extends z<b, a> implements w0 {
        public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
        public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
        public static final int AD_RESPONSE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
        private static volatile f1<b> PARSER = null;
        public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
        private int valueCase_ = 0;
        private Object value_;

        /* compiled from: UniversalResponseOuterClass */
        public static final class a extends z.a<b, a> implements w0 {
            /* synthetic */ a(v3 v3Var) {
                this();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            z.b0(b.class, bVar);
        }

        private b() {
        }

        public static b i0() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (v3.f39104a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a((v3) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", p1.class, s.class, k.class, e.class, r2.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<b> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (b.class) {
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

        public e f0() {
            if (this.valueCase_ == 4) {
                return (e) this.value_;
            }
            return e.h0();
        }

        public k g0() {
            if (this.valueCase_ == 3) {
                return (k) this.value_;
            }
            return k.g0();
        }

        public s h0() {
            if (this.valueCase_ == 2) {
                return (s) this.value_;
            }
            return s.p0();
        }

        public p1 j0() {
            if (this.valueCase_ == 1) {
                return (p1) this.value_;
            }
            return p1.f0();
        }

        public r2 k0() {
            if (this.valueCase_ == 5) {
                return (r2) this.value_;
            }
            return r2.g0();
        }
    }

    static {
        w3 w3Var = new w3();
        DEFAULT_INSTANCE = w3Var;
        z.b0(w3.class, w3Var);
    }

    private w3() {
    }

    public static a l0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    public static w3 m0(byte[] bArr) throws e0 {
        return (w3) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void n0(d1 d1Var) {
        d1Var.getClass();
        this.error_ = d1Var;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v3.f39104a[fVar.ordinal()]) {
            case 1:
                return new w3();
            case 2:
                return new a((v3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<w3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (w3.class) {
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

    public d1 g0() {
        d1 d1Var = this.error_;
        return d1Var == null ? d1.g0() : d1Var;
    }

    public t1 h0() {
        t1 t1Var = this.mutableData_;
        return t1Var == null ? t1.i0() : t1Var;
    }

    public b i0() {
        b bVar = this.payload_;
        return bVar == null ? b.i0() : bVar;
    }

    public boolean j0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean k0() {
        return (this.bitField0_ & 1) != 0;
    }
}
