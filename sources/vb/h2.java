package vb;

import com.google.protobuf.d0;

/* compiled from: OperativeEventRequestOuterClass */
public enum h2 implements d0.c {
    OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
    OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    private static final d0.d<h2> f38972f = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f38974a;

    /* compiled from: OperativeEventRequestOuterClass */
    class a implements d0.d<h2> {
        a() {
        }

        /* renamed from: b */
        public h2 a(int i10) {
            return h2.c(i10);
        }
    }

    static {
        f38972f = new a();
    }

    private h2(int i10) {
        this.f38974a = i10;
    }

    public static h2 c(int i10) {
        if (i10 == 0) {
            return OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
        }
        if (i10 != 1) {
            return null;
        }
        return OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f38974a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
