package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcbo implements Runnable {
    public final /* synthetic */ zzccb zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcbo(zzccb zzccb, String str) {
        this.zza = zzccb;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzF(this.zzb);
    }
}
