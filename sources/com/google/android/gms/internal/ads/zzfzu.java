package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfzu extends zzgct {
    final /* synthetic */ zzfzv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzu(zzfzv zzfzv, Class cls) {
        super(cls);
        this.zza = zzfzv;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgiy zzgiy = (zzgiy) zzgrw;
        zzgiu zzc = zzgiv.zzc();
        zzc.zzb(0);
        zzc.zza(zzgpe.zzv(zzgoe.zza(32)));
        return (zzgiv) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgiy.zzd(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgcs(zzgiy.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgcs(zzgiy.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgiy zzgiy = (zzgiy) zzgrw;
    }
}
