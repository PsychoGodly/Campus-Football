package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.q0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzadd implements zzadf {
    private final /* synthetic */ Status zza;

    zzadd(zzacz zzacz, Status status) {
        this.zza = status;
    }

    public final void zza(q0.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzacf.zza(this.zza));
    }
}
