package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaaj extends zzacx<Void, i1> {
    private final zzxv zzy;

    public zzaaj(String str, String str2, String str3) {
        super(4);
        q.h(str, "code cannot be null or empty");
        q.h(str2, "new password cannot be null or empty");
        this.zzy = new zzxv(str, str2, str3);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(null);
    }
}
