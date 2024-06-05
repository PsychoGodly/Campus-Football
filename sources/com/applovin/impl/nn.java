package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class nn extends jn {

    class a implements b4.e {
        a() {
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (nn.this.h()) {
                t tVar = nn.this.f13423c;
                if (t.a()) {
                    nn nnVar = nn.this;
                    t tVar2 = nnVar.f13423c;
                    String str3 = nnVar.f13422b;
                    tVar2.b(str3, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            t tVar3 = nn.this.f13423c;
            if (t.a()) {
                nn nnVar2 = nn.this;
                t tVar4 = nnVar2.f13423c;
                String str4 = nnVar2.f13422b;
                tVar4.b(str4, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            nn.this.a(i10);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            if (nn.this.h()) {
                t tVar = nn.this.f13423c;
                if (t.a()) {
                    nn nnVar = nn.this;
                    t tVar2 = nnVar.f13423c;
                    String str2 = nnVar.f13422b;
                    tVar2.b(str2, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                t tVar3 = nn.this.f13423c;
                if (t.a()) {
                    nn nnVar2 = nn.this;
                    t tVar4 = nnVar2.f13423c;
                    String str3 = nnVar2.f13422b;
                    tVar4.b(str3, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            t tVar5 = nn.this.f13423c;
            if (t.a()) {
                nn nnVar3 = nn.this;
                t tVar6 = nnVar3.f13423c;
                String str4 = nnVar3.f13422b;
                tVar6.a(str4, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            nn.this.c(jSONObject);
        }
    }

    protected nn(String str, k kVar) {
        super(str, kVar);
    }

    private ch b(JSONObject jSONObject) {
        Map<String, String> map;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        c4.c(jSONObject2, this.f13421a);
        c4.b(jSONObject, this.f13421a);
        c4.a(jSONObject, this.f13421a);
        try {
            map = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            map = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return ch.a(str, map);
    }

    /* access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        ch b10 = b(jSONObject);
        a(b10);
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Pending reward handled: " + b10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ch chVar);

    /* access modifiers changed from: protected */
    public int g() {
        return ((Integer) this.f13421a.a(oj.f10393r1)).intValue();
    }

    /* access modifiers changed from: protected */
    public abstract boolean h();

    public void run() {
        a(e(), new a());
    }
}
