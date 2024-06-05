package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.k3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotificationFormatHelper */
class a2 {
    private static String a(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", (String) null);
            if (string != null) {
                return c(string);
            }
            k3.a(k3.r0.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    static String b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return c(jSONObject.optString("custom", (String) null));
    }

    private static String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("i")) {
                return jSONObject.optString("i", (String) null);
            }
            k3.a(k3.r0.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            k3.a(k3.r0.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
    }

    static boolean d(Bundle bundle) {
        return a(bundle) != null;
    }

    static boolean e(Intent intent) {
        if (intent == null) {
            return false;
        }
        return d(intent.getExtras());
    }
}
