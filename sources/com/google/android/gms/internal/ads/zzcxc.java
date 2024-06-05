package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcxc implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzcxc(zzcxd zzcxd, zzcxb zzcxb) {
        this.zza = new WeakReference(zzcxd);
    }

    public final void run() {
        zzcxd zzcxd = (zzcxd) this.zza.get();
        if (zzcxd != null) {
            zzcxd.zzp(zzcxa.zza);
        }
    }
}
