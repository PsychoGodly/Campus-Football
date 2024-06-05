package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzka implements Runnable {
    public final /* synthetic */ zzkc zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzso zzc;

    public /* synthetic */ zzka(zzkc zzkc, Pair pair, zzso zzso) {
        this.zza = zzkc;
        this.zzb = pair;
        this.zzc = zzso;
    }

    public final void run() {
        zzkc zzkc = this.zza;
        Pair pair = this.zzb;
        zzkc.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzss) pair.second, this.zzc);
    }
}
