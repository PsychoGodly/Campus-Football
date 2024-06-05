package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.walking.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f27429a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f27430b = {"x", "y", "width", "height"};

    /* renamed from: c  reason: collision with root package name */
    static float f27431c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27432a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f27432a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final float f27433a;

        /* renamed from: b  reason: collision with root package name */
        final float f27434b;

        b(float f10, float f11) {
            this.f27433a = f10;
            this.f27434b = f11;
        }
    }

    static float a(int i10) {
        return ((float) i10) / f27431c;
    }

    public static void b(JSONObject jSONObject) {
        b a10 = a(jSONObject);
        try {
            jSONObject.put("width", (double) a10.f27433a);
            jSONObject.put("height", (double) a10.f27434b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!optJSONArray.optString(i10, MaxReward.DEFAULT_LABEL).equals(optJSONArray2.optString(i10, MaxReward.DEFAULT_LABEL))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f27430b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", MaxReward.DEFAULT_LABEL).equals(jSONObject2.optString("adSessionId", MaxReward.DEFAULT_LABEL));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f12 = 0.0f;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f11 = Math.max(f11, (float) (optDouble + optDouble3));
                        f12 = Math.max(f12, (float) (optDouble2 + optDouble4));
                    }
                }
                f10 = f12;
                return new b(f11, f10);
            }
        } else if (f27429a != null) {
            Point point = new Point(0, 0);
            f27429a.getDefaultDisplay().getRealSize(point);
            f11 = a(point.x);
            f10 = a(point.y);
            return new b(f11, f10);
        }
        f10 = 0.0f;
        return new b(f11, f10);
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            d.a("Error with setting not visible reason", e10);
        }
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) a(i10));
            jSONObject.put("y", (double) a(i11));
            jSONObject.put("width", (double) a(i12));
            jSONObject.put("height", (double) a(i13));
        } catch (JSONException e10) {
            d.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!h(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static void a(Context context) {
        if (context != null) {
            f27431c = context.getResources().getDisplayMetrics().density;
            f27429a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e10) {
            d.a("Error with setting output device status", e10);
        }
    }

    public static void a(JSONObject jSONObject, a.C0287a aVar) {
        e a10 = aVar.a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a10.d());
            jSONObject.put("friendlyObstructionPurpose", a10.b());
            jSONObject.put("friendlyObstructionReason", a10.a());
        } catch (JSONException e10) {
            d.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            d.a("Error with setting has window focus", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            d.a("Error with setting ad session id", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            d.a("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
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

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f27432a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
