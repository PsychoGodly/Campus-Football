package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzagg {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzagh[] zzk;

    public zzagg(int i10, int i11, long j10, long j11, long j12, zzaf zzaf, int i12, zzagh[] zzaghArr, int i13, long[] jArr, long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = zzaf;
        this.zzg = i12;
        this.zzk = zzaghArr;
        this.zzj = i13;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzagh zza(int i10) {
        zzagh[] zzaghArr = this.zzk;
        if (zzaghArr == null) {
            return null;
        }
        return zzaghArr[i10];
    }
}
