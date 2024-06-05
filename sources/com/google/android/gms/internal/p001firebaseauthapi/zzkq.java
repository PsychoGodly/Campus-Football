package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzkq implements zzbr {
    private final zzcg<zzbr> zza;
    private final zzrr zzb;

    public zzkq(zzcg<zzbr> zzcg) {
        this.zza = zzcg;
        if (zzcg.zzf()) {
            this.zzb = zznn.zza().zzb().zza(zznh.zza(zzcg), "hybrid_encrypt", "encrypt");
        } else {
            this.zzb = zznh.zza;
        }
    }
}
