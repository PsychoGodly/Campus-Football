package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbhq implements zzbhp {
    private final zzbhr zza;

    public zzbhq(zzbhr zzbhr, byte[] bArr) {
        this.zza = zzbhr;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        boolean equals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("transparentBackground"));
        boolean equals2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzbza.zzh("Fail to parse float", e10);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcei.zzat(equals);
    }
}
