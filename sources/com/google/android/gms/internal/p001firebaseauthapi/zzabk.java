package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabk extends zzacx<Void, i1> {
    private final zzye zzy;

    public zzabk(String str) {
        super(9);
        this.zzy = new zzye(str);
    }

    public final String zza() {
        return "setFirebaseUIVersion";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(null);
    }
}
