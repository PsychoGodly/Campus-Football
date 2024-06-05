package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxs {
    private final BigInteger zza;

    private zzxs(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzxs zza(BigInteger bigInteger, zzcs zzcs) {
        Objects.requireNonNull(zzcs, "SecretKeyAccess required");
        return new zzxs(bigInteger);
    }

    public final BigInteger zza(zzcs zzcs) {
        Objects.requireNonNull(zzcs, "SecretKeyAccess required");
        return this.zza;
    }
}
