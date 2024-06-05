package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzepk implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    zzepk(zzfuu zzfuu, Context context) {
        this.zza = zzfuu;
        this.zzb = context;
    }

    public static Bundle zzc(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i11 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i11 != 0) {
                String[] split = optString2.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = i11 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public final int zza() {
        return 37;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzepi(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepm zzd() throws Exception {
        String str = (String) a0.c().zzb(zzbar.zzfH);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zzepj(zzc(this.zzb, new JSONArray(str)));
        } catch (JSONException e10) {
            zzbza.zzf("JSON parsing error", e10);
            return null;
        }
    }
}
