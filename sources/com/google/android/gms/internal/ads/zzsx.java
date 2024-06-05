package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzsx implements Runnable {
    public final /* synthetic */ zztb zza;
    public final /* synthetic */ zztc zzb;
    public final /* synthetic */ zzsj zzc;
    public final /* synthetic */ zzso zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzsx(zztb zztb, zztc zztc, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        this.zza = zztb;
        this.zzb = zztc;
        this.zzc = zzsj;
        this.zzd = zzso;
        this.zze = iOException;
        this.zzf = z10;
    }

    public final void run() {
        zztb zztb = this.zza;
        this.zzb.zzai(0, zztb.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
