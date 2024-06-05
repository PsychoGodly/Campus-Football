package n4;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.d5;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final d5 f20952a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20953b;

    private k(d5 d5Var) {
        this.f20952a = d5Var;
        c3 c3Var = d5Var.f14452c;
        this.f20953b = c3Var == null ? null : c3Var.v();
    }

    public static k i(d5 d5Var) {
        if (d5Var != null) {
            return new k(d5Var);
        }
        return null;
    }

    public a a() {
        return this.f20953b;
    }

    public String b() {
        return this.f20952a.f14455g;
    }

    public String c() {
        return this.f20952a.f14457i;
    }

    public String d() {
        return this.f20952a.f14456h;
    }

    public String e() {
        return this.f20952a.f14454f;
    }

    public String f() {
        return this.f20952a.f14450a;
    }

    public Bundle g() {
        return this.f20952a.f14453d;
    }

    public long h() {
        return this.f20952a.f14451b;
    }

    public final JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f20952a.f14450a);
        jSONObject.put("Latency", this.f20952a.f14451b);
        String e10 = e();
        if (e10 == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", e10);
        }
        String b10 = b();
        if (b10 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", b10);
        }
        String d10 = d();
        if (d10 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", d10);
        }
        String c10 = c();
        if (c10 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", c10);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f20952a.f14453d.keySet()) {
            jSONObject2.put(str, this.f20952a.f14453d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f20953b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
