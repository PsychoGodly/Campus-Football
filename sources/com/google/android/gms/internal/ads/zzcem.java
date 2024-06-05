package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcem implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbwb zza;
    final /* synthetic */ zzcep zzb;

    zzcem(zzcep zzcep, zzbwb zzbwb) {
        this.zzb = zzcep;
        this.zza = zzbwb;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
