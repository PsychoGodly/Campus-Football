package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgap {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long zzb = zzb(bArr3, 0, 0);
        long zzb2 = zzb(bArr3, 3, 2) & 67108611;
        long zzb3 = zzb(bArr3, 6, 4) & 67092735;
        long zzb4 = zzb(bArr3, 9, 6) & 66076671;
        long zzb5 = zzb(bArr3, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr5 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i11 = 0;
        while (true) {
            int length = bArr4.length;
            if (i11 < length) {
                int min = Math.min(16, length - i11);
                System.arraycopy(bArr4, i11, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i10, (byte) 0);
                }
                long j15 = zzb5 * 5;
                long j16 = zzb4 * 5;
                long j17 = zzb3 * 5;
                long zzb6 = j14 + zzb(bArr5, 0, 0);
                long zzb7 = j11 + zzb(bArr5, 3, 2);
                long zzb8 = j10 + zzb(bArr5, 6, 4);
                long zzb9 = j12 + zzb(bArr5, 9, 6);
                long zzb10 = j13 + (zzb(bArr5, 12, 8) | ((long) (bArr5[16] << Ascii.CAN)));
                long j18 = zzb7 * zzb;
                long j19 = zzb7 * zzb2;
                long j20 = zzb7 * zzb3;
                long j21 = zzb9 * zzb;
                long j22 = zzb7 * zzb4;
                long j23 = zzb10 * zzb;
                long j24 = (zzb6 * zzb) + (zzb7 * j15) + (zzb8 * j16) + (zzb9 * j17) + (zzb2 * 5 * zzb10);
                long j25 = (zzb6 * zzb2) + j18 + (zzb8 * j15) + (zzb9 * j16) + (j17 * zzb10) + (j24 >> 26);
                long j26 = (zzb6 * zzb3) + j19 + (zzb8 * zzb) + (zzb9 * j15) + (j16 * zzb10) + (j25 >> 26);
                long j27 = (zzb6 * zzb4) + j20 + (zzb8 * zzb2) + j21 + (zzb10 * j15) + (j26 >> 26);
                long j28 = (zzb6 * zzb5) + j22 + (zzb8 * zzb3) + (zzb9 * zzb2) + j23 + (j27 >> 26);
                long j29 = (j24 & 67108863) + ((j28 >> 26) * 5);
                j11 = (j25 & 67108863) + (j29 >> 26);
                i11 += 16;
                j10 = j26 & 67108863;
                j12 = j27 & 67108863;
                j13 = j28 & 67108863;
                i10 = 17;
                j14 = j29 & 67108863;
            } else {
                long j30 = j10 + (j11 >> 26);
                long j31 = j30 & 67108863;
                long j32 = j12 + (j30 >> 26);
                long j33 = j32 & 67108863;
                long j34 = j13 + (j32 >> 26);
                long j35 = j34 & 67108863;
                long j36 = j14 + ((j34 >> 26) * 5);
                long j37 = j36 & 67108863;
                long j38 = j37 + 5;
                long j39 = (j11 & 67108863) + (j36 >> 26);
                long j40 = j39 + (j38 >> 26);
                long j41 = (j40 >> 26) + j31;
                long j42 = j33 + (j41 >> 26);
                long j43 = (j35 + (j42 >> 26)) - 67108864;
                long j44 = j43 >> 63;
                long j45 = ~j44;
                long j46 = (j39 & j44) | (j40 & 67108863 & j45);
                long j47 = (j31 & j44) | (j41 & 67108863 & j45);
                long j48 = (j33 & j44) | (j42 & 67108863 & j45);
                long j49 = (j35 & j44) | (j43 & j45);
                long zzc = (((j44 & j37) | (j38 & 67108863 & j45) | (j46 << 26)) & 4294967295L) + zzc(bArr3, 16);
                long zzc2 = (((j46 >> 6) | (j47 << 20)) & 4294967295L) + zzc(bArr3, 20);
                long zzc3 = (((j47 >> 12) | (j48 << 14)) & 4294967295L) + zzc(bArr3, 24);
                long zzc4 = (((j48 >> 18) | (j49 << 8)) & 4294967295L) + zzc(bArr3, 28);
                byte[] bArr6 = new byte[16];
                zzd(bArr6, zzc & 4294967295L, 0);
                long j50 = zzc2 + (zzc >> 32);
                zzd(bArr6, j50 & 4294967295L, 4);
                long j51 = zzc3 + (j50 >> 32);
                zzd(bArr6, j51 & 4294967295L, 8);
                zzd(bArr6, (zzc4 + (j51 >> 32)) & 4294967295L, 12);
                return bArr6;
            }
        }
    }

    private static long zzb(byte[] bArr, int i10, int i11) {
        return (zzc(bArr, i10) >> i11) & 67108863;
    }

    private static long zzc(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((long) (((bArr[i10 + 3] & 255) << Ascii.CAN) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << Ascii.DLE))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            j10 >>= 8;
        }
    }
}
