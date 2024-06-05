package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzabx implements zzzf {
    private final zzaah zza;
    private final int zzb;
    private final zzaac zzc = new zzaac();

    /* synthetic */ zzabx(zzaah zzaah, int i10, zzabw zzabw) {
        this.zza = zzaah;
        this.zzb = i10;
    }

    private final long zzc(zzzv zzzv) throws IOException {
        zzzv zzzv2 = zzzv;
        while (zzzv.zze() < zzzv.zzd() - 6) {
            zzaah zzaah = this.zza;
            int i10 = this.zzb;
            zzaac zzaac = this.zzc;
            long zze = zzzv.zze();
            byte[] bArr = new byte[2];
            zzzk zzzk = (zzzk) zzzv2;
            zzzk.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzzv.zzj();
                zzzk.zzl((int) (zze - zzzv.zzf()), false);
            } else {
                zzen zzen = new zzen(16);
                System.arraycopy(bArr, 0, zzen.zzH(), 0, 2);
                zzen.zzE(zzzy.zza(zzzv2, zzen.zzH(), 2, 14));
                zzzv.zzj();
                zzzk.zzl((int) (zze - zzzv.zzf()), false);
                if (zzaad.zzc(zzen, zzaah, i10, zzaac)) {
                    break;
                }
            }
            zzzk.zzl(1, false);
        }
        if (zzzv.zze() < zzzv.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzzk) zzzv2).zzl((int) (zzzv.zzd() - zzzv.zze()), false);
        return this.zza.zzj;
    }

    public final zzze zza(zzzv zzzv, long j10) throws IOException {
        long zzf = zzzv.zzf();
        long zzc2 = zzc(zzzv);
        long zze = zzzv.zze();
        ((zzzk) zzzv).zzl(Math.max(6, this.zza.zzc), false);
        int i10 = (zzc2 > j10 ? 1 : (zzc2 == j10 ? 0 : -1));
        long zzc3 = zzc(zzzv);
        long zze2 = zzzv.zze();
        if (i10 > 0 || zzc3 <= j10) {
            return zzc3 <= j10 ? zzze.zzf(zzc3, zze2) : zzze.zzd(zzc2, zzf);
        }
        return zzze.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}
