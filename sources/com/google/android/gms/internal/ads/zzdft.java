package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdft implements Runnable {
    public final /* synthetic */ zzdgd zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdft(zzdgd zzdgd, View view, boolean z10, int i10) {
        this.zza = zzdgd;
        this.zzb = view;
        this.zzc = z10;
        this.zzd = i10;
    }

    public final void run() {
        this.zza.zzv(this.zzb, this.zzc, this.zzd);
    }
}
