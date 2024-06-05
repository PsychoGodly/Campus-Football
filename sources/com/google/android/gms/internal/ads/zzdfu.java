package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdfu implements Runnable {
    public final /* synthetic */ zzdgd zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzdfu(zzdgd zzdgd, View view) {
        this.zza = zzdgd;
        this.zzb = view;
    }

    public final void run() {
        this.zza.zzx(this.zzb);
    }
}
