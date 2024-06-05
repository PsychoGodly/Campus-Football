package vb;

import com.google.protobuf.d0;

/* compiled from: DiagnosticEventRequestOuterClass */
public enum u0 implements d0.c {
    DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
    DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    private static final d0.d<u0> f39090f = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39092a;

    /* compiled from: DiagnosticEventRequestOuterClass */
    class a implements d0.d<u0> {
        a() {
        }

        /* renamed from: b */
        public u0 a(int i10) {
            return u0.c(i10);
        }
    }

    static {
        f39090f = new a();
    }

    private u0(int i10) {
        this.f39092a = i10;
    }

    public static u0 c(int i10) {
        if (i10 == 0) {
            return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
        }
        if (i10 != 1) {
            return null;
        }
        return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39092a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
