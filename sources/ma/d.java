package ma;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeSource.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private e f29294a;

    /* renamed from: b  reason: collision with root package name */
    private e f29295b;

    public d(e eVar, e eVar2) {
        this.f29294a = eVar;
        this.f29295b = eVar2;
    }

    public final e a() {
        return this.f29294a;
    }

    public final e b() {
        return this.f29295b;
    }

    public final d c(e eVar) {
        d(eVar);
        return this;
    }

    public final void d(e eVar) {
        this.f29294a = eVar;
    }

    public final d e(e eVar) {
        f(eVar);
        return this;
    }

    public final void f(e eVar) {
        this.f29295b = eVar;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        e eVar = this.f29294a;
        if (eVar != null) {
            jSONObject.put("direct", eVar.e());
        }
        e eVar2 = this.f29295b;
        if (eVar2 != null) {
            jSONObject.put("indirect", eVar2.e());
        }
        return jSONObject;
    }

    public String toString() {
        return "OSOutcomeSource{directBody=" + this.f29294a + ", indirectBody=" + this.f29295b + '}';
    }
}
