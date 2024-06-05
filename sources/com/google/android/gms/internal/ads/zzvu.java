package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzvu implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzwc zza;

    zzvu(zzvv zzvv, zzwc zzwc) {
        this.zza = zzwc;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzt();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzt();
    }
}
