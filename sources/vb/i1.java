package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: InitializationCompletedEventRequestOuterClass */
public final class i1 extends z<i1, a> implements w0 {
    /* access modifiers changed from: private */
    public static final i1 DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
    private static volatile f1<i1> PARSER = null;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
    private a1 dynamicDeviceInfo_;
    private b3 staticDeviceInfo_;

    /* compiled from: InitializationCompletedEventRequestOuterClass */
    public static final class a extends z.a<i1, a> implements w0 {
        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public a F(a1 a1Var) {
            w();
            ((i1) this.f27301b).i0(a1Var);
            return this;
        }

        public a G(b3 b3Var) {
            w();
            ((i1) this.f27301b).j0(b3Var);
            return this;
        }

        private a() {
            super(i1.DEFAULT_INSTANCE);
        }
    }

    static {
        i1 i1Var = new i1();
        DEFAULT_INSTANCE = i1Var;
        z.b0(i1.class, i1Var);
    }

    private i1() {
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void i0(a1 a1Var) {
        a1Var.getClass();
        this.dynamicDeviceInfo_ = a1Var;
    }

    /* access modifiers changed from: private */
    public void j0(b3 b3Var) {
        b3Var.getClass();
        this.staticDeviceInfo_ = b3Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (h1.f38968a[fVar.ordinal()]) {
            case 1:
                return new i1();
            case 2:
                return new a((h1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"staticDeviceInfo_", "dynamicDeviceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<i1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (i1.class) {
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
