package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzaaw implements zzaax {
    private final long zza;
    private final zzaav zzb;

    public zzaaw(long j10, long j11) {
        this.zza = j10;
        zzaay zzaay = j11 == 0 ? zzaay.zza : new zzaay(0, j11);
        this.zzb = new zzaav(zzaay, zzaay);
    }

    public final long zze() {
        return this.zza;
    }

    public final zzaav zzg(long j10) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }
}
