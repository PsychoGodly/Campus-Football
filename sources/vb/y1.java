package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: NativeConfigurationOuterClass */
public final class y1 extends z<y1, a> implements w0 {
    public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final y1 DEFAULT_INSTANCE;
    public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
    public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
    private static volatile f1<y1> PARSER;
    private boolean boldSdkNextSessionEnabled_;
    private boolean openglGpuEnabled_;
    private boolean opportunityIdPlacementValidation_;

    /* compiled from: NativeConfigurationOuterClass */
    public static final class a extends z.a<y1, a> implements w0 {
        /* synthetic */ a(v1 v1Var) {
            this();
        }

        private a() {
            super(y1.DEFAULT_INSTANCE);
        }
    }

    static {
        y1 y1Var = new y1();
        DEFAULT_INSTANCE = y1Var;
        z.b0(y1.class, y1Var);
    }

    private y1() {
    }

    public static y1 g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new y1();
            case 2:
                return new a((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<y1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (y1.class) {
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

    public boolean f0() {
        return this.boldSdkNextSessionEnabled_;
    }

    public boolean h0() {
        return this.openglGpuEnabled_;
    }

    public boolean i0() {
        return this.opportunityIdPlacementValidation_;
    }
}
