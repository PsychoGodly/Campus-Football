package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcds implements Runnable {
    public final /* synthetic */ zzcbj zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcds(zzcbj zzcbj, Map map) {
        this.zza = zzcbj;
        this.zzb = map;
    }

    public final void run() {
        zzcbj zzcbj = this.zza;
        Map map = this.zzb;
        int i10 = zzcdv.zza;
        zzcbj.zzd("onGcacheInfoEvent", map);
    }
}
