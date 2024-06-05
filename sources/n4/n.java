package n4;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class n extends a {

    /* renamed from: e  reason: collision with root package name */
    private final y f20955e;

    public n(int i10, String str, String str2, a aVar, y yVar) {
        super(i10, str, str2, aVar);
        this.f20955e = yVar;
    }

    public final JSONObject e() throws JSONException {
        JSONObject e10 = super.e();
        y f10 = f();
        if (f10 == null) {
            e10.put("Response Info", "null");
        } else {
            e10.put("Response Info", f10.i());
        }
        return e10;
    }

    public y f() {
        return this.f20955e;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
