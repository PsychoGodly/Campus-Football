package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfyr extends zzgcu {
    zzfyr() {
        super(zzgid.class, new zzfyp(zzfvo.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i10, int i11) {
        zzgif zzc = zzgig.zzc();
        zzc.zza(i10);
        return new zzgcs((zzgig) zzc.zzal(), i11);
    }

    public final zzgct zza() {
        return new zzfyq(this, zzgig.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgid.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgid zzgid = (zzgid) zzgrw;
        zzgog.zzb(zzgid.zza(), 0);
        zzgog.zza(zzgid.zzf().zzd());
    }

    public final int zzf() {
        return 2;
    }
}
