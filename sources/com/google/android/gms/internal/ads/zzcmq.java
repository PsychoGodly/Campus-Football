package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcmq implements Runnable {
    public final /* synthetic */ zzcmv zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcmq(zzcmv zzcmv, int i10, int i11) {
        this.zza = zzcmv;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final void run() {
        this.zza.zzh(this.zzb, this.zzc);
    }
}
