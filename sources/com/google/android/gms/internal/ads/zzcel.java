package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcel implements Runnable {
    public final /* synthetic */ zzcep zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzbwb zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzcel(zzcep zzcep, View view, zzbwb zzbwb, int i10) {
        this.zza = zzcep;
        this.zzb = view;
        this.zzc = zzbwb;
        this.zzd = i10;
    }

    public final void run() {
        this.zza.zzo(this.zzb, this.zzc, this.zzd);
    }
}
