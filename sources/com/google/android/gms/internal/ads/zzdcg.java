package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdcg {
    private final List zza;
    private final zzfff zzb;
    private boolean zzc;

    public zzdcg(zzeyc zzeyc, zzfff zzfff) {
        this.zza = zzeyc.zzq;
        this.zzb = zzfff;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
