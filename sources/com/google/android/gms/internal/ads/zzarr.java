package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarr implements Callable {
    private final zzaqx zza;
    private final zzamv zzb;

    public zzarr(zzaqx zzaqx, zzamv zzamv) {
        this.zza = zzaqx;
        this.zzb = zzamv;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzans zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzamv zzamv = this.zzb;
                byte[] zzax = zzc.zzax();
                zzamv.zzak(zzax, 0, zzax.length, zzgpy.zza());
            }
            return null;
        } catch (zzgqy | NullPointerException unused) {
            return null;
        }
    }
}
