package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcvd implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzcvd(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcva zza2 = ((zzcvc) this.zza).zzb();
        Set zzc2 = ((zzgxj) this.zzb).zzb();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzcvb(zza2, zzc2, zzfuu, (ScheduledExecutorService) this.zzd.zzb());
    }
}
