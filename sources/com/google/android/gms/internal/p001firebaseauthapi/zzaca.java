package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.d1;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaca  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaca extends zzacx<Void, i1> {
    private final d1 zzy;

    public zzaca(d1 d1Var) {
        super(2);
        this.zzy = (d1) q.l(d1Var, "request cannot be null");
    }

    public final String zza() {
        return "updateProfile";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzd.zze(), this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
