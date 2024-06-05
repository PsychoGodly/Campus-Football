package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzjx implements Runnable {
    public final /* synthetic */ zzkc zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzsj zzc;
    public final /* synthetic */ zzso zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzjx(zzkc zzkc, Pair pair, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        this.zza = zzkc;
        this.zzb = pair;
        this.zzc = zzsj;
        this.zzd = zzso;
        this.zze = iOException;
        this.zzf = z10;
    }

    public final void run() {
        zzkc zzkc = this.zza;
        Pair pair = this.zzb;
        zzkc.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzss) pair.second, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
