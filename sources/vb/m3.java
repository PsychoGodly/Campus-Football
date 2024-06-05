package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;

/* compiled from: TransactionEventRequestOuterClass */
public final class m3 extends z<m3, a> implements w0 {
    public static final int APP_STORE_FIELD_NUMBER = 3;
    public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final m3 DEFAULT_INSTANCE;
    public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
    private static volatile f1<m3> PARSER = null;
    public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
    public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
    private int appStore_;
    private String customStore_ = MaxReward.DEFAULT_LABEL;
    private a1 dynamicDeviceInfo_;
    private b3 staticDeviceInfo_;
    private d0.j<l3> transactionData_ = z.F();

    /* compiled from: TransactionEventRequestOuterClass */
    public static final class a extends z.a<m3, a> implements w0 {
        /* synthetic */ a(j3 j3Var) {
            this();
        }

        public a F(Iterable<? extends l3> iterable) {
            w();
            ((m3) this.f27301b).j0(iterable);
            return this;
        }

        public List<l3> G() {
            return Collections.unmodifiableList(((m3) this.f27301b).l0());
        }

        public a H(k3 k3Var) {
            w();
            ((m3) this.f27301b).n0(k3Var);
            return this;
        }

        public a I(a1 a1Var) {
            w();
            ((m3) this.f27301b).o0(a1Var);
            return this;
        }

        public a J(b3 b3Var) {
            w();
            ((m3) this.f27301b).p0(b3Var);
            return this;
        }

        private a() {
            super(m3.DEFAULT_INSTANCE);
        }
    }

    static {
        m3 m3Var = new m3();
        DEFAULT_INSTANCE = m3Var;
        z.b0(m3.class, m3Var);
    }

    private m3() {
    }

    /* access modifiers changed from: private */
    public void j0(Iterable<? extends l3> iterable) {
        k0();
        com.google.protobuf.a.h(iterable, this.transactionData_);
    }

    private void k0() {
        d0.j<l3> jVar = this.transactionData_;
        if (!jVar.t()) {
            this.transactionData_ = z.Q(jVar);
        }
    }

    public static a m0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void n0(k3 k3Var) {
        this.appStore_ = k3Var.I();
    }

    /* access modifiers changed from: private */
    public void o0(a1 a1Var) {
        a1Var.getClass();
        this.dynamicDeviceInfo_ = a1Var;
    }

    /* access modifiers changed from: private */
    public void p0(b3 b3Var) {
        b3Var.getClass();
        this.staticDeviceInfo_ = b3Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (j3.f38993a[fVar.ordinal()]) {
            case 1:
                return new m3();
            case 2:
                return new a((j3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\f\u0004Ȉ\u0005\u001b", new Object[]{"staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", l3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<m3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (m3.class) {
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

    public List<l3> l0() {
        return this.transactionData_;
    }
}
