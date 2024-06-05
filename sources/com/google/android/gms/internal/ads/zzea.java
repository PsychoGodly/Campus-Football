package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzea {
    public final Object zza;
    private zzy zzb = new zzy();
    private boolean zzc;
    private boolean zzd;

    public zzea(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzea.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzea) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i10, zzdy zzdy) {
        if (!this.zzd) {
            if (i10 != -1) {
                this.zzb.zza(i10);
            }
            this.zzc = true;
            zzdy.zza(this.zza);
        }
    }

    public final void zzb(zzdz zzdz) {
        if (!this.zzd && this.zzc) {
            zzaa zzb2 = this.zzb.zzb();
            this.zzb = new zzy();
            this.zzc = false;
            zzdz.zza(this.zza, zzb2);
        }
    }

    public final void zzc(zzdz zzdz) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdz.zza(this.zza, this.zzb.zzb());
        }
    }
}
