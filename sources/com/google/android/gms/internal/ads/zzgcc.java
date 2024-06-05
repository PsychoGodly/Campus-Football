package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgcc {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 16);
    public static final byte[] zzd = zzc(2, 17);
    public static final byte[] zze = zzc(2, 18);
    public static final byte[] zzf = zzc(2, 1);
    public static final byte[] zzg = zzc(2, 2);
    public static final byte[] zzh = zzc(2, 3);
    public static final byte[] zzi = zzc(2, 1);
    public static final byte[] zzj = zzc(2, 2);
    public static final byte[] zzk = zzc(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static {
        Charset charset = zzgek.zza;
        zzm = "KEM".getBytes(charset);
        zzn = "HPKE".getBytes(charset);
        zzo = "HPKE-v1".getBytes(charset);
    }

    static void zza(zzgkn zzgkn) throws GeneralSecurityException {
        if (zzgkn.zzg() == 2 || zzgkn.zzg() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zzgkh.zza(zzgkn.zzg())));
        }
        String str = "UNRECOGNIZED";
        if (zzgkn.zzf() == 2 || zzgkn.zzf() == 1) {
            int zzf2 = zzgkn.zzf();
            if (zzf2 == 2) {
                str = "KDF_UNKNOWN";
            } else if (zzf2 == 3) {
                str = "HKDF_SHA256";
            } else if (zzf2 == 4) {
                str = "HKDF_SHA384";
            } else if (zzf2 == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (zzgkn.zze() == 2 || zzgkn.zze() == 1) {
            int zze2 = zzgkn.zze();
            if (zze2 == 2) {
                str = "AEAD_UNKNOWN";
            } else if (zze2 == 3) {
                str = "AES_128_GCM";
            } else if (zze2 == 4) {
                str = "AES_256_GCM";
            } else if (zze2 == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzgmv.zzb(zzn, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    static byte[] zzd(byte[] bArr) throws GeneralSecurityException {
        return zzgmv.zzb(zzm, bArr);
    }

    static byte[] zze(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzgmv.zzb(zzo, bArr2, str.getBytes(zzgek.zza), bArr);
    }

    static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return zzgmv.zzb(zzc(2, i10), zzo, bArr2, str.getBytes(zzgek.zza), bArr);
    }

    static int zzg(int i10) throws GeneralSecurityException {
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
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
