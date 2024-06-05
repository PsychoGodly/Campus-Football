package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdsq implements b.c {
    public final /* synthetic */ zzdsz zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzdsq(zzdsz zzdsz, String str, String str2) {
        this.zza = zzdsz;
        this.zzb = str;
        this.zzc = str2;
    }

    public final void onNativeAdLoaded(b bVar) {
        this.zza.zzg(this.zzb, bVar, this.zzc);
    }
}
