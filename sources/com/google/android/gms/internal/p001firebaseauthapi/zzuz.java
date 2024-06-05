package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzuz implements zzaje {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzuz> zzf = null;
    private final int zzh;

    static {
        zzf = new zzvc();
    }

    private zzuz(int i10) {
        this.zzh = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzuz.class.getName());
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

    public static zzuz zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }
}
