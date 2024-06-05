package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdjx implements zzatf {
    public final /* synthetic */ zzcei zza;

    public /* synthetic */ zzdjx(zzcei zzcei) {
        this.zza = zzcei;
    }

    public final void zzc(zzate zzate) {
        zzcei zzcei = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != zzate.zzj ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zzcei.zzd("onAdVisibilityChanged", hashMap);
    }
}
