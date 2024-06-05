package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrm {
    private HashMap<String, String> zza = new HashMap<>();

    public final zzrn zza() {
        if (this.zza != null) {
            zzrn zzrn = new zzrn(Collections.unmodifiableMap(this.zza));
            this.zza = null;
            return zzrn;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
