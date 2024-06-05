package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdwi implements zzfnj {
    public final /* synthetic */ zzdwj zza;
    public final /* synthetic */ zzbtn zzb;

    public /* synthetic */ zzdwi(zzdwj zzdwj, zzbtn zzbtn) {
        this.zza = zzdwj;
        this.zzb = zzbtn;
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zzb.zza;
        if (bundle == null) {
            return jSONObject;
        }
        try {
            JSONObject zzi = x.b().zzi(bundle);
            try {
                x.b().zzl(jSONObject, zzi);
                return jSONObject;
            } catch (JSONException unused) {
                return zzi;
            }
        } catch (JSONException unused2) {
            return jSONObject;
        }
    }
}
