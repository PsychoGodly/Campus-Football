package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzmj {
    static final zzmj zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmj(bigInteger, bigInteger, BigInteger.ZERO);
    }

    zzmj(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
