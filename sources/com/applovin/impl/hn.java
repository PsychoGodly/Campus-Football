package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

public abstract class hn extends jn {

    class a implements b4.e {
        a() {
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            hn.this.a(i10);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            hn.this.b(jSONObject);
        }
    }

    protected hn(String str, k kVar) {
        super(str, kVar);
    }

    private JSONObject a(ch chVar) {
        JSONObject e10 = e();
        JsonUtils.putString(e10, "result", chVar.b());
        Map a10 = chVar.a();
        if (a10 != null) {
            JsonUtils.putJSONObject(e10, "params", new JSONObject(a10));
        }
        return e10;
    }

    /* access modifiers changed from: protected */
    public abstract void b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public int g() {
        return ((Integer) this.f13421a.a(oj.f10401s1)).intValue();
    }

    /* access modifiers changed from: protected */
    public abstract ch h();

    /* access modifiers changed from: protected */
    public abstract void i();

    public void run() {
        ch h10 = h();
        if (h10 != null) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Reporting pending reward: " + h10 + "...");
            }
            a(a(h10), new a());
            return;
        }
        if (t.a()) {
            this.f13423c.b(this.f13422b, "Pending reward not found");
        }
        i();
    }
}
