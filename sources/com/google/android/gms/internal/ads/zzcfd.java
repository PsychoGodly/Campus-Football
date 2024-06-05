package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcfd implements Runnable {
    public final /* synthetic */ zzcfe zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzcfd(zzcfe zzcfe, int i10, int i11, boolean z10, boolean z11) {
        this.zza = zzcfe;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = z11;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
