package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzkx {
    public static zzwo zza(zzty zzty) throws GeneralSecurityException {
        int i10 = zzkw.zzb[zzty.ordinal()];
        if (i10 == 1) {
            return zzwo.NIST_P256;
        }
        if (i10 == 2) {
            return zzwo.NIST_P384;
        }
        if (i10 == 3) {
            return zzwo.NIST_P521;
        }
        String valueOf = String.valueOf(zzty);
        throw new GeneralSecurityException("unknown curve type: " + valueOf);
    }

    public static zzwr zza(zztk zztk) throws GeneralSecurityException {
        int i10 = zzkw.zzc[zztk.ordinal()];
        if (i10 == 1) {
            return zzwr.UNCOMPRESSED;
        }
        if (i10 == 2) {
            return zzwr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i10 == 3) {
            return zzwr.COMPRESSED;
        }
        String valueOf = String.valueOf(zztk);
        throw new GeneralSecurityException("unknown point format: " + valueOf);
    }

    public static String zza(zzub zzub) throws NoSuchAlgorithmException {
        int i10 = zzkw.zza[zzub.ordinal()];
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha224";
        }
        if (i10 == 3) {
            return "HmacSha256";
        }
        if (i10 == 4) {
            return "HmacSha384";
        }
        if (i10 == 5) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzub);
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + valueOf);
    }

    public static void zza(zztq zztq) throws GeneralSecurityException {
        zzwp.zza(zza(zztq.zzf().zzd()));
        zza(zztq.zzf().zze());
        if (zztq.zza() != zztk.UNKNOWN_FORMAT) {
            zzct.zza(zztq.zzb().zzd());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
