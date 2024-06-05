package ca;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import da.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x9.j;
import z9.e;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f24313a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f24314b = {"x", "y", "width", "height"};

    /* renamed from: c  reason: collision with root package name */
    static float f24315c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24316a;

        static {
            int[] iArr = new int[j.values().length];
            f24316a = iArr;
            try {
                iArr[j.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final float f24317a;

        /* renamed from: b  reason: collision with root package name */
        final float f24318b;

        b(float f10, float f11) {
            this.f24317a = f10;
            this.f24318b = f11;
        }
    }

    static float a(int i10) {
        return ((float) i10) / f24315c;
    }

    private static b b(JSONObject jSONObject) {
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
        } else if (f24313a != null) {
            Point point = new Point(0, 0);
            f24313a.getDefaultDisplay().getRealSize(point);
            f11 = a(point.x);
            f10 = a(point.y);
            return new b(f11, f10);
        }
        f10 = 0.0f;
        return new b(f11, f10);
    }

    public static JSONObject c(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) a(i10));
            jSONObject.put("y", (double) a(i11));
            jSONObject.put("width", (double) a(i12));
            jSONObject.put("height", (double) a(i13));
        } catch (JSONException e10) {
            d.b("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void d(Context context) {
        if (context != null) {
            f24315c = context.getResources().getDisplayMetrics().density;
            f24313a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void e(JSONObject jSONObject, b.a aVar) {
        e a10 = aVar.a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.c()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a10.d());
            jSONObject.put("friendlyObstructionPurpose", a10.b());
            jSONObject.put("friendlyObstructionReason", a10.a());
        } catch (JSONException e10) {
            d.b("Error with setting friendly obstruction", e10);
        }
    }

    public static void f(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            d.b("Error with setting has window focus", e10);
        }
    }

    public static void g(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            d.b("Error with setting ad session id", e10);
        }
    }

    public static void h(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            d.b("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void i(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static void j(JSONObject jSONObject, j jVar) {
        try {
            jSONObject.put("noOutputDevice", l(jVar));
        } catch (JSONException e10) {
            d.b("Error with setting output device status", e10);
        }
    }

    private static boolean k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    private static boolean l(j jVar) {
        return a.f24316a[jVar.ordinal()] == 1;
    }

    public static void m(JSONObject jSONObject) {
        b b10 = b(jSONObject);
        try {
            jSONObject.put("width", (double) b10.f24317a);
            jSONObject.put("height", (double) b10.f24318b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void n(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            d.b("Error with setting not visible reason", e10);
        }
    }

    private static boolean o(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!k(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!u(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean p(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!k(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!optJSONArray.optString(i10, MaxReward.DEFAULT_LABEL).equals(optJSONArray2.optString(i10, MaxReward.DEFAULT_LABEL))) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean s(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f24314b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean t(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", MaxReward.DEFAULT_LABEL).equals(jSONObject2.optString("adSessionId", MaxReward.DEFAULT_LABEL));
    }

    public static boolean u(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && s(jSONObject, jSONObject2) && t(jSONObject, jSONObject2) && r(jSONObject, jSONObject2) && q(jSONObject, jSONObject2) && p(jSONObject, jSONObject2) && o(jSONObject, jSONObject2);
    }
}
