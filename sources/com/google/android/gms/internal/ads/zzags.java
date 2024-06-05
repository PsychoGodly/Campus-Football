package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzags {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzen zzg = new zzen(255);

    zzags() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzzv zzzv, boolean z10) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzzy.zzc(zzzv, this.zzg.zzH(), 0, 27, z10) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() == 0) {
                this.zza = this.zzg.zzk();
                this.zzb = this.zzg.zzp();
                this.zzg.zzq();
                this.zzg.zzq();
                this.zzg.zzq();
                int zzk = this.zzg.zzk();
                this.zzc = zzk;
                this.zzd = zzk + 27;
                this.zzg.zzC(zzk);
                if (zzzy.zzc(zzzv, this.zzg.zzH(), 0, this.zzc, z10)) {
                    for (int i10 = 0; i10 < this.zzc; i10++) {
                        this.zzf[i10] = this.zzg.zzk();
                        this.zze += this.zzf[i10];
                    }
                    return true;
                }
            } else if (z10) {
                return false;
            } else {
                throw zzbu.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean zzc(zzzv zzzv, long j10) throws IOException {
        int i10;
        zzdl.zzd(zzzv.zzf() == zzzv.zze());
        this.zzg.zzC(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || zzzv.zzf() + 4 < j10) && zzzy.zzc(zzzv, this.zzg.zzH(), 0, 4, true)) {
                this.zzg.zzF(0);
                if (this.zzg.zzs() != 1332176723) {
                    ((zzzk) zzzv).zzo(1, false);
                } else {
                    zzzv.zzj();
                    return true;
                }
            }
        }
        do {
            if ((i10 != 0 && zzzv.zzf() >= j10) || zzzv.zzc(1) == -1) {
                return false;
            }
            break;
        } while (zzzv.zzc(1) == -1);
        return false;
    }
}
