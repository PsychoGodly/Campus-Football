package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdwn implements zzfcd {
    public final /* synthetic */ JSONObject zza;
    public final /* synthetic */ zzbtq zzb;

    public /* synthetic */ zzdwn(JSONObject jSONObject, zzbtq zzbtq) {
        this.zza = jSONObject;
        this.zzb = zzbtq;
    }

    public final Object zza(Object obj) {
        return new zzdxo(zzdyc.zza(new InputStreamReader((InputStream) obj)), this.zza, this.zzb);
    }
}
