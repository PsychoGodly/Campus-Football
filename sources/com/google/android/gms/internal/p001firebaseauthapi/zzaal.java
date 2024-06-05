package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import d7.t;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaal extends zzacx<Void, t> {
    public zzaal() {
        super(5);
    }

    public final String zza() {
        return "delete";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzd.zze(), (zzace) this.zzb);
    }

    public final void zzb() {
        ((t) this.zze).zza();
        zzb(null);
    }
}
