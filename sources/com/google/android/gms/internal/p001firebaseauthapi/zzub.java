package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzub  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzub implements zzaje {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    private static final zzajh<zzub> zzh = null;
    private final int zzj;

    static {
        zzh = new zzud();
    }

    private zzub(int i10) {
        this.zzj = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzub.class.getName());
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
            return this.zzj;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzub zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }
}
