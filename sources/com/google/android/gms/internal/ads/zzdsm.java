package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdsm implements Runnable {
    public final /* synthetic */ zzdsn zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsm(zzdsn zzdsn, String str) {
        this.zza = zzdsn;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
