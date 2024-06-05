package la;

import com.onesignal.l3;
import com.onesignal.n3;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV2Service.kt */
public final class h extends b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(l3 l3Var) {
        super(l3Var);
        m.e(l3Var, "client");
    }

    public void a(JSONObject jSONObject, n3 n3Var) {
        m.e(jSONObject, "jsonObject");
        m.e(n3Var, "responseHandler");
        b().a("outcomes/measure_sources", jSONObject, n3Var);
    }
}
