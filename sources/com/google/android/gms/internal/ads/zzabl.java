package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzabl implements zzaax {
    final /* synthetic */ zzabo zza;
    private final long zzb;

    public zzabl(zzabo zzabo, long j10) {
        this.zza = zzabo;
        this.zzb = j10;
    }

    public final long zze() {
        return this.zzb;
    }

    public final zzaav zzg(long j10) {
        zzaav zza2 = this.zza.zzg[0].zza(j10);
        int i10 = 1;
        while (true) {
            zzabo zzabo = this.zza;
            if (i10 >= zzabo.zzg.length) {
                return zza2;
            }
            zzaav zza3 = zzabo.zzg[i10].zza(j10);
            if (zza3.zza.zzc < zza2.zza.zzc) {
                zza2 = zza3;
            }
            i10++;
        }
    }

    public final boolean zzh() {
        return true;
    }
}
