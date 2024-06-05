package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzatw implements Runnable {
    final /* synthetic */ zzatx zza;

    zzatw(zzatx zzatx) {
        this.zza = zzatx;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzatx zzatx = this.zza;
            if (!zzatx.zzd || !zzatx.zze) {
                zzbza.zze("App is still foreground");
            } else {
                zzatx.zzd = false;
                zzbza.zze("App went background");
                for (zzaty zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e10) {
                        zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                    }
                }
            }
        }
    }
}
