package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;

/* compiled from: WebviewConfiguration */
public final class y3 extends z<y3, a> implements w0 {
    public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final y3 DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_FIELD_NUMBER = 2;
    private static volatile f1<y3> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private d0.j<String> additionalFiles_ = z.F();
    private String entryPoint_ = MaxReward.DEFAULT_LABEL;
    private int version_;

    /* compiled from: WebviewConfiguration */
    public static final class a extends z.a<y3, a> implements w0 {
        /* synthetic */ a(x3 x3Var) {
            this();
        }

        private a() {
            super(y3.DEFAULT_INSTANCE);
        }
    }

    static {
        y3 y3Var = new y3();
        DEFAULT_INSTANCE = y3Var;
        z.b0(y3.class, y3Var);
    }

    private y3() {
    }

    public static y3 g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (x3.f39115a[fVar.ordinal()]) {
            case 1:
                return new y3();
            case 2:
                return new a((x3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț", new Object[]{"version_", "entryPoint_", "additionalFiles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<y3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (y3.class) {
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

    public List<String> f0() {
        return this.additionalFiles_;
    }

    public String h0() {
        return this.entryPoint_;
    }

    public int i0() {
        return this.version_;
    }
}
