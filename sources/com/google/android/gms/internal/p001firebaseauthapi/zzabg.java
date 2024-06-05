package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabg extends zzacx<Void, i1> {
    public zzabg() {
        super(2);
    }

    public final String zza() {
        return "reload";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zzc(this.zzd.zze(), this.zzb);
    }

    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
