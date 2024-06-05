package com.onesignal;

import com.onesignal.k3;
import com.onesignal.v3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSReceiveReceiptRepository */
class n2 {
    n2() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, Integer num, String str3, v3.g gVar) {
        try {
            JSONObject put = new JSONObject().put("app_id", str).put("player_id", str2);
            if (num != null) {
                put.put("device_type", num);
            }
            v3.l("notifications/" + str3 + "/report_received", put, gVar);
        } catch (JSONException e10) {
            k3.b(k3.r0.ERROR, "Generating direct receive receipt:JSON Failed.", e10);
        }
    }
}
