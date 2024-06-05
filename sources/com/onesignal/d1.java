package com.onesignal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageAction */
public class d1 {

    /* renamed from: a  reason: collision with root package name */
    private String f27633a;

    /* renamed from: b  reason: collision with root package name */
    private String f27634b;

    /* renamed from: c  reason: collision with root package name */
    private a f27635c;

    /* renamed from: d  reason: collision with root package name */
    private String f27636d;

    /* renamed from: e  reason: collision with root package name */
    private String f27637e;

    /* renamed from: f  reason: collision with root package name */
    private List<l1> f27638f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private List<o1> f27639g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private t1 f27640h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27641i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f27642j;

    /* compiled from: OSInAppMessageAction */
    public enum a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        

        /* renamed from: a  reason: collision with root package name */
        private String f27647a;

        private a(String str) {
            this.f27647a = str;
        }

        public static a a(String str) {
            for (a aVar : values()) {
                if (aVar.f27647a.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            return this.f27647a;
        }
    }

    d1(JSONObject jSONObject) throws JSONException {
        this.f27633a = jSONObject.optString("id", (String) null);
        this.f27634b = jSONObject.optString(MediationMetaData.KEY_NAME, (String) null);
        this.f27636d = jSONObject.optString("url", (String) null);
        this.f27637e = jSONObject.optString("pageId", (String) null);
        a a10 = a.a(jSONObject.optString("url_target", (String) null));
        this.f27635c = a10;
        if (a10 == null) {
            this.f27635c = a.IN_APP_WEBVIEW;
        }
        this.f27642j = jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            j(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.f27640h = new t1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            k(jSONObject);
        }
    }

    private void j(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f27638f.add(new l1((JSONObject) jSONArray.get(i10)));
        }
    }

    private void k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            string.hashCode();
            if (string.equals("push")) {
                this.f27639g.add(new q1());
            } else if (string.equals("location")) {
                this.f27639g.add(new k1());
            }
        }
    }

    public boolean a() {
        return this.f27642j;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f27633a;
    }

    public String c() {
        return this.f27634b;
    }

    public String d() {
        return this.f27636d;
    }

    public List<l1> e() {
        return this.f27638f;
    }

    public List<o1> f() {
        return this.f27639g;
    }

    public t1 g() {
        return this.f27640h;
    }

    public a h() {
        return this.f27635c;
    }

    public boolean i() {
        return this.f27641i;
    }

    /* access modifiers changed from: package-private */
    public void l(boolean z10) {
        this.f27641i = z10;
    }
}
