package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationPayloadProcessorHMS */
class p0 {
    private static JSONObject a(Intent intent) {
        if (!a2.e(intent)) {
            return null;
        }
        JSONObject a10 = k0.a(intent.getExtras());
        d(a10);
        return a10;
    }

    static void b(Activity activity, Intent intent) {
        JSONObject a10;
        k3.e1(activity.getApplicationContext());
        if (intent != null && (a10 = a(intent)) != null) {
            c(activity, a10);
        }
    }

    private static void c(Activity activity, JSONObject jSONObject) {
        if (!n1.b(activity, jSONObject)) {
            k3.W0(activity, new JSONArray().put(jSONObject), a2.b(jSONObject));
        }
    }

    private static void d(JSONObject jSONObject) {
        try {
            String str = (String) k0.b(jSONObject).remove("actionId");
            if (str != null) {
                jSONObject.put("actionId", str);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
