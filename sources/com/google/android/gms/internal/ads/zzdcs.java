package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdcs extends zzczy {
    private boolean zzb;

    protected zzdcs(Set set) {
        super(set);
    }

    public final void zza() {
        zzp(zzdco.zza);
    }

    public final void zzb() {
        zzp(zzdcq.zza);
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzp(zzdcp.zza);
            this.zzb = true;
        }
        zzp(zzdcr.zza);
    }

    public final synchronized void zzd() {
        zzp(zzdcp.zza);
        this.zzb = true;
    }
}
