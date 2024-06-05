package ia;

import com.onesignal.t2;
import com.onesignal.u3;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: OSInfluenceDataRepository.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final t2 f29025a;

    public c(t2 t2Var) {
        m.e(t2Var, "preferences");
        this.f29025a = t2Var;
    }

    public final void a(ja.c cVar) {
        m.e(cVar, "influenceType");
        t2 t2Var = this.f29025a;
        t2Var.i(t2Var.f(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", cVar.toString());
    }

    public final void b(ja.c cVar) {
        m.e(cVar, "influenceType");
        t2 t2Var = this.f29025a;
        t2Var.i(t2Var.f(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", cVar.toString());
    }

    public final void c(String str) {
        t2 t2Var = this.f29025a;
        t2Var.i(t2Var.f(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    public final String d() {
        t2 t2Var = this.f29025a;
        return t2Var.e(t2Var.f(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", (String) null);
    }

    public final ja.c e() {
        String str = ja.c.UNATTRIBUTED.toString();
        t2 t2Var = this.f29025a;
        return ja.c.f29109a.a(t2Var.e(t2Var.f(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", str));
    }

    public final int f() {
        t2 t2Var = this.f29025a;
        return t2Var.d(t2Var.f(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int g() {
        t2 t2Var = this.f29025a;
        return t2Var.d(t2Var.f(), "PREFS_OS_IAM_LIMIT", 10);
    }

    public final JSONArray h() throws JSONException {
        JSONArray jSONArray;
        t2 t2Var = this.f29025a;
        String e10 = t2Var.e(t2Var.f(), "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        if (e10 == null) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray(e10);
        }
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final JSONArray i() throws JSONException {
        JSONArray jSONArray;
        t2 t2Var = this.f29025a;
        String e10 = t2Var.e(t2Var.f(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        if (e10 == null) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray(e10);
        }
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final ja.c j() {
        t2 t2Var = this.f29025a;
        return ja.c.f29109a.a(t2Var.e(t2Var.f(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", ja.c.UNATTRIBUTED.toString()));
    }

    public final int k() {
        t2 t2Var = this.f29025a;
        return t2Var.d(t2Var.f(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int l() {
        t2 t2Var = this.f29025a;
        return t2Var.d(t2Var.f(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final boolean m() {
        t2 t2Var = this.f29025a;
        return t2Var.j(t2Var.f(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean n() {
        t2 t2Var = this.f29025a;
        return t2Var.j(t2Var.f(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean o() {
        t2 t2Var = this.f29025a;
        return t2Var.j(t2Var.f(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void p(JSONArray jSONArray) {
        m.e(jSONArray, "iams");
        t2 t2Var = this.f29025a;
        t2Var.i(t2Var.f(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    public final void q(u3.e eVar) {
        m.e(eVar, "influenceParams");
        t2 t2Var = this.f29025a;
        t2Var.b(t2Var.f(), "PREFS_OS_DIRECT_ENABLED", eVar.e());
        t2 t2Var2 = this.f29025a;
        t2Var2.b(t2Var2.f(), "PREFS_OS_INDIRECT_ENABLED", eVar.f());
        t2 t2Var3 = this.f29025a;
        t2Var3.b(t2Var3.f(), "PREFS_OS_UNATTRIBUTED_ENABLED", eVar.g());
        t2 t2Var4 = this.f29025a;
        t2Var4.a(t2Var4.f(), "PREFS_OS_NOTIFICATION_LIMIT", eVar.d());
        t2 t2Var5 = this.f29025a;
        t2Var5.a(t2Var5.f(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", eVar.c());
        t2 t2Var6 = this.f29025a;
        t2Var6.a(t2Var6.f(), "PREFS_OS_IAM_LIMIT", eVar.a());
        t2 t2Var7 = this.f29025a;
        t2Var7.a(t2Var7.f(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", eVar.b());
    }

    public final void r(JSONArray jSONArray) {
        m.e(jSONArray, "notifications");
        t2 t2Var = this.f29025a;
        t2Var.i(t2Var.f(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
