package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzgfy implements zzgcl {
    public static final /* synthetic */ zzgfy zza = new zzgfy();

    private /* synthetic */ zzgfy() {
    }

    public final zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) {
        zzgfr zzgfr;
        zzgfs zzgfs;
        int i10 = zzgfz.zza;
        if (((zzgdz) zzgeb).zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgjz zzf = zzgjz.zzf(((zzgdz) zzgeb).zze(), zzgpy.zza());
                if (zzf.zza() == 0) {
                    zzgfq zzgfq = new zzgfq((zzgfp) null);
                    zzgfq.zzb(zzf.zzh().zzd());
                    zzgfq.zzc(zzf.zzg().zza());
                    int zzg = zzf.zzg().zzg();
                    zzgme zzgme = zzgme.UNKNOWN_PREFIX;
                    int i11 = zzg - 2;
                    if (i11 == 1) {
                        zzgfr = zzgfr.zza;
                    } else if (i11 == 2) {
                        zzgfr = zzgfr.zzd;
                    } else if (i11 == 3) {
                        zzgfr = zzgfr.zzc;
                    } else if (i11 == 4) {
                        zzgfr = zzgfr.zze;
                    } else if (i11 == 5) {
                        zzgfr = zzgfr.zzb;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + zzgjw.zza(zzg));
                    }
                    zzgfq.zza(zzgfr);
                    zzgme zzc = ((zzgdz) zzgeb).zzc();
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzgfs = zzgfs.zza;
                    } else if (ordinal == 2) {
                        zzgfs = zzgfs.zzc;
                    } else if (ordinal == 3) {
                        zzgfs = zzgfs.zzd;
                    } else if (ordinal == 4) {
                        zzgfs = zzgfs.zzb;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc.zza());
                    }
                    zzgfq.zzd(zzgfs);
                    zzgfu zze = zzgfq.zze();
                    zzgfi zzgfi = new zzgfi((zzgfh) null);
                    zzgfi.zzc(zze);
                    zzgfi.zzb(zzgok.zzb(zzf.zzh().zzE(), zzfxg));
                    zzgfi.zza(((zzgdz) zzgeb).zzf());
                    return zzgfi.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgqy | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }
}
