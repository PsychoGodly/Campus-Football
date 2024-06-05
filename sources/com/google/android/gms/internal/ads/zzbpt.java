package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import t4.s;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbpt implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbpu zzb;

    zzbpt(zzbpu zzbpu, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbpu;
        this.zza = adOverlayInfoParcel;
    }

    public final void run() {
        t.k();
        s.a(this.zzb.zza, this.zza, true);
    }
}
