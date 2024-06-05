package vb;

import com.google.protobuf.d0;

/* compiled from: TransactionEventRequestOuterClass */
public enum n3 implements d0.c {
    TRANSACTION_STATE_UNSPECIFIED(0),
    TRANSACTION_STATE_PENDING(1),
    TRANSACTION_STATE_PURCHASED(2),
    TRANSACTION_STATE_FAILED(3),
    TRANSACTION_STATE_RESTORED(4),
    TRANSACTION_STATE_DEFERRED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: j  reason: collision with root package name */
    private static final d0.d<n3> f39038j = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39040a;

    /* compiled from: TransactionEventRequestOuterClass */
    class a implements d0.d<n3> {
        a() {
        }

        /* renamed from: b */
        public n3 a(int i10) {
            return n3.c(i10);
        }
    }

    static {
        f39038j = new a();
    }

    private n3(int i10) {
        this.f39040a = i10;
    }

    public static n3 c(int i10) {
        if (i10 == 0) {
            return TRANSACTION_STATE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return TRANSACTION_STATE_PENDING;
        }
        if (i10 == 2) {
            return TRANSACTION_STATE_PURCHASED;
        }
        if (i10 == 3) {
            return TRANSACTION_STATE_FAILED;
        }
        if (i10 == 4) {
            return TRANSACTION_STATE_RESTORED;
        }
        if (i10 != 5) {
            return null;
        }
        return TRANSACTION_STATE_DEFERRED;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39040a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
