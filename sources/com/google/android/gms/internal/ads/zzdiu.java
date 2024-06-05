package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdiu implements Callable {
    public final /* synthetic */ zzdiw zza;
    public final /* synthetic */ zzeyo zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdiu(zzdiw zzdiw, zzeyo zzeyo, zzeyc zzeyc, JSONObject jSONObject) {
        this.zza = zzdiw;
        this.zzb = zzeyo;
        this.zzc = zzeyc;
        this.zzd = jSONObject;
    }

    public final Object call() {
        zzeyo zzeyo = this.zzb;
        zzeyc zzeyc = this.zzc;
        JSONObject jSONObject = this.zzd;
        zzdgi zzdgi = new zzdgi();
        zzdgi.zzX(jSONObject.optInt("template_id", -1));
        zzdgi.zzJ(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdgi.zzU(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzeyx zzeyx = zzeyo.zza.zza;
        if (zzeyx.zzg.contains(Integer.toString(zzdgi.zzc()))) {
            if (zzdgi.zzc() == 3) {
                if (zzdgi.zzz() == null) {
                    throw new zzeek(1, "No custom template id for custom template ad response.");
                } else if (!zzeyx.zzh.contains(zzdgi.zzz())) {
                    throw new zzeek(1, "Unexpected custom template id in the response.");
                }
            }
            zzdgi.zzV(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzeyc.zzN) {
                t.r();
                optString = b2.T() + " : " + optString;
            }
            zzdgi.zzW("headline", optString);
            zzdgi.zzW("body", jSONObject.optString("body", (String) null));
            zzdgi.zzW("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdgi.zzW("store", jSONObject.optString("store", (String) null));
            zzdgi.zzW(InAppPurchaseMetaData.KEY_PRICE, jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE, (String) null));
            zzdgi.zzW("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdgi;
        }
        throw new zzeek(1, "Invalid template ID: " + zzdgi.zzc());
    }
}
