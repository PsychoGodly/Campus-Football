package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfyq extends zzgct {
    final /* synthetic */ zzfyr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyq(zzfyr zzfyr, Class cls) {
        super(cls);
        this.zza = zzfyr;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgic zzc = zzgid.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(((zzgig) zzgrw).zza())));
        zzc.zzb(0);
        return (zzgid) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgig.zze(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzfyr.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzfyr.zzg(16, 3));
        hashMap.put("AES256_GCM", zzfyr.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzfyr.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgog.zza(((zzgig) zzgrw).zza());
    }
}
