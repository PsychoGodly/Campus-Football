package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzty  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzty implements zzaje {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzty> zzg = null;
    private final int zzi;

    static {
        zzg = new zztx();
    }

    private zzty(int i10) {
        this.zzi = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzty.class.getName());
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

    public static zzty zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i10 == 2) {
            return NIST_P256;
        }
        if (i10 == 3) {
            return NIST_P384;
        }
        if (i10 == 4) {
            return NIST_P521;
        }
        if (i10 != 5) {
            return null;
        }
        return CURVE25519;
    }
}
