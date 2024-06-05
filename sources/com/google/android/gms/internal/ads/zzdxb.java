package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxb implements zzfcd {
    public static final /* synthetic */ zzdxb zza = new zzdxb();

    private /* synthetic */ zzdxb() {
    }

    public final Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        n1.a("Ad request signals:");
        n1.a(jSONObject.toString(2));
        return jSONObject;
    }
}
