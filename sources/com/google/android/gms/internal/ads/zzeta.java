package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.n1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeta implements zzepm {
    private final Map zza;

    public zzeta(Map map) {
        this.zza = map;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", x.b().zzj(this.zza));
        } catch (JSONException e10) {
            n1.a("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
