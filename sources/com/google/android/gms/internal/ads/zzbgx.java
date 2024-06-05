package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbgx implements zzbhp {
    zzbgx() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcei zzcei = (zzcei) obj;
        zzbdk zzK = zzcei.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcei.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcei.zze("nativeClickMetaReady", zzb);
        }
    }
}
