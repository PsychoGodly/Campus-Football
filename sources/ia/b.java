package ia;

import com.onesignal.c3;
import com.onesignal.v1;
import ja.a;
import ja.c;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sd.w;

/* compiled from: OSInAppMessageTracker.kt */
public final class b extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, v1 v1Var, c3 c3Var) {
        super(cVar, v1Var, c3Var);
        m.e(cVar, "dataRepository");
        m.e(v1Var, "logger");
        m.e(c3Var, "timeProvider");
    }

    public void a(JSONObject jSONObject, a aVar) {
        m.e(jSONObject, "jsonObject");
        m.e(aVar, "influence");
    }

    public void b() {
        c k10 = k();
        if (k10 == null) {
            k10 = c.UNATTRIBUTED;
        }
        c f10 = f();
        if (k10 == c.DIRECT) {
            k10 = c.INDIRECT;
        }
        f10.a(k10);
    }

    public int c() {
        return f().g();
    }

    public ja.b d() {
        return ja.b.IAM;
    }

    public String h() {
        return "iam_id";
    }

    public int i() {
        return f().f();
    }

    public JSONArray l() throws JSONException {
        return f().h();
    }

    public JSONArray m(String str) {
        try {
            JSONArray l10 = l();
            try {
                JSONArray jSONArray = new JSONArray();
                int i10 = 0;
                int length = l10.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        if (!m.a(str, l10.getJSONObject(i10).getString(h()))) {
                            jSONArray.put(l10.getJSONObject(i10));
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return jSONArray;
            } catch (JSONException e10) {
                o().c("Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                return l10;
            }
        } catch (JSONException e11) {
            o().c("Generating IAM tracker getLastChannelObjects JSONObject ", e11);
            return new JSONArray();
        }
    }

    public void p() {
        c e10 = f().e();
        if (e10.f()) {
            x(n());
        }
        w wVar = w.f38141a;
        y(e10);
        o().d(m.m("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ", this));
    }

    public void u(JSONArray jSONArray) {
        m.e(jSONArray, "channelObjects");
        f().p(jSONArray);
    }
}
