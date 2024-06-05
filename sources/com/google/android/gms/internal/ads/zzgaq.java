package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgaq extends ThreadLocal {
    zzgaq() {
    }

    protected static final Cipher zza() {
        try {
            return (Cipher) zzgnn.zza.zza("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
