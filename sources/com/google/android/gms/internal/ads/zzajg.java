package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajg implements zzajf {
    private final zzzx zza;
    private final zzabb zzb;
    private final zzaji zzc;
    private final zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzajg(zzzx zzzx, zzabb zzabb, zzaji zzaji, String str, int i10) throws zzbu {
        this.zza = zzzx;
        this.zzb = zzabb;
        this.zzc = zzaji;
        int i11 = zzaji.zzb * zzaji.zze;
        int i12 = zzaji.zzd;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = zzaji.zzc * i13;
            int i15 = i14 * 8;
            int max = Math.max(i13, i14 / 10);
            this.zze = max;
            zzad zzad = new zzad();
            zzad.zzS(str);
            zzad.zzv(i15);
            zzad.zzO(i15);
            zzad.zzL(max);
            zzad.zzw(zzaji.zzb);
            zzad.zzT(zzaji.zzc);
            zzad.zzN(i10);
            this.zzd = zzad.zzY();
            return;
        }
        throw zzbu.zza("Expected block size: " + i13 + "; got: " + i12, (Throwable) null);
    }

    public final void zza(int i10, long j10) {
        this.zza.zzN(new zzajl(this.zzc, 1, (long) i10, j10));
        this.zzb.zzk(this.zzd);
    }

    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0;
    }

    public final boolean zzc(zzzv zzzv, long j10) throws IOException {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
            if (i10 <= 0 || (i11 = this.zzg) >= (i12 = this.zze)) {
                zzaji zzaji = this.zzc;
                int i13 = zzaji.zzd;
                int i14 = this.zzg / i13;
            } else {
                int zza2 = zzaaz.zza(this.zzb, zzzv, (int) Math.min((long) (i12 - i11), j11), true);
                if (zza2 == -1) {
                    j11 = 0;
                } else {
                    this.zzg += zza2;
                    j11 -= (long) zza2;
                }
            }
        }
        zzaji zzaji2 = this.zzc;
        int i132 = zzaji2.zzd;
        int i142 = this.zzg / i132;
        if (i142 > 0) {
            int i15 = i142 * i132;
            int i16 = this.zzg - i15;
            this.zzb.zzs(this.zzf + zzew.zzw(this.zzh, 1000000, (long) zzaji2.zzc), 1, i15, i16, (zzaba) null);
            this.zzh += (long) i142;
            this.zzg = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }
}
