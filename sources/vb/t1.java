package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: MutableDataOuterClass */
public final class t1 extends z<t1, a> implements w0 {
    public static final int ALLOWED_PII_FIELD_NUMBER = 13;
    public static final int CACHE_FIELD_NUMBER = 14;
    public static final int CURRENT_STATE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final t1 DEFAULT_INSTANCE;
    private static volatile f1<t1> PARSER = null;
    public static final int PRIVACY_FIELD_NUMBER = 11;
    public static final int PRIVACY_FSM_FIELD_NUMBER = 15;
    public static final int SESSION_COUNTERS_FIELD_NUMBER = 12;
    public static final int SESSION_TOKEN_FIELD_NUMBER = 10;
    private v allowedPii_;
    private int bitField0_;
    private i cache_;
    private i currentState_;
    private i privacyFsm_;
    private i privacy_;
    private x2 sessionCounters_;
    private i sessionToken_;

    /* compiled from: MutableDataOuterClass */
    public static final class a extends z.a<t1, a> implements w0 {
        /* synthetic */ a(s1 s1Var) {
            this();
        }

        private a() {
            super(t1.DEFAULT_INSTANCE);
        }
    }

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        z.b0(t1.class, t1Var);
    }

    private t1() {
        i iVar = i.f27039b;
        this.currentState_ = iVar;
        this.sessionToken_ = iVar;
        this.privacy_ = iVar;
        this.cache_ = iVar;
        this.privacyFsm_ = iVar;
    }

    public static t1 i0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (s1.f39079a[fVar.ordinal()]) {
            case 1:
                return new t1();
            case 2:
                return new a((s1) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0000\u0001ည\u0000\nည\u0001\u000bည\u0002\fဉ\u0003\rဉ\u0004\u000eည\u0005\u000fည\u0006", new Object[]{"bitField0_", "currentState_", "sessionToken_", "privacy_", "sessionCounters_", "allowedPii_", "cache_", "privacyFsm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<t1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (t1.class) {
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

    public v f0() {
        v vVar = this.allowedPii_;
        return vVar == null ? v.h0() : vVar;
    }

    public i g0() {
        return this.cache_;
    }

    public i h0() {
        return this.currentState_;
    }

    public i j0() {
        return this.privacy_;
    }

    public i k0() {
        return this.privacyFsm_;
    }

    public x2 l0() {
        x2 x2Var = this.sessionCounters_;
        return x2Var == null ? x2.n0() : x2Var;
    }

    public i m0() {
        return this.sessionToken_;
    }

    public boolean n0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean o0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean p0() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean q0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean r0() {
        return (this.bitField0_ & 2) != 0;
    }
}
