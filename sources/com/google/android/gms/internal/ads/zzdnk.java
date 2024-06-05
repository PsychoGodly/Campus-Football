package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdnk {
    public static String zza(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str2)) == null)) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (zzb(optJSONArray2, str) && !zzb(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", MaxReward.DEFAULT_LABEL);
                    }
                }
            }
        }
        return MaxReward.DEFAULT_LABEL;
    }

    private static boolean zzb(JSONArray jSONArray, String str) {
        Pattern pattern;
        if (!(jSONArray == null || str == null)) {
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                String optString = jSONArray.optString(i10);
                try {
                    if (((Boolean) a0.c().zzb(zzbar.zzjj)).booleanValue()) {
                        pattern = Pattern.compile(optString, 2);
                    } else {
                        pattern = Pattern.compile(optString);
                    }
                    if (pattern.matcher(str).lookingAt()) {
                        return true;
                    }
                    i10++;
                } catch (PatternSyntaxException e10) {
                    t.q().zzu(e10, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
