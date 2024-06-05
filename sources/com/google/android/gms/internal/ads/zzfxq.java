package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfxq extends zzgcu {
    zzfxq() {
        super(zzghf.class, new zzfxo(zzfvo.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i10, int i11, int i12, int i13, int i14, int i15) {
        zzghn zzc = zzgho.zzc();
        zzghq zzc2 = zzghr.zzc();
        zzc2.zza(16);
        zzc.zzb((zzghr) zzc2.zzal());
        zzc.zza(i10);
        zzgkb zzc3 = zzgkc.zzc();
        zzgke zzc4 = zzgkf.zzc();
        zzc4.zzb(5);
        zzc4.zza(i13);
        zzc3.zzb((zzgkf) zzc4.zzal());
        zzc3.zza(32);
        zzghh zza = zzghi.zza();
        zza.zza((zzgho) zzc.zzal());
        zza.zzb((zzgkc) zzc3.zzal());
        return new zzgcs((zzghi) zza.zzal(), i15);
    }

    public final zzgct zza() {
        return new zzfxp(this, zzghi.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzghf.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzghf zzghf = (zzghf) zzgrw;
        zzgog.zzb(zzghf.zza(), 0);
        new zzfxt();
        zzfxt.zzh(zzghf.zzf());
        new zzgfo();
        zzgfo.zzm(zzghf.zzg());
    }

    public final int zzf() {
        return 2;
    }
}
