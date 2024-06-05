package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfyj implements zzgcl {
    public static final /* synthetic */ zzfyj zza = new zzfyj();

    private /* synthetic */ zzfyj() {
    }

    public final zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) {
        zzfyd zzfyd;
        int i10 = zzfyk.zza;
        if (((zzgdz) zzgeb).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzghu zze = zzghu.zze(((zzgdz) zzgeb).zze(), zzgpy.zza());
                if (zze.zza() == 0) {
                    zzfyc zzfyc = new zzfyc((zzfyb) null);
                    zzfyc.zzb(zze.zzg().zzd());
                    zzfyc.zza(zze.zzf().zza());
                    zzfyc.zzc(16);
                    zzgme zzc = ((zzgdz) zzgeb).zzc();
                    zzgme zzgme = zzgme.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzfyd = zzfyd.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzfyd = zzfyd.zzb;
                    } else {
                        zzfyd = zzfyd.zza;
                    }
                    zzfyc.zzd(zzfyd);
                    zzfyf zze2 = zzfyc.zze();
                    zzfxv zzfxv = new zzfxv((zzfxu) null);
                    zzfxv.zzc(zze2);
                    zzfxv.zzb(zzgok.zzb(zze.zzg().zzE(), zzfxg));
                    zzfxv.zza(((zzgdz) zzgeb).zzf());
                    return zzfxv.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgqy unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
    }
}
