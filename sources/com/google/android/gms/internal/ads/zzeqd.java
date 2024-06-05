package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeqd implements zzepm {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfks zzc;

    public zzeqd(AdvertisingIdClient.Info info, String str, zzfks zzfks) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfks;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject f10 = w0.f((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    f10.put("pdid", str);
                    f10.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            f10.put("rdid", this.zza.getId());
            f10.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            f10.put("idtype", "adid");
            zzfks zzfks = this.zzc;
            if (zzfks.zzc()) {
                f10.put("paidv1_id_android_3p", zzfks.zzb());
                f10.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e10) {
            n1.b("Failed putting Ad ID.", e10);
        }
    }
}
