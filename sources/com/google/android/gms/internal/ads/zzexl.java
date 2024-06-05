package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzexl implements Runnable {
    public final /* synthetic */ zzexm zza;
    public final /* synthetic */ c3 zzb;

    public /* synthetic */ zzexl(zzexm zzexm, c3 c3Var) {
        this.zza = zzexm;
        this.zzb = c3Var;
    }

    public final void run() {
        zzexm zzexm = this.zza;
        zzexm.zze.zzd.zza(this.zzb);
    }
}
