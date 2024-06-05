package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zztf implements zzwe {
    private final zzwe zza;
    private final zzcp zzb;

    public zztf(zzwe zzwe, zzcp zzcp) {
        this.zza = zzwe;
        this.zzb = zzcp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztf)) {
            return false;
        }
        zztf zztf = (zztf) obj;
        return this.zza.equals(zztf.zza) && this.zzb.equals(zztf.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    public final int zza(int i10) {
        return this.zza.zza(0);
    }

    public final int zzb(int i10) {
        return this.zza.zzb(i10);
    }

    public final int zzc() {
        return this.zza.zzc();
    }

    public final zzaf zzd(int i10) {
        return this.zza.zzd(i10);
    }

    public final zzcp zze() {
        return this.zzb;
    }
}
