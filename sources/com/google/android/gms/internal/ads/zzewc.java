package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzewc implements Runnable {
    public final /* synthetic */ zzewe zza;
    public final /* synthetic */ c3 zzb;

    public /* synthetic */ zzewc(zzewe zzewe, c3 c3Var) {
        this.zza = zzewe;
        this.zzb = c3Var;
    }

    public final void run() {
        zzewe zzewe = this.zza;
        zzewe.zze.zzd.zza(this.zzb);
    }
}
