package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabz extends zzacx<Void, Void> {
    private final zzyi zzy;

    public zzabz(String str, String str2, e eVar) {
        super(6);
        q.g(str);
        q.g(str2);
        q.k(eVar);
        this.zzy = new zzyi(str, str2, eVar);
    }

    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(null);
    }
}
