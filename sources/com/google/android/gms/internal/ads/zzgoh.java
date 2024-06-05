package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgoh {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b10 = copyOf[31] & Ascii.DEL;
            copyOf[31] = (byte) b10;
            copyOf[31] = (byte) (b10 | 64);
            int i10 = zzgmx.zzb;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Ascii.DEL);
                int i11 = 0;
                while (i11 < 7) {
                    byte[][] bArr5 = zzgmx.zza;
                    if (!MessageDigest.isEqual(bArr5[i11], copyOf2)) {
                        i11++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgnx.zza(bArr5[i11])));
                    }
                }
                long[] zzk = zzgnw.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i12 = 0;
                for (int i13 = 32; i12 < i13; i13 = 32) {
                    byte b11 = copyOf[(32 - i12) - 1] & 255;
                    int i14 = 0;
                    while (i14 < 8) {
                        int i15 = (b11 >> (7 - i14)) & 1;
                        zzgmx.zza(jArr4, jArr2, i15);
                        zzgmx.zza(jArr5, jArr3, i15);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b12 = b11;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i16 = i12;
                        long[] jArr12 = new long[19];
                        int i17 = i14;
                        long[] jArr13 = new long[19];
                        int i18 = i15;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzgnw.zzi(jArr4, jArr4, jArr5);
                        zzgnw.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzgnw.zzi(jArr2, jArr2, jArr3);
                        zzgnw.zzh(jArr3, copyOf4, jArr3);
                        zzgnw.zzb(jArr13, jArr2, jArr5);
                        zzgnw.zzb(jArr14, jArr4, jArr3);
                        zzgnw.zze(jArr13);
                        zzgnw.zzd(jArr13);
                        zzgnw.zze(jArr14);
                        zzgnw.zzd(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzgnw.zzi(jArr13, jArr13, jArr14);
                        zzgnw.zzh(jArr14, copyOf4, jArr14);
                        zzgnw.zzg(jArr17, jArr13);
                        zzgnw.zzg(jArr16, jArr14);
                        zzgnw.zzb(jArr14, jArr16, zzk);
                        zzgnw.zze(jArr14);
                        zzgnw.zzd(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzgnw.zzg(jArr11, jArr4);
                        zzgnw.zzg(jArr12, jArr5);
                        zzgnw.zzb(jArr8, jArr11, jArr12);
                        zzgnw.zze(jArr8);
                        zzgnw.zzd(jArr8);
                        zzgnw.zzh(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzgnw.zzf(jArr19, jArr12, 121665);
                        zzgnw.zzd(jArr19);
                        zzgnw.zzi(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzgnw.zzb(jArr20, jArr12, jArr19);
                        zzgnw.zze(jArr20);
                        zzgnw.zzd(jArr20);
                        int i19 = i18;
                        zzgmx.zza(jArr8, jArr6, i19);
                        zzgmx.zza(jArr20, jArr7, i19);
                        i14 = i17 + 1;
                        byte[] bArr7 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b11 = b12;
                        jArr = jArr10;
                        i12 = i16;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr6;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr8 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i12++;
                    byte[] bArr9 = bArr2;
                    copyOf = bArr8;
                }
                long[] jArr26 = jArr;
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[10];
                zzgnw.zzg(jArr28, jArr5);
                zzgnw.zzg(jArr38, jArr28);
                zzgnw.zzg(jArr36, jArr38);
                zzgnw.zza(jArr29, jArr36, jArr5);
                zzgnw.zza(jArr30, jArr29, jArr28);
                zzgnw.zzg(jArr36, jArr30);
                zzgnw.zza(jArr31, jArr36, jArr29);
                zzgnw.zzg(jArr36, jArr31);
                zzgnw.zzg(jArr38, jArr36);
                zzgnw.zzg(jArr36, jArr38);
                zzgnw.zzg(jArr38, jArr36);
                zzgnw.zzg(jArr36, jArr38);
                zzgnw.zza(jArr32, jArr36, jArr31);
                zzgnw.zzg(jArr36, jArr32);
                zzgnw.zzg(jArr38, jArr36);
                for (int i20 = 2; i20 < 10; i20 += 2) {
                    zzgnw.zzg(jArr36, jArr38);
                    zzgnw.zzg(jArr38, jArr36);
                }
                zzgnw.zza(jArr33, jArr38, jArr32);
                zzgnw.zzg(jArr36, jArr33);
                zzgnw.zzg(jArr38, jArr36);
                for (int i21 = 2; i21 < 20; i21 += 2) {
                    zzgnw.zzg(jArr36, jArr38);
                    zzgnw.zzg(jArr38, jArr36);
                }
                zzgnw.zza(jArr36, jArr38, jArr33);
                zzgnw.zzg(jArr38, jArr36);
                zzgnw.zzg(jArr36, jArr38);
                for (int i22 = 2; i22 < 10; i22 += 2) {
                    zzgnw.zzg(jArr38, jArr36);
                    zzgnw.zzg(jArr36, jArr38);
                }
                zzgnw.zza(jArr34, jArr36, jArr32);
                zzgnw.zzg(jArr36, jArr34);
                zzgnw.zzg(jArr38, jArr36);
                for (int i23 = 2; i23 < 50; i23 += 2) {
                    zzgnw.zzg(jArr36, jArr38);
                    zzgnw.zzg(jArr38, jArr36);
                }
                zzgnw.zza(jArr35, jArr38, jArr34);
                zzgnw.zzg(jArr38, jArr35);
                zzgnw.zzg(jArr36, jArr38);
                for (int i24 = 2; i24 < 100; i24 += 2) {
                    zzgnw.zzg(jArr38, jArr36);
                    zzgnw.zzg(jArr36, jArr38);
                }
                zzgnw.zza(jArr38, jArr36, jArr35);
                zzgnw.zzg(jArr36, jArr38);
                zzgnw.zzg(jArr38, jArr36);
                for (int i25 = 2; i25 < 50; i25 += 2) {
                    zzgnw.zzg(jArr36, jArr38);
                    zzgnw.zzg(jArr38, jArr36);
                }
                zzgnw.zza(jArr36, jArr38, jArr34);
                zzgnw.zzg(jArr38, jArr36);
                zzgnw.zzg(jArr36, jArr38);
                zzgnw.zzg(jArr38, jArr36);
                zzgnw.zzg(jArr36, jArr38);
                zzgnw.zzg(jArr38, jArr36);
                zzgnw.zza(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzgnw.zza(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzgnw.zza(jArr40, zzk, jArr39);
                zzgnw.zzi(jArr41, zzk, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzgnw.zzi(jArr43, jArr41, jArr45);
                zzgnw.zza(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzgnw.zzi(jArr43, jArr43, jArr46);
                zzgnw.zza(jArr43, jArr43, jArr40);
                zzgnw.zza(jArr43, jArr43, jArr46);
                zzgnw.zzf(jArr42, jArr43, 4);
                zzgnw.zzd(jArr42);
                zzgnw.zza(jArr43, jArr40, jArr3);
                zzgnw.zzh(jArr43, jArr43, jArr3);
                zzgnw.zza(jArr44, jArr41, jArr46);
                zzgnw.zzi(jArr43, jArr43, jArr44);
                zzgnw.zzg(jArr43, jArr43);
                if (MessageDigest.isEqual(zzgnw.zzj(jArr42), zzgnw.zzj(jArr43))) {
                    return zzgnw.zzj(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgnx.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgoe.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b10 = zza[31] & 63;
        zza[31] = (byte) b10;
        zza[31] = (byte) (b10 | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
