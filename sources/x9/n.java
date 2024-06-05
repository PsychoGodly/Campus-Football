package x9;

import ca.c;
import java.net.URL;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f31276a;

    /* renamed from: b  reason: collision with root package name */
    private final URL f31277b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31278c;

    public URL a() {
        return this.f31277b;
    }

    public String b() {
        return this.f31276a;
    }

    public String c() {
        return this.f31278c;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, "vendorKey", this.f31276a);
        c.h(jSONObject, "resourceUrl", this.f31277b.toString());
        c.h(jSONObject, "verificationParameters", this.f31278c);
        return jSONObject;
    }
}
