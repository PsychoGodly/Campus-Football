package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import k5.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzadw implements OnFailureListener {
    zzadw(zzadu zzadu) {
    }

    public final void onFailure(Exception exc) {
        a zza = zzadu.zza;
        String message = exc.getMessage();
        zza.c("SmsRetrieverClient failed to start: " + message, new Object[0]);
    }
}
