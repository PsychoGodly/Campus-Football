package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: PrivacyUpdateResponseOuterClass */
public final class r2 extends z<r2, a> implements w0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final r2 DEFAULT_INSTANCE;
    private static volatile f1<r2> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i content_ = i.f27039b;
    private int version_;

    /* compiled from: PrivacyUpdateResponseOuterClass */
    public static final class a extends z.a<r2, a> implements w0 {
        /* synthetic */ a(q2 q2Var) {
            this();
        }

        private a() {
            super(r2.DEFAULT_INSTANCE);
        }
    }

    static {
        r2 r2Var = new r2();
        DEFAULT_INSTANCE = r2Var;
        z.b0(r2.class, r2Var);
    }

    private r2() {
    }

    public static r2 g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (q2.f39063a[fVar.ordinal()]) {
            case 1:
                return new r2();
            case 2:
                return new a((q2) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"version_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<r2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (r2.class) {
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

    public i f0() {
        return this.content_;
    }

    public int h0() {
        return this.version_;
    }
}
