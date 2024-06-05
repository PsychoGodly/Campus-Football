package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcbl implements Runnable {
    private final zzcax zza;
    private boolean zzb = false;

    zzcbl(zzcax zzcax) {
        this.zza = zzcax;
    }

    private final void zzc() {
        zzfkr zzfkr = b2.f14773i;
        zzfkr.removeCallbacks(this);
        zzfkr.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
