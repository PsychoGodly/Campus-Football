package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaua implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzaue zzb;

    zzaua(zzaue zzaue, View view) {
        this.zzb = zzaue;
        this.zza = view;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
