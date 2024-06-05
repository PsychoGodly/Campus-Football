package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcf {
    public static final zzn zza = zzce.zza;
    private static final String zzk = zzew.zzP(0);
    private static final String zzl = zzew.zzP(1);
    private static final String zzm = zzew.zzP(2);
    private static final String zzn = zzew.zzP(3);
    private static final String zzo = zzew.zzP(4);
    private static final String zzp = zzew.zzP(5);
    private static final String zzq = zzew.zzP(6);
    public final Object zzb;
    public final int zzc;
    public final zzbg zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    public zzcf(Object obj, int i10, zzbg zzbg, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.zzb = obj;
        this.zzc = i10;
        this.zzd = zzbg;
        this.zze = obj2;
        this.zzf = i11;
        this.zzg = j10;
        this.zzh = j11;
        this.zzi = i12;
        this.zzj = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcf.class == obj.getClass()) {
            zzcf zzcf = (zzcf) obj;
            return this.zzc == zzcf.zzc && this.zzf == zzcf.zzf && this.zzg == zzcf.zzg && this.zzh == zzcf.zzh && this.zzi == zzcf.zzi && this.zzj == zzcf.zzj && zzfnp.zza(this.zzb, zzcf.zzb) && zzfnp.zza(this.zze, zzcf.zze) && zzfnp.zza(this.zzd, zzcf.zzd);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
