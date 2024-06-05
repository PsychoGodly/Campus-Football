package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzelt implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzelt(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelk(((zzelf) this.zza).zzb(), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, (e) this.zzb.zzb());
    }
}
