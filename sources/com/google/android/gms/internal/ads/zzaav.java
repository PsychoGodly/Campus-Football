package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaav {
    public final zzaay zza;
    public final zzaay zzb;

    public zzaav(zzaay zzaay, zzaay zzaay2) {
        this.zza = zzaay;
        this.zzb = zzaay2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaav.class == obj.getClass()) {
            zzaav zzaav = (zzaav) obj;
            return this.zza.equals(zzaav.zza) && this.zzb.equals(zzaav.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? MaxReward.DEFAULT_LABEL : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
