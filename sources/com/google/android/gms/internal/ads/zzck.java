package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzck {
    public static final zzn zza = zzcj.zza;
    private static final String zzh = zzew.zzP(0);
    private static final String zzi = zzew.zzP(1);
    private static final String zzj = zzew.zzP(2);
    private static final String zzk = zzew.zzP(3);
    private static final String zzl = zzew.zzP(4);
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class.equals(obj.getClass())) {
            zzck zzck = (zzck) obj;
            return zzew.zzU(this.zzb, zzck.zzb) && zzew.zzU(this.zzc, zzck.zzc) && this.zzd == zzck.zzd && this.zze == zzck.zze && this.zzg == zzck.zzg && zzew.zzU(this.zzm, zzck.zzm);
        }
    }

    public final int hashCode() {
        int i10;
        Object obj = this.zzb;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        Object obj2 = this.zzc;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        int i12 = ((((i10 + 217) * 31) + i11) * 31) + this.zzd;
        long j10 = this.zze;
        return (((((i12 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.zzm.hashCode();
    }

    public final int zza(int i10) {
        return this.zzm.zza(i10).zzc;
    }

    public final int zzb() {
        int i10 = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long j10) {
        return -1;
    }

    public final int zzd(long j10) {
        return -1;
    }

    public final int zze(int i10) {
        return this.zzm.zza(i10).zza(-1);
    }

    public final int zzf(int i10, int i11) {
        return this.zzm.zza(i10).zza(i11);
    }

    public final long zzg(int i10, int i11) {
        zzc zza2 = this.zzm.zza(i10);
        if (zza2.zzc != -1) {
            return zza2.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i10) {
        long j10 = this.zzm.zza(i10).zzb;
        return 0;
    }

    public final long zzi() {
        long j10 = this.zzm.zzd;
        return 0;
    }

    public final long zzj(int i10) {
        long j10 = this.zzm.zza(i10).zzg;
        return 0;
    }

    public final zzck zzk(Object obj, Object obj2, int i10, long j10, long j11, zzd zzd2, boolean z10) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j10;
        this.zzf = 0;
        this.zzm = zzd2;
        this.zzg = z10;
        return this;
    }

    public final boolean zzl(int i10) {
        boolean z10 = this.zzm.zza(i10).zzh;
        return false;
    }
}
