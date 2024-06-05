package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzt {
    public static final zzt zza = new zzt(0, 0, 0);
    public static final zzn zzb = zzs.zza;
    private static final String zzf = zzew.zzP(0);
    private static final String zzg = zzew.zzP(1);
    private static final String zzh = zzew.zzP(2);
    public final int zzc = 0;
    public final int zzd;
    public final int zze;

    public zzt(int i10, int i11, int i12) {
        this.zzd = i11;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzt)) {
            return false;
        }
        zzt zzt = (zzt) obj;
        int i10 = zzt.zzc;
        return this.zzd == zzt.zzd && this.zze == zzt.zze;
    }

    public final int hashCode() {
        return ((this.zzd + 16337) * 31) + this.zze;
    }
}
