package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafk {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzen zzf;
    private final zzen zzg;
    private int zzh;
    private int zzi;

    public zzafk(zzen zzen, zzen zzen2, boolean z10) throws zzbu {
        this.zzg = zzen;
        this.zzf = zzen2;
        this.zze = z10;
        zzen2.zzF(12);
        this.zza = zzen2.zzn();
        zzen.zzF(12);
        this.zzi = zzen.zzn();
        zzzy.zzb(zzen.zze() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long j10;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        if (this.zze) {
            j10 = this.zzf.zzt();
        } else {
            j10 = this.zzf.zzs();
        }
        this.zzd = j10;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i11 = -1;
            int i12 = this.zzi - 1;
            this.zzi = i12;
            if (i12 > 0) {
                i11 = -1 + this.zzg.zzn();
            }
            this.zzh = i11;
        }
        return true;
    }
}
