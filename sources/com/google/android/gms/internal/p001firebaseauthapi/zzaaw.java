package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;
import com.google.firebase.auth.o0;
import d7.d;
import d7.i1;
import d7.w1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaaw extends zzacx<i, i1> {
    private final o0 zzy;

    public zzaaw(o0 o0Var) {
        super(2);
        this.zzy = (o0) q.l(o0Var, "credential cannot be null");
    }

    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(new zzya(this.zzd.zze(), this.zzy), (zzace) this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        ((i1) this.zze).a(this.zzj, zza);
        zzb(new w1(zza));
    }
}
