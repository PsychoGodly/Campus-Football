package ba;

import android.webkit.WebView;
import ca.c;
import ca.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import fa.b;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import x9.d;
import x9.n;
import x9.o;
import z9.g;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private String f24292a;

    /* renamed from: b  reason: collision with root package name */
    private b f24293b = new b((WebView) null);

    /* renamed from: c  reason: collision with root package name */
    private x9.a f24294c;

    /* renamed from: d  reason: collision with root package name */
    private C0260a f24295d;

    /* renamed from: e  reason: collision with root package name */
    private long f24296e;

    /* renamed from: ba.a$a  reason: collision with other inner class name */
    enum C0260a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a(String str) {
        a();
        this.f24292a = str;
    }

    public void a() {
        this.f24296e = f.b();
        this.f24295d = C0260a.AD_STATE_IDLE;
    }

    public void b(float f10) {
        g.a().c(r(), this.f24292a, f10);
    }

    /* access modifiers changed from: package-private */
    public void c(WebView webView) {
        this.f24293b = new b(webView);
    }

    public void d(String str, long j10) {
        C0260a aVar;
        if (j10 >= this.f24296e && this.f24295d != (aVar = C0260a.AD_STATE_NOTVISIBLE)) {
            this.f24295d = aVar;
            g.a().d(r(), this.f24292a, str);
        }
    }

    public void e(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            c.h(jSONObject, "timestamp", Long.valueOf(date.getTime()));
            g.a().i(r(), jSONObject);
        }
    }

    public void f(JSONObject jSONObject) {
        g.a().m(r(), this.f24292a, jSONObject);
    }

    public void g(x9.a aVar) {
        this.f24294c = aVar;
    }

    public void h(x9.c cVar) {
        g.a().e(r(), this.f24292a, cVar.c());
    }

    public void i(o oVar, d dVar) {
        j(oVar, dVar, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public void j(o oVar, d dVar, JSONObject jSONObject) {
        String o10 = oVar.o();
        JSONObject jSONObject2 = new JSONObject();
        c.h(jSONObject2, "environment", "app");
        c.h(jSONObject2, "adSessionType", dVar.c());
        c.h(jSONObject2, "deviceInfo", ca.b.d());
        c.h(jSONObject2, "deviceCategory", ca.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.h(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, dVar.h().b());
        c.h(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, dVar.h().c());
        c.h(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.h(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        c.h(jSONObject4, "appId", z9.f.c().a().getApplicationContext().getPackageName());
        c.h(jSONObject2, "app", jSONObject4);
        if (dVar.d() != null) {
            c.h(jSONObject2, "contentUrl", dVar.d());
        }
        if (dVar.e() != null) {
            c.h(jSONObject2, "customReferenceData", dVar.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (n next : dVar.i()) {
            c.h(jSONObject5, next.b(), next.c());
        }
        g.a().f(r(), o10, jSONObject2, jSONObject5, jSONObject);
    }

    public void k(boolean z10) {
        if (o()) {
            g.a().l(r(), this.f24292a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void l() {
        this.f24293b.clear();
    }

    public void m(String str, long j10) {
        if (j10 >= this.f24296e) {
            this.f24295d = C0260a.AD_STATE_VISIBLE;
            g.a().d(r(), this.f24292a, str);
        }
    }

    public x9.a n() {
        return this.f24294c;
    }

    public boolean o() {
        return this.f24293b.get() != null;
    }

    public void p() {
        g.a().b(r(), this.f24292a);
    }

    public void q() {
        g.a().k(r(), this.f24292a);
    }

    public WebView r() {
        return (WebView) this.f24293b.get();
    }

    public void s() {
        f((JSONObject) null);
    }

    public void t() {
    }
}
