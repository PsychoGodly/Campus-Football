package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaan {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!zzaao.zzm(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i11;
        this.zzb = zzaao.zza[3 - i12];
        int i17 = zzaao.zzb[i14];
        this.zzd = i17;
        int i18 = 2;
        if (i11 == 2) {
            i17 /= 2;
            this.zzd = i17;
        } else if (i11 == 0) {
            i17 /= 4;
            this.zzd = i17;
        }
        int i19 = (i10 >>> 9) & 1;
        this.zzg = zzaao.zzl(i11, i12);
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = zzaao.zzc[i13 - 1];
            } else {
                i16 = zzaao.zzd[i13 - 1];
            }
            this.zzf = i16;
            this.zzc = (((i16 * 12) / i17) + i19) * 4;
        } else {
            int i20 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = zzaao.zze[i13 - 1];
                } else {
                    i15 = zzaao.zzf[i13 - 1];
                }
                this.zzf = i15;
                this.zzc = ((i15 * 144) / i17) + i19;
            } else {
                int i21 = zzaao.zzg[i13 - 1];
                this.zzf = i21;
                if (i12 == 1) {
                    i20 = 72;
                }
                this.zzc = ((i20 * i21) / i17) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.zze = i18;
        return true;
    }
}
