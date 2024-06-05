package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzyg implements Runnable {
    public final /* synthetic */ zzyo zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzyg(zzyo zzyo, Exception exc) {
        this.zza = zzyo;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
