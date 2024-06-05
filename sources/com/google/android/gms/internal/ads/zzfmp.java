package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfmp extends zzfml {
    final /* synthetic */ zzfmv zza;

    zzfmp(zzfmv zzfmv) {
        this.zza = zzfmv;
    }

    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0) {
                if (this.zza.zzl.decrementAndGet() > 0) {
                    this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfmv zzfmv = this.zza;
            if (zzfmv.zzn != null) {
                zzfmv.zzc.zzc("Unbind from service.", new Object[0]);
                zzfmv zzfmv2 = this.zza;
                zzfmv2.zzb.unbindService(zzfmv2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
