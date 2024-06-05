package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzavw implements Runnable {
    public final /* synthetic */ zzbzs zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzavw(zzbzs zzbzs, Future future) {
        this.zza = zzbzs;
        this.zzb = future;
    }

    public final void run() {
        zzbzs zzbzs = this.zza;
        Future future = this.zzb;
        if (zzbzs.isCancelled()) {
            future.cancel(true);
        }
    }
}
