package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzly  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzly {
    private final zzbg zza;
    private final zzbp zzb;

    public zzly(zzbg zzbg) {
        this.zza = zzbg;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbg zzbg = this.zza;
        if (zzbg != null) {
            return zzbg.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }

    public zzly(zzbp zzbp) {
        this.zza = null;
        this.zzb = zzbp;
    }
}
