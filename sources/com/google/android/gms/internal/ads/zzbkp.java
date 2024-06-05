package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbkp implements Runnable {
    public final /* synthetic */ zzbku zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbkp(zzbku zzbku, String str) {
        this.zza = zzbku;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzm(this.zzb);
    }
}
