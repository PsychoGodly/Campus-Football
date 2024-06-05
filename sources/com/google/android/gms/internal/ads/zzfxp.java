package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfxp extends zzgct {
    final /* synthetic */ zzfxq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxp(zzfxq zzfxq, Class cls) {
        super(cls);
        this.zza = zzfxq;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzghi zzghi = (zzghi) zzgrw;
        new zzfxt();
        zzghl zzf = zzfxs.zzf(zzghi.zze());
        zzgrw zza2 = new zzgfo().zza().zza(zzghi.zzf());
        zzghe zzc = zzghf.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgjz) zza2);
        zzc.zzc(0);
        return (zzghf) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzghi.zzd(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzfxq.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfxq.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzfxq.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfxq.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzghi zzghi = (zzghi) zzgrw;
        ((zzfxs) new zzfxt().zza()).zzd(zzghi.zze());
        new zzgfo().zza().zzd(zzghi.zzf());
        zzgog.zza(zzghi.zze().zza());
    }
}
