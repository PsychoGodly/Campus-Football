package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.q0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzacb extends zzacx<Void, q0.b> {
    private final zzyb zzy;

    public zzacb(zzaga zzaga) {
        super(8);
        q.k(zzaga);
        this.zzy = new zzyb(zzaga);
    }

    public final String zza() {
        return "verifyPhoneNumber";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
    }
}
