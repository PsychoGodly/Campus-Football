package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzadc implements Runnable {
    private final /* synthetic */ zzadf zza;
    private final /* synthetic */ zzacz zzb;

    zzadc(zzacz zzacz, zzadf zzadf) {
        this.zzb = zzacz;
        this.zza = zzadf;
    }

    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
