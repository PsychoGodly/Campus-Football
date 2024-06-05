package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaas extends zzacx<zzafj, Void> {
    private final zzxy zzy = new zzxy();

    public zzaas() {
        super(11);
    }

    public final String zza() {
        return "getRecaptchaParam";
    }

    public final void zza(TaskCompletionSource<zzafj> taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(this.zzu);
    }
}
