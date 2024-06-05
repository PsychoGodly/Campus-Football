package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaik {
    private final zzahn zza;
    private final zzeu zzb;
    private final zzem zzc = new zzem(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaik(zzahn zzahn, zzeu zzeu) {
        this.zza = zzahn;
        this.zzb = zzeu;
    }

    public final void zza(zzen zzen) throws zzbu {
        long j10;
        zzen zzen2 = zzen;
        zzen2.zzB(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzen2.zzB(this.zzc.zza, 0, this.zzc.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long zzd2 = (long) this.zzc.zzd(3);
            this.zzc.zzl(1);
            int zzd3 = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long zzd4 = (long) this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzl(4);
                this.zzc.zzl(1);
                this.zzc.zzl(1);
                long zzd5 = (long) this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb(((long) (this.zzc.zzd(15) << 15)) | (((long) this.zzc.zzd(3)) << 30) | zzd5);
                this.zzf = true;
            }
            j10 = this.zzb.zzb((zzd2 << 30) | ((long) zzd3) | zzd4);
        } else {
            j10 = 0;
        }
        this.zza.zzd(j10, 4);
        this.zza.zza(zzen2);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
