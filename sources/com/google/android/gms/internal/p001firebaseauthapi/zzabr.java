package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.t0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabr extends zzacx<Void, q0.b> {
    private final zzyf zzy;

    public zzabr(t0 t0Var, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        q.k(t0Var);
        q.g(str);
        this.zzy = new zzyf(t0Var, str, str2, j10, z10, z11, str3, str4, z12);
    }

    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zza(this.zzy, (zzace) this.zzb);
    }

    public final void zzb() {
    }
}
