package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbws implements Runnable {
    public final /* synthetic */ zzbxf zza;
    public final /* synthetic */ zzbxe zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbws(zzbxf zzbxf, zzbxe zzbxe, String str) {
        this.zza = zzbxf;
        this.zzb = zzbxe;
        this.zzc = str;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
