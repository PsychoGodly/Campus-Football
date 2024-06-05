package com.google.android.gms.internal.ads;

import h5.j;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzesp implements zzepm {
    public static final /* synthetic */ zzesp zza = new zzesp();

    private /* synthetic */ zzesp() {
    }

    public final void zzh(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", j.f18843a);
        } catch (JSONException unused) {
        }
    }
}
