package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdpo implements Runnable {
    public final /* synthetic */ zzdpp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdpo(zzdpp zzdpp, String str) {
        this.zza = zzdpp;
        this.zzb = str;
    }

    public final void run() {
        zzdpp zzdpp = this.zza;
        zzdpp.zzd.zza(this.zzb);
    }
}
