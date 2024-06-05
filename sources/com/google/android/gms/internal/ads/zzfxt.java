package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfxt extends zzgcu {
    zzfxt() {
        super(zzghl.class, new zzfxr(zzgny.class));
    }

    public static final void zzh(zzghl zzghl) throws GeneralSecurityException {
        zzgog.zzb(zzghl.zza(), 0);
        zzgog.zza(zzghl.zzh().zzd());
        zzm(zzghl.zzg());
    }

    /* access modifiers changed from: private */
    public static final void zzm(zzghr zzghr) throws GeneralSecurityException {
        if (zzghr.zza() < 12 || zzghr.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzgct zza() {
        return new zzfxs(this, zzgho.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzghl.zzf(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzh((zzghl) zzgrw);
    }
}
