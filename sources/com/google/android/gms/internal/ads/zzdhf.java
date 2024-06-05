package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdhf implements Runnable {
    public final /* synthetic */ zzdhi zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdhf(zzdhi zzdhi, ViewGroup viewGroup) {
        this.zza = zzdhi;
        this.zzb = viewGroup;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
