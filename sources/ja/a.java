package ja;

import com.applovin.mediation.MaxReward;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInfluence.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private c f29101a;

    /* renamed from: b  reason: collision with root package name */
    private b f29102b;

    /* renamed from: c  reason: collision with root package name */
    private JSONArray f29103c;

    public a(String str) throws JSONException {
        m.e(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        this.f29102b = b.f29104b.a(string);
        this.f29101a = c.f29109a.a(string2);
        m.d(string3, "ids");
        this.f29103c = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final a a() {
        return new a(this.f29102b, this.f29101a, this.f29103c);
    }

    public final JSONArray b() {
        return this.f29103c;
    }

    public final b c() {
        return this.f29102b;
    }

    public final c d() {
        return this.f29101a;
    }

    public final void e(JSONArray jSONArray) {
        this.f29103c = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m.a(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f29102b == aVar.f29102b && this.f29101a == aVar.f29101a) {
            return true;
        }
        return false;
    }

    public final void f(c cVar) {
        m.e(cVar, "<set-?>");
        this.f29101a = cVar;
    }

    public final String g() throws JSONException {
        JSONObject put = new JSONObject().put("influence_channel", this.f29102b.toString()).put("influence_type", this.f29101a.toString());
        JSONArray jSONArray = this.f29103c;
        String jSONObject = put.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : MaxReward.DEFAULT_LABEL).toString();
        m.d(jSONObject, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return jSONObject;
    }

    public int hashCode() {
        return (this.f29102b.hashCode() * 31) + this.f29101a.hashCode();
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.f29102b + ", influenceType=" + this.f29101a + ", ids=" + this.f29103c + '}';
    }

    public a(b bVar, c cVar, JSONArray jSONArray) {
        m.e(bVar, "influenceChannel");
        m.e(cVar, "influenceType");
        this.f29102b = bVar;
        this.f29101a = cVar;
        this.f29103c = jSONArray;
    }
}
