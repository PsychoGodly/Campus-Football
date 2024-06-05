package vb;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;

/* compiled from: NativeConfigurationOuterClass */
public final class x1 extends z<x1, c> implements w0 {
    public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
    public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
    /* access modifiers changed from: private */
    public static final x1 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
    public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
    private static volatile f1<x1> PARSER = null;
    public static final int SEVERITY_FIELD_NUMBER = 5;
    public static final int TTM_ENABLED_FIELD_NUMBER = 4;
    private static final d0.h.a<Integer, u0> allowedEvents_converter_ = new a();
    private static final d0.h.a<Integer, u0> blockedEvents_converter_ = new b();
    private int allowedEventsMemoizedSerializedSize;
    private d0.g allowedEvents_ = z.E();
    private int blockedEventsMemoizedSerializedSize;
    private d0.g blockedEvents_ = z.E();
    private boolean enabled_;
    private int maxBatchIntervalMs_;
    private int maxBatchSize_;
    private int severity_;
    private boolean ttmEnabled_;

    /* compiled from: NativeConfigurationOuterClass */
    class a implements d0.h.a<Integer, u0> {
        a() {
        }

        /* renamed from: b */
        public u0 a(Integer num) {
            u0 c10 = u0.c(num.intValue());
            return c10 == null ? u0.UNRECOGNIZED : c10;
        }
    }

    /* compiled from: NativeConfigurationOuterClass */
    class b implements d0.h.a<Integer, u0> {
        b() {
        }

        /* renamed from: b */
        public u0 a(Integer num) {
            u0 c10 = u0.c(num.intValue());
            return c10 == null ? u0.UNRECOGNIZED : c10;
        }
    }

    /* compiled from: NativeConfigurationOuterClass */
    public static final class c extends z.a<x1, c> implements w0 {
        /* synthetic */ c(v1 v1Var) {
            this();
        }

        public c F(boolean z10) {
            w();
            ((x1) this.f27301b).q0(z10);
            return this;
        }

        public c G(int i10) {
            w();
            ((x1) this.f27301b).r0(i10);
            return this;
        }

        public c H(int i10) {
            w();
            ((x1) this.f27301b).s0(i10);
            return this;
        }

        public c I(boolean z10) {
            w();
            ((x1) this.f27301b).t0(z10);
            return this;
        }

        private c() {
            super(x1.DEFAULT_INSTANCE);
        }
    }

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        z.b0(x1.class, x1Var);
    }

    private x1() {
    }

    public static x1 l0() {
        return DEFAULT_INSTANCE;
    }

    public static c p0() {
        return (c) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void q0(boolean z10) {
        this.enabled_ = z10;
    }

    /* access modifiers changed from: private */
    public void r0(int i10) {
        this.maxBatchIntervalMs_ = i10;
    }

    /* access modifiers changed from: private */
    public void s0(int i10) {
        this.maxBatchSize_ = i10;
    }

    /* access modifiers changed from: private */
    public void t0(boolean z10) {
        this.ttmEnabled_ = z10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (v1.f39101a[fVar.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return new c((v1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<x1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (x1.class) {
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

    public List<u0> j0() {
        return new d0.h(this.allowedEvents_, allowedEvents_converter_);
    }

    public List<u0> k0() {
        return new d0.h(this.blockedEvents_, blockedEvents_converter_);
    }

    public boolean m0() {
        return this.enabled_;
    }

    public int n0() {
        return this.maxBatchIntervalMs_;
    }

    public int o0() {
        return this.maxBatchSize_;
    }
}
