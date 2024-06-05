package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: PiiOuterClass */
public final class m2 extends z<m2, a> implements w0 {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final m2 DEFAULT_INSTANCE;
    public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
    private static volatile f1<m2> PARSER = null;
    public static final int VENDOR_ID_FIELD_NUMBER = 2;
    private i advertisingId_;
    private i openAdvertisingTrackingId_;
    private i vendorId_;

    /* compiled from: PiiOuterClass */
    public static final class a extends z.a<m2, a> implements w0 {
        /* synthetic */ a(l2 l2Var) {
            this();
        }

        public a F(i iVar) {
            w();
            ((m2) this.f27301b).k0(iVar);
            return this;
        }

        public a G(i iVar) {
            w();
            ((m2) this.f27301b).l0(iVar);
            return this;
        }

        private a() {
            super(m2.DEFAULT_INSTANCE);
        }
    }

    static {
        m2 m2Var = new m2();
        DEFAULT_INSTANCE = m2Var;
        z.b0(m2.class, m2Var);
    }

    private m2() {
        i iVar = i.f27039b;
        this.advertisingId_ = iVar;
        this.vendorId_ = iVar;
        this.openAdvertisingTrackingId_ = iVar;
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void k0(i iVar) {
        iVar.getClass();
        this.advertisingId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void l0(i iVar) {
        iVar.getClass();
        this.openAdvertisingTrackingId_ = iVar;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (l2.f39016a[fVar.ordinal()]) {
            case 1:
                return new m2();
            case 2:
                return new a((l2) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"advertisingId_", "vendorId_", "openAdvertisingTrackingId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<m2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (m2.class) {
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

    public i h0() {
        return this.advertisingId_;
    }

    public i i0() {
        return this.openAdvertisingTrackingId_;
    }
}
