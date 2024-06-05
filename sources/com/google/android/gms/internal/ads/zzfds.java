package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfds {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfds(Context context, zzbzg zzbzg) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzbzg.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        t.r();
        map.put("device", b2.O());
        map.put("app", this.zzb);
        t.r();
        String str = "0";
        map.put("is_lite_sdk", true != b2.a(this.zza) ? str : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        List zzb2 = zzbar.zzb();
        if (((Boolean) a0.c().zzb(zzbar.zzgw)).booleanValue()) {
            zzb2.addAll(t.q().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb2));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) a0.c().zzb(zzbar.zzjA)).booleanValue()) {
            t.r();
            if (true == b2.W(this.zza)) {
                str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            }
            map.put("is_bstar", str);
        }
    }
}
