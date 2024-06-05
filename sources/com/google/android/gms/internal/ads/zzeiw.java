package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeiw implements Runnable {
    public final /* synthetic */ zzeix zza;
    public final /* synthetic */ c3 zzb;

    public /* synthetic */ zzeiw(zzeix zzeix, c3 c3Var) {
        this.zza = zzeix;
        this.zzb = c3Var;
    }

    public final void run() {
        zzeix zzeix = this.zza;
        zzeix.zze.zzd.zza().zza(this.zzb);
    }
}
