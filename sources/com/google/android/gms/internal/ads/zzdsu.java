package com.google.android.gms.internal.ads;

import a5.c;
import a5.d;
import n4.n;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdsu extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdsz zzc;

    zzdsu(zzdsz zzdsz, String str, String str2) {
        this.zzc = zzdsz;
        this.zza = str;
        this.zzb = str2;
    }

    public final void onAdFailedToLoad(n nVar) {
        this.zzc.zzl(zzdsz.zzk(nVar), this.zzb);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzc.zzg(this.zza, (c) obj, this.zzb);
    }
}
