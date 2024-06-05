package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfzh extends zzgct {
    final /* synthetic */ zzfzi zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzh(zzfzi zzfzi, Class cls) {
        super(cls);
        this.zza = zzfzi;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgii zzc = zzgij.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(((zzgim) zzgrw).zza())));
        zzc.zzb(0);
        return (zzgij) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgim.zze(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzfzi.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzfzi.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzfzi.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzfzi.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgog.zza(((zzgim) zzgrw).zza());
    }
}
