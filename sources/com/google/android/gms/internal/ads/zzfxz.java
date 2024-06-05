package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfxz extends zzgct {
    final /* synthetic */ zzfya zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxz(zzfya zzfya, Class cls) {
        super(cls);
        this.zza = zzfya;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzghx zzghx = (zzghx) zzgrw;
        zzght zzc = zzghu.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(zzghx.zza())));
        zzc.zzb(zzghx.zzf());
        zzc.zzc(0);
        return (zzghu) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzghx.zze(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfya.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfya.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfya.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfya.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzghx zzghx = (zzghx) zzgrw;
        zzgog.zza(zzghx.zza());
        if (zzghx.zzf().zza() != 12 && zzghx.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
