package la;

import com.onesignal.i2;
import com.onesignal.n3;
import com.onesignal.v1;
import ja.c;
import kotlin.jvm.internal.m;
import ma.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventsV1Repository.kt */
public final class e extends d {

    /* compiled from: OSOutcomeEventsV1Repository.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29218a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.DIRECT.ordinal()] = 1;
            iArr[c.INDIRECT.ordinal()] = 2;
            iArr[c.UNATTRIBUTED.ordinal()] = 3;
            f29218a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(v1 v1Var, a aVar, j jVar) {
        super(v1Var, aVar, jVar);
        m.e(v1Var, "logger");
        m.e(aVar, "outcomeEventsCache");
        m.e(jVar, "outcomeEventsService");
    }

    private final void l(String str, int i10, i2 i2Var, n3 n3Var) {
        try {
            JSONObject put = i2Var.g().put("app_id", str).put("device_type", i10).put("direct", true);
            j k10 = k();
            m.d(put, "jsonObject");
            k10.a(put, n3Var);
        } catch (JSONException e10) {
            j().c("Generating direct outcome:JSON Failed.", e10);
        }
    }

    private final void m(String str, int i10, i2 i2Var, n3 n3Var) {
        try {
            JSONObject put = i2Var.g().put("app_id", str).put("device_type", i10).put("direct", false);
            j k10 = k();
            m.d(put, "jsonObject");
            k10.a(put, n3Var);
        } catch (JSONException e10) {
            j().c("Generating indirect outcome:JSON Failed.", e10);
        }
    }

    private final void n(String str, int i10, i2 i2Var, n3 n3Var) {
        try {
            JSONObject put = i2Var.g().put("app_id", str).put("device_type", i10);
            j k10 = k();
            m.d(put, "jsonObject");
            k10.a(put, n3Var);
        } catch (JSONException e10) {
            j().c("Generating unattributed outcome:JSON Failed.", e10);
        }
    }

    public void a(String str, int i10, b bVar, n3 n3Var) {
        m.e(str, "appId");
        m.e(bVar, "eventParams");
        m.e(n3Var, "responseHandler");
        i2 a10 = i2.a(bVar);
        c d10 = a10.d();
        int i11 = d10 == null ? -1 : a.f29218a[d10.ordinal()];
        if (i11 == 1) {
            m.d(a10, "event");
            l(str, i10, a10, n3Var);
        } else if (i11 == 2) {
            m.d(a10, "event");
            m(str, i10, a10, n3Var);
        } else if (i11 == 3) {
            m.d(a10, "event");
            n(str, i10, a10, n3Var);
        }
    }
}
