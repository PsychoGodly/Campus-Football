package vb;

import com.google.protobuf.d0;

/* compiled from: DiagnosticEventRequestOuterClass */
public enum r0 implements d0.c {
    DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
    DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
    DIAGNOSTIC_AD_TYPE_BANNER(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final d0.d<r0> f39071g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39073a;

    /* compiled from: DiagnosticEventRequestOuterClass */
    class a implements d0.d<r0> {
        a() {
        }

        /* renamed from: b */
        public r0 a(int i10) {
            return r0.c(i10);
        }
    }

    static {
        f39071g = new a();
    }

    private r0(int i10) {
        this.f39073a = i10;
    }

    public static r0 c(int i10) {
        if (i10 == 0) {
            return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
        }
        if (i10 != 2) {
            return null;
        }
        return DIAGNOSTIC_AD_TYPE_BANNER;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39073a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
