package com.google.android.gms.internal.ads;

import androidx.collection.g;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgr {
    zzbey zza;
    zzbev zzb;
    zzbfl zzc;
    zzbfi zzd;
    zzbkg zze;
    final g zzf = new g();
    final g zzg = new g();

    public final zzdgr zza(zzbev zzbev) {
        this.zzb = zzbev;
        return this;
    }

    public final zzdgr zzb(zzbey zzbey) {
        this.zza = zzbey;
        return this;
    }

    public final zzdgr zzc(String str, zzbfe zzbfe, zzbfb zzbfb) {
        this.zzf.put(str, zzbfe);
        if (zzbfb != null) {
            this.zzg.put(str, zzbfb);
        }
        return this;
    }

    public final zzdgr zzd(zzbkg zzbkg) {
        this.zze = zzbkg;
        return this;
    }

    public final zzdgr zze(zzbfi zzbfi) {
        this.zzd = zzbfi;
        return this;
    }

    public final zzdgr zzf(zzbfl zzbfl) {
        this.zzc = zzbfl;
        return this;
    }

    public final zzdgt zzg() {
        return new zzdgt(this);
    }
}
