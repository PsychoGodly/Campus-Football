package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzgfb implements zzgcl {
    public static final /* synthetic */ zzgfb zza = new zzgfb();

    private /* synthetic */ zzgfb() {
    }

    public final zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) {
        zzgev zzgev;
        int i10 = zzgfc.zza;
        if (((zzgdz) zzgeb).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzggw zze = zzggw.zze(((zzgdz) zzgeb).zze(), zzgpy.zza());
                if (zze.zza() == 0) {
                    zzgeu zzgeu = new zzgeu((zzget) null);
                    zzgeu.zza(zze.zzg().zzd());
                    zzgeu.zzb(zze.zzf().zza());
                    zzgme zzc = ((zzgdz) zzgeb).zzc();
                    zzgme zzgme = zzgme.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzgev = zzgev.zza;
                    } else if (ordinal == 2) {
                        zzgev = zzgev.zzc;
                    } else if (ordinal == 3) {
                        zzgev = zzgev.zzd;
                    } else if (ordinal == 4) {
                        zzgev = zzgev.zzb;
                    } else {
                        int zza2 = zzc.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                    }
                    zzgeu.zzc(zzgev);
                    zzgex zzd = zzgeu.zzd();
                    zzgem zzgem = new zzgem((zzgel) null);
                    zzgem.zzc(zzd);
                    zzgem.zza(zzgok.zzb(zze.zzg().zzE(), zzfxg));
                    zzgem.zzb(((zzgdz) zzgeb).zzf());
                    return zzgem.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgqy | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
