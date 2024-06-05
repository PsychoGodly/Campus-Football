package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzepo implements Runnable {
    public final /* synthetic */ zzepq zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzepn zzc;

    public /* synthetic */ zzepo(zzepq zzepq, long j10, zzepn zzepn) {
        this.zza = zzepq;
        this.zzb = j10;
        this.zzc = zzepn;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
