package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzajb {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzen zzen, int i10, int i11) {
        zzen.zzF(i10);
        if (zzen.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzen.zze();
        if ((8388608 & zze) != 0 || ((zze >> 8) & 8191) != i11 || (zze & 32) == 0 || zzen.zzk() < 7 || zzen.zza() < 7 || (zzen.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzen.zzB(bArr, 0, 6);
        long j10 = (long) bArr[4];
        long j11 = ((long) bArr[3]) & 255;
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | (j11 + j11) | ((j10 & 255) >> 7);
    }
}
