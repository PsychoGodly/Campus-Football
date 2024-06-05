package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzvs implements zzaje {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzvs> zzg = null;
    private final int zzi;

    static {
        zzg = new zzvu();
    }

    private zzvs(int i10) {
        this.zzi = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzvs.class.getName());
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

    public static zzvs zza(int i10) {
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
}
