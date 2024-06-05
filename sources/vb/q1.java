package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: InitializationResponseOuterClass */
public final class q1 extends z<q1, a> implements w0 {
    public static final int AD_FORMAT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final q1 DEFAULT_INSTANCE;
    private static volatile f1<q1> PARSER;
    private int adFormat_;

    /* compiled from: InitializationResponseOuterClass */
    public static final class a extends z.a<q1, a> implements w0 {
        /* synthetic */ a(o1 o1Var) {
            this();
        }

        private a() {
            super(q1.DEFAULT_INSTANCE);
        }
    }

    static {
        q1 q1Var = new q1();
        DEFAULT_INSTANCE = q1Var;
        z.b0(q1.class, q1Var);
    }

    private q1() {
    }

    public static q1 f0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (o1.f39050a[fVar.ordinal()]) {
            case 1:
                return new q1();
            case 2:
                return new a((o1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"adFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<q1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (q1.class) {
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
