package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.j;
import d7.d;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaba  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaba extends zzacx<Void, i1> {
    private final zzyd zzy;

    public zzaba(j jVar, String str) {
        super(2);
        q.l(jVar, "Credential cannot be null");
        this.zzy = new zzyd(jVar, str);
    }

    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        if (this.zzd.c().equalsIgnoreCase(zza.c())) {
            ((i1) this.zze).a(this.zzj, zza);
            zzb(null);
            return;
        }
        zza(new Status(17024));
    }
}
