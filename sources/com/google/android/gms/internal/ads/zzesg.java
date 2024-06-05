package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzesg implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzesg(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzese(new zzbrg(), (ScheduledExecutorService) this.zzb.zzb(), ((zzcgj) this.zzc).zza(), (byte[]) null);
    }
}
