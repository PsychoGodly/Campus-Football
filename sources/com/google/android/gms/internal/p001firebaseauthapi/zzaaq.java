package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.i;
import com.google.firebase.auth.i0;
import d7.d;
import d7.i1;
import d7.w1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaaq extends zzacx<i, i1> {
    private final String zzaa;
    private final i0 zzy;
    private final String zzz;

    public zzaaq(i0 i0Var, String str, String str2) {
        super(2);
        this.zzy = (i0) q.k(i0Var);
        this.zzz = q.g(str);
        this.zzaa = str2;
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzz, this.zzy, this.zzaa, (zzace) this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        a0 a0Var = this.zzd;
        if (a0Var == null || a0Var.c().equalsIgnoreCase(zza.c())) {
            ((i1) this.zze).a(this.zzj, zza);
            zzb(new w1(zza));
            return;
        }
        zza(new Status(17024));
    }
}
