package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfmr extends zzfml {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfmu zzb;

    zzfmr(zzfmu zzfmu, IBinder iBinder) {
        this.zzb = zzfmu;
        this.zza = iBinder;
    }

    public final void zza() {
        this.zzb.zza.zzn = zzfmg.zzb(this.zza);
        zzfmv.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        for (Runnable run : this.zzb.zza.zze) {
            run.run();
        }
        this.zzb.zza.zze.clear();
    }
}
