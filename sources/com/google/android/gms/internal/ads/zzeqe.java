package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeqe implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;

    public zzeqe(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5, zzgxl zzgxl6, zzgxl zzgxl7) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
        this.zzf = zzgxl6;
        this.zzg = zzgxl7;
    }

    public static zzeqc zza(zzbya zzbya, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new zzeqc(zzbya, context, scheduledExecutorService, executor, i10, z10, z11, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzeqc(new zzbya(), ((zzcgj) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzfuu, ((zzesj) this.zze).zzb().intValue(), ((zzesk) this.zzf).zzb().booleanValue(), ((zzesm) this.zzg).zzb().booleanValue(), (byte[]) null);
    }
}
