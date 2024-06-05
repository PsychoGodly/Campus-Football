package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgcg implements zzgbv {
    private final zzgoj zza;
    private final zzgoj zzb;

    private zzgcg(byte[] bArr, byte[] bArr2) {
        this.zza = zzgoj.zzb(bArr);
        this.zzb = zzgoj.zzb(bArr2);
    }

    static zzgcg zza(byte[] bArr) throws GeneralSecurityException {
        return new zzgcg(bArr, zzgoh.zzc(bArr));
    }
}
