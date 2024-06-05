package com.google.android.gms.internal.ads;

import n4.d;
import n4.j;
import n4.n;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdss extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ j zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdsz zzd;

    zzdss(zzdsz zzdsz, String str, j jVar, String str2) {
        this.zzd = zzdsz;
        this.zza = str;
        this.zzb = jVar;
        this.zzc = str2;
    }

    public final void onAdFailedToLoad(n nVar) {
        this.zzd.zzl(zzdsz.zzk(nVar), this.zzc);
    }

    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
