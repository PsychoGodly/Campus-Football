package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public enum zzgme implements zzgqo {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final zzgqp zzg = null;
    private final int zzi;

    static {
        zzg = new zzgmd();
    }

    private zzgme(int i10) {
        this.zzi = i10;
    }

    public static zzgme zzb(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
