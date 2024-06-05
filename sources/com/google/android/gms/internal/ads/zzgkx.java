package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public enum zzgkx implements zzgqo {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzgqp zzg = null;
    private final int zzi;

    static {
        zzg = new zzgkw();
    }

    private zzgkx(int i10) {
        this.zzi = i10;
    }

    public static zzgkx zzb(int i10) {
        if (i10 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i10 == 1) {
            return SYMMETRIC;
        }
        if (i10 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i10 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i10 != 4) {
            return null;
        }
        return REMOTE;
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
