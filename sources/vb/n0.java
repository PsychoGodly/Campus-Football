package vb;

import com.google.protobuf.d0;

/* compiled from: DeveloperConsentOuterClass */
public enum n0 implements d0.c {
    DEVELOPER_CONSENT_TYPE_UNSPECIFIED(0),
    DEVELOPER_CONSENT_TYPE_CUSTOM(1),
    DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL(2),
    DEVELOPER_CONSENT_TYPE_PIPL_CONSENT(3),
    DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT(4),
    DEVELOPER_CONSENT_TYPE_GDPR_CONSENT(5),
    DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: k  reason: collision with root package name */
    private static final d0.d<n0> f39026k = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f39028a;

    /* compiled from: DeveloperConsentOuterClass */
    class a implements d0.d<n0> {
        a() {
        }

        /* renamed from: b */
        public n0 a(int i10) {
            return n0.c(i10);
        }
    }

    static {
        f39026k = new a();
    }

    private n0(int i10) {
        this.f39028a = i10;
    }

    public static n0 c(int i10) {
        switch (i10) {
            case 0:
                return DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
            case 1:
                return DEVELOPER_CONSENT_TYPE_CUSTOM;
            case 2:
                return DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
            case 3:
                return DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
            case 4:
                return DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
            case 5:
                return DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
            case 6:
                return DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
            default:
                return null;
        }
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f39028a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
