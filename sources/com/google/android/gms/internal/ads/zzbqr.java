package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqr extends zzbfk {
    private final b.c zza;

    public zzbqr(b.c cVar) {
        this.zza = cVar;
    }

    public final void zze(zzbfu zzbfu) {
        this.zza.onNativeAdLoaded(new zzbqk(zzbfu));
    }
}
