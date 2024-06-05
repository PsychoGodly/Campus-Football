package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzetg implements Runnable {
    public final /* synthetic */ zzeth zza;
    public final /* synthetic */ c3 zzb;

    public /* synthetic */ zzetg(zzeth zzeth, c3 c3Var) {
        this.zza = zzeth;
        this.zzb = c3Var;
    }

    public final void run() {
        zzeth zzeth = this.zza;
        zzeth.zze.zzd.zza(this.zzb);
    }
}
