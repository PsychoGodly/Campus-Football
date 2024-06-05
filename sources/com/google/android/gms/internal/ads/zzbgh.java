package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.w0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbgh implements zzbhp {
    private final zzbgi zza;

    public zzbgh(zzbgi zzbgi) {
        this.zza = zzbgi;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza != null) {
            String str = (String) map.get(MediationMetaData.KEY_NAME);
            if (str == null) {
                zzbza.zzi("Ad metadata with no name parameter.");
                str = MaxReward.DEFAULT_LABEL;
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = w0.a(new JSONObject((String) map.get("info")));
                } catch (JSONException e10) {
                    zzbza.zzh("Failed to convert ad metadata to JSON.", e10);
                }
            }
            if (bundle == null) {
                zzbza.zzg("Failed to convert ad metadata to Bundle.");
            } else {
                this.zza.zza(str, bundle);
            }
        }
    }
}
