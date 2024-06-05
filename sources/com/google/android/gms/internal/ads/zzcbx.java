package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcbx implements Runnable {
    public final /* synthetic */ zzccb zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcbx(zzccb zzccb, boolean z10, long j10) {
        this.zza = zzccb;
        this.zzb = z10;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzI(this.zzb, this.zzc);
    }
}
