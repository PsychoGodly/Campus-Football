package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;
import com.google.firebase.auth.j;
import d7.d;
import d7.i1;
import d7.w1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaau extends zzacx<i, i1> {
    private final j zzy;
    private final String zzz;

    public zzaau(j jVar, String str) {
        super(2);
        this.zzy = (j) q.l(jVar, "credential cannot be null");
        q.h(jVar.zzc(), "email cannot be null");
        q.h(jVar.zzd(), "password cannot be null");
        this.zzz = str;
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy.zzc(), q.g(this.zzy.zzd()), this.zzd.zze(), this.zzd.B(), this.zzz, this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        ((i1) this.zze).a(this.zzj, zza);
        zzb(new w1(zza));
    }
}
