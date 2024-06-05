package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzyh implements Runnable {
    public final /* synthetic */ zzyo zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzyh(zzyo zzyo, long j10, int i10) {
        this.zza = zzyo;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
