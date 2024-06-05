package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbkz implements Runnable {
    public final /* synthetic */ zzblr zza;
    public final /* synthetic */ zzblq zzb;
    public final /* synthetic */ zzbkm zzc;

    public /* synthetic */ zzbkz(zzblr zzblr, zzblq zzblq, zzbkm zzbkm) {
        this.zza = zzblr;
        this.zzb = zzblq;
        this.zzc = zzbkm;
    }

    public final void run() {
        this.zza.zzi(this.zzb, this.zzc);
    }
}
