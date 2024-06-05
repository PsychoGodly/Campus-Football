package com.google.android.gms.internal.ads;

import n4.d;
import n4.n;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdsw extends d {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdsz zzb;

    zzdsw(zzdsz zzdsz, String str) {
        this.zzb = zzdsz;
        this.zza = str;
    }

    public final void onAdFailedToLoad(n nVar) {
        this.zzb.zzl(zzdsz.zzk(nVar), this.zza);
    }
}
