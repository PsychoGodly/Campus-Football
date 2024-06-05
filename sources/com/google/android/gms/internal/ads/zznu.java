package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zznu implements Runnable {
    public final /* synthetic */ zzob zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zznu(zzob zzob, long j10) {
        this.zza = zzob;
        this.zzb = j10;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
