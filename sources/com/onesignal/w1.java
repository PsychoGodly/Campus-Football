package com.onesignal;

import androidx.core.app.l;
import com.onesignal.k3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotification */
public class w1 {
    private int A;

    /* renamed from: a  reason: collision with root package name */
    private l.f f28298a;

    /* renamed from: b  reason: collision with root package name */
    private List<w1> f28299b;

    /* renamed from: c  reason: collision with root package name */
    private int f28300c;

    /* renamed from: d  reason: collision with root package name */
    private String f28301d;

    /* renamed from: e  reason: collision with root package name */
    private String f28302e;

    /* renamed from: f  reason: collision with root package name */
    private String f28303f;

    /* renamed from: g  reason: collision with root package name */
    private String f28304g;

    /* renamed from: h  reason: collision with root package name */
    private String f28305h;

    /* renamed from: i  reason: collision with root package name */
    private JSONObject f28306i;

    /* renamed from: j  reason: collision with root package name */
    private String f28307j;

    /* renamed from: k  reason: collision with root package name */
    private String f28308k;

    /* renamed from: l  reason: collision with root package name */
    private String f28309l;

    /* renamed from: m  reason: collision with root package name */
    private String f28310m;

    /* renamed from: n  reason: collision with root package name */
    private String f28311n;

    /* renamed from: o  reason: collision with root package name */
    private String f28312o;

    /* renamed from: p  reason: collision with root package name */
    private String f28313p;

    /* renamed from: q  reason: collision with root package name */
    private int f28314q;

    /* renamed from: r  reason: collision with root package name */
    private String f28315r;

    /* renamed from: s  reason: collision with root package name */
    private String f28316s;

    /* renamed from: t  reason: collision with root package name */
    private List<a> f28317t;

    /* renamed from: u  reason: collision with root package name */
    private String f28318u;

    /* renamed from: v  reason: collision with root package name */
    private b f28319v;

    /* renamed from: w  reason: collision with root package name */
    private String f28320w;

    /* renamed from: x  reason: collision with root package name */
    private int f28321x;

    /* renamed from: y  reason: collision with root package name */
    private String f28322y;

    /* renamed from: z  reason: collision with root package name */
    private long f28323z;

    /* compiled from: OSNotification */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f28324a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f28325b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f28326c;

        public String d() {
            return this.f28326c;
        }

        public String e() {
            return this.f28324a;
        }

        public String f() {
            return this.f28325b;
        }

        public JSONObject g() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f28324a);
                jSONObject.put("text", this.f28325b);
                jSONObject.put("icon", this.f28326c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* compiled from: OSNotification */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f28327a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f28328b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f28329c;

        public String d() {
            return this.f28329c;
        }

        public String e() {
            return this.f28327a;
        }

        public String f() {
            return this.f28328b;
        }
    }

    /* compiled from: OSNotification */
    public static class c {
        private int A;

        /* renamed from: a  reason: collision with root package name */
        private l.f f28330a;

        /* renamed from: b  reason: collision with root package name */
        private List<w1> f28331b;

        /* renamed from: c  reason: collision with root package name */
        private int f28332c;

        /* renamed from: d  reason: collision with root package name */
        private String f28333d;

        /* renamed from: e  reason: collision with root package name */
        private String f28334e;

        /* renamed from: f  reason: collision with root package name */
        private String f28335f;

        /* renamed from: g  reason: collision with root package name */
        private String f28336g;

        /* renamed from: h  reason: collision with root package name */
        private String f28337h;

        /* renamed from: i  reason: collision with root package name */
        private JSONObject f28338i;

        /* renamed from: j  reason: collision with root package name */
        private String f28339j;

        /* renamed from: k  reason: collision with root package name */
        private String f28340k;

        /* renamed from: l  reason: collision with root package name */
        private String f28341l;

        /* renamed from: m  reason: collision with root package name */
        private String f28342m;

        /* renamed from: n  reason: collision with root package name */
        private String f28343n;

        /* renamed from: o  reason: collision with root package name */
        private String f28344o;

        /* renamed from: p  reason: collision with root package name */
        private String f28345p;

        /* renamed from: q  reason: collision with root package name */
        private int f28346q = 1;

        /* renamed from: r  reason: collision with root package name */
        private String f28347r;

        /* renamed from: s  reason: collision with root package name */
        private String f28348s;

        /* renamed from: t  reason: collision with root package name */
        private List<a> f28349t;

        /* renamed from: u  reason: collision with root package name */
        private String f28350u;

        /* renamed from: v  reason: collision with root package name */
        private b f28351v;

        /* renamed from: w  reason: collision with root package name */
        private String f28352w;

        /* renamed from: x  reason: collision with root package name */
        private int f28353x;

        /* renamed from: y  reason: collision with root package name */
        private String f28354y;

        /* renamed from: z  reason: collision with root package name */
        private long f28355z;

        public c A(String str) {
            this.f28334e = str;
            return this;
        }

        public c B(String str) {
            this.f28336g = str;
            return this;
        }

        public w1 a() {
            w1 w1Var = new w1();
            w1Var.X(this.f28330a);
            w1Var.S(this.f28331b);
            w1Var.J(this.f28332c);
            w1Var.Y(this.f28333d);
            w1Var.g0(this.f28334e);
            w1Var.f0(this.f28335f);
            w1Var.h0(this.f28336g);
            w1Var.N(this.f28337h);
            w1Var.I(this.f28338i);
            w1Var.c0(this.f28339j);
            w1Var.T(this.f28340k);
            w1Var.M(this.f28341l);
            w1Var.d0(this.f28342m);
            w1Var.U(this.f28343n);
            w1Var.e0(this.f28344o);
            w1Var.V(this.f28345p);
            w1Var.W(this.f28346q);
            w1Var.Q(this.f28347r);
            w1Var.R(this.f28348s);
            w1Var.H(this.f28349t);
            w1Var.P(this.f28350u);
            w1Var.K(this.f28351v);
            w1Var.O(this.f28352w);
            w1Var.Z(this.f28353x);
            w1Var.a0(this.f28354y);
            w1Var.b0(this.f28355z);
            w1Var.i0(this.A);
            return w1Var;
        }

        public c b(List<a> list) {
            this.f28349t = list;
            return this;
        }

        public c c(JSONObject jSONObject) {
            this.f28338i = jSONObject;
            return this;
        }

        public c d(int i10) {
            this.f28332c = i10;
            return this;
        }

        public c e(b bVar) {
            this.f28351v = bVar;
            return this;
        }

        public c f(String str) {
            this.f28341l = str;
            return this;
        }

        public c g(String str) {
            this.f28337h = str;
            return this;
        }

        public c h(String str) {
            this.f28352w = str;
            return this;
        }

        public c i(String str) {
            this.f28350u = str;
            return this;
        }

        public c j(String str) {
            this.f28347r = str;
            return this;
        }

        public c k(String str) {
            this.f28348s = str;
            return this;
        }

        public c l(List<w1> list) {
            this.f28331b = list;
            return this;
        }

        public c m(String str) {
            this.f28340k = str;
            return this;
        }

        public c n(String str) {
            this.f28343n = str;
            return this;
        }

        public c o(String str) {
            this.f28345p = str;
            return this;
        }

        public c p(int i10) {
            this.f28346q = i10;
            return this;
        }

        public c q(l.f fVar) {
            this.f28330a = fVar;
            return this;
        }

        public c r(String str) {
            this.f28333d = str;
            return this;
        }

        public c s(int i10) {
            this.f28353x = i10;
            return this;
        }

        public c t(String str) {
            this.f28354y = str;
            return this;
        }

        public c u(long j10) {
            this.f28355z = j10;
            return this;
        }

        public c v(String str) {
            this.f28339j = str;
            return this;
        }

        public c w(String str) {
            this.f28342m = str;
            return this;
        }

        public c x(String str) {
            this.f28344o = str;
            return this;
        }

        public c y(int i10) {
            this.A = i10;
            return this;
        }

        public c z(String str) {
            this.f28335f = str;
            return this;
        }
    }

    protected w1() {
        this.f28314q = 1;
    }

    private void F(JSONObject jSONObject) {
        try {
            JSONObject b10 = k0.b(jSONObject);
            long b11 = k3.N0().b();
            if (jSONObject.has("google.ttl")) {
                this.f28323z = jSONObject.optLong("google.sent_time", b11) / 1000;
                this.A = jSONObject.optInt("google.ttl", 259200);
            } else if (jSONObject.has("hms.ttl")) {
                this.f28323z = jSONObject.optLong("hms.sent_time", b11) / 1000;
                this.A = jSONObject.optInt("hms.ttl", 259200);
            } else {
                this.f28323z = b11 / 1000;
                this.A = 259200;
            }
            this.f28301d = b10.optString("i");
            this.f28303f = b10.optString("ti");
            this.f28302e = b10.optString("tn");
            this.f28322y = jSONObject.toString();
            this.f28306i = b10.optJSONObject("a");
            this.f28311n = b10.optString("u", (String) null);
            this.f28305h = jSONObject.optString("alert", (String) null);
            this.f28304g = jSONObject.optString("title", (String) null);
            this.f28307j = jSONObject.optString("sicon", (String) null);
            this.f28309l = jSONObject.optString("bicon", (String) null);
            this.f28308k = jSONObject.optString("licon", (String) null);
            this.f28312o = jSONObject.optString("sound", (String) null);
            this.f28315r = jSONObject.optString("grp", (String) null);
            this.f28316s = jSONObject.optString("grp_msg", (String) null);
            this.f28310m = jSONObject.optString("bgac", (String) null);
            this.f28313p = jSONObject.optString("ledc", (String) null);
            String optString = jSONObject.optString("vis", (String) null);
            if (optString != null) {
                this.f28314q = Integer.parseInt(optString);
            }
            this.f28318u = jSONObject.optString("from", (String) null);
            this.f28321x = jSONObject.optInt("pri", 0);
            String optString2 = jSONObject.optString("collapse_key", (String) null);
            if (!"do_not_collapse".equals(optString2)) {
                this.f28320w = optString2;
            }
            try {
                G();
            } catch (Throwable th) {
                k3.b(k3.r0.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                L(jSONObject);
            } catch (Throwable th2) {
                k3.b(k3.r0.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            k3.b(k3.r0.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private void G() throws Throwable {
        JSONObject jSONObject = this.f28306i;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = this.f28306i.getJSONArray("actionButtons");
            this.f28317t = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                a aVar = new a();
                String unused = aVar.f28324a = jSONObject2.optString("id", (String) null);
                String unused2 = aVar.f28325b = jSONObject2.optString("text", (String) null);
                String unused3 = aVar.f28326c = jSONObject2.optString("icon", (String) null);
                this.f28317t.add(aVar);
            }
            this.f28306i.remove("actionId");
            this.f28306i.remove("actionButtons");
        }
    }

    private void L(JSONObject jSONObject) throws Throwable {
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            b bVar = new b();
            this.f28319v = bVar;
            String unused = bVar.f28327a = jSONObject2.optString("img");
            String unused2 = this.f28319v.f28328b = jSONObject2.optString("tc");
            String unused3 = this.f28319v.f28329c = jSONObject2.optString("bc");
        }
    }

    /* access modifiers changed from: private */
    public void b0(long j10) {
        this.f28323z = j10;
    }

    /* access modifiers changed from: private */
    public void i0(int i10) {
        this.A = i10;
    }

    public String A() {
        return this.f28303f;
    }

    public String B() {
        return this.f28302e;
    }

    public String C() {
        return this.f28304g;
    }

    public int D() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f28300c != 0;
    }

    /* access modifiers changed from: package-private */
    public void H(List<a> list) {
        this.f28317t = list;
    }

    /* access modifiers changed from: package-private */
    public void I(JSONObject jSONObject) {
        this.f28306i = jSONObject;
    }

    /* access modifiers changed from: protected */
    public void J(int i10) {
        this.f28300c = i10;
    }

    /* access modifiers changed from: package-private */
    public void K(b bVar) {
        this.f28319v = bVar;
    }

    /* access modifiers changed from: package-private */
    public void M(String str) {
        this.f28309l = str;
    }

    /* access modifiers changed from: package-private */
    public void N(String str) {
        this.f28305h = str;
    }

    /* access modifiers changed from: package-private */
    public void O(String str) {
        this.f28320w = str;
    }

    /* access modifiers changed from: package-private */
    public void P(String str) {
        this.f28318u = str;
    }

    /* access modifiers changed from: package-private */
    public void Q(String str) {
        this.f28315r = str;
    }

    /* access modifiers changed from: package-private */
    public void R(String str) {
        this.f28316s = str;
    }

    /* access modifiers changed from: package-private */
    public void S(List<w1> list) {
        this.f28299b = list;
    }

    /* access modifiers changed from: package-private */
    public void T(String str) {
        this.f28308k = str;
    }

    /* access modifiers changed from: package-private */
    public void U(String str) {
        this.f28311n = str;
    }

    /* access modifiers changed from: package-private */
    public void V(String str) {
        this.f28313p = str;
    }

    /* access modifiers changed from: package-private */
    public void W(int i10) {
        this.f28314q = i10;
    }

    /* access modifiers changed from: protected */
    public void X(l.f fVar) {
        this.f28298a = fVar;
    }

    /* access modifiers changed from: package-private */
    public void Y(String str) {
        this.f28301d = str;
    }

    /* access modifiers changed from: package-private */
    public void Z(int i10) {
        this.f28321x = i10;
    }

    /* access modifiers changed from: package-private */
    public void a0(String str) {
        this.f28322y = str;
    }

    /* access modifiers changed from: package-private */
    public w1 c() {
        return new c().q(this.f28298a).l(this.f28299b).d(this.f28300c).r(this.f28301d).A(this.f28302e).z(this.f28303f).B(this.f28304g).g(this.f28305h).c(this.f28306i).v(this.f28307j).m(this.f28308k).f(this.f28309l).w(this.f28310m).n(this.f28311n).x(this.f28312o).o(this.f28313p).p(this.f28314q).j(this.f28315r).k(this.f28316s).b(this.f28317t).i(this.f28318u).e(this.f28319v).h(this.f28320w).s(this.f28321x).t(this.f28322y).u(this.f28323z).y(this.A).a();
    }

    /* access modifiers changed from: package-private */
    public void c0(String str) {
        this.f28307j = str;
    }

    public List<a> d() {
        return this.f28317t;
    }

    /* access modifiers changed from: package-private */
    public void d0(String str) {
        this.f28310m = str;
    }

    public JSONObject e() {
        return this.f28306i;
    }

    /* access modifiers changed from: package-private */
    public void e0(String str) {
        this.f28312o = str;
    }

    public int f() {
        return this.f28300c;
    }

    /* access modifiers changed from: package-private */
    public void f0(String str) {
        this.f28303f = str;
    }

    public b g() {
        return this.f28319v;
    }

    /* access modifiers changed from: package-private */
    public void g0(String str) {
        this.f28302e = str;
    }

    public String h() {
        return this.f28309l;
    }

    /* access modifiers changed from: package-private */
    public void h0(String str) {
        this.f28304g = str;
    }

    public String i() {
        return this.f28305h;
    }

    public String j() {
        return this.f28320w;
    }

    public JSONObject j0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", this.f28300c);
            JSONArray jSONArray = new JSONArray();
            List<w1> list = this.f28299b;
            if (list != null) {
                for (w1 j02 : list) {
                    jSONArray.put(j02.j0());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", this.f28301d);
            jSONObject.put("templateName", this.f28302e);
            jSONObject.put("templateId", this.f28303f);
            jSONObject.put("title", this.f28304g);
            jSONObject.put("body", this.f28305h);
            jSONObject.put("smallIcon", this.f28307j);
            jSONObject.put("largeIcon", this.f28308k);
            jSONObject.put("bigPicture", this.f28309l);
            jSONObject.put("smallIconAccentColor", this.f28310m);
            jSONObject.put("launchURL", this.f28311n);
            jSONObject.put("sound", this.f28312o);
            jSONObject.put("ledColor", this.f28313p);
            jSONObject.put("lockScreenVisibility", this.f28314q);
            jSONObject.put("groupKey", this.f28315r);
            jSONObject.put("groupMessage", this.f28316s);
            jSONObject.put("fromProjectNumber", this.f28318u);
            jSONObject.put("collapseId", this.f28320w);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, this.f28321x);
            JSONObject jSONObject2 = this.f28306i;
            if (jSONObject2 != null) {
                jSONObject.put("additionalData", jSONObject2);
            }
            if (this.f28317t != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (a g10 : this.f28317t) {
                    jSONArray2.put(g10.g());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", this.f28322y);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String k() {
        return this.f28318u;
    }

    public String l() {
        return this.f28315r;
    }

    public String m() {
        return this.f28316s;
    }

    public List<w1> n() {
        return this.f28299b;
    }

    public String o() {
        return this.f28308k;
    }

    public String p() {
        return this.f28311n;
    }

    public String q() {
        return this.f28313p;
    }

    public int r() {
        return this.f28314q;
    }

    public l.f s() {
        return this.f28298a;
    }

    public String t() {
        return this.f28301d;
    }

    public String toString() {
        return "OSNotification{notificationExtender=" + this.f28298a + ", groupedNotifications=" + this.f28299b + ", androidNotificationId=" + this.f28300c + ", notificationId='" + this.f28301d + '\'' + ", templateName='" + this.f28302e + '\'' + ", templateId='" + this.f28303f + '\'' + ", title='" + this.f28304g + '\'' + ", body='" + this.f28305h + '\'' + ", additionalData=" + this.f28306i + ", smallIcon='" + this.f28307j + '\'' + ", largeIcon='" + this.f28308k + '\'' + ", bigPicture='" + this.f28309l + '\'' + ", smallIconAccentColor='" + this.f28310m + '\'' + ", launchURL='" + this.f28311n + '\'' + ", sound='" + this.f28312o + '\'' + ", ledColor='" + this.f28313p + '\'' + ", lockScreenVisibility=" + this.f28314q + ", groupKey='" + this.f28315r + '\'' + ", groupMessage='" + this.f28316s + '\'' + ", actionButtons=" + this.f28317t + ", fromProjectNumber='" + this.f28318u + '\'' + ", backgroundImageLayout=" + this.f28319v + ", collapseId='" + this.f28320w + '\'' + ", priority=" + this.f28321x + ", rawPayload='" + this.f28322y + '\'' + '}';
    }

    public int u() {
        return this.f28321x;
    }

    public String v() {
        return this.f28322y;
    }

    public long w() {
        return this.f28323z;
    }

    public String x() {
        return this.f28307j;
    }

    public String y() {
        return this.f28310m;
    }

    public String z() {
        return this.f28312o;
    }

    w1(JSONObject jSONObject) {
        this((List<w1>) null, jSONObject, 0);
    }

    w1(List<w1> list, JSONObject jSONObject, int i10) {
        this.f28314q = 1;
        F(jSONObject);
        this.f28299b = list;
        this.f28300c = i10;
    }
}
