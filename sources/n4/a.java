package n4;

import android.os.IBinder;
import com.google.android.gms.ads.internal.client.c3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f20893a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20894b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20895c;

    /* renamed from: d  reason: collision with root package name */
    private final a f20896d;

    public a(int i10, String str, String str2) {
        this(i10, str, str2, (a) null);
    }

    public a(int i10, String str, String str2, a aVar) {
        this.f20893a = i10;
        this.f20894b = str;
        this.f20895c = str2;
        this.f20896d = aVar;
    }

    public int a() {
        return this.f20893a;
    }

    public String b() {
        return this.f20895c;
    }

    public String c() {
        return this.f20894b;
    }

    public final c3 d() {
        c3 c3Var;
        if (this.f20896d == null) {
            c3Var = null;
        } else {
            a aVar = this.f20896d;
            c3Var = new c3(aVar.f20893a, aVar.f20894b, aVar.f20895c, (c3) null, (IBinder) null);
        }
        return new c3(this.f20893a, this.f20894b, this.f20895c, c3Var, (IBinder) null);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f20893a);
        jSONObject.put("Message", this.f20894b);
        jSONObject.put("Domain", this.f20895c);
        a aVar = this.f20896d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", aVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
