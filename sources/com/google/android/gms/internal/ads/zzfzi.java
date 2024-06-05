package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfzi extends zzgcu {
    zzfzi() {
        super(zzgij.class, new zzfzg(zzfvo.class));
    }

    public static void zzg(boolean z10) throws GeneralSecurityException {
        if (zzm()) {
            zzfxf.zzo(new zzfzi(), true);
            zzfzs.zza();
        }
    }

    static /* bridge */ /* synthetic */ zzgcs zzh(int i10, int i11) {
        zzgil zzc = zzgim.zzc();
        zzc.zza(i10);
        return new zzgcs((zzgim) zzc.zzal(), i11);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzgct zza() {
        return new zzfzh(this, zzgim.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgij.zze(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzgij zzgij = (zzgij) zzgrw;
        zzgog.zzb(zzgij.zza(), 0);
        zzgog.zza(zzgij.zzf().zzd());
    }
}
