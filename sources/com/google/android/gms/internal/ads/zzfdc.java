package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfdc implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzfdc(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzfda(zzfuu, (ScheduledExecutorService) this.zzb.zzb(), ((zzfdd) this.zzc).zzb());
    }
}
