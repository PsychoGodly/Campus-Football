package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzwf extends ThreadLocal<Cipher> {
    zzwf() {
    }

    private static Cipher zza() {
        try {
            return zzwt.zza.zza("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return zza();
    }
}
