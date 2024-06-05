package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeco implements zzeat {
    /* access modifiers changed from: private */
    public final zzcph zza;
    private final zzebv zzb;
    private final zzfuu zzc;
    /* access modifiers changed from: private */
    public final zzcuq zzd;
    private final ScheduledExecutorService zze;

    public zzeco(zzcph zzcph, zzebv zzebv, zzcuq zzcuq, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuu) {
        this.zza = zzcph;
        this.zzb = zzebv;
        this.zzd = zzcuq;
        this.zze = scheduledExecutorService;
        this.zzc = zzfuu;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        return this.zzc.zzb(new zzecl(this, zzeyo, zzeyc));
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        return zzeyo.zza.zza.zza() != null && this.zzb.zzb(zzeyo, zzeyc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcok zzc(zzeyo zzeyo, zzeyc zzeyc) throws Exception {
        return this.zza.zzb(new zzcrb(zzeyo, zzeyc, (String) null), new zzcpu(zzeyo.zza.zza.zza(), new zzecm(this, zzeyo, zzeyc))).zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzeyo zzeyo, zzeyc zzeyc) {
        zzfuj.zzq(zzfuj.zzn(this.zzb.zza(zzeyo, zzeyc), (long) zzeyc.zzS, TimeUnit.SECONDS, this.zze), new zzecn(this), this.zzc);
    }
}
