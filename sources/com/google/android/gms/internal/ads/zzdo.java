package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdo {
    private final zzdm zza;
    private boolean zzb;

    public zzdo() {
        throw null;
    }

    public zzdo(zzdm zzdm) {
        this.zza = zzdm;
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z10 = false;
        while (!this.zzb) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z10;
        z10 = this.zzb;
        this.zzb = false;
        return z10;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }
}
