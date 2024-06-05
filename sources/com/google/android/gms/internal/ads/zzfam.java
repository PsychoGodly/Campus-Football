package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfam {
    private final zzfal zza = new zzfal();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfam() {
    }

    public final zzfal zza() {
        zzfal zza2 = this.zza.clone();
        zzfal zzfal = this.zza;
        zzfal.zza = false;
        zzfal.zzb = false;
        return zza2;
    }

    public final String zzb() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
