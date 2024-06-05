package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzum  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzum implements zzaje {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzum> zzf = null;
    private final int zzh;

    static {
        zzf = new zzul();
    }

    private zzum(int i10) {
        this.zzh = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzum.class.getName());
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
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzum zza(int i10) {
        if (i10 == 0) {
            return KDF_UNKNOWN;
        }
        if (i10 == 1) {
            return HKDF_SHA256;
        }
        if (i10 == 2) {
            return HKDF_SHA384;
        }
        if (i10 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }
}
