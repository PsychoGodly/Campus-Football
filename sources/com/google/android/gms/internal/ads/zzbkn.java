package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbkn implements zzcfu {
    public final /* synthetic */ zzbla zza;

    public /* synthetic */ zzbkn(zzbla zzbla, byte[] bArr) {
        this.zza = zzbla;
    }

    public final void zza() {
        zzbla zzbla = this.zza;
        b2.f14773i.postDelayed(new zzbkz(zzbla.zza, zzbla.zzb, zzbla.zzc), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }
}
