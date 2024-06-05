package vb;

import com.google.protobuf.d0;

/* compiled from: ClientInfoOuterClass */
public enum f0 implements d0.c {
    MEDIATION_PROVIDER_UNSPECIFIED(0),
    MEDIATION_PROVIDER_CUSTOM(1),
    MEDIATION_PROVIDER_ADMOB(2),
    MEDIATION_PROVIDER_MAX(3),
    MEDIATION_PROVIDER_LEVELPLAY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: i  reason: collision with root package name */
    private static final d0.d<f0> f38949i = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f38951a;

    /* compiled from: ClientInfoOuterClass */
    class a implements d0.d<f0> {
        a() {
        }

        /* renamed from: b */
        public f0 a(int i10) {
            return f0.c(i10);
        }
    }

    static {
        f38949i = new a();
    }

    private f0(int i10) {
        this.f38951a = i10;
    }

    public static f0 c(int i10) {
        if (i10 == 0) {
            return MEDIATION_PROVIDER_UNSPECIFIED;
        }
        if (i10 == 1) {
            return MEDIATION_PROVIDER_CUSTOM;
        }
        if (i10 == 2) {
            return MEDIATION_PROVIDER_ADMOB;
        }
        if (i10 == 3) {
            return MEDIATION_PROVIDER_MAX;
        }
        if (i10 != 4) {
            return null;
        }
        return MEDIATION_PROVIDER_LEVELPLAY;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f38951a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
