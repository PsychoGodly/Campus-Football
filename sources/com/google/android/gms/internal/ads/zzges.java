package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzges extends zzgcu {
    private static final zzgdr zza = zzgdr.zzb(zzgep.zza, zzgeo.class, zzgfd.class);

    zzges() {
        super(zzggw.class, new zzgeq(zzfws.class));
    }

    public static void zzm(boolean z10) throws GeneralSecurityException {
        zzfxf.zzo(new zzges(), true);
        zzgfc.zza();
        zzgde.zza().zze(zza);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzghc zzghc) throws GeneralSecurityException {
        if (zzghc.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzghc.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzo(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzgct zza() {
        return new zzger(this, zzggz.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzggw.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzggw zzggw = (zzggw) zzgrw;
        zzgog.zzb(zzggw.zza(), 0);
        zzo(zzggw.zzg().zzd());
        zzn(zzggw.zzf());
    }
}
