package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbhr {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized float zza() {
        return this.zzc;
    }

    public final synchronized void zzb(boolean z10, float f10) {
        this.zzb = z10;
        this.zzc = f10;
    }

    public final synchronized void zzc(boolean z10) {
        this.zza = z10;
        this.zzd.set(true);
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze(boolean z10) {
        if (!this.zzd.get()) {
            return z10;
        }
        return this.zza;
    }
}
