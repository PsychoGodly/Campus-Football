package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbks implements Runnable {
    public final /* synthetic */ zzbku zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbks(zzbku zzbku, String str) {
        this.zza = zzbku;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
