package com.google.android.gms.internal.ads;

import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbps implements t {
    final /* synthetic */ zzbpu zza;

    zzbps(zzbpu zzbpu) {
        this.zza = zzbpu;
    }

    public final void zzb() {
        zzbza.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbpu zzbpu = this.zza;
        zzbpu.zzb.onAdOpened(zzbpu);
    }

    public final void zzbF() {
        zzbza.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbo() {
        zzbza.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zzby() {
        zzbza.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zze() {
    }

    public final void zzf(int i10) {
        zzbza.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbpu zzbpu = this.zza;
        zzbpu.zzb.onAdClosed(zzbpu);
    }
}
