package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzlt {
    public static final byte[] zza = zza(1, 0);
    public static final byte[] zzb = zza(2, 32);
    public static final byte[] zzc = zza(2, 16);
    public static final byte[] zzd = zza(2, 17);
    public static final byte[] zze = zza(2, 18);
    public static final byte[] zzf = zza(2, 1);
    public static final byte[] zzg = zza(2, 2);
    public static final byte[] zzh = zza(2, 3);
    public static final byte[] zzi = zza(2, 1);
    public static final byte[] zzj = zza(2, 2);
    public static final byte[] zzk = zza(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzm = zza(1, 2);
    private static final byte[] zzn;
    private static final byte[] zzo;
    private static final byte[] zzp;

    static {
        Charset charset = zzpf.zza;
        zzn = "KEM".getBytes(charset);
        zzo = "HPKE".getBytes(charset);
        zzp = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzuo zzuo) throws GeneralSecurityException {
        int i10 = zzls.zza[zzuo.ordinal()];
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 66;
        }
        if (i10 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzuo zzuo) throws GeneralSecurityException {
        int i10 = zzls.zza[zzuo.ordinal()];
        if (i10 == 1) {
            return 65;
        }
        if (i10 == 2) {
            return 97;
        }
        if (i10 == 3) {
            return 133;
        }
        if (i10 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    static zzwo zzc(zzuo zzuo) throws GeneralSecurityException {
        int i10 = zzls.zza[zzuo.ordinal()];
        if (i10 == 1) {
            return zzwo.NIST_P256;
        }
        if (i10 == 2) {
            return zzwo.NIST_P384;
        }
        if (i10 == 3) {
            return zzwo.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    static void zza(zzur zzur) throws GeneralSecurityException {
        if (zzur.zzc() == zzuo.KEM_UNKNOWN || zzur.zzc() == zzuo.UNRECOGNIZED) {
            String name = zzur.zzc().name();
            throw new GeneralSecurityException("Invalid KEM param: " + name);
        } else if (zzur.zzb() == zzum.KDF_UNKNOWN || zzur.zzb() == zzum.UNRECOGNIZED) {
            String name2 = zzur.zzb().name();
            throw new GeneralSecurityException("Invalid KDF param: " + name2);
        } else if (zzur.zza() == zzuk.AEAD_UNKNOWN || zzur.zza() == zzuk.UNRECOGNIZED) {
            String name3 = zzur.zza().name();
            throw new GeneralSecurityException("Invalid AEAD param: " + name3);
        }
    }

    static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzwg.zza(zzo, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) (i11 >> (((i10 - i12) - 1) * 8));
        }
        return bArr;
    }

    static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return zzwg.zza(zzn, bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzwg.zza(zzp, bArr2, str.getBytes(zzpf.zza), bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return zzwg.zza(zza(2, i10), zzp, bArr2, str.getBytes(zzpf.zza), bArr);
    }
}
