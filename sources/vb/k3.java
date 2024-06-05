package vb;

import com.google.protobuf.d0;

/* compiled from: TransactionEventRequestOuterClass */
public enum k3 implements d0.c {
    STORE_TYPE_UNSPECIFIED(0),
    STORE_TYPE_CUSTOM(1),
    STORE_TYPE_APPLE_APP_STORE(2),
    STORE_TYPE_GOOGLE_PLAY(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    private static final d0.d<k3> f39003h = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39005a;

    /* compiled from: TransactionEventRequestOuterClass */
    class a implements d0.d<k3> {
        a() {
        }

        /* renamed from: b */
        public k3 a(int i10) {
            return k3.c(i10);
        }
    }

    static {
        f39003h = new a();
    }

    private k3(int i10) {
        this.f39005a = i10;
    }

    public static k3 c(int i10) {
        if (i10 == 0) {
            return STORE_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return STORE_TYPE_CUSTOM;
        }
        if (i10 == 2) {
            return STORE_TYPE_APPLE_APP_STORE;
        }
        if (i10 != 3) {
            return null;
        }
        return STORE_TYPE_GOOGLE_PLAY;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39005a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
