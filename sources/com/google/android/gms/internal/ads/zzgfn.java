package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgfn extends zzgct {
    final /* synthetic */ zzgfo zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgfn(zzgfo zzgfo, Class cls) {
        super(cls);
        this.zza = zzgfo;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgkc zzgkc = (zzgkc) zzgrw;
        zzgjy zzc = zzgjz.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgkc.zzg());
        zzc.zza(zzgpe.zzv(zzgoe.zza(zzgkc.zza())));
        return (zzgjz) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgkc.zzf(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgfo.zzn(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgfo.zzn(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzgfo.zzn(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgfo.zzn(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzgfo.zzn(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgfo.zzn(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzgfo.zzn(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgfo.zzn(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzgfo.zzn(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgfo.zzn(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgkc zzgkc = (zzgkc) zzgrw;
        if (zzgkc.zza() >= 16) {
            zzgfo.zzo(zzgkc.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
