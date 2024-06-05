package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfya extends zzgcu {
    zzfya() {
        super(zzghu.class, new zzfxy(zzfvo.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i10, int i11, int i12) {
        zzghw zzc = zzghx.zzc();
        zzc.zza(i10);
        zzghz zzc2 = zzgia.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgia) zzc2.zzal());
        return new zzgcs((zzghx) zzc.zzal(), i12);
    }

    public final zzgct zza() {
        return new zzfxz(this, zzghx.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzghu.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzghu zzghu = (zzghu) zzgrw;
        zzgog.zzb(zzghu.zza(), 0);
        zzgog.zza(zzghu.zzg().zzd());
        if (zzghu.zzf().zza() != 12 && zzghu.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
