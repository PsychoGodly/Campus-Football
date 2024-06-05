package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzerf implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzerf(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
    }

    public static zzerd zza(String str, zzavh zzavh, zzbyj zzbyj, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuu) {
        return new zzerd(str, zzavh, zzbyj, scheduledExecutorService, zzfuu, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzerd(((zzesi) this.zza).zza(), new zzavh(), (zzbyj) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzfuu, (byte[]) null);
    }
}
