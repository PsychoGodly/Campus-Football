package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzuk implements zzaje {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzuk> zzf = null;
    private final int zzh;

    static {
        zzf = new zzuj();
    }

    private zzuk(int i10) {
        this.zzh = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzuk.class.getName());
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

    public static zzuk zza(int i10) {
        if (i10 == 0) {
            return AEAD_UNKNOWN;
        }
        if (i10 == 1) {
            return AES_128_GCM;
        }
        if (i10 == 2) {
            return AES_256_GCM;
        }
        if (i10 != 3) {
            return null;
        }
        return CHACHA20_POLY1305;
    }
}
