package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzacm implements zzaax {
    final /* synthetic */ zzaax zza;
    final /* synthetic */ zzacn zzb;

    zzacm(zzacn zzacn, zzaax zzaax) {
        this.zzb = zzacn;
        this.zza = zzaax;
    }

    public final long zze() {
        return this.zza.zze();
    }

    public final zzaav zzg(long j10) {
        zzaav zzg = this.zza.zzg(j10);
        zzaay zzaay = zzg.zza;
        zzaay zzaay2 = new zzaay(zzaay.zzb, zzaay.zzc + this.zzb.zzb);
        zzaay zzaay3 = zzg.zzb;
        return new zzaav(zzaay2, new zzaay(zzaay3.zzb, zzaay3.zzc + this.zzb.zzb));
    }

    public final boolean zzh() {
        return this.zza.zzh();
    }
}
