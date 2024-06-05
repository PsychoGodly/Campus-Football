package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzun extends zzcn {
    private static final Object zzc = new Object();
    private static final zzbg zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbg zzh;
    private final zzaw zzi;

    static {
        zzaj zzaj = new zzaj();
        zzaj.zza("SinglePeriodTimeline");
        zzaj.zzb(Uri.EMPTY);
        zzd = zzaj.zzc();
    }

    public zzun(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzbg zzbg, zzaw zzaw) {
        this.zze = j13;
        this.zzf = j14;
        this.zzg = z10;
        this.zzh = zzbg;
        this.zzi = zzaw;
    }

    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzck zzd(int i10, zzck zzck, boolean z10) {
        zzdl.zza(i10, 0, 1);
        zzck.zzk((Object) null, z10 ? zzc : null, 0, this.zze, 0, zzd.zza, false);
        return zzck;
    }

    public final zzcm zze(int i10, zzcm zzcm, long j10) {
        zzdl.zza(i10, 0, 1);
        zzcm.zza(zzcm.zza, this.zzh, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0, this.zzf, 0, 0, 0);
        return zzcm;
    }

    public final Object zzf(int i10) {
        zzdl.zza(i10, 0, 1);
        return zzc;
    }
}
