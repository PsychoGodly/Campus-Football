package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfug implements Runnable {
    final Future zza;
    final zzfuf zzb;

    zzfug(Future future, zzfuf zzfuf) {
        this.zza = future;
        this.zzb = zzfuf;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzfvm) || (zza2 = zzfvn.zza((zzfvm) future)) == null) {
            try {
                this.zzb.zzb(zzfuj.zzo(this.zza));
            } catch (ExecutionException e10) {
                this.zzb.zza(e10.getCause());
            } catch (Error | RuntimeException e11) {
                this.zzb.zza(e11);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfnn zza2 = zzfno.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
