package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzftg implements Runnable {
    public final /* synthetic */ zzfti zza;
    public final /* synthetic */ zzfut zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzftg(zzfti zzfti, zzfut zzfut, int i10) {
        this.zza = zzfti;
        this.zzb = zzfut;
        this.zzc = i10;
    }

    public final void run() {
        this.zza.zzx(this.zzb, this.zzc);
    }
}
