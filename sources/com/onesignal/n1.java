package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessagePreviewHandler.kt */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n1 f28059a = new n1();

    private n1() {
    }

    public static final String a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        m.e(jSONObject, "payload");
        try {
            JSONObject b10 = k0.b(jSONObject);
            m.d(b10, "{\n            Notificati…Object(payload)\n        }");
            if (b10.has("a") && (optJSONObject = b10.optJSONObject("a")) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final boolean b(Activity activity, JSONObject jSONObject) {
        m.e(activity, "activity");
        m.e(jSONObject, "jsonData");
        String a10 = a(jSONObject);
        if (a10 == null) {
            return false;
        }
        k3.B1(activity, new JSONArray().put(jSONObject));
        k3.n0().J(a10);
        return true;
    }

    public static final boolean c(Context context, Bundle bundle) {
        JSONObject a10 = k0.a(bundle);
        m.d(a10, "bundleAsJSONObject(bundle)");
        n1 n1Var = f28059a;
        String a11 = a(a10);
        if (a11 == null) {
            return false;
        }
        if (k3.g1()) {
            k3.n0().J(a11);
            return true;
        } else if (!n1Var.d()) {
            return true;
        } else {
            v.m(new b2(context, a10));
            return true;
        }
    }

    private final boolean d() {
        return Build.VERSION.SDK_INT > 18;
    }
}
