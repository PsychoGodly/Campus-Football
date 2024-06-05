package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzjy implements Runnable {
    public final /* synthetic */ zzkc zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzsj zzc;
    public final /* synthetic */ zzso zzd;

    public /* synthetic */ zzjy(zzkc zzkc, Pair pair, zzsj zzsj, zzso zzso) {
        this.zza = zzkc;
        this.zzb = pair;
        this.zzc = zzsj;
        this.zzd = zzso;
    }

    public final void run() {
        zzkc zzkc = this.zza;
        Pair pair = this.zzb;
        zzkc.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzss) pair.second, this.zzc, this.zzd);
    }
}
