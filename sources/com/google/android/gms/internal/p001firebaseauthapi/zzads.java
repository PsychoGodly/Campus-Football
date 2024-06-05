package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;
import y6.l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzads  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzads extends q0.b {
    private final /* synthetic */ q0.b zza;
    private final /* synthetic */ String zzb;

    zzads(q0.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzadt.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, q0.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    public final void onVerificationCompleted(o0 o0Var) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(o0Var);
    }

    public final void onVerificationFailed(l lVar) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationFailed(lVar);
    }
}
