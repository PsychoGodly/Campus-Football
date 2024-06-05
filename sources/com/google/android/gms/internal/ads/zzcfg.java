package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcfg implements Runnable {
    public final /* synthetic */ zzcfi zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcfg(zzcfi zzcfi, String str) {
        this.zza = zzcfi;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
