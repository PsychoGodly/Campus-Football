package vb;

import com.google.protobuf.d0;

/* compiled from: ClientInfoOuterClass */
public enum g0 implements d0.c {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_ANDROID(1),
    PLATFORM_IOS(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final d0.d<g0> f38960g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f38962a;

    /* compiled from: ClientInfoOuterClass */
    class a implements d0.d<g0> {
        a() {
        }

        /* renamed from: b */
        public g0 a(int i10) {
            return g0.c(i10);
        }
    }

    static {
        f38960g = new a();
    }

    private g0(int i10) {
        this.f38962a = i10;
    }

    public static g0 c(int i10) {
        if (i10 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i10 == 1) {
            return PLATFORM_ANDROID;
        }
        if (i10 != 2) {
            return null;
        }
        return PLATFORM_IOS;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f38962a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
