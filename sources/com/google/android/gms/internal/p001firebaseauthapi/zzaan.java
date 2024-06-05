package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i0;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaan  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaan extends zzacx<Void, i1> {
    private final String zzaa;
    private final String zzab;
    private final i0 zzy;
    private final String zzz;

    public zzaan(i0 i0Var, String str, String str2, String str3) {
        super(2);
        this.zzy = (i0) q.k(i0Var);
        this.zzz = q.g(str);
        this.zzaa = str2;
        this.zzab = str3;
    }

    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, this.zzz, this.zzaa, this.zzab, (zzace) this.zzb);
    }

    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
