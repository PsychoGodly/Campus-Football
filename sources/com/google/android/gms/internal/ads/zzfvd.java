package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvd implements Runnable {
    zzfvg zza;

    zzfvd(zzfvg zzfvg) {
        this.zza = zzfvg;
    }

    public final void run() {
        zzfut zzf;
        String str;
        zzfvg zzfvg = this.zza;
        if (zzfvg != null && (zzf = zzfvg.zza) != null) {
            this.zza = null;
            if (zzf.isDone()) {
                zzfvg.zzt(zzf);
                return;
            }
            try {
                ScheduledFuture zzw = zzfvg.zzb;
                zzfvg.zzb = null;
                str = "Timed out";
                if (zzw != null) {
                    long abs = Math.abs(zzw.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzfvg.zze(new zzfvf(str + ": " + zzf.toString(), (zzfve) null));
                zzf.cancel(true);
            } catch (Throwable th) {
                zzf.cancel(true);
                throw th;
            }
        }
    }
}
