package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzuo implements zzaje {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzuo> zzg = null;
    private final int zzi;

    static {
        zzg = new zzun();
    }

    private zzuo(int i10) {
        this.zzi = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzuo.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzuo zza(int i10) {
        if (i10 == 0) {
            return KEM_UNKNOWN;
        }
        if (i10 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i10 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i10 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i10 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }
}
