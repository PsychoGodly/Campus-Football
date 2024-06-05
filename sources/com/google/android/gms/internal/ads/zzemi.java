package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzemi implements zzepm {
    public final String zza;
    public final boolean zzb;

    public zzemi(String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
    }
}
