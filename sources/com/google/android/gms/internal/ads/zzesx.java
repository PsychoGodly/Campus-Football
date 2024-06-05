package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzesx implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;

    public zzesx(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5, zzgxl zzgxl6, zzgxl zzgxl7) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
        this.zzf = zzgxl6;
        this.zzg = zzgxl7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzesl) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzesm) this.zzc).zzb().booleanValue();
        zzbxy zzbxy = new zzbxy();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzesv((zzbyj) this.zza.zzb(), booleanValue, booleanValue2, zzbxy, zzfuu, ((zzesi) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb(), (byte[]) null);
    }
}
