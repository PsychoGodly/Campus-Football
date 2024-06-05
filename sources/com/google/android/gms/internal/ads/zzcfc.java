package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcfc implements Runnable {
    public final /* synthetic */ zzcfe zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcfc(zzcfe zzcfe, Map map) {
        this.zza = zzcfe;
        this.zzb = map;
    }

    public final void run() {
        this.zza.zzr(this.zzb);
    }
}
