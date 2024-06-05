package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgav extends zzgct {
    final /* synthetic */ zzgaw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgav(zzgaw zzgaw, Class cls) {
        super(cls);
        this.zza = zzgaw;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgio zzc = zzgip.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(((zzgis) zzgrw).zza())));
        zzc.zzb(0);
        return (zzgip) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgis.zze(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgir zzc = zzgis.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgcs((zzgis) zzc.zzal(), 1));
        zzgir zzc2 = zzgis.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgcs((zzgis) zzc2.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgis zzgis = (zzgis) zzgrw;
        if (zzgis.zza() != 64) {
            int zza2 = zzgis.zza();
            throw new InvalidAlgorithmParameterException("invalid key size: " + zza2 + ". Valid keys must have 64 bytes.");
        }
    }
}
