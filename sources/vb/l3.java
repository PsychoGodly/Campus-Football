package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: TransactionEventRequestOuterClass */
public final class l3 extends z<l3, a> implements w0 {
    /* access modifiers changed from: private */
    public static final l3 DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 3;
    private static volatile f1<l3> PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 5;
    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    public static final int RECEIPT_FIELD_NUMBER = 7;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 6;
    public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
    public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
    private int bitField0_;
    private i eventId_ = i.f27039b;
    private String productId_ = MaxReward.DEFAULT_LABEL;
    private String product_ = MaxReward.DEFAULT_LABEL;
    private String receipt_ = MaxReward.DEFAULT_LABEL;
    private t1 timestamp_;
    private String transactionId_ = MaxReward.DEFAULT_LABEL;
    private int transactionState_;
    private String transaction_ = MaxReward.DEFAULT_LABEL;

    /* compiled from: TransactionEventRequestOuterClass */
    public static final class a extends z.a<l3, a> implements w0 {
        /* synthetic */ a(j3 j3Var) {
            this();
        }

        public a F(i iVar) {
            w();
            ((l3) this.f27301b).n0(iVar);
            return this;
        }

        public a G(String str) {
            w();
            ((l3) this.f27301b).o0(str);
            return this;
        }

        public a H(String str) {
            w();
            ((l3) this.f27301b).p0(str);
            return this;
        }

        public a I(t1 t1Var) {
            w();
            ((l3) this.f27301b).q0(t1Var);
            return this;
        }

        public a J(String str) {
            w();
            ((l3) this.f27301b).r0(str);
            return this;
        }

        public a K(String str) {
            w();
            ((l3) this.f27301b).s0(str);
            return this;
        }

        public a L(n3 n3Var) {
            w();
            ((l3) this.f27301b).t0(n3Var);
            return this;
        }

        private a() {
            super(l3.DEFAULT_INSTANCE);
        }
    }

    static {
        l3 l3Var = new l3();
        DEFAULT_INSTANCE = l3Var;
        z.b0(l3.class, l3Var);
    }

    private l3() {
    }

    public static a m0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void n0(i iVar) {
        iVar.getClass();
        this.eventId_ = iVar;
    }

    /* access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.product_ = str;
    }

    /* access modifiers changed from: private */
    public void p0(String str) {
        str.getClass();
        this.productId_ = str;
    }

    /* access modifiers changed from: private */
    public void q0(t1 t1Var) {
        t1Var.getClass();
        this.timestamp_ = t1Var;
    }

    /* access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.transaction_ = str;
    }

    /* access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.transactionId_ = str;
    }

    /* access modifiers changed from: private */
    public void t0(n3 n3Var) {
        this.transactionState_ = n3Var.I();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (j3.f38993a[fVar.ordinal()]) {
            case 1:
                return new l3();
            case 2:
                return new a((j3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0000\b\f", new Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<l3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (l3.class) {
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
