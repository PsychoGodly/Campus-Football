package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzelw implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzelw(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfqp zzfqp;
        zzelm zza2 = zzelo.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) a0.c().zzb(zzbar.zzdC)).booleanValue()) {
            zzfqp = zzfqp.zzn(new zzent(zza2, (long) ((Integer) a0.c().zzb(zzbar.zzdD)).intValue(), scheduledExecutorService));
        } else {
            zzfqp = zzfqp.zzm();
        }
        zzgxg.zzb(zzfqp);
        return zzfqp;
    }
}
