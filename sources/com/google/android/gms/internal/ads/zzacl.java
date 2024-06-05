package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzacl extends zzaai {
    private final long zza;

    public zzacl(zzzv zzzv, long j10) {
        super(zzzv);
        zzdl.zzd(zzzv.zzf() >= j10);
        this.zza = j10;
    }

    public final long zzd() {
        return super.zzd() - this.zza;
    }

    public final long zze() {
        return super.zze() - this.zza;
    }

    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
