package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.o0;
import d7.d;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabe extends zzacx<Void, i1> {
    private final zzyg zzy;

    public zzabe(o0 o0Var, String str) {
        super(2);
        q.l(o0Var, "credential cannot be null");
        o0Var.B(false);
        this.zzy = new zzyg(o0Var, str);
    }

    public final String zza() {
        return "reauthenticateWithPhoneCredential";
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
