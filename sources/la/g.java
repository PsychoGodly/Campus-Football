package la;

import com.onesignal.n3;
import com.onesignal.v1;
import kotlin.jvm.internal.m;
import ma.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV2Repository.kt */
public final class g extends d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(v1 v1Var, a aVar, j jVar) {
        super(v1Var, aVar, jVar);
        m.e(v1Var, "logger");
        m.e(aVar, "outcomeEventsCache");
        m.e(jVar, "outcomeEventsService");
    }

    public void a(String str, int i10, b bVar, n3 n3Var) {
        m.e(str, "appId");
        m.e(bVar, "event");
        m.e(n3Var, "responseHandler");
        try {
            JSONObject put = bVar.g().put("app_id", str).put("device_type", i10);
            j k10 = k();
            m.d(put, "jsonObject");
            k10.a(put, n3Var);
        } catch (JSONException e10) {
            j().c("Generating indirect outcome:JSON Failed.", e10);
        }
    }
}
