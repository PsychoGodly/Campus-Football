package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeja implements zzepm {
    private final boolean zza;

    public zzeja(boolean z10) {
        this.zza = z10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }
}
