package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzake implements Runnable {
    private final zzako zza;
    private final zzaku zzb;
    private final Runnable zzc;

    public zzake(zzako zzako, zzaku zzaku, Runnable runnable) {
        this.zza = zzako;
        this.zzb = zzaku;
        this.zzc = runnable;
    }

    public final void run() {
        this.zza.zzw();
        zzaku zzaku = this.zzb;
        if (zzaku.zzc()) {
            this.zza.zzo(zzaku.zza);
        } else {
            this.zza.zzn(zzaku.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
