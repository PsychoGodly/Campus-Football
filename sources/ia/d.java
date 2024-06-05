package ia;

import com.onesignal.c3;
import com.onesignal.v1;
import ja.a;
import ja.b;
import ja.c;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sd.w;

/* compiled from: OSNotificationTracker.kt */
public final class d extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, v1 v1Var, c3 c3Var) {
        super(cVar, v1Var, c3Var);
        m.e(cVar, "dataRepository");
        m.e(v1Var, "logger");
        m.e(c3Var, "timeProvider");
    }

    public void a(JSONObject jSONObject, a aVar) {
        m.e(jSONObject, "jsonObject");
        m.e(aVar, "influence");
        if (aVar.d().c()) {
            try {
                jSONObject.put("direct", aVar.d().d());
                jSONObject.put("notification_ids", aVar.b());
            } catch (JSONException e10) {
                o().c("Generating notification tracker addSessionData JSONObject ", e10);
            }
        }
    }

    public void b() {
        c f10 = f();
        c k10 = k();
        if (k10 == null) {
            k10 = c.UNATTRIBUTED;
        }
        f10.b(k10);
        f().c(g());
    }

    public int c() {
        return f().l();
    }

    public b d() {
        return b.NOTIFICATION;
    }

    public String h() {
        return "notification_id";
    }

    public int i() {
        return f().k();
    }

    public JSONArray l() throws JSONException {
        return f().i();
    }

    public JSONArray m(String str) {
        try {
            return l();
        } catch (JSONException e10) {
            o().c("Generating Notification tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    public void p() {
        c j10 = f().j();
        if (j10.f()) {
            x(n());
        } else if (j10.d()) {
            w(f().d());
        }
        w wVar = w.f38141a;
        y(j10);
        o().d(m.m("OneSignal NotificationTracker initInfluencedTypeFromCache: ", this));
    }

    public void u(JSONArray jSONArray) {
        m.e(jSONArray, "channelObjects");
        f().r(jSONArray);
    }
}
