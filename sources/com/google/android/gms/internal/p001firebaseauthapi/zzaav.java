package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;
import com.google.firebase.auth.j;
import d7.d;
import d7.i1;
import d7.w1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaav  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaav extends zzacx<i, i1> {
    private final j zzy;

    public zzaav(j jVar) {
        super(2);
        this.zzy = (j) q.l(jVar, "credential cannot be null");
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(new zzyd(this.zzy.y(this.zzd), (String) null), (zzace) this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        ((i1) this.zze).a(this.zzj, zza);
        zzb(new w1(zza));
    }
}
