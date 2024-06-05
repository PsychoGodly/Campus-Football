package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.h;
import d7.d;
import d7.i1;
import d7.l1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaay extends zzacx<Void, i1> {
    private final zzagt zzy;

    public zzaay(h hVar, String str) {
        super(2);
        q.l(hVar, "credential cannot be null");
        this.zzy = l1.a(hVar, str).zza(false);
    }

    public final String zza() {
        return "reauthenticateWithCredential";
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
