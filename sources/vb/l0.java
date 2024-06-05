package vb;

import com.google.protobuf.d0;

/* compiled from: DeveloperConsentOuterClass */
public enum l0 implements d0.c {
    DEVELOPER_CONSENT_CHOICE_UNSPECIFIED(0),
    DEVELOPER_CONSENT_CHOICE_TRUE(1),
    DEVELOPER_CONSENT_CHOICE_FALSE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final d0.d<l0> f39012g = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39014a;

    /* compiled from: DeveloperConsentOuterClass */
    class a implements d0.d<l0> {
        a() {
        }

        /* renamed from: b */
        public l0 a(int i10) {
            return l0.c(i10);
        }
    }

    static {
        f39012g = new a();
    }

    private l0(int i10) {
        this.f39014a = i10;
    }

    public static l0 c(int i10) {
        if (i10 == 0) {
            return DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return DEVELOPER_CONSENT_CHOICE_FALSE;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39014a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
