package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdwd implements zzftq {
    public static final /* synthetic */ zzdwd zza = new zzdwd();

    private /* synthetic */ zzdwd() {
    }

    public final zzfut zza(Object obj) {
        InputStream inputStream = (InputStream) obj;
        JSONObject jSONObject = new JSONObject();
        if (inputStream == null) {
            return zzfuj.zzh(jSONObject);
        }
        try {
            t.r();
            jSONObject = new JSONObject(b2.j(new InputStreamReader(inputStream)));
        } catch (IOException | JSONException e10) {
            t.q().zzu(e10, "AdsServiceSignalTask.startAdsServiceSignalTask");
        }
        return zzfuj.zzh(jSONObject);
    }
}
