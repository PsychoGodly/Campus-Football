package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfdl implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzfdl(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgws zza2 = zzgwx.zza(this.zza);
        zzgws zza3 = zzgwx.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) a0.c().zzb(zzbar.zzhT)).booleanValue()) {
            obj = new zzfdn((zzfdk) zza2.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfdk) zza3.zzb();
        }
        zzgxg.zzb(obj);
        return obj;
    }
}
