package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcra {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfut zzc;
    private volatile boolean zzd = true;

    public zzcra(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfut zzfut) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfut;
    }

    static /* bridge */ /* synthetic */ void zzb(zzcra zzcra, List list, zzfuf zzfuf) {
        if (list == null || list.isEmpty()) {
            zzcra.zza.execute(new zzcqu(zzfuf));
            return;
        }
        zzfut zzh = zzfuj.zzh((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzh = zzfuj.zzm(zzfuj.zzf(zzh, Throwable.class, new zzcqv(zzfuf), zzcra.zza), new zzcqw(zzcra, zzfuf, (zzfut) it.next()), zzcra.zza);
        }
        zzfuj.zzq(zzh, new zzcqz(zzcra, zzfuf), zzcra.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zza(zzfuf zzfuf, zzfut zzfut, zzcqm zzcqm) throws Exception {
        if (zzcqm != null) {
            zzfuf.zzb(zzcqm);
        }
        return zzfuj.zzn(zzfut, ((Long) zzbcx.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfuf zzfuf) {
        zzfuj.zzq(this.zzc, new zzcqy(this, zzfuf), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
