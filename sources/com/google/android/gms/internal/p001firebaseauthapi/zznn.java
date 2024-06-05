package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznn {
    private static final zznn zza = new zznn();
    private static final zznq zzb = new zznq();
    private final AtomicReference<zzro> zzc = new AtomicReference<>();

    public static zznn zza() {
        return zza;
    }

    public final zzro zzb() {
        zzro zzro = this.zzc.get();
        return zzro == null ? zzb : zzro;
    }
}
