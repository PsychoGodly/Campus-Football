package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgp {
    static float zza = Resources.getSystem().getDisplayMetrics().density;
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};

    public static JSONObject zza(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i10) / zza));
            jSONObject.put("y", (double) (((float) i11) / zza));
            jSONObject.put("width", (double) (((float) i12) / zza));
            jSONObject.put("height", (double) (((float) i13) / zza));
        } catch (JSONException e10) {
            zzfgq.zza("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            zzfgq.zza("Error with setting ad session id", e10);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void zzd(JSONObject jSONObject, zzfgt zzfgt) {
        zzfgb zza2 = zzfgt.zza();
        JSONArray jSONArray = new JSONArray();
        ArrayList zzb2 = zzfgt.zzb();
        int size = zzb2.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put((String) zzb2.get(i10));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", zza2.zzd());
            jSONObject.put("friendlyObstructionPurpose", zza2.zza());
            jSONObject.put("friendlyObstructionReason", zza2.zzc());
        } catch (JSONException e10) {
            zzfgq.zza("Error with setting friendly obstruction", e10);
        }
    }

    public static void zze(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            zzfgq.zza("Error with setting not visible reason", e10);
        }
    }

    public static void zzf(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            zzfgq.zza("Error with setting not visible reason", e10);
        }
    }

    public static void zzg(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zzh(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            zzfgq.zza("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void zzi(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f12 = zza;
            f11 = ((float) point.x) / f12;
            f10 = ((float) point.y) / f12;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", (double) f11);
            jSONObject.put("height", (double) f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean zzj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    String str = strArr[i10];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i10++;
                } else if (jSONObject.optString("adSessionId", MaxReward.DEFAULT_LABEL).equals(jSONObject2.optString("adSessionId", MaxReward.DEFAULT_LABEL)) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzk(optJSONArray, optJSONArray2)) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < optJSONArray.length()) {
                                    if (!optJSONArray.optString(i11, MaxReward.DEFAULT_LABEL).equals(optJSONArray2.optString(i11, MaxReward.DEFAULT_LABEL))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (zzk(optJSONArray3, optJSONArray4)) {
                            int i12 = 0;
                            while (i12 < optJSONArray3.length()) {
                                if (zzj(optJSONArray3.optJSONObject(i12), optJSONArray4.optJSONObject(i12))) {
                                    i12++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzk(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
