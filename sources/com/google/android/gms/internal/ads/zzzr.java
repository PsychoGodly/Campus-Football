package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzaf zza(byte[] bArr, String str, String str2, zzx zzx) {
        zzem zzem;
        int i10 = 0;
        int i11 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzem = new zzem(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i12 = 0; i12 < copyOf.length - 1; i12 += 2) {
                    byte b11 = copyOf[i12];
                    int i13 = i12 + 1;
                    copyOf[i12] = copyOf[i13];
                    copyOf[i13] = b11;
                }
            }
            int length = copyOf.length;
            zzem = new zzem(copyOf, length);
            if (copyOf[0] == 31) {
                zzem zzem2 = new zzem(copyOf, length);
                while (zzem2.zza() >= 16) {
                    zzem2.zzl(2);
                    zzem.zzf(zzem2.zzd(14), 14);
                }
            }
            zzem.zzi(copyOf, copyOf.length);
        }
        zzem.zzl(60);
        int i14 = zzb[zzem.zzd(6)];
        int i15 = zzc[zzem.zzd(4)];
        int zzd2 = zzem.zzd(5);
        if (zzd2 < 29) {
            i11 = (zzd[zzd2] * 1000) / 2;
        }
        zzem.zzl(10);
        if (zzem.zzd(2) > 0) {
            i10 = 1;
        }
        int i16 = i14 + i10;
        zzad zzad = new zzad();
        zzad.zzH(str);
        zzad.zzS("audio/vnd.dts");
        zzad.zzv(i11);
        zzad.zzw(i16);
        zzad.zzT(i15);
        zzad.zzB((zzx) null);
        zzad.zzK(str2);
        return zzad.zzY();
    }
}
