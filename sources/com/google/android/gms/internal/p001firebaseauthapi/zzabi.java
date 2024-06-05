package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabi extends zzacx<Void, i1> {
    private final zzxz zzy;

    public zzabi(String str, e eVar) {
        super(6);
        q.h(str, "token cannot be null or empty");
        this.zzy = new zzxz(str, eVar);
    }

    public final String zza() {
        return "sendEmailVerification";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(null);
    }
}
