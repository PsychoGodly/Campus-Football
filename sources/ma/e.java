package ma;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeSourceBody.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f29296a;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f29297b;

    public e() {
        this((JSONArray) null, (JSONArray) null, 3, (h) null);
    }

    public e(JSONArray jSONArray, JSONArray jSONArray2) {
        this.f29296a = jSONArray;
        this.f29297b = jSONArray2;
    }

    public final JSONArray a() {
        return this.f29297b;
    }

    public final JSONArray b() {
        return this.f29296a;
    }

    public final void c(JSONArray jSONArray) {
        this.f29297b = jSONArray;
    }

    public final void d(JSONArray jSONArray) {
        this.f29296a = jSONArray;
    }

    public final JSONObject e() throws JSONException {
        JSONObject put = new JSONObject().put("notification_ids", this.f29296a).put("in_app_message_ids", this.f29297b);
        m.d(put, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return put;
    }

    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.f29296a + ", inAppMessagesIds=" + this.f29297b + '}';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(JSONArray jSONArray, JSONArray jSONArray2, int i10, h hVar) {
        this((i10 & 1) != 0 ? new JSONArray() : jSONArray, (i10 & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}
