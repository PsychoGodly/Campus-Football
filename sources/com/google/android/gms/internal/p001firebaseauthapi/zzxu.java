package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxu {
    private final zzxt zza;

    private zzxu(zzxt zzxt) {
        this.zza = zzxt;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzxu zza(byte[] bArr, zzcs zzcs) {
        Objects.requireNonNull(zzcs, "SecretKeyAccess required");
        return new zzxu(zzxt.zza(bArr));
    }

    public final byte[] zza(zzcs zzcs) {
        Objects.requireNonNull(zzcs, "SecretKeyAccess required");
        return this.zza.zzb();
    }
}
