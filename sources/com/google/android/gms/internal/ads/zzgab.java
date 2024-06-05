package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgab extends zzgct {
    final /* synthetic */ zzgac zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgab(zzgac zzgac, Class cls) {
        super(cls);
        this.zza = zzgac;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgly zzc = zzglz.zzc();
        zzc.zza((zzgmc) zzgrw);
        zzc.zzb(0);
        return (zzglz) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgmc.zze(zzgpe, zzgpy.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgmc zzgmc = (zzgmc) zzgrw;
        if (zzgmc.zzf().isEmpty() || !zzgmc.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
