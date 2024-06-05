package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaid implements zzaim {
    private zzaf zza;
    private zzeu zzb;
    private zzabb zzc;

    public zzaid(String str) {
        zzad zzad = new zzad();
        zzad.zzS(str);
        this.zza = zzad.zzY();
    }

    public final void zza(zzen zzen) {
        zzdl.zzb(this.zzb);
        int i10 = zzew.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd != -9223372036854775807L && zze != -9223372036854775807L) {
            zzaf zzaf = this.zza;
            if (zze != zzaf.zzq) {
                zzad zzb2 = zzaf.zzb();
                zzb2.zzW(zze);
                zzaf zzY = zzb2.zzY();
                this.zza = zzY;
                this.zzc.zzk(zzY);
            }
            int zza2 = zzen.zza();
            this.zzc.zzq(zzen, zza2);
            this.zzc.zzs(zzd, 1, zza2, 0, (zzaba) null);
        }
    }

    public final void zzb(zzeu zzeu, zzzx zzzx, zzaiz zzaiz) {
        this.zzb = zzeu;
        zzaiz.zzc();
        zzabb zzv = zzzx.zzv(zzaiz.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}
