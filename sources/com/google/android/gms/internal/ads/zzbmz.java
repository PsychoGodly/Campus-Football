package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.t;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbmz {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzbmz(JSONObject jSONObject) throws JSONException {
        List list;
        this.zzb = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.zzc = Collections.unmodifiableList(arrayList);
        this.zzd = jSONObject.optString("allocation_id", (String) null);
        t.i();
        this.zzf = zzbnb.zza(jSONObject, "clickurl");
        t.i();
        this.zzg = zzbnb.zza(jSONObject, "imp_urls");
        t.i();
        this.zzh = zzbnb.zza(jSONObject, "downloaded_imp_urls");
        t.i();
        this.zzj = zzbnb.zza(jSONObject, "fill_urls");
        t.i();
        this.zzl = zzbnb.zza(jSONObject, "video_start_urls");
        t.i();
        this.zzn = zzbnb.zza(jSONObject, "video_complete_urls");
        t.i();
        this.zzm = zzbnb.zza(jSONObject, "video_reward_urls");
        this.zzo = jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        this.zzp = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            t.i();
            list = zzbnb.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzi = list;
        this.zza = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY);
        this.zzk = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.zze = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.zzq = jSONObject.optString("html_template", (String) null);
        this.zzr = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.zzs = optJSONObject3 != null ? optJSONObject3.toString() : null;
        t.i();
        this.zzt = zzbnb.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.zzu = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.zzv = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
