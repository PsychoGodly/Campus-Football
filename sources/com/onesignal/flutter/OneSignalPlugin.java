package com.onesignal.flutter;

import android.content.Context;
import com.onesignal.c1;
import com.onesignal.d1;
import com.onesignal.f2;
import com.onesignal.g2;
import com.onesignal.j1;
import com.onesignal.k2;
import com.onesignal.k3;
import com.onesignal.m2;
import com.onesignal.p2;
import com.onesignal.v2;
import com.onesignal.w1;
import com.onesignal.w2;
import com.onesignal.x0;
import com.onesignal.z0;
import dc.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.j;
import lc.k;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignalPlugin extends a implements dc.a, k.c, ec.a, k3.x0, k3.u0, v2, x0, p2, k2, k3.y0 {

    /* renamed from: d  reason: collision with root package name */
    private d1 f27762d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27763f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27764g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f27765h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27766i = false;

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<String, g2> f27767j = new HashMap<>();

    class a extends j1 {
        a() {
        }

        public void a(c1 c1Var) {
            OneSignalPlugin.this.o("OneSignal#onDidDismissInAppMessage", f.f(c1Var));
        }

        public void b(c1 c1Var) {
            OneSignalPlugin.this.o("OneSignal#onDidDisplayInAppMessage", f.f(c1Var));
        }

        public void c(c1 c1Var) {
            OneSignalPlugin.this.o("OneSignal#onWillDismissInAppMessage", f.f(c1Var));
        }

        public void d(c1 c1Var) {
            OneSignalPlugin.this.o("OneSignal#onWillDisplayInAppMessage", f.f(c1Var));
        }
    }

    static class b extends d implements k3.m0 {
        b(lc.c cVar, k kVar, k.d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        public void j(k3.l0 l0Var) {
            if (!this.f27771g.getAndSet(true)) {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error when " + this.f27770f + ": " + l0Var.a(), (Object) null);
            }
        }

        public void onSuccess() {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring!");
                return;
            }
            r(this.f27769d, (Object) null);
        }
    }

    static class c extends d implements k3.s0 {
        c(lc.c cVar, k kVar, k.d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        public void a(JSONObject jSONObject) {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                r(this.f27769d, f.h(jSONObject));
            } catch (JSONException e10) {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error attempting to deserialize server response for " + this.f27770f + ": " + e10.getMessage(), (Object) null);
            }
        }

        public void g(k3.o0 o0Var) {
            if (!this.f27771g.getAndSet(true)) {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error when " + this.f27770f + " (" + o0Var.b() + "): " + o0Var.a(), (Object) null);
            }
        }
    }

    static class d extends a {

        /* renamed from: d  reason: collision with root package name */
        protected final k.d f27769d;

        /* renamed from: f  reason: collision with root package name */
        protected final String f27770f;

        /* renamed from: g  reason: collision with root package name */
        protected final AtomicBoolean f27771g = new AtomicBoolean(false);

        d(lc.c cVar, k kVar, k.d dVar, String str) {
            this.f27774c = cVar;
            this.f27773b = kVar;
            this.f27769d = dVar;
            this.f27770f = str;
        }
    }

    static class e extends d implements k3.f1 {
        e(lc.c cVar, k kVar, k.d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        public void a(JSONObject jSONObject) {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                r(this.f27769d, f.h(jSONObject));
            } catch (JSONException e10) {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error attempting to deserialize server response for " + this.f27770f + ": " + e10.getMessage(), (Object) null);
            }
        }

        public void f(JSONObject jSONObject) {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error attempting to " + this.f27770f + " " + jSONObject.toString(), f.h(jSONObject));
            } catch (JSONException e10) {
                k.d dVar2 = this.f27769d;
                p(dVar2, "OneSignal", "Encountered an error attempting to deserialize server response " + this.f27770f + " " + e10.getMessage(), (Object) null);
            }
        }
    }

    static class f extends d implements k3.h1 {
        f(lc.c cVar, k kVar, k.d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        public void n(boolean z10) {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring! response");
                return;
            }
            r(this.f27769d, Boolean.valueOf(z10));
        }
    }

    static class g extends d implements k3.c1 {
        g(lc.c cVar, k kVar, k.d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        public void a(JSONObject jSONObject) {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                r(this.f27769d, f.h(jSONObject));
            } catch (JSONException e10) {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error attempting to deserialize server response for " + this.f27770f + ": " + e10.getMessage(), (Object) null);
            }
        }

        public void d(k3.b1 b1Var) {
            if (!this.f27771g.getAndSet(true)) {
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error when " + this.f27770f + " (" + b1Var.b() + "): " + b1Var.a(), (Object) null);
            }
        }
    }

    static class h extends d implements k3.d1 {
        h(lc.c cVar, k kVar, k.d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        public void b(String str) {
            if (this.f27771g.getAndSet(true)) {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OneSignal " + this.f27770f + " handler called twice, ignoring! response: " + str);
                return;
            }
            if (str == null) {
                str = "Successfully set language.";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("success", Boolean.TRUE);
            hashMap.put("message", str);
            r(this.f27769d, hashMap);
        }

        public void h(k3.w0 w0Var) {
            if (!this.f27771g.getAndSet(true)) {
                String a10 = w0Var.a();
                if (a10 == null) {
                    a10 = "Failed to set language.";
                }
                k.d dVar = this.f27769d;
                p(dVar, "OneSignal", "Encountered an error when " + this.f27770f + ": " + a10, (Object) null);
            }
        }
    }

    private void A() {
        this.f27763f = true;
        d1 d1Var = this.f27762d;
        if (d1Var != null) {
            k(d1Var);
            this.f27762d = null;
        }
    }

    private void B() {
        k3.y2(this);
    }

    private void C() {
        this.f27764g = true;
    }

    private void D(k.d dVar) {
        k3.q1(new b(this.f27774c, this.f27773b, dVar, "logoutEmail"));
    }

    private void E(k.d dVar) {
        k3.r1(new g(this.f27774c, this.f27773b, dVar, "logoutSMSNumber"));
    }

    private void F() {
        k3.y2((k3.x0) null);
        k3.q2((k3.u0) null);
    }

    private void G(j jVar, k.d dVar) {
        k3.A1(k3.r0.values()[((Integer) jVar.a("logLevel")).intValue()], (String) jVar.a("message"));
        r(dVar, (Object) null);
    }

    private void H(j jVar, k.d dVar) {
        k3.D1(new JSONObject((Map) jVar.f36117b), new e(this.f27774c, this.f27773b, dVar, "postNotification"));
    }

    private void I(k.d dVar) {
        k3.F1();
        r(dVar, (Object) null);
    }

    private void J(j jVar, k.d dVar) {
        k3.E1(((Boolean) jVar.a("fallback")).booleanValue(), new f(this.f27774c, this.f27773b, dVar, "promptPermission"));
    }

    private void K(k.d dVar) {
        k3.Q1(new c(this.f27774c, this.f27773b, dVar, "removeExternalUserId"));
    }

    private void L(j jVar, k.d dVar) {
        k3.R1(((Integer) jVar.a("notificationId")).intValue());
        r(dVar, (Object) null);
    }

    private void M(j jVar, k.d dVar) {
        k3.q2(this);
        k3.e1(this.f27772a);
        k3.m2((String) jVar.a("appId"));
        P();
        if (!this.f27765h || k3.P2()) {
            t();
        } else {
            this.f27766i = true;
        }
        r(dVar, (Object) null);
    }

    private void N(j jVar, k.d dVar) {
        k3.n2((String) jVar.a("email"), (String) jVar.a("emailAuthHashToken"), new b(this.f27774c, this.f27773b, dVar, "setEmail"));
    }

    private void O(j jVar, k.d dVar) {
        String str = (String) jVar.a("externalUserId");
        String str2 = (String) jVar.a("authHashToken");
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        k3.p2(str, str2, new c(this.f27774c, this.f27773b, dVar, "setExternalUserId"));
    }

    private void Q(j jVar, k.d dVar) {
        String str = (String) jVar.a("language");
        if (str != null && str.length() == 0) {
            str = null;
        }
        k3.t2(str, new h(this.f27774c, this.f27773b, dVar, "setLanguage"));
    }

    private void R(j jVar, k.d dVar) {
        k3.v2(((Boolean) jVar.f36117b).booleanValue());
        r(dVar, (Object) null);
    }

    private void S(j jVar, k.d dVar) {
        k3.w2(((Integer) jVar.a("console")).intValue(), ((Integer) jVar.a("visual")).intValue());
        r(dVar, (Object) null);
    }

    private void T(j jVar, k.d dVar) {
        boolean booleanValue = ((Boolean) jVar.a("required")).booleanValue();
        this.f27765h = booleanValue;
        k3.B2(booleanValue);
        r(dVar, (Object) null);
    }

    private void U(j jVar, k.d dVar) {
        k3.C2((String) jVar.a("smsNumber"), (String) jVar.a("smsAuthHashToken"), new g(this.f27774c, this.f27773b, dVar, "setSMSNumber"));
    }

    private void V(j jVar, k.d dVar) {
        r(dVar, Boolean.valueOf(k3.P2()));
    }

    private void t() {
        k3.U1(this);
        k3.O1(this);
        k3.T1(this);
        k3.S1(this);
        k3.C(this);
        k3.x(this);
        k3.B(this);
        k3.A(this);
        k3.z2(this);
    }

    private void u(j jVar, k.d dVar) {
        k3.J();
        r(dVar, (Object) null);
    }

    private void v(j jVar, k.d dVar) {
        String str = (String) jVar.a("notificationId");
        boolean booleanValue = ((Boolean) jVar.a("shouldDisplay")).booleanValue();
        g2 g2Var = this.f27767j.get(str);
        if (g2Var == null) {
            k3.r0 r0Var = k3.r0.ERROR;
            k3.A1(r0Var, "Could not find notification completion block with id: " + str);
        } else if (booleanValue) {
            g2Var.b(g2Var.c());
        } else {
            g2Var.b((w1) null);
        }
    }

    private void w(j jVar, k.d dVar) {
        k3.H1(((Boolean) jVar.a("granted")).booleanValue());
        if (this.f27766i) {
            this.f27766i = false;
            t();
        }
        r(dVar, (Object) null);
    }

    private void x(j jVar, k.d dVar) {
        k3.M(((Boolean) jVar.f36117b).booleanValue());
        r(dVar, (Object) null);
    }

    private void y(k.d dVar) {
        r(dVar, f.b(k3.g0()));
    }

    private void z(Context context, lc.c cVar) {
        this.f27772a = context;
        this.f27774c = cVar;
        k3.Q = "flutter";
        this.f27766i = false;
        k kVar = new k(cVar, "OneSignal");
        this.f27773b = kVar;
        kVar.e(this);
        g.v(cVar);
        d.v(cVar);
        e.t(cVar);
    }

    public void P() {
        k3.r2(new a());
    }

    public void k(d1 d1Var) {
        if (!this.f27763f) {
            this.f27762d = d1Var;
        } else {
            o("OneSignal#handleClickedInAppMessage", f.e(d1Var));
        }
    }

    public void l(g2 g2Var) {
        if (!this.f27764g) {
            g2Var.b(g2Var.c());
            return;
        }
        this.f27767j.put(g2Var.c().t(), g2Var);
        try {
            o("OneSignal#handleNotificationWillShowInForeground", f.k(g2Var));
        } catch (JSONException e10) {
            e10.getStackTrace();
            k3.r0 r0Var = k3.r0.ERROR;
            k3.A1(r0Var, "Encountered an error attempting to convert OSNotificationReceivedEvent object to hash map: " + e10.getMessage());
        }
    }

    public void m(f2 f2Var) {
        try {
            o("OneSignal#handleOpenedNotification", f.j(f2Var));
        } catch (JSONException e10) {
            e10.getStackTrace();
            k3.r0 r0Var = k3.r0.ERROR;
            k3.A1(r0Var, "Encountered an error attempting to convert OSNotificationOpenResult object to hash map: " + e10.getMessage());
        }
    }

    public void onAttachedToActivity(ec.c cVar) {
        this.f27772a = cVar.getActivity();
    }

    public void onAttachedToEngine(a.b bVar) {
        z(bVar.a(), bVar.b());
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        F();
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.contentEquals("OneSignal#setAppId")) {
            M(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#setLogLevel")) {
            S(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#log")) {
            G(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#requiresUserPrivacyConsent")) {
            r(dVar, Boolean.valueOf(k3.X1()));
        } else if (jVar.f36116a.contentEquals("OneSignal#setRequiresUserPrivacyConsent")) {
            T(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#consentGranted")) {
            w(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#userProvidedPrivacyConsent")) {
            V(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#promptPermission")) {
            J(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#getDeviceState")) {
            y(dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#disablePush")) {
            x(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#postNotification")) {
            H(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#promptLocation")) {
            I(dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#setLocationShared")) {
            R(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#setEmail")) {
            N(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#logoutEmail")) {
            D(dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#setSMSNumber")) {
            U(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#logoutSMSNumber")) {
            E(dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#setExternalUserId")) {
            O(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#removeExternalUserId")) {
            K(dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#setLanguage")) {
            Q(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#initNotificationOpenedHandlerParams")) {
            B();
        } else if (jVar.f36116a.contentEquals("OneSignal#initInAppMessageClickedHandlerParams")) {
            A();
        } else if (jVar.f36116a.contentEquals("OneSignal#initNotificationWillShowInForegroundHandlerParams")) {
            C();
        } else if (jVar.f36116a.contentEquals("OneSignal#completeNotification")) {
            v(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#clearOneSignalNotifications")) {
            u(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#removeNotification")) {
            L(jVar, dVar);
        } else {
            q(dVar);
        }
    }

    public void onOSEmailSubscriptionChanged(z0 z0Var) {
        o("OneSignal#emailSubscriptionChanged", f.c(z0Var));
    }

    public void onOSPermissionChanged(m2 m2Var) {
        o("OneSignal#permissionChanged", f.n(m2Var));
    }

    public void onOSSubscriptionChanged(w2 w2Var) {
        o("OneSignal#subscriptionChanged", f.p(w2Var));
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
    }
}
