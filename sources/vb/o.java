package vb;

import com.google.protobuf.d0;

/* compiled from: AdRequestOuterClass */
public enum o implements d0.c {
    AD_REQUEST_TYPE_UNSPECIFIED(0),
    AD_REQUEST_TYPE_FULLSCREEN(1),
    AD_REQUEST_TYPE_BANNER(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final d0.d<o> f39045g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39047a;

    /* compiled from: AdRequestOuterClass */
    class a implements d0.d<o> {
        a() {
        }

        /* renamed from: b */
        public o a(int i10) {
            return o.c(i10);
        }
    }

    static {
        f39045g = new a();
    }

    private o(int i10) {
        this.f39047a = i10;
    }

    public static o c(int i10) {
        if (i10 == 0) {
            return AD_REQUEST_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return AD_REQUEST_TYPE_FULLSCREEN;
        }
        if (i10 != 2) {
            return null;
        }
        return AD_REQUEST_TYPE_BANNER;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39047a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
