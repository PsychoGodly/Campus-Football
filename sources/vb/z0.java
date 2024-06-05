package vb;

import com.google.protobuf.d0;

/* compiled from: DynamicDeviceInfoOuterClass */
public enum z0 implements d0.c {
    CONNECTION_TYPE_UNSPECIFIED(0),
    CONNECTION_TYPE_WIFI(1),
    CONNECTION_TYPE_CELLULAR(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final d0.d<z0> f39126g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39128a;

    /* compiled from: DynamicDeviceInfoOuterClass */
    class a implements d0.d<z0> {
        a() {
        }

        /* renamed from: b */
        public z0 a(int i10) {
            return z0.c(i10);
        }
    }

    static {
        f39126g = new a();
    }

    private z0(int i10) {
        this.f39128a = i10;
    }

    public static z0 c(int i10) {
        if (i10 == 0) {
            return CONNECTION_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return CONNECTION_TYPE_WIFI;
        }
        if (i10 != 2) {
            return null;
        }
        return CONNECTION_TYPE_CELLULAR;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39128a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
