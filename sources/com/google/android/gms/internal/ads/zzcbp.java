package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcbp implements Runnable {
    public final /* synthetic */ zzccb zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcbp(zzccb zzccb, int i10, int i11) {
        this.zza = zzccb;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final void run() {
        this.zza.zzN(this.zzb, this.zzc);
    }
}
