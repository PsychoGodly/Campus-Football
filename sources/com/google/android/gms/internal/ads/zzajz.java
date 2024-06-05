package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajz implements Runnable {
    final /* synthetic */ zzako zza;
    final /* synthetic */ zzaka zzb;

    zzajz(zzaka zzaka, zzako zzako) {
        this.zzb = zzaka;
        this.zza = zzako;
    }

    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
