package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabs extends zzacx<zzagj, Void> {
    private final zzagm zzy;

    public zzabs(o oVar, String str) {
        super(12);
        q.k(oVar);
        this.zzy = zzagm.zza(q.g(oVar.zzb()), str);
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(this.zzv);
    }
}
