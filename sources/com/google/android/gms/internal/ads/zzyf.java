package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzyf implements Runnable {
    public final /* synthetic */ zzyo zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzyf(zzyo zzyo, Object obj, long j10) {
        this.zza = zzyo;
        this.zzb = obj;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
