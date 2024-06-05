package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajk {
    public static Pair zza(zzzv zzzv) throws IOException {
        zzzv.zzj();
        zzajj zzd = zzd(1684108385, zzzv, new zzen(8));
        ((zzzk) zzzv).zzo(8, false);
        return Pair.create(Long.valueOf(zzzv.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaji zzb(zzzv zzzv) throws IOException {
        byte[] bArr;
        zzen zzen = new zzen(16);
        zzajj zzd = zzd(1718449184, zzzv, zzen);
        zzdl.zzf(zzd.zzb >= 16);
        zzzk zzzk = (zzzk) zzzv;
        zzzk.zzm(zzen.zzH(), 0, 16, false);
        zzen.zzF(0);
        int zzi = zzen.zzi();
        int zzi2 = zzen.zzi();
        int zzh = zzen.zzh();
        int zzh2 = zzen.zzh();
        int zzi3 = zzen.zzi();
        int zzi4 = zzen.zzi();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            zzzk.zzm(bArr, 0, i10, false);
        } else {
            bArr = zzew.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzzk) zzzv).zzo((int) (zzzv.zze() - zzzv.zzf()), false);
        return new zzaji(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzzv zzzv) throws IOException {
        zzen zzen = new zzen(8);
        int i10 = zzajj.zza(zzzv, zzen).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((zzzk) zzzv).zzm(zzen.zzH(), 0, 4, false);
        zzen.zzF(0);
        int zze = zzen.zze();
        if (zze == 1463899717) {
            return true;
        }
        zzee.zzb("WavHeaderReader", "Unsupported form type: " + zze);
        return false;
    }

    private static zzajj zzd(int i10, zzzv zzzv, zzen zzen) throws IOException {
        zzajj zza = zzajj.zza(zzzv, zzen);
        while (true) {
            int i11 = zza.zza;
            if (i11 == i10) {
                return zza;
            }
            zzee.zze("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = zza.zzb + 8;
            if (j10 <= 2147483647L) {
                ((zzzk) zzzv).zzo((int) j10, false);
                zza = zzajj.zza(zzzv, zzen);
            } else {
                int i12 = zza.zza;
                throw zzbu.zzc("Chunk is too large (~2GB+) to skip; id: " + i12);
            }
        }
    }
}
