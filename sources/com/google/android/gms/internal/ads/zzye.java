package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzye implements Runnable {
    public final /* synthetic */ zzyo zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzye(zzyo zzyo, int i10, long j10) {
        this.zza = zzyo;
        this.zzb = i10;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
