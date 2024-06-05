package u9;

import android.os.Build;
import android.webkit.WebView;
import com.startapp.a5;
import com.startapp.eb;
import com.startapp.ec;
import com.startapp.l;
import com.startapp.p;
import com.startapp.q;
import com.startapp.qb;
import com.startapp.sb;
import com.startapp.zb;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public sb f30666a = new sb((WebView) null);

    /* renamed from: b  reason: collision with root package name */
    public l f30667b;

    /* renamed from: c  reason: collision with root package name */
    public a5 f30668c;

    /* renamed from: d  reason: collision with root package name */
    public C0344a f30669d;

    /* renamed from: e  reason: collision with root package name */
    public long f30670e;

    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* compiled from: Sta */
    public enum C0344a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a() {
        a();
    }

    public void a() {
        this.f30670e = System.nanoTime();
        this.f30669d = C0344a.AD_STATE_IDLE;
    }

    public void a(WebView webView) {
        this.f30666a = new sb(webView);
    }

    public void a(eb ebVar, q qVar) {
        a(ebVar, qVar, (JSONObject) null);
    }

    public void b() {
        this.f30666a.clear();
    }

    public void b(String str, long j10) {
        if (j10 >= this.f30670e) {
            this.f30669d = C0344a.AD_STATE_VISIBLE;
            ec.f15801a.a(c(), "setNativeViewHierarchy", str);
        }
    }

    public WebView c() {
        return (WebView) this.f30666a.get();
    }

    public void d() {
    }

    public void a(p pVar) {
        ec ecVar = ec.f15801a;
        WebView c10 = c();
        pVar.getClass();
        JSONObject jSONObject = new JSONObject();
        qb.a(jSONObject, "impressionOwner", pVar.f16240a);
        qb.a(jSONObject, "mediaEventsOwner", pVar.f16241b);
        qb.a(jSONObject, "creativeType", pVar.f16243d);
        qb.a(jSONObject, "impressionType", pVar.f16244e);
        qb.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(pVar.f16242c));
        ecVar.a(c10, "init", jSONObject);
    }

    public void a(eb ebVar, q qVar, JSONObject jSONObject) {
        String str = ebVar.f15798h;
        JSONObject jSONObject2 = new JSONObject();
        qb.a(jSONObject2, "environment", "app");
        qb.a(jSONObject2, "adSessionType", qVar.f16276h);
        JSONObject jSONObject3 = new JSONObject();
        qb.a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        qb.a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        qb.a(jSONObject3, "os", "Android");
        qb.a(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        qb.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        qb.a(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, qVar.f16269a.f15925a);
        qb.a(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, qVar.f16269a.f15926b);
        qb.a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        qb.a(jSONObject5, "libraryVersion", "1.3.31-Startio");
        qb.a(jSONObject5, "appId", zb.f17611b.f17612a.getApplicationContext().getPackageName());
        qb.a(jSONObject2, "app", jSONObject5);
        String str2 = qVar.f16275g;
        if (str2 != null) {
            qb.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = qVar.f16274f;
        if (str3 != null) {
            qb.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (T t10 : Collections.unmodifiableList(qVar.f16271c)) {
            qb.a(jSONObject6, t10.f17428a, t10.f17430c);
        }
        ec.f15801a.a(c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public void a(String str, long j10) {
        C0344a aVar;
        if (j10 >= this.f30670e && this.f30669d != (aVar = C0344a.AD_STATE_NOTVISIBLE)) {
            this.f30669d = aVar;
            ec.f15801a.a(c(), "setNativeViewHierarchy", str);
        }
    }
}
