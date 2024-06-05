package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfzr implements zzgcl {
    public static final /* synthetic */ zzfzr zza = new zzfzr();

    private /* synthetic */ zzfzr() {
    }

    public final zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) {
        zzfzl zzfzl;
        int i10 = zzfzs.zza;
        if (((zzgdz) zzgeb).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgij zze = zzgij.zze(((zzgdz) zzgeb).zze(), zzgpy.zza());
                if (zze.zza() == 0) {
                    zzfzk zzfzk = new zzfzk((zzfzj) null);
                    zzfzk.zza(zze.zzf().zzd());
                    zzgme zzc = ((zzgdz) zzgeb).zzc();
                    zzgme zzgme = zzgme.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzfzl = zzfzl.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzfzl = zzfzl.zzb;
                    } else {
                        zzfzl = zzfzl.zza;
                    }
                    zzfzk.zzb(zzfzl);
                    zzfzn zzc2 = zzfzk.zzc();
                    zzfzd zzfzd = new zzfzd((zzfzc) null);
                    zzfzd.zzc(zzc2);
                    zzfzd.zzb(zzgok.zzb(zze.zzf().zzE(), zzfxg));
                    zzfzd.zza(((zzgdz) zzgeb).zzf());
                    return zzfzd.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgqy unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
    }
}
