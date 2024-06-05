package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdka {
    private final Executor zza;
    private final zzcnq zzb;
    private final zzdbw zzc;

    zzdka(Executor executor, zzcnq zzcnq, zzdbw zzdbw) {
        this.zza = executor;
        this.zzc = zzdbw;
        this.zzb = zzcnq;
    }

    public final void zza(zzcei zzcei) {
        if (zzcei != null) {
            this.zzc.zza(zzcei.zzF());
            this.zzc.zzm(new zzdjw(zzcei), this.zza);
            this.zzc.zzm(new zzdjx(zzcei), this.zza);
            this.zzc.zzm(this.zzb, this.zza);
            this.zzb.zzf(zzcei);
            zzcei.zzad("/trackActiveViewUnit", new zzdjy(this));
            zzcei.zzad("/untrackActiveViewUnit", new zzdjz(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcei zzcei, Map map) {
        this.zzb.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcei zzcei, Map map) {
        this.zzb.zza();
    }
}
