package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzduf implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzduf(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
    }

    /* renamed from: zza */
    public final zzdue zzb() {
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        zzfuu zzfuu2 = zzbzn.zzb;
        zzgxg.zzb(zzfuu2);
        return new zzdue((ScheduledExecutorService) this.zza.zzb(), zzfuu, zzfuu2, ((zzduw) this.zzd).zzb(), zzgwx.zza(this.zze));
    }
}
