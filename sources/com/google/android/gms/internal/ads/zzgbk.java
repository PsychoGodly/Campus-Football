package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbk {
    public static void zza(zzgjj zzgjj) throws GeneralSecurityException {
        zzgne.zzh(zzc(zzgjj.zzf().zzg()));
        zzb(zzgjj.zzf().zzh());
        if (zzgjj.zzi() != 2) {
            zzfxf.zzc(zzgjj.zza().zze());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String zzb(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return "HmacSha1";
        }
        if (i11 == 2) {
            return "HmacSha384";
        }
        if (i11 == 3) {
            return "HmacSha256";
        }
        if (i11 == 4) {
            return "HmacSha512";
        }
        if (i11 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgjw.zza(i10))));
    }

    public static int zzc(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgju.zza(i10))));
    }

    public static int zzd(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzgja.zza(i10))));
            }
        }
        return i12;
    }
}
