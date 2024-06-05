package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzblj implements zzbzw {
    final /* synthetic */ zzbll zza;

    zzblj(zzbll zzbll) {
        this.zza = zzbll;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbls zzbls = (zzbls) obj;
        n1.a("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
