package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbgj implements zzbhp {
    private final zzbgk zza;

    public zzbgj(zzbgk zzbgk) {
        this.zza = zzbgk;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            zzbza.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbz(str, (String) map.get("info"));
        }
    }
}
