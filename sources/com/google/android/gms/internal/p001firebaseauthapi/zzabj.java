package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;
import d7.d;
import d7.i1;
import d7.w1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabj extends zzacx<i, i1> {
    private final String zzy;

    public zzabj(String str) {
        super(2);
        this.zzy = str;
    }

    public final String zza() {
        return "signInAnonymously";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zzd(this.zzy, this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        ((i1) this.zze).a(this.zzj, zza);
        zzb(new w1(zza));
    }
}
