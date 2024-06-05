package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhe {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfhd zzd = null;

    public zzfhe() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfhd zzfhd = (zzfhd) this.zzc.poll();
        this.zzd = zzfhd;
        if (zzfhd != null) {
            zzfhd.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfhd zzfhd) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfhd zzfhd) {
        zzfhd.zzb(this);
        this.zzc.add(zzfhd);
        if (this.zzd == null) {
            zzc();
        }
    }
}
