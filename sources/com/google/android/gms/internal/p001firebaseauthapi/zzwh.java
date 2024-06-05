package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwh implements zzbp {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_NOT_FIPS;
    private static final Collection<Integer> zzb = Arrays.asList(new Integer[]{64});
    private static final byte[] zzc = new byte[16];
    private static final byte[] zzd = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final zzxl zze;
    private final byte[] zzf;
    private final byte[] zzg;

    public zzwh(byte[] bArr) throws GeneralSecurityException {
        this(bArr, zzxt.zza(new byte[0]));
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        byte[] bArr4;
        int length = bArr.length;
        byte[] bArr5 = this.zzg;
        if (length < bArr5.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        } else if (zzpf.zza(bArr5, bArr)) {
            Cipher zza2 = zzwt.zza.zza("AES/CTR/NoPadding");
            byte[] bArr6 = this.zzg;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr6.length, bArr6.length + 16);
            byte[] bArr7 = (byte[]) copyOfRange.clone();
            bArr7[8] = (byte) (bArr7[8] & Ascii.DEL);
            bArr7[12] = (byte) (bArr7[12] & Ascii.DEL);
            zza2.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr7));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzg.length + 16, bArr.length);
            byte[] doFinal = zza2.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && zzxp.zza()) {
                doFinal = new byte[0];
            }
            byte[][] bArr8 = {bArr2, doFinal};
            byte[] zza3 = this.zze.zza(zzc, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                if (bArr8[i10] == null) {
                    bArr4 = new byte[0];
                } else {
                    bArr4 = bArr8[i10];
                }
                zza3 = zzwg.zza(zzrd.zzb(zza3), this.zze.zza(bArr4, 16));
            }
            byte[] bArr9 = bArr8[1];
            if (bArr9.length < 16) {
                bArr3 = zzwg.zza(zzrd.zza(bArr9), zzrd.zzb(zza3));
            } else if (bArr9.length >= zza3.length) {
                int length2 = bArr9.length - zza3.length;
                bArr3 = Arrays.copyOf(bArr9, bArr9.length);
                for (int i11 = 0; i11 < zza3.length; i11++) {
                    int i12 = length2 + i11;
                    bArr3[i12] = (byte) (bArr3[i12] ^ zza3[i11]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            if (MessageDigest.isEqual(copyOfRange, this.zze.zza(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    private zzwh(byte[] bArr, zzxt zzxt) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else if (zzb.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.zze = new zzxl(copyOfRange);
            this.zzg = zzxt.zzb();
        } else {
            int length = bArr.length;
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
    }
}
