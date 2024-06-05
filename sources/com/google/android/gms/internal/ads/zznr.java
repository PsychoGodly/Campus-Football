package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zznr implements Runnable {
    public final /* synthetic */ zzob zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zznr(zzob zzob, Exception exc) {
        this.zza = zzob;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzh(this.zzb);
    }
}
