package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabv extends zzacx<Void, i1> {
    private final String zzy;

    public zzabv(String str) {
        super(2);
        this.zzy = q.h(str, "email cannot be null or empty");
    }

    public final String zza() {
        return "updateEmail";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zzb(this.zzd.zze(), this.zzy, this.zzb);
    }

    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
