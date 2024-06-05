package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdrl implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;

    public zzdrl(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5, zzgxl zzgxl6, zzgxl zzgxl7, zzgxl zzgxl8, zzgxl zzgxl9, zzgxl zzgxl10) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
        this.zzf = zzgxl6;
        this.zzg = zzgxl7;
        this.zzh = zzgxl8;
        this.zzi = zzgxl9;
        this.zzj = zzgxl10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcgj) this.zzb).zza();
        WeakReference zza3 = ((zzcgk) this.zzc).zza();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzdrk((Executor) this.zza.zzb(), zza2, zza3, zzfuu, (zzdnd) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdpr) this.zzg.zzb(), ((zzcgu) this.zzh).zza(), ((zzdbg) this.zzi).zzb(), (zzfep) this.zzj.zzb());
    }
}
