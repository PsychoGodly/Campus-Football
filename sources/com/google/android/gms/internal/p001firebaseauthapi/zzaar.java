package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaar  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaar extends zzacx<zzafk, Void> {
    private final zzxx zzy;

    public zzaar(String str, String str2) {
        super(10);
        q.g(str2);
        this.zzy = new zzxx(str, str2);
    }

    public final String zza() {
        return "getRecaptchaConfig";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
        zzb(this.zzt);
    }
}
