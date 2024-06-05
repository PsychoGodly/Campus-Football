package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabf extends zzacx<Void, Void> {
    private final zzafz zzy;

    public zzabf(String str, String str2, String str3, String str4) {
        super(15);
        this.zzy = zzafz.zzg().zzd(str).zza(str2).zzc(str4).zzb(str3).zza(zzaey.ACCESS_TOKEN).zza();
    }

    public final String zza() {
        return "revokeAccessToken";
    }

    public final void zza(TaskCompletionSource<Void> taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(null);
    }
}
