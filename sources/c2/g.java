package c2;

import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: BackendResponse */
public abstract class g {

    /* compiled from: BackendResponse */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1);
    }

    public static g d() {
        return new b(a.INVALID_PAYLOAD, -1);
    }

    public static g e(long j10) {
        return new b(a.OK, j10);
    }

    public static g f() {
        return new b(a.TRANSIENT_ERROR, -1);
    }

    public abstract long b();

    public abstract a c();
}
