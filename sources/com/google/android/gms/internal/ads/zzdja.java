package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdja implements zzfnj {
    public final /* synthetic */ zzdjj zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdja(zzdjj zzdjj, JSONObject jSONObject) {
        this.zza = zzdjj;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zza.zza(this.zzb, (List) obj);
    }
}
