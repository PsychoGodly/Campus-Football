package vb;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: SessionCountersOuterClass */
public final class x2 extends z<x2, a> implements w0 {
    public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
    public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
    public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final x2 DEFAULT_INSTANCE;
    public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
    public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
    private static volatile f1<x2> PARSER;
    private int bannerImpressions_;
    private int bannerLoadRequests_;
    private int bannerRequestsAdm_;
    private int loadRequestsAdm_;
    private int loadRequests_;

    /* compiled from: SessionCountersOuterClass */
    public static final class a extends z.a<x2, a> implements w0 {
        /* synthetic */ a(w2 w2Var) {
            this();
        }

        public int F() {
            return ((x2) this.f27301b).k0();
        }

        public int G() {
            return ((x2) this.f27301b).l0();
        }

        public int H() {
            return ((x2) this.f27301b).m0();
        }

        public int I() {
            return ((x2) this.f27301b).o0();
        }

        public int J() {
            return ((x2) this.f27301b).p0();
        }

        public a K(int i10) {
            w();
            ((x2) this.f27301b).r0(i10);
            return this;
        }

        public a L(int i10) {
            w();
            ((x2) this.f27301b).s0(i10);
            return this;
        }

        public a M(int i10) {
            w();
            ((x2) this.f27301b).t0(i10);
            return this;
        }

        public a N(int i10) {
            w();
            ((x2) this.f27301b).u0(i10);
            return this;
        }

        public a O(int i10) {
            w();
            ((x2) this.f27301b).v0(i10);
            return this;
        }

        private a() {
            super(x2.DEFAULT_INSTANCE);
        }
    }

    static {
        x2 x2Var = new x2();
        DEFAULT_INSTANCE = x2Var;
        z.b0(x2.class, x2Var);
    }

    private x2() {
    }

    public static x2 n0() {
        return DEFAULT_INSTANCE;
    }

    public static a q0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void r0(int i10) {
        this.bannerImpressions_ = i10;
    }

    /* access modifiers changed from: private */
    public void s0(int i10) {
        this.bannerLoadRequests_ = i10;
    }

    /* access modifiers changed from: private */
    public void t0(int i10) {
        this.bannerRequestsAdm_ = i10;
    }

    /* access modifiers changed from: private */
    public void u0(int i10) {
        this.loadRequests_ = i10;
    }

    /* access modifiers changed from: private */
    public void v0(int i10) {
        this.loadRequestsAdm_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (w2.f39109a[fVar.ordinal()]) {
            case 1:
                return new x2();
            case 2:
                return new a((w2) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<x2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (x2.class) {
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

    public int k0() {
        return this.bannerImpressions_;
    }

    public int l0() {
        return this.bannerLoadRequests_;
    }

    public int m0() {
        return this.bannerRequestsAdm_;
    }

    public int o0() {
        return this.loadRequests_;
    }

    public int p0() {
        return this.loadRequestsAdm_;
    }
}
