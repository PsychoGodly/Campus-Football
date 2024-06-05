package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbif implements zzbhp {
    private final zzbie zza;

    public zzbif(zzbie zzbie) {
        this.zza = zzbie;
    }

    public static void zzb(zzcei zzcei, zzbie zzbie) {
        zzcei.zzad("/reward", new zzbif(zzbie));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbup zzbup = null;
            try {
                int parseInt = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbup = new zzbup(str2, parseInt);
                }
            } catch (NumberFormatException e10) {
                zzbza.zzk("Unable to parse reward amount.", e10);
            }
            this.zza.zza(zzbup);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
