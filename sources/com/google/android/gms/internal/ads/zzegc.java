package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzegc implements f {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcum zzb;
    private final zzcvg zzc;
    private final zzdce zzd;
    private final zzdbw zze;
    private final zzcng zzf;

    zzegc(zzcum zzcum, zzcvg zzcvg, zzdce zzdce, zzdbw zzdbw, zzcng zzcng) {
        this.zzb = zzcum;
        this.zzc = zzcvg;
        this.zzd = zzdce;
        this.zze = zzdbw;
        this.zzf = zzcng;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
