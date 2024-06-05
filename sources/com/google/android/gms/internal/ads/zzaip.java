package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaip implements zzzf {
    private final zzeu zza;
    private final zzen zzb = new zzen();
    private final int zzc;

    public zzaip(int i10, zzeu zzeu, int i11) {
        this.zzc = i10;
        this.zza = zzeu;
    }

    public final zzze zza(zzzv zzzv, long j10) throws IOException {
        int zza2;
        int i10;
        long j11;
        long zzf = zzzv.zzf();
        int min = (int) Math.min(112800, zzzv.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzzk) zzzv).zzm(this.zzb.zzH(), 0, min, false);
        zzen zzen = this.zzb;
        int zzd = zzen.zzd();
        long j12 = -1;
        long j13 = -9223372036854775807L;
        long j14 = -1;
        while (zzen.zza() >= 188 && (i10 = zza2 + 188) <= zzd) {
            long zzb2 = zzajb.zzb(zzen, (zza2 = zzajb.zza(zzen.zzH(), zzen.zzc(), zzd)), this.zzc);
            if (zzb2 != -9223372036854775807L) {
                long zzb3 = this.zza.zzb(zzb2);
                if (zzb3 > j10) {
                    if (j13 == -9223372036854775807L) {
                        return zzze.zzd(zzb3, zzf);
                    }
                    j11 = zzf + j14;
                } else if (100000 + zzb3 > j10) {
                    j11 = zzf + ((long) zza2);
                } else {
                    j14 = (long) zza2;
                    j13 = zzb3;
                }
                return zzze.zze(j11);
            }
            zzen.zzF(i10);
            j12 = (long) i10;
        }
        return j13 != -9223372036854775807L ? zzze.zzf(j13, zzf + j12) : zzze.zza;
    }

    public final void zzb() {
        zzen zzen = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzen.zzD(bArr, 0);
    }
}
