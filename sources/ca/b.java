package ca;

import android.os.Build;
import org.json.JSONObject;

public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return "Android";
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, "deviceType", a());
        c.h(jSONObject, "osVersion", c());
        c.h(jSONObject, "os", b());
        return jSONObject;
    }
}
