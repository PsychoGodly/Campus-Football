package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcma implements zzclt {
    private final zzdsf zza;

    zzcma(zzdsf zzdsf) {
        this.zza = zzdsf;
    }

    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) a0.c().zzb(zzbar.zziv)).booleanValue()) {
                this.zza.zzl(jSONObject);
            }
        }
    }
}
