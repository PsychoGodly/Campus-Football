package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzjk {
    public zzkh zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zzjk(zzkh zzkh) {
        this.zza = zzkh;
    }

    public final void zza(int i10) {
        boolean z10 = true;
        if (true != (this.zzg | i10)) {
            z10 = false;
        }
        this.zzg = z10;
        this.zzb += i10;
    }

    public final void zzb(int i10) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i10;
    }

    public final void zzc(zzkh zzkh) {
        this.zzg |= this.zza != zzkh;
        this.zza = zzkh;
    }

    public final void zzd(int i10) {
        boolean z10 = true;
        if (!this.zzc || this.zzd == 5) {
            this.zzg = true;
            this.zzc = true;
            this.zzd = i10;
            return;
        }
        if (i10 != 5) {
            z10 = false;
        }
        zzdl.zzd(z10);
    }
}
