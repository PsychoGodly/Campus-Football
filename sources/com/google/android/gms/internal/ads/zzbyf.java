package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbyf extends b0 {
    final /* synthetic */ zzbyj zza;

    zzbyf(zzbyj zzbyj) {
        this.zza = zzbyj;
    }

    public final void zza() {
        zzbyj zzbyj = this.zza;
        zzbax zzbax = new zzbax(zzbyj.zze, zzbyj.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                t.g();
                zzbba.zza(this.zza.zzh, zzbax);
            } catch (IllegalArgumentException e10) {
                zzbza.zzk("Cannot config CSI reporter.", e10);
            }
        }
    }
}
