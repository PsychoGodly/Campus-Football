package com.applovin.impl.sdk.network;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f11931a;

    /* renamed from: b  reason: collision with root package name */
    private String f11932b;

    /* renamed from: c  reason: collision with root package name */
    private String f11933c;

    /* renamed from: d  reason: collision with root package name */
    private String f11934d;

    /* renamed from: e  reason: collision with root package name */
    private Map f11935e;

    /* renamed from: f  reason: collision with root package name */
    private Map f11936f;

    /* renamed from: g  reason: collision with root package name */
    private Map f11937g;

    /* renamed from: h  reason: collision with root package name */
    private qi.a f11938h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11939i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11940j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11941k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11942l;

    /* renamed from: m  reason: collision with root package name */
    private String f11943m;

    /* renamed from: n  reason: collision with root package name */
    private int f11944n;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f11945a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f11946b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f11947c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f11948d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Map f11949e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Map f11950f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Map f11951g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public qi.a f11952h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f11953i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public boolean f11954j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f11955k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f11956l;

        public b a(qi.a aVar) {
            this.f11952h = aVar;
            return this;
        }

        public b b(String str) {
            this.f11945a = str;
            return this;
        }

        public b c(String str) {
            this.f11946b = str;
            return this;
        }

        public b d(String str) {
            this.f11947c = str;
            return this;
        }

        public b a(String str) {
            this.f11948d = str;
            return this;
        }

        public b b(Map map) {
            this.f11949e = map;
            return this;
        }

        public b c(Map map) {
            this.f11951g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f11955k = z10;
            return this;
        }

        public b a(Map map) {
            this.f11950f = map;
            return this;
        }

        public b b(boolean z10) {
            this.f11956l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f11954j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f11953i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Map map = CollectionUtils.map(this.f11935e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f11935e = map;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f11944n;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f11934d;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f11943m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f11931a.equals(((d) obj).f11931a);
    }

    /* access modifiers changed from: package-private */
    public qi.a f() {
        return this.f11938h;
    }

    /* access modifiers changed from: package-private */
    public Map g() {
        return this.f11936f;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        return this.f11932b;
    }

    public int hashCode() {
        return this.f11931a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Map i() {
        return this.f11935e;
    }

    /* access modifiers changed from: package-private */
    public Map j() {
        return this.f11937g;
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.f11933c;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f11944n++;
    }

    public boolean m() {
        return this.f11941k;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f11939i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f11940j;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f11942l;
    }

    /* access modifiers changed from: package-private */
    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f11931a);
        jSONObject.put("communicatorRequestId", this.f11943m);
        jSONObject.put("httpMethod", this.f11932b);
        jSONObject.put("targetUrl", this.f11933c);
        jSONObject.put("backupUrl", this.f11934d);
        jSONObject.put("encodingType", this.f11938h);
        jSONObject.put("isEncodingEnabled", this.f11939i);
        jSONObject.put("gzipBodyEncoding", this.f11940j);
        jSONObject.put("isAllowedPreInitEvent", this.f11941k);
        jSONObject.put("attemptNumber", this.f11944n);
        if (this.f11935e != null) {
            jSONObject.put("parameters", new JSONObject(this.f11935e));
        }
        if (this.f11936f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f11936f));
        }
        if (this.f11937g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f11937g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f11931a + '\'' + ", communicatorRequestId='" + this.f11943m + '\'' + ", httpMethod='" + this.f11932b + '\'' + ", targetUrl='" + this.f11933c + '\'' + ", backupUrl='" + this.f11934d + '\'' + ", attemptNumber=" + this.f11944n + ", isEncodingEnabled=" + this.f11939i + ", isGzipBodyEncoding=" + this.f11940j + ", isAllowedPreInitEvent=" + this.f11941k + ", shouldFireInWebView=" + this.f11942l + '}';
    }

    d(JSONObject jSONObject, k kVar) {
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, Object> map3;
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", MaxReward.DEFAULT_LABEL);
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", MaxReward.DEFAULT_LABEL);
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", MaxReward.DEFAULT_LABEL);
        int i10 = jSONObject.getInt("attemptNumber");
        if (JsonUtils.valueExists(jSONObject, "parameters")) {
            map = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters")));
        } else {
            map = new HashMap<>();
        }
        if (JsonUtils.valueExists(jSONObject, "httpHeaders")) {
            map2 = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders")));
        } else {
            map2 = new HashMap<>();
        }
        if (JsonUtils.valueExists(jSONObject, "requestBody")) {
            map3 = Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody")));
        } else {
            map3 = new HashMap<>();
        }
        this.f11931a = string;
        this.f11932b = string3;
        this.f11943m = string2;
        this.f11933c = string4;
        this.f11934d = string5;
        this.f11935e = map;
        this.f11936f = map2;
        this.f11937g = map3;
        this.f11938h = qi.a.a(jSONObject.optInt("encodingType", qi.a.DEFAULT.b()));
        this.f11939i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f11940j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f11941k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f11942l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f11944n = i10;
    }

    private d(b bVar) {
        this.f11931a = UUID.randomUUID().toString();
        this.f11932b = bVar.f11946b;
        this.f11933c = bVar.f11947c;
        this.f11934d = bVar.f11948d;
        this.f11935e = bVar.f11949e;
        this.f11936f = bVar.f11950f;
        this.f11937g = bVar.f11951g;
        this.f11938h = bVar.f11952h;
        this.f11939i = bVar.f11953i;
        this.f11940j = bVar.f11954j;
        this.f11941k = bVar.f11955k;
        this.f11942l = bVar.f11956l;
        this.f11943m = bVar.f11945a;
        this.f11944n = 0;
    }
}
