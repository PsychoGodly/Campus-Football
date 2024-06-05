package rb;

import com.google.protobuf.d0;

/* compiled from: Protos */
public enum g implements d0.c {
    Barcode(0),
    Cancelled(1),
    Error(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final d0.d<g> f37901g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f37903a;

    /* compiled from: Protos */
    class a implements d0.d<g> {
        a() {
        }

        /* renamed from: b */
        public g a(int i10) {
            return g.a(i10);
        }
    }

    static {
        f37901g = new a();
    }

    private g(int i10) {
        this.f37903a = i10;
    }

    public static g a(int i10) {
        if (i10 == 0) {
            return Barcode;
        }
        if (i10 == 1) {
            return Cancelled;
        }
        if (i10 != 2) {
            return null;
        }
        return Error;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f37903a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
