package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbgw implements zzbhp {
    zzbgw() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcei zzcei = (zzcei) obj;
        zzbdk zzK = zzcei.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcei.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcei.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
