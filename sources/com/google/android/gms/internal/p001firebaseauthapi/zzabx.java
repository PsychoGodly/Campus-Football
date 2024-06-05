package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.o0;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabx extends zzacx<Void, i1> {
    private final o0 zzy;

    public zzabx(o0 o0Var) {
        super(2);
        this.zzy = (o0) q.k(o0Var);
    }

    public final String zza() {
        return "updatePhoneNumber";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(new zzya(this.zzd.zze(), this.zzy), (zzace) this.zzb);
    }

    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
