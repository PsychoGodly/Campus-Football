package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfza implements zzgcl {
    public static final /* synthetic */ zzfza zza = new zzfza();

    private /* synthetic */ zzfza() {
    }

    public final zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) {
        zzfyu zzfyu;
        int i10 = zzfzb.zza;
        if (((zzgdz) zzgeb).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgid zze = zzgid.zze(((zzgdz) zzgeb).zze(), zzgpy.zza());
                if (zze.zza() == 0) {
                    zzfyt zzfyt = new zzfyt((zzfys) null);
                    zzfyt.zzb(zze.zzf().zzd());
                    zzfyt.zza(12);
                    zzfyt.zzc(16);
                    zzgme zzc = ((zzgdz) zzgeb).zzc();
                    zzgme zzgme = zzgme.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzfyu = zzfyu.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzfyu = zzfyu.zzb;
                    } else {
                        zzfyu = zzfyu.zza;
                    }
                    zzfyt.zzd(zzfyu);
                    zzfyw zze2 = zzfyt.zze();
                    zzfym zzfym = new zzfym((zzfyl) null);
                    zzfym.zzc(zze2);
                    zzfym.zzb(zzgok.zzb(zze.zzf().zzE(), zzfxg));
                    zzfym.zza(((zzgdz) zzgeb).zzf());
                    return zzfym.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgqy unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
    }
}
