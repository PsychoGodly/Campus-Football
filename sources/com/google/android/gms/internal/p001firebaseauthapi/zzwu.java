package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzwu<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzwu(zzxb<JcePrimitiveT> zzxb) {
        this.zza = zzxb;
    }

    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        return this.zza.zza(str, (Provider) null);
    }
}
