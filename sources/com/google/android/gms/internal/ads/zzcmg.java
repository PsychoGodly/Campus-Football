package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcmg implements zzclt {
    private final zzbwh zza;

    zzcmg(zzbwh zzbwh) {
        this.zza = zzbwh;
    }

    public final void zza(JSONObject jSONObject) {
        int i10;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i10 = -1;
        } else {
            i10 = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(i10, optLong);
    }
}
