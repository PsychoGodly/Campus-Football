package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdql {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    /* synthetic */ zzdql(String str, zzdqk zzdqk) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdql zzdql) {
        String str = (String) a0.c().zzb(zzbar.zziR);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdql.zza);
            jSONObject.put("eventCategory", zzdql.zzb);
            jSONObject.putOpt("event", zzdql.zzc);
            jSONObject.putOpt("errorCode", zzdql.zzd);
            jSONObject.putOpt("rewardType", zzdql.zze);
            jSONObject.putOpt("rewardAmount", zzdql.zzf);
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
